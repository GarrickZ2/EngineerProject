import com.alee.laf.WebLookAndFeel;
import gui.Index;
import gui.membership.MemberIndex;
import gui.order.OrderGUI;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Zixuan Zhang
 */
public class Main extends JFrame {
    CardLayout card;
    JPanel content;
    Index index;
    OrderGUI orderGui;
    MemberIndex memberIndex;
    public Main(){
        card = new CardLayout();
        content = new JPanel(card);

        index = new Index(new BorderLayout());
        orderGui = new OrderGUI(new BorderLayout());
        memberIndex = new MemberIndex(new BorderLayout());

        content.add(index, "index");
        content.add(orderGui, "order");
        content.add(memberIndex, "membership");

        index.dinner.addActionListener(e -> card.show(content, "order"));

        index.membership.addActionListener(e -> card.show(content, "membership"));

        orderGui.back.addActionListener(e -> card.show(content, "index"));


        this.add(content);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLocation(400, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
        WebLookAndFeel.initializeManagers ();

        Main m = new Main();
    }
}
