package newgui.membership;

import database.UserData;
import database.information.MemberList;
import database.information.Membership;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JPanel {
    public CreateMember createMember;
    public Register(){

        createMember = new CreateMember();
        createMember.create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lNameContent= createMember.lNameText.getText();
                String fNameContent= createMember.fNameText.getText();
                String phone= createMember.telText.getText();
                String emailContent = createMember.emailText.getText();
                if("".equals(lNameContent)) {
                    lNameContent=null;
                }
                if("".equals(fNameContent)) {
                    fNameContent=null;
                }
                if("".equals(phone)) {
                    phone=null;
                }
                if("".equals(emailContent)) {
                    emailContent=null;
                }
                UserData userData = new UserData();
                MemberList memberlist = userData.loadInfo();
                String response = memberlist.createMember(fNameContent, lNameContent, phone, emailContent);
                switch (response) {
                    case "Error type 01: Null message input, name is empty or both telephone and e-mail are null":
                        JOptionPane.showMessageDialog(null, "Null message input, name is empty or both telephone and e-mail are null", "Warning", JOptionPane.WARNING_MESSAGE);
                        break;
                    case "Error type 02: Invalid format of telephone or e-mail address":
                        JOptionPane.showMessageDialog(null, "Invalid format of telephone or e-mail address", "Warning", JOptionPane.WARNING_MESSAGE);
                        break;
                    case "Error type 03: Telephone or E-mail address has been already used":
                        JOptionPane.showMessageDialog(null, "Telephone or E-mail address has been already used", "Warning", JOptionPane.WARNING_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Create Successfully, Your ID number is " + response + ". Please remember it!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        memberlist.saveMembershipCsv();
                        break;
                }
                createMember.lNameText.setText("");
                createMember.fNameText.setText("");
                createMember.telText.setText("");
                createMember.emailText.setText("");
            }
        });
        this.setLayout(new BorderLayout());
        this.add(createMember);
    }
}
