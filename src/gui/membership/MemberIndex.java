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

    SelectPanel selectPanel;
    CreatePanel createPanel;
    CheckPanel checkPanel;

    public MemberIndex(LayoutManager layoutManager){
        card = new CardLayout();
        main = new JPanel(card);

        selectPanel = new SelectPanel(new BorderLayout());
        createPanel = new CreatePanel(new BorderLayout());
        checkPanel = new CheckPanel(new BorderLayout());

        main.add(selectPanel, "first");
        main.add(createPanel, "create");
        main.add(checkPanel, "check");
        this.add(main);
        //select
        selectPanel.become.addActionListener(e -> card.show(main, "create"));
        selectPanel.check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = JOptionPane.showInputDialog("Please Input Your VIP Number");
                if ("".equals(number)){
                    return;
                }
                UserData userData = new UserData();
                MemberList memberList = userData.loadInfo();
                memberList.queryMember(number);
                if(memberList.queryMember(number)) {
                    for(Membership ms : memberList.getMsl()) {
                        if(ms.getMembershipId().equals(number)) {
                            checkPanel.name.setText(ms.getLastName() + " " + ms.getLastName());
                            checkPanel.tel.setText(ms.getTelephone());
                            checkPanel.email.setText(ms.geteMail());
                            checkPanel.coupon.setText("" + ms.getStamps());
                            card.show(main, "check");
                            return;
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, "Doesn't exist this account!");
            }
        });


        //return
        createPanel.back.addActionListener(e -> card.show(main, "first"));
        checkPanel.back.addActionListener(e -> card.show(main, "first"));
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
