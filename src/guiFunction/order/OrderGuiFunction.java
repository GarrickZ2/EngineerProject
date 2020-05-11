package guiFunction.order;


import com.alee.laf.WebLookAndFeel;
import database.interaction.MenuData;
import database.interaction.UserData;
import database.entity.*;
import database.entity.Menu;
import database.entityList.MemberList;
import database.entityList.OrderList;
import database.process.Receipt;
import gui.order.OrderMenu;
import gui.order.Payment;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

/**
 * @author Zixuan Zhang
 */
public class OrderGuiFunction extends JPanel{

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    JPanel middle;

    public CardLayout card;

    public OrderMenu orderMenu;
    public Payment payment;

    public Member member;

    public Order order;
    public OrderList orderList;
    public Cuisine cuisine;
    public MenuData menuData;
    public Menu menu;

    public Receipt receipt;

    public int eatType = 0;
    public String payingMethod;
    public boolean login = false;
    public boolean usingCoupon = false;
    public OrderGuiFunction(LayoutManager layoutManager){

        super(layoutManager);

        orderMenu = new OrderMenu();
        payment = new Payment();

        menuData = new MenuData();
        menu = menuData.loadInfo();

        orderList = new OrderList();

        card = new CardLayout();
        middle = new JPanel(card);
        middle.add(orderMenu, "order");
        middle.add(payment, "payment");

        orderMenu.noodlePrice.setText("" + menu.getNoodle());
        orderMenu.extraPrice.setText("0");
        orderMenu.totalPrice.setText("" + menu.getNoodle());
        NumberChangeListener changeListener = new NumberChangeListener();
        orderMenu.noriNumber.addChangeListener(changeListener);
        orderMenu.shootNumber.addChangeListener(changeListener);
        orderMenu.eggNumber.addChangeListener(changeListener);
        orderMenu.chashuNumber.addChangeListener(changeListener);


        orderMenu.settleButton.addActionListener(e -> {
            try{
                // set the value of cuisine.
                cuisine = new Cuisine(getSelectedText(orderMenu.soupGroup),getSelectedText(orderMenu.noodleGroup),
                        getSelectedText(orderMenu.onionGroup),getSelectedBoolean(getSelectedText(orderMenu.noriGroup)),
                        getSelectedBoolean(getSelectedText(orderMenu.chashuGroup)),getSelectedBoolean(getSelectedText(orderMenu.eggGroup)),
                        Integer.parseInt(getSelectedText(orderMenu.spicinessGroup)),(int)orderMenu.noriNumber.getValue(),
                        (int)orderMenu.eggNumber.getValue(), (int)orderMenu.shootNumber.getValue(),(int)orderMenu.chashuNumber.getValue());
                System.out.println(cuisine.toString());

                payment.serialNumber.setText(orderList.generateOrderId("orderId"));
                payment.time.setText(dateFormat.format(new Date()));
                if((member == null)){
                    payment.membershipNumber.setText("null");
                }
                else if(member.getMembershipId() == null){
                    payment.membershipNumber.setText("null");
                }else {
                    payment.membershipNumber.setText(member.getMembershipId());
                }

                payment.soup.setText(cuisine.getSoupType());
    //            payment.food.setText("￡"+menu.getNoodle());
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

                payment.extraEgg.setText(""+cuisine.getExtraEgg());

                payment.extraShoot.setText(""+cuisine.getExtraShoot());

                payment.extraChashu.setText(""+cuisine.getExtraChashu());

                payment.noodlePrice.setText("￡"+menu.getNoodle());
                payment.extraPrice.setText("￡"+ ( cuisine.calculate() - menu.getNoodle() ) );
                payment.packingPrice.setText("￡0");
                payment.totalPrice.setText("￡" + cuisine.calculate());
                payment.eatIn.setSelected(true);
                payment.cash.setSelected(true);
                card.show(middle, "payment");
            }catch (Exception exception){
                JOptionPane.showMessageDialog(this, "Please Select Necessary Option!");
            }
        });

        payment.takeAway.addActionListener(e ->{
            eatType = 1;
            payment.packingPrice.setText("￡1");
            payment.totalPrice.setText("￡" + (cuisine.calculate() + 1));
        });
        payment.eatIn.addActionListener(e ->{
            eatType = 0;
            payment.packingPrice.setText("￡0");
            payment.totalPrice.setText("￡"+cuisine.calculate());
        });
        payment.cash.addActionListener(e ->{
            payingMethod = "Cash";
        });
        payment.visa.addActionListener(e ->{
            payingMethod = "Visa";
        });

        payment.returnButton.addActionListener(e ->{
            card.show(middle,"order");
        });

        //VIP SYSTEM

        payment.useCoupon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(payment.useCoupon.isSelected()){
                    payment.cash.setEnabled(false);
                    payment.visa.setEnabled(false);
                }else {
                    payment.cash.setEnabled(true);
                    payment.visa.setEnabled(true);
                }
            }
        });
        payment.checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserData userData = new UserData();
                MemberList memberList = userData.loadInfo();
                String userId = payment.membershipNumberInput.getText();
                payment.useCoupon.setSelected(false);
                if(memberList.queryMember(userId)){
                    payment.identifiedInformation.setText("Identified Successfully");
                    member = memberList.getMember(userId);
                    payment.userGreeting.setText("Hello, dear " + member.getFirstName() + " " + member.getLastName());
                    payment.membershipNumber.setText(member.getMembershipId());
                    String coupStatus = "";
                    if(member.getStamps() >= 10){
                        coupStatus = "(Could Use)";
                        payment.useCoupon.setEnabled(true);
                    }else {
                        coupStatus = "(<10)";
                        payment.useCoupon.setEnabled(false);
                    }
                    login = true;
                    payment.coupon.setText("" + member.getStamps() + coupStatus);

                }else {
                    payment.identifiedInformation.setText("Identified Failed");
                    payment.userGreeting.setText("Welcome To Join Us");
                    payment.membershipNumber.setText(" ");
                    payment.coupon.setText("");
                    login = false;
                    payment.useCoupon.setEnabled(false);
                }
            }
        });
        payment.useCoupon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usingCoupon = payment.useCoupon.isSelected();
            }
        });
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
    private class NumberChangeListener implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            double optionalPrice = (int)orderMenu.chashuNumber.getValue()* menu.getChashu()
                    + (int)orderMenu.noriNumber.getValue() * menu.getNori()
                    + (int)orderMenu.eggNumber.getValue() * menu.getEgg()
                    + (int)orderMenu.shootNumber.getValue() * menu.getShoot();
            orderMenu.extraPrice.setText("" + optionalPrice);
            orderMenu.totalPrice.setText("" + (optionalPrice + menu.getNoodle()));
        }
    }
    public static boolean getSelectedBoolean(String str){
        if("Yes".equals(str)){
            return true;
        }
        else if("No".equals(str)){
            return false;
        }
        else{
            Exception exception = new Exception("Error value");
            return false;
        }
    }

    public void clearOrder(){
        {
           orderMenu.soup1.setSelected(true);
           orderMenu.noodle1.setSelected(true);
           orderMenu.onion1.setSelected(true);
           orderMenu.nori2.setSelected(true);
           orderMenu.chashu2.setSelected(true);
           orderMenu.egg2.setSelected(true);
           orderMenu.spice0.setSelected(true);
        }

        orderMenu.noriNumber.setValue(0);
        orderMenu.chashuNumber.setValue(0);
        orderMenu.eggNumber.setValue(0);
        orderMenu.shootNumber.setValue(0);

        orderMenu.noodlePrice.setText("" + menu.getNoodle());
        orderMenu.extraPrice.setText("0");
        orderMenu.totalPrice.setText("" + menu.getNoodle());

        payment.membershipNumberInput.setText("");
        payment.identifiedInformation.setText("");
        payment.userGreeting.setText("Welcome To Join Us");
        payment.membershipNumber.setText("");
        payment.coupon.setText("");
        payment.useCoupon.setEnabled(false);
        payment.useCoupon.setSelected(false);
        card.show(middle, "order");
    }

    public void setMenu(){
        MenuData menuData = new MenuData();
        menu = menuData.loadInfo();
        if(!menu.isNoriAvailable()){
            orderMenu.noriAvailable.setText("Unavailable");
            orderMenu.noriNumber.setEnabled(false);
        }else {
            orderMenu.noriAvailable.setText("Available");
            orderMenu.noriNumber.setEnabled(true);
        }
        orderMenu.noriPrice.setText("￡" + menu.getNori());

        if(!menu.isEggAvailable()){
            orderMenu.eggAvailable.setText("Unavailable");
            orderMenu.eggNumber.setEnabled(false);
        }else {
            orderMenu.eggAvailable.setText("Available");
            orderMenu.eggNumber.setEnabled(true);
        }
        orderMenu.eggPrice.setText("￡" + menu.getEgg());

        if(!menu.isChashuAvailable()){
            orderMenu.chashuAvailable.setText("Unavailable");
            orderMenu.chashuNumber.setEnabled(false);
        }else {
            orderMenu.chashuAvailable.setText("Available");
            orderMenu.chashuNumber.setEnabled(true);
        }
        orderMenu.chashuPrice.setText("￡" + menu.getChashu());

        if(!menu.isShootAvailable()){
            orderMenu.shootAvailable.setText("Unavailable");
            orderMenu.shootNumber.setEnabled(false);
        }else {
            orderMenu.shootAvailable.setText("Available");
            orderMenu.shootNumber.setEnabled(true);
        }
        orderMenu.shootPrice.setText("￡" + menu.getShoot());

    }

    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
        WebLookAndFeel.initializeManagers ();

        JFrame test = new JFrame("Test");

        OrderGuiFunction order = new OrderGuiFunction(new BorderLayout());
        test.add(order);


        test.pack();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}
