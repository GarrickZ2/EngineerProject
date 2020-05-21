package guiFunction.membership;

import database.interaction.UserData;
import database.entityList.MemberList;
import gui.membership.CreateMember;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * sdfjdkjfdkjfksdjfkjksdjfk
 * @author Zixuan Zhang
 * @version 1.0
 */
public class CreateMemberFunction extends JPanel {
    public CreateMember createMember;

    /**
     *
     */
    public CreateMemberFunction(){

        createMember = new CreateMember();
        createMember.create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fNameContent= createMember.fNameText.getText();
                String lNameContent= createMember.lNameText.getText();
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
                System.out.println("lNameContent in CMF:"+lNameContent);
                String response = memberlist.createMember(fNameContent, lNameContent, phone, emailContent);
                switch (response) {
                    case "Error: Invalid data input.":
                        JOptionPane.showMessageDialog(null, "Invalid input", "Warning", JOptionPane.WARNING_MESSAGE);
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
