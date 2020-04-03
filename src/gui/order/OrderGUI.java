package gui.order;


import com.alee.laf.WebLookAndFeel;
import database.information.Cuisine;
import database.information.Order;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Zixuan Zhang
 */
public class OrderGUI extends JPanel{

    public JButton back;

    Compulsory compulsory;
    Select selective;
    Bill bill;

    CardLayout card;

    JPanel up;
    JPanel middle;

    JLabel title;
    Order order;
    Cuisine cuisine;

    public OrderGUI(LayoutManager layoutManager){
        super(layoutManager);
        compulsory = new Compulsory(new BorderLayout());
        selective = new Select();
        bill = new Bill();

        card = new CardLayout();
        middle = new JPanel(card);
        middle.add(compulsory, "compulsory");
        middle.add(selective, "selective");
        middle.add(bill, "bill");

        selective.last.addActionListener(e -> card.show(middle, "compulsory"));
        selective.next.addActionListener(e -> {
            // set the value of cuisine.
            //cuisine = new Cuisine();
            card.show(middle, "bill");
        });

        up = new JPanel(new BorderLayout());
        back = new JButton("Return");
        title = new JLabel("Welcome to Order!!!");
        up.add(back, BorderLayout.WEST);
        up.add(title, BorderLayout.CENTER);


        this.add(up, BorderLayout.NORTH);
        this.add(middle, BorderLayout.CENTER);


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
}
