package gui.membership;

import database.UserData;
import database.information.MemberList;
import database.information.Membership;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Zixuan Zhang
 */
public class SelectPanel extends JPanel implements ActionListener {

    JButton become;
    JButton check;
    JPanel main;

    public SelectPanel(LayoutManager layoutManager){
        check = new JButton("I'm the VIP");
        become = new JButton("I want to become VIP");

        main = new JPanel(new GridLayout(1,2));
        main.add(check);
        check.addActionListener(this);
        main.add(become);

        this.add(main);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
