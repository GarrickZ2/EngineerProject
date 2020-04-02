import com.alee.laf.WebLookAndFeel;
import database.Data;
import gui.Index;
import gui.management.ManageIndex;
import gui.membership.MemberIndex;
import gui.order.OrderGUI;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

/**
 * @author Zixuan Zhang
 */
public class Main extends JFrame {
    CardLayout card;
    JPanel content;
    Index index;
    OrderGUI orderGui;
    MemberIndex memberIndex;
    ManageIndex manageIndex;
    public Main(){
        card = new CardLayout();
        content = new JPanel(card);

        index = new Index(new BorderLayout());
        orderGui = new OrderGUI(new BorderLayout());
        memberIndex = new MemberIndex(new BorderLayout());
        manageIndex = new ManageIndex();

        content.add(index, "index");
        content.add(orderGui, "order");
        content.add(memberIndex, "membership");
        content.add(manageIndex, "manage");

        index.dinner.addActionListener(e -> card.show(content, "order"));

        index.membership.addActionListener(e -> card.show(content, "membership"));

        index.manage.addActionListener(e -> {
            while (true) {
                JPasswordField pwd = new JPasswordField();
                Object[] message = {"Input password:", pwd};
//                String i = JOptionPane.showConfirmDialog(null, message, "Please input manager password", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE);

                String pass = JOptionPane.showInputDialog(null, "Please input manager password(123456):");
                if (pass == null) {
                    return;
                }
                if("123456".equals(pass)){
                    card.show(content, "manage");
                    return;
                }
                JOptionPane.showMessageDialog(null, "The password is wrong!");
            }
        });


        orderGui.back.addActionListener(e -> card.show(content, "index"));
        memberIndex.selectPanel.back.addActionListener(e -> card.show(content, "index"));
        manageIndex.manageSelect.back.addActionListener(e -> card.show(content, "index"));
        this.add(content);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLocation(400, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
        WebLookAndFeel.initializeManagers ();

        new Main();

        Data data = new Data();
        data.saveReceipt();
    }
}
