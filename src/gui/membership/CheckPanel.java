package gui.membership;

import database.information.Membership;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zixuan Zhang
 */
public class CheckPanel extends JPanel {
    public JButton back;

    JLabel name;
    JLabel tel;
    JLabel email;
    JLabel coupon;

    JButton change;

    JPanel up;
    JPanel mid;
    JPanel bellow;

    JPanel main;

    public Membership membership;

    public CheckPanel(LayoutManager layoutManager){
        up = new JPanel(new BorderLayout());
        back = new JButton("Return");
        up.add(back);

        mid = new JPanel(new GridLayout(4, 1));
        name = new JLabel("Name: Zixuan Zhang");
        tel = new JLabel("Telephone: 18810017937");
        email = new JLabel("Email: GarrickZ2018@Gmail.com");
        coupon = new JLabel("Coupon: 11");

        mid.add(name);
        mid.add(tel);
        mid.add(email);
        mid.add(coupon);

        bellow = new JPanel(new BorderLayout());
        change = new JButton("Change Info");
        bellow.add(change);

        main = new JPanel(new BorderLayout());
        main.add(up, BorderLayout.NORTH);
        main.add(mid, BorderLayout.CENTER);
        main.add(bellow, BorderLayout.SOUTH);
        this.add(main);
    }
}
