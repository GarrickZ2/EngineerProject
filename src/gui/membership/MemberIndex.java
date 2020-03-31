package gui.membership;

import com.alee.laf.WebLookAndFeel;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Zixuan Zhang
 */
public class MemberIndex extends JPanel {

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
        selectPanel.become.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(main, "create");
            }
        });
        selectPanel.check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(main, "check");
            }
        });


        //return
        createPanel.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(main, "first");
            }
        });
        checkPanel.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(main, "first");
            }
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
