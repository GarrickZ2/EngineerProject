package gui;

import javax.swing.*;
import java.awt.*;

public class Index extends JPanel {
    JPanel up;
    JPanel mid;
    JPanel down;
    JButton manage;
    JButton dinner;
    JButton membership;

    JLabel title;
    JLabel copyright;

    public Index(LayoutManager layoutManager){
        super(layoutManager);
        up = new JPanel(new BorderLayout());
        mid = new JPanel(new BorderLayout());
        down = new JPanel(new BorderLayout());

        manage = new JButton("Management");
        ImageIcon mIcon = new ImageIcon("resource/img/dinner.png");
        manage.setIcon(mIcon);
        dinner = new JButton("Order Food");
        dinner.setIcon(mIcon);
        membership = new JButton("Become VIP");
        membership.setIcon(mIcon);

        title = new JLabel("Welcome to XXX");
        copyright = new JLabel("@copyright is sdfjskdfsjd");

        up.add(title, BorderLayout.CENTER);
        this.add(up, BorderLayout.NORTH);

        mid.add(manage, BorderLayout.EAST);
        mid.add(dinner, BorderLayout.CENTER);
        mid.add(membership, BorderLayout.WEST);

        this.add(mid, BorderLayout.CENTER);

        down.add(copyright, BorderLayout.CENTER);
        this.add(down, BorderLayout.SOUTH);

    }

}
