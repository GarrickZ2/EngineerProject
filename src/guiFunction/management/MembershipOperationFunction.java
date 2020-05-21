package guiFunction.management;

import database.interaction.OrderData;
import database.interaction.UserData;
import database.entity.*;
import database.entityList.MemberList;
import database.entityList.OrderList;
import gui.management.MembershipOperation;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * This is the class used to implement the method of MembershipOperation Class
 * A type of JPanel
 * Implement ActionListener
 * @author Zixuan Zhang
 */
public class MembershipOperationFunction extends JPanel implements ActionListener {
    public MembershipOperation membershipOperation;
    Member member = null;
    Order order = null;
    RecipientReader recipientReader = null;
    MemberList memberList;
    ArrayList<Order> orderList;

    /**
     * This is the constructor for MembershipOperationFunction Class
     */
    public MembershipOperationFunction(){
        membershipOperation = new MembershipOperation();

        initialize();
        membershipOperation.membershipList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    member = memberList.getMsl().get(membershipOperation.membershipList.getSelectedIndex());
                }catch (Exception ignored){}
                setUserInfo();
                orderList = getOrders(member.getMembershipId());
                if (orderList.size() == 0){
                    order = null;
                    clearOrder();
                    membershipOperation.consumpList.setListData(new String[0]);
                    return;
                }
                order = orderList.get(0);
                setOrderList();
                setOrderInfo();
            }
        });

        membershipOperation.consumpList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    order = orderList.get(membershipOperation.consumpList.getSelectedIndex());
                } catch (Exception ignored){}
                setOrderInfo();
            }
        });
        membershipOperation.addStamps_plus1.addActionListener(this);
        membershipOperation.addStamps_plus5.addActionListener(this);
        membershipOperation.addStamps_plus10.addActionListener(this);
        membershipOperation.searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchText = membershipOperation.search_input.getText();
                if("".equals(searchText)){
                    initialize();
                    return;
                }
                String[] content;
                for(Member each: memberList.getMsl()){
                    if(searchText.equals(each.getMembershipId())){
                        content = new String[1];
                        member = each;
                        content[0] = member.getMembershipId() + " | " + member.getFirstName() + " " + member.getLastName();
                        setUserInfo();
                        orderList = getOrders(member.getMembershipId());
                        if (orderList.size() == 0){
                            order = null;
                            clearOrder();
                            membershipOperation.consumpList.setListData(new String[0]);
                            return;
                        }
                        order = orderList.get(0);
                        setOrderList();
                        setOrderInfo();
                        membershipOperation.membershipList.setListData(content);
                        return;
                    }
                }
                content = new String[1];
                membershipOperation.membershipList.setListData(content);
                membershipOperation.consumpList.setListData(new String[0]);
                clearOrder();
                order = null;
            }
        });

        this.setLayout(new BorderLayout());
        this.add(membershipOperation);

    }

    /**
     * This method is used to initialize all the information on the JPanel
     */
    public void initialize(){
        UserData userData = new UserData();
        this.memberList = userData.loadInfo();
        setMemberList();

        if(member == null){

            this.orderList = new ArrayList<>();
        }else {
            this.orderList = getOrders(member.getMembershipId());
        }
        if(orderList.size() == 0){
            clearOrder();
            return;
        }
        order = orderList.get(0);

        setOrderList();

        setUserInfo();
        setOrderInfo();

    }

    /**
     * This method is used to set the information of membershipList
     */
    private void setMemberList(){
        String[] users = new String[memberList.getMsl().size()];
        if(memberList.getMsl().size() == 0){
            membershipOperation.name.setText("");
            membershipOperation.telephone.setText("");
            membershipOperation.eMail.setText("");
            membershipOperation.stamps.setText("");
            member = null;
            return;
        }
        this.member = memberList.getMsl().get(0);
        for(int i = 0; i < users.length; i++){
            Member member = memberList.getMsl().get(i);
            users[i] = member.getMembershipId() + " | " + member.getFirstName() + " " + member.getLastName();
        }
        membershipOperation.membershipList.setListData(users);
    }

    /**
     * This method is used to set the information of orderList
     */
    private void setOrderList(){
        String[] orders = new String[orderList.size()];
        for(int i = 0; i <orders.length; i++){
            Order order = orderList.get(i);
            if(order.getMembershipId().equals(member.getMembershipId())) {
                orders[i] = order.getDate() + " | " + order.getOrderId() + " | $" + order.getAmountMoney();
            }
        }
        membershipOperation.consumpList.setListData(orders);
    }

    /**
     * This method is used to get all the orders of user
     * @param membershipId the id of the user you want to search
     * @return ArrayList of all the orders of that user
     */
    private ArrayList<Order> getOrders(String membershipId){
        OrderData orderData = new OrderData();
        OrderList orderList = orderData.loadInfo();
        ArrayList<Order> orders = new ArrayList<>();
        for(Order each: orderList.getOrders()){
            if(each.getMembershipId().equals(membershipId)){
                orders.add(each);
            }
        }
        return orders;
    }

    /**
     * Set the information of the user
     */
    public void setUserInfo(){
        membershipOperation.addStamps_plus1.setEnabled(member.getStamps() != 0);
        membershipOperation.membeshipNumber.setText(member.getMembershipId());
        membershipOperation.name.setText(member.getFirstName() + " " + member.getLastName());
        membershipOperation.telephone.setText(member.getTelephone());
        membershipOperation.eMail.setText(member.geteMail());
        membershipOperation.stamps.setText("" + member.getStamps());
    }

    /**
     * Set the information of the order
     */
    public void setOrderInfo(){
        try {
            recipientReader = new RecipientReader(order.getBillId());
        } catch (Exception e){
            recipientReader = null;
        }
        membershipOperation.noodleNumber.setText("1");
        membershipOperation.packingNumber.setText("1");
        membershipOperation.packingSingle.setText("£1");
        membershipOperation.packingPrice.setText("£1");
        membershipOperation.serialNumber.setText(order.getOrderId());
        membershipOperation.consumptionTime.setText(order.getDate());
        if(order.getEatType() == 0){
            membershipOperation.diningMethod.setText("Eat in");
            membershipOperation.packingNumber.setText("0");
            membershipOperation.packingPrice.setText("£0");
        }else {
            membershipOperation.diningMethod.setText("Take out");
            membershipOperation.packingNumber.setText("1");
            membershipOperation.packingPrice.setText("£1");
        }
        membershipOperation.totalPrice.setText("" + order.getAmountMoney());

        Cuisine cuisine = order.getCuisine();
        membershipOperation.label_noodle.setText(cuisine.getSoupType() + "(" + cuisine.getOnionType() + "," +
                cuisine.getNoodleType() + "," + cuisine.getSpiciness() + ")");
        membershipOperation.noriNumber.setText("" + cuisine.getExtraNori());
        membershipOperation.shootNumber.setText("" + cuisine.getExtraNori());
        membershipOperation.chashuNumber.setText("" + cuisine.getExtraNori());
        membershipOperation.eggNumber.setText("" + cuisine.getExtraNori());

        if(recipientReader != null) {
            membershipOperation.noriSingle.setText("" + recipientReader.getNoriPrice());
            membershipOperation.noriPrice.setText("" + recipientReader.getNoriTotalPrice());
            membershipOperation.shootSingle.setText("" + recipientReader.getShootPrice());
            membershipOperation.shootPrice.setText("" + recipientReader.getShootTotalPrice());
            membershipOperation.chashuSingle.setText("" + recipientReader.getChashuPrice());
            membershipOperation.chashuPrice.setText("" + recipientReader.getChashuTotalPrice());
            membershipOperation.eggSingle.setText("" + recipientReader.getEggPrice());
            membershipOperation.eggPrice.setText("" + recipientReader.getEggTotalPrice());
            membershipOperation.noodlePrice.setText("" + recipientReader.getNoodleTotalPrice());
            membershipOperation.noodleSingle.setText("" + recipientReader.getNoodlePrice());
            membershipOperation.diningMethod.setText(recipientReader.getPayingMethod());
            if("Coupon".equals(recipientReader.getPayingMethod())){
                membershipOperation.useCoupon.setText("True");
            }else {
                membershipOperation.useCoupon.setText("False");
            }
        }else {
            membershipOperation.noriSingle.setText("Lost");
            membershipOperation.noriPrice.setText("Lost");
            membershipOperation.shootSingle.setText("Lost");
            membershipOperation.shootPrice.setText("Lost");
            membershipOperation.chashuSingle.setText("Lost");
            membershipOperation.chashuPrice.setText("Lost");
            membershipOperation.eggSingle.setText("Lost");
            membershipOperation.eggPrice.setText("Lost");
            membershipOperation.noodlePrice.setText("Lost");
            membershipOperation.noodleSingle.setText("Lost");
            membershipOperation.diningMethod.setText("Lost");
            membershipOperation.useCoupon.setText("Lost");
        }
    }

    /**
     * Clear the information of order
     */
    private void clearOrder(){
        membershipOperation.noodleNumber.setText("");
        membershipOperation.useCoupon.setText("");
        membershipOperation.payingMethod.setText("");
        membershipOperation.packingNumber.setText("");
        membershipOperation.packingPrice.setText("");
        membershipOperation.packingSingle.setText("");

        membershipOperation.serialNumber.setText("");
        membershipOperation.consumptionTime.setText("");
        membershipOperation.diningMethod.setText("");
        membershipOperation.packingNumber.setText("");
        membershipOperation.packingPrice.setText("");
        membershipOperation.totalPrice.setText("");

        membershipOperation.label_noodle.setText("");
        membershipOperation.noriNumber.setText("");
        membershipOperation.shootNumber.setText("");
        membershipOperation.chashuNumber.setText("");
        membershipOperation.eggNumber.setText("");


        membershipOperation.noriSingle.setText("");
        membershipOperation.noriPrice.setText("");
        membershipOperation.shootSingle.setText("");
        membershipOperation.shootPrice.setText("");
        membershipOperation.chashuSingle.setText("");
        membershipOperation.chashuPrice.setText("");
        membershipOperation.eggSingle.setText("");
        membershipOperation.eggPrice.setText("");
        membershipOperation.noodlePrice.setText("");
        membershipOperation.noodleSingle.setText("");
        membershipOperation.diningMethod.setText("");
        membershipOperation.useCoupon.setText("");
    }

    /**
     * Overrider Method used to change the stamps number of one user.
     * @param e ignored action event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();
        switch (button.getText()){
            case "-1":
                member.setStamps(member.getStamps() - 1);
                break;
            case "+1":
                member.addStamps();
                break;
            default:
                member.setStamps(member.getStamps() + 5);
                break;
        }
        memberList.saveMembershipCsv();
        setUserInfo();
    }
}
