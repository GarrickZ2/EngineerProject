package guiFunction.membership;

import database.OrderData;
import database.UserData;
import database.information.MemberList;
import database.information.Membership;
import database.information.Order;
import database.information.OrderList;
import gui.membership.MemberChangeInfo;

import javax.swing.*;
import java.awt.*;

public class MemberChangeInfoFunction extends JPanel {
    public MemberChangeInfo memberChangeInfo;
    public Membership membership;
    public MemberChangeInfoFunction(){
        memberChangeInfo = new MemberChangeInfo();
        memberChangeInfo.saveAndChangeButton.addActionListener(e -> {
            UserData userData = new UserData();
            MemberList list = userData.loadInfo();
            if(!"".equals(memberChangeInfo.change_fName.getText())) {
                membership.setFirstName(memberChangeInfo.change_fName.getText());
            }
            if(!"".equals(memberChangeInfo.change_lName.getText())) {
                membership.setLastName(memberChangeInfo.change_lName.getText());
            }
            if(!"".equals(memberChangeInfo.change_telephone.getText())) {
                membership.setTelephone(memberChangeInfo.change_telephone.getText());
            }
            if(!"".equals(memberChangeInfo.change_eMail.getText())) {
                membership.seteMail(memberChangeInfo.change_eMail.getText());
            }
            list.changeInfo(membership.getMembershipId(), membership.getFirstName(), membership.getLastName()
            , membership.getTelephone(), membership.geteMail());
            setMessage();
            list.saveMembershipCsv();
        });
//        memberChangeInfo.consumptionTime.setText("");
//        memberChangeInfo.consumptionCost.setText("");
//        memberChangeInfo.consumptionUseCoupon.setText("");
        this.setLayout(new BorderLayout());
        this.add(memberChangeInfo);
    }
    public void setMessage(){
        memberChangeInfo.sug_fName.setText(membership.getFirstName());
        memberChangeInfo.sug_lName.setText(membership.getLastName());
        memberChangeInfo.sug_eMail.setText(membership.geteMail());
        memberChangeInfo.sug_telephone.setText(membership.getTelephone());
        memberChangeInfo.membershipNumber.setText(membership.getMembershipId());
        memberChangeInfo.coupon.setText("" + membership.getStamps());
        if(membership.getLastOrder().equals("null")){
            memberChangeInfo.consumptionTime.setText("");
            memberChangeInfo.consumptionCost.setText("");
            memberChangeInfo.consumptionUseCoupon.setText("");
            return;
        }
        OrderData orderData = new OrderData();
        OrderList orderList = orderData.loadInfo();
        for(Order each:orderList.getOrders()){
            if(each.getOrderId().equals(membership.getLastOrder())){
                memberChangeInfo.consumptionTime.setText(each.getDate());
                memberChangeInfo.consumptionCost.setText("" + each.getAmountMoney());
                memberChangeInfo.consumptionUseCoupon.setText(each.getPayingMethod());
                return;
            }
        }
    }
}
