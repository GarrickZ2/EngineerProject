package gui.membership;

import com.alee.laf.WebLookAndFeel;
import database.UserData;
import database.information.MemberList;
import database.information.Membership;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Zixuan Zhang
 */
public class MemberIndex extends JPanel{

    CardLayout card;
    JPanel main;

    public SelectPanel selectPanel;
    CreatePanel createPanel;
    CheckPanel checkPanel;
    ChangeInfo changeInfo;

    public MemberIndex(LayoutManager layoutManager){
        card = new CardLayout();
        main = new JPanel(card);

        selectPanel = new SelectPanel(new BorderLayout());
        createPanel = new CreatePanel(new BorderLayout());
        checkPanel = new CheckPanel(new BorderLayout());
        changeInfo = new ChangeInfo();

        main.add(selectPanel, "first");
        main.add(createPanel, "create");
        main.add(checkPanel, "check");
        main.add(changeInfo, "change");
        this.add(main);
        //select
        selectPanel.become.addActionListener(e -> card.show(main, "create"));
        //CHECK
        selectPanel.check.addActionListener(e -> {
            while (true) {
                String number = JOptionPane.showInputDialog("Please Input Your VIP Number");
                if (number == null) {
                    return;
                }
                UserData userData = new UserData();
                MemberList memberList = userData.loadInfo();
                if (memberList.queryMember(number)) {
                    checkPanel.membership = memberList.getMember(number);
                    checkPanel.name.setText("Name: " + checkPanel.membership.getLastName() + " "
                            + checkPanel.membership.getLastName());
                    checkPanel.tel.setText("Telephone: " + checkPanel.membership.getTelephone());
                    checkPanel.email.setText("Email:" + checkPanel.membership.geteMail());
                    checkPanel.coupon.setText("Stamps:" + checkPanel.membership.getStamps());
                    card.show(main, "check");
                    return;
                }
                JOptionPane.showMessageDialog(null, "Doesn't exist this account!");
            }
        });


        //return
        createPanel.back.addActionListener(e -> card.show(main, "first"));
        checkPanel.back.addActionListener(e -> card.show(main, "first"));
        changeInfo.back.addActionListener(e ->{
            checkPanel.name.setText("Name: " + checkPanel.membership.getLastName() + " "
                    + checkPanel.membership.getLastName());
            checkPanel.tel.setText("Telephone: " + checkPanel.membership.getTelephone());
            checkPanel.email.setText("Email:" + checkPanel.membership.geteMail());
            checkPanel.coupon.setText("Stamps:" + checkPanel.membership.getStamps());
            card.show(main, "check");
        });

        checkPanel.change.addActionListener(e -> {
            changeInfo.fNameText.setText(checkPanel.membership.getFirstName());
            changeInfo.lNameText.setText(checkPanel.membership.getLastName());
            changeInfo.telText.setText(checkPanel.membership.getTelephone());
            changeInfo.emailText.setText(checkPanel.membership.geteMail());
            card.show(main, "change");
        });
    }


    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
        WebLookAndFeel.initializeManagers ();

        MemberIndex memberIndex = new MemberIndex(new BorderLayout());
        JFrame jFrame = new JFrame();
        jFrame.add(memberIndex);

        jFrame.setBounds(400,400,400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
