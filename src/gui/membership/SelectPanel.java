package gui.membership;

import gui.order.Selective;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zixuan Zhang
 */
public class SelectPanel extends JPanel{

    JButton become;
    JButton check;
    JPanel main;

    public SelectPanel(LayoutManager layoutManager){
        check = new JButton("I'm the VIP");
        become = new JButton("I want to become VIP");

        main = new JPanel(new GridLayout(1,2));
        main.add(check);
        main.add(become);

        this.add(main);
    }
}
