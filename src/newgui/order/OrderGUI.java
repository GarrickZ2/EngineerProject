package newgui.order;


import com.alee.laf.WebLookAndFeel;
import database.MenuData;
import database.information.*;
import database.information.Menu;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

/**
 * @author Zixuan Zhang
 */
public class OrderGUI extends JPanel{

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    JPanel middle;

    CardLayout card;

    public OrderMenu orderMenu;
    public Payment payment;

    public Membership membership;

    Order order;
    OrderList orderList;
    Cuisine cuisine;
    MenuData menuData;
    public Menu menu;

    Receipt receipt;

    int eatType = 0;
    String payingMethod;

    public OrderGUI(LayoutManager layoutManager){

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
                if((membership == null)){
                    payment.membershipNumber.setText("null");
                }
                else if(membership.getMembershipId() == null){
                    payment.membershipNumber.setText("null");
                }else {
                    payment.membershipNumber.setText(membership.getMembershipId());
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
