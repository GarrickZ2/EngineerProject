package gui.membership;


import com.alee.demo.api.example.PreviewPanel;
import database.Data;
import database.MemberList;
import database.information.Membership;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Zixuan Zhang
 */
public class CreatePanel extends JPanel implements ActionListener {
    JButton back;

    JPanel fNamePanel;
    JLabel fName;
    JTextField fNameText;
    JPanel lNamePanel;
    JLabel lName;
    JTextField lNameText;
    JPanel telPanel;
    JLabel tel;
    JTextField telText;
    JPanel emailPanel;
    JLabel email;
    JTextField emailText;

    JButton commit;

    JPanel up;
    JPanel mid;
    JPanel bellow;

    JPanel main;
    public CreatePanel(LayoutManager layoutManager){
        //up zone
        up = new JPanel(new BorderLayout());
        back = new JButton("Return");
        up.add(back, BorderLayout.WEST);

        //mid zone
        //fName zone
        fNamePanel = new JPanel(new GridLayout(1, 2));
        fName = new JLabel("Please input your first name:");
        fNameText = new JTextField(30);
        fNamePanel.add(fName);
        fNamePanel.add(fNameText);
        //lName zone
        lNamePanel = new JPanel(new GridLayout(1, 2));
        lName = new JLabel("Please input your last name:");
        lNameText = new JTextField(30);
        lNamePanel.add(lName);
        lNamePanel.add(lNameText);
        //tel zone
        telPanel = new JPanel(new GridLayout(1, 2));
        tel = new JLabel("Please input your telephone:");
        telText = new JTextField(30);
        telPanel.add(tel);
        telPanel.add(telText);
        //email zone
        emailPanel = new JPanel(new GridLayout(1, 2));
        email = new JLabel("Please input your email:");
        emailText = new JTextField(10);
        emailPanel.add(email);
        emailPanel.add(emailText);

        mid = new JPanel(new GridLayout(4, 1));
        mid.add(fNamePanel);
        mid.add(lNamePanel);
        mid.add(telPanel);
        mid.add(emailPanel);


        //bellow zone
        bellow = new JPanel(new BorderLayout());
        commit = new JButton("Commit");
        commit.addActionListener(this);
        bellow.add(commit);

//        summon
        this.add(bellow, BorderLayout.SOUTH);
        main = new JPanel(new BorderLayout());
        main.add(up, BorderLayout.NORTH);
        main.add(mid, BorderLayout.CENTER);
        main.add(bellow, BorderLayout.SOUTH);
        this.add(main);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String lNameContent=lNameText.getText();
        String fNameContent=fNameText.getText();
        String phone=telText.getText();
        String emailContent = emailText.getText();
        if("".equals(lNameContent)) {
            lNameContent=null;
        }
        if("".equals(fNameContent))
            fNameContent=null;
        if("".equals(phone))
            phone=null;
        if("".equals(emailContent))
            emailContent=null;
        System.out.println(lNameContent);
        System.out.println(fNameContent);
        System.out.println(phone);
        System.out.println(emailContent);
        Membership m = new Membership("M0001","Tian", "Huang", "15500043370", null,0);
        Data data = new Data();
        MemberList memberlist = data.loadUserInfo();
        String response = memberlist.createMember(fNameContent, lNameContent, phone, emailContent);
        switch (response) {
            case "Error type 01: Null message input, name is empty or both telephone and e-mail are null":
                JOptionPane.showMessageDialog(this, "Null message input, name is empty or both telephone and e-mail are null", "Warning", JOptionPane.WARNING_MESSAGE);
                break;
            case "Error type 02: Invalid format of telephone or e-mail address":
                JOptionPane.showMessageDialog(this, "Invalid format of telephone or e-mail address", "Warning", JOptionPane.WARNING_MESSAGE);
                break;
            case "Error type 03: Telephone or E-mail address has been already used":
                JOptionPane.showMessageDialog(this, "Telephone or E-mail address has been already used", "Warning", JOptionPane.WARNING_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Create Successfully, Your ID number is " + response + ". Please remember it!", "Success", JOptionPane.INFORMATION_MESSAGE);
                memberlist.save();
                break;
        }
        lNameText.setText("");
        fNameText.setText("");
        telText.setText("");
        emailText.setText("");
    }
}
