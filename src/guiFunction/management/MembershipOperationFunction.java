package guiFunction.management;

import database.OrderData;
import database.UserData;
import database.information.*;
import gui.management.MembershipOperation;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * @author Zixuan Zhang
 */
public class MembershipOperationFunction extends JPanel implements ActionListener {
    public MembershipOperation membershipOperation;
    Membership membership = null;
    Order order = null;
    RecipientReader recipientReader = null;
    MemberList memberList;
    ArrayList<Order> orderList;
    public MembershipOperationFunction(){
        membershipOperation = new MembershipOperation();

        initialize();
        membershipOperation.membershipList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                membership = memberList.getMsl().get(membershipOperation.membershipList.getSelectedIndex());
                setUserInfo();
                orderList = getOrders(membership.getMembershipId());
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

        this.setLayout(new BorderLayout());
        this.add(membershipOperation);

    }

    public void initialize(){
        UserData userData = new UserData();
        this.memberList = userData.loadInfo();
        setMemberList();

        this.orderList = getOrders(membership.getMembershipId());
        if(orderList.size() == 0){
            clearOrder();
            return;
        }
        order = orderList.get(0);

        setOrderList();

        setUserInfo();
        setOrderInfo();

    }

    private void setMemberList(){
        String[] users = new String[memberList.getMsl().size()];
        this.membership = memberList.getMsl().get(0);
        for(int i = 0; i < users.length; i++){
            Membership membership = memberList.getMsl().get(i);
            users[i] = membership.getMembershipId() + " | " + membership.getFirstName() + " " + membership.getLastName();
        }
        membershipOperation.membershipList.setListData(users);
    }

    private void setOrderList(){
        String[] orders = new String[orderList.size()];
        for(int i = 0; i <orders.length; i++){
            Order order = orderList.get(i);
            if(order.getMembershipId().equals(membership.getMembershipId())) {
                orders[i] = order.getDate() + " | " + order.getOrderId() + " | $" + order.getAmountMoney();
            }
        }
        membershipOperation.consumpList.setListData(orders);
    }

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

    public void setUserInfo(){
        membershipOperation.addStamps_plus1.setEnabled(membership.getStamps() != 0);
        membershipOperation.membeshipNumber.setText(membership.getMembershipId());
        membershipOperation.name.setText(membership.getFirstName() + " " + membership.getLastName());
        membershipOperation.telephone.setText(membership.getTelephone());
        membershipOperation.eMail.setText(membership.geteMail());
        membershipOperation.stamps.setText("" + membership.getStamps());
    }

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
        }
    }

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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();
        switch (button.getText()){
            case "-1":
                membership.setStamps(membership.getStamps() - 1);
                break;
            case "+1":
                membership.addStamps();
                break;
            default:
                membership.setStamps(membership.getStamps() + 5);
                break;
        }
        memberList.saveMembershipCsv();
        setUserInfo();
    }
}
