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
public class SelectPanel extends JPanel {

    JButton become;
    JButton check;
    public JButton back;
    JPanel main;

    public SelectPanel(LayoutManager layoutManager){
        back = new JButton("Return");
        check = new JButton("I'm the VIP");
        become = new JButton("I want to become VIP");

        main = new JPanel(new GridLayout(3,1));
        main.add(back);
        main.add(check);
        main.add(become);

        this.add(main);
    }
}
