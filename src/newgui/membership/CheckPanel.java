package newgui.membership;

import database.information.Membership;

import javax.swing.*;
import java.awt.*;

public class CheckPanel extends JPanel {
    public MemberChangeInfo memberChangeInfo;
    public Membership membership;
    public CheckPanel(){
        memberChangeInfo = new MemberChangeInfo();
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
    }
}
