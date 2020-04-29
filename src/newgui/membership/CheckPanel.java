package newgui.membership;

import com.kitfox.svg.Use;
import database.UserData;
import database.information.MemberList;
import database.information.Membership;

import javax.swing.*;
import java.awt.*;

public class CheckPanel extends JPanel {
    public MemberChangeInfo memberChangeInfo;
    public Membership membership;
    public CheckPanel(){
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
