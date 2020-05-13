package guiFunction.membership;

import database.interaction.OrderData;
import database.interaction.UserData;
import database.entity.Member;
import database.entityList.MemberList;
import database.entity.Order;
import database.entityList.OrderList;
import gui.membership.MemberChangeInfo;

import javax.swing.*;
import java.awt.*;

public class MemberChangeInfoFunction extends JPanel {
    public MemberChangeInfo memberChangeInfo;
    public Member member;
    public MemberChangeInfoFunction(){
        memberChangeInfo = new MemberChangeInfo();
        memberChangeInfo.saveAndChangeButton.addActionListener(e -> {
            UserData userData = new UserData();
            MemberList list = userData.loadInfo();
            if(!"".equals(memberChangeInfo.change_fName.getText())) {
                member.setFirstName(memberChangeInfo.change_fName.getText());
            }
            if(!"".equals(memberChangeInfo.change_lName.getText())) {
                member.setLastName(memberChangeInfo.change_lName.getText());
            }
            if(!"".equals(memberChangeInfo.change_telephone.getText())) {
                member.setTelephone(memberChangeInfo.change_telephone.getText());
            }
            if(!"".equals(memberChangeInfo.change_eMail.getText())) {
                member.seteMail(memberChangeInfo.change_eMail.getText());
            }
            list.changeInfo(member.getMembershipId(), member.getFirstName(), member.getLastName()
            , member.getTelephone(), member.geteMail());
            setMessage();
            list.saveMembershipCsv();
        });
//        memberChangeInfo.consumptionTime.setText("");
//        memberChangeInfo.consumptionCost.setText("");
//        memberChangeInfo.consumptionUseCoupon.setText("");
        this.setLayout(new BorderLayout());
        this.add(memberChangeInfo);
    }

    /**
     *
     */
    public void setMessage(){
        memberChangeInfo.sug_fName.setText(member.getFirstName());
        memberChangeInfo.sug_lName.setText(member.getLastName());
        memberChangeInfo.sug_eMail.setText(member.geteMail());
        memberChangeInfo.sug_telephone.setText(member.getTelephone());
        memberChangeInfo.membershipNumber.setText(member.getMembershipId());
        memberChangeInfo.coupon.setText("" + member.getStamps());
        if(member.getLastOrder().equals("null")){
            memberChangeInfo.consumptionTime.setText("");
            memberChangeInfo.consumptionCost.setText("");
            memberChangeInfo.consumptionUseCoupon.setText("");
            return;
        }
        OrderData orderData = new OrderData();
        OrderList orderList = orderData.loadInfo();
        for(Order each:orderList.getOrders()){
            if(each.getOrderId().equals(member.getLastOrder())){
                memberChangeInfo.consumptionTime.setText(each.getDate());
                memberChangeInfo.consumptionCost.setText("" + each.getAmountMoney());
                memberChangeInfo.consumptionUseCoupon.setText(each.getPayingMethod());
                return;
            }
        }
    }
}
