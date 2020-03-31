package gui.order;

import com.alee.laf.WebLookAndFeel;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Zixuan Zhang
 */
public class OrderGUI extends JPanel implements ActionListener {

    Compulsory compulsory;
    Selective selective;
    Bill bill;

    CardLayout card;
    JPanel middle;
    JPanel below;

    JLabel title;

    JButton next;
    JButton last;


    public OrderGUI(LayoutManager layoutManager){
        super(layoutManager);
        compulsory = new Compulsory(new BorderLayout());
        selective = new Selective(new BorderLayout());
        bill = new Bill();

        card = new CardLayout();
        middle = new JPanel(card);
        middle.add(compulsory);
        middle.add(selective);
        middle.add(bill);

        title = new JLabel("Welcome to Order!!!");

        next = new JButton("Next");
        next.addActionListener(this);

        last = new JButton("Last");
        last.addActionListener(this);

        below = new JPanel(new BorderLayout());
        below.add(last, BorderLayout.WEST);
        below.add(next, BorderLayout.EAST);


        this.add(title, BorderLayout.NORTH);
        this.add(middle, BorderLayout.CENTER);
        this.add(below, BorderLayout.SOUTH);

    }


    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
        WebLookAndFeel.initializeManagers ();

        JFrame test = new JFrame("Test");

        OrderGUI order = new OrderGUI(new BorderLayout());
        test.add(order);

        test.setBounds(400,400,400,400);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        if(b.equals(next)){
            card.next(middle);
        } else if(b.equals(last)) {
            card.previous(middle);
        }

    }
}
