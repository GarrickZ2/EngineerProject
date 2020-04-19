package gui.order;


import com.alee.laf.WebLookAndFeel;
import database.Data;
import database.MenuData;
import database.information.*;
import database.information.Menu;

import org.junit.Test;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;

/**
 * @author Zixuan Zhang
 */
public class OrderGUI extends JPanel{

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public JButton back;
    JPanel up;
    JPanel middle;
    JLabel title;

    CardLayout card;

    Compulsory compulsory;
    Select selective;
    public Payment payment;

    public Membership membership;

    Order order;
    OrderList orderList;
    Cuisine cuisine;
    MenuData menuData;
    Menu menu;

    Receipt receipt;

    int eatType = 0;
    String payingMethod;

    public OrderGUI(LayoutManager layoutManager){

        super(layoutManager);

        compulsory = new Compulsory();
        selective = new Select();
        payment = new Payment();

        menuData = new MenuData();
        menu = menuData.loadInfo();

        orderList = new OrderList();

        card = new CardLayout();
        middle = new JPanel(card);
        middle.add(compulsory, "compulsory");
        middle.add(selective, "selective");
        middle.add(payment, "payment");




        compulsory.nextButton.addActionListener(e -> card.show(middle,"selective"));
        selective.last.addActionListener(e -> card.show(middle, "compulsory"));
        selective.next.addActionListener(e -> {
            // set the value of cuisine.
            cuisine = new Cuisine(getSelectedText(compulsory.soupGroup),getSelectedText(compulsory.noodleGroup),
                    getSelectedText(compulsory.onionGroup),getSelectedBoolean(getSelectedText(compulsory.noriGroup)),
                    getSelectedBoolean(getSelectedText(compulsory.chashuGroup)),getSelectedBoolean(getSelectedText(compulsory.eggGroup)),
                    Integer.parseInt(getSelectedText(compulsory.spiceGroup)),(int)selective.noriNumber.getValue(),
                    (int)selective.eggNumber.getValue(), (int)selective.shootNumber.getValue(),(int)selective.chashuNumber.getValue());
            System.out.println(cuisine.toString());

            payment.serialNumber.setText(orderList.generateOrderId("orderId"));
            payment.time.setText(dateFormat.format(new Date()));
            if((membership == null)){
                payment.membershipNumber.setText("null");
            }
            else if(membership.getMembershipId() == null){
                payment.membershipNumber.setText("null");
            }else {
                payment.membershipNumber.setText(membership.getMembershipId());
            }

            payment.soup.setText(cuisine.getSoupType());
            payment.noodlePrice.setText("￡"+menu.getNoodle());
            payment.noodle.setText(cuisine.getNoodleType());
            payment.onion.setText(cuisine.getOnionType());
            payment.onion.setText(""+cuisine.getSpiciness());
            if(cuisine.isNori()){
                payment.nori.setText("Yes");
            }else{
                payment.nori.setText("No");
            }

            if(cuisine.isEgg()){
                payment.egg.setText("Yes");
            }else{
                payment.egg.setText("No");
            }

            //todo boolean shoot & isShoot()
            payment.shoot.setText("No");

            if(cuisine.isChashu()){
                payment.chashu.setText("Yes");
            }else{
                payment.chashu.setText("No");
            }

            payment.extraNori.setText(""+cuisine.getExtraNori());
            payment.noriPrice.setText("￡"+menu.getNori()*cuisine.getExtraNori());

            payment.extraEgg.setText(""+cuisine.getExtraEgg());
            payment.eggPrice.setText("￡"+menu.getEgg()*cuisine.getExtraEgg());

            payment.extraShoot.setText(""+cuisine.getExtraShoot());
            payment.shootPrice.setText("￡"+menu.getShoot()*cuisine.getExtraShoot());

            payment.extraChashu.setText(""+cuisine.getExtraChashu());
            payment.chashuPrice.setText("￡"+menu.getChashu()*cuisine.getExtraChashu());

            payment.totalPrice.setText("￡"+cuisine.calculate());
            card.show(middle, "payment");
        });

        payment.takeAway.addActionListener(e ->{
            if(payment.takeAway.isSelected()){
                eatType = 1;
                payment.totalPrice.setText("￡"+(cuisine.calculate()+1));
            }
        });
        payment.eatIn.addActionListener(e ->{
            if(payment.eatIn.isSelected()){
                eatType = 0;
                payment.totalPrice.setText("￡"+cuisine.calculate());
            }
        });
        payment.cash.addActionListener(e ->{
            if(payment.cash.isSelected()){
                payingMethod = "Cash";
            }
        });
        payment.visa.addActionListener(e ->{
            if(payment.visa.isSelected()){
                payingMethod = "Visa";
            }
        });

        payment.returnButton.addActionListener(e ->{
            card.show(middle,"compulsory");
        });
        payment.settleButton.addActionListener(e ->{

            if((membership == null)){
                orderList.createOrder(cuisine,eatType,"NoMembership");
            }
            else if(membership.getMembershipId() == null){
                orderList.createOrder(cuisine,eatType,"NoMembership");
            }else {
                orderList.createOrder(cuisine,eatType,membership.getMembershipId());
            }
            orderList.save();
            order = orderList.getOrders().get(orderList.getOrders().size()-1);
            receipt = new Receipt(order);
            receipt.payingMethod = this.payingMethod;

            System.out.println(receipt.generateReceipt(true));

            card.show(middle,"compulsory");
        });

        up = new JPanel(new BorderLayout());
        back = new JButton("Return");
        title = new JLabel("Welcome to Order!!!");
        up.add(back, BorderLayout.WEST);
        up.add(title, BorderLayout.CENTER);

        this.add(up, BorderLayout.NORTH);
        this.add(middle, BorderLayout.CENTER);
    }

    public static String getSelectedText(ButtonGroup buttonGroup){
        Enumeration<AbstractButton> buttons = buttonGroup.getElements();
        while (buttons.hasMoreElements()) {
            AbstractButton btn = buttons.nextElement();
            if(btn.isSelected()){
                return btn.getText();
            }
        }
        return "Error nothing has been selected";
    }

    public static boolean getSelectedBoolean(String str){
        if(str == "Yes"){
            return true;
        }
        else if(str == "No"){
            return false;
        }
        else{
            Exception exception = new Exception("Error value");
            return false;
        }
    }


    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
        WebLookAndFeel.initializeManagers ();

        JFrame test = new JFrame("Test");

        OrderGUI order = new OrderGUI(new BorderLayout());
        test.add(order);


        test.pack();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}
