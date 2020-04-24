import com.alee.laf.WebLookAndFeel;
import database.MenuData;
import newgui.Index;
import gui.management.ManageIndex;
import gui.membership.MemberIndex;
import newgui.order.OrderGUI;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
/**
 * @author Zixuan Zhang
 */
public class MainVersion2 extends JFrame {
    MenuData menuData;
    CardLayout card;
    JPanel content;
    Index index;
    OrderGUI orderGui;
    MemberIndex memberIndex;
    ManageIndex manageIndex;


    public MainVersion2(){
        card = new CardLayout();
        content = new JPanel(card);

        index = new Index();
        orderGui = new OrderGUI(new BorderLayout());
        memberIndex = new MemberIndex(new BorderLayout());
        manageIndex = new ManageIndex();

        content.add(index, "index");
        content.add(orderGui, "order");
        content.add(memberIndex, "membership");
        content.add(manageIndex, "manage");

        index.dinner.addActionListener(e -> card.show(content, "order"));
        orderGui.orderMenu.returnButton.addActionListener(e -> {
            card.show(content, "index");
        });

        //todo


//        index.dinner.addActionListener(e -> card.show(content, "order"));
//
//        index.membership.addActionListener(e -> card.show(content, "membership"));
//
//        memberIndex.checkPanel.back.addActionListener(e ->{
//            OrderGUI.membership = memberIndex.membership;
//            System.out.println("Member in order:" + OrderGUI.membership);
//            System.out.println("Member in index:" + memberIndex.membership);
//        });
//
//
//        index.manage.addActionListener(e -> {
//            while (true) {
//                JPasswordField pwd = new JPasswordField();
//                Object[] message = {"Input password:", pwd};
//
//                String pass = JOptionPane.showInputDialog(null, "Please input manager password(123456):");
//                if (pass == null) {
//                    return;
//                }
//                if("123456".equals(pass)){
//                    card.show(content, "manage");
//                    return;
//                }
//                JOptionPane.showMessageDialog(null, "The password is wrong!");
//            }
//        });
//
//
//        OrderGUI.back.addActionListener(e -> card.show(content, "index"));
//        //todo Page after finishing payment
//        OrderGUI.payment.settleButton.addActionListener(e -> card.show(content, "index"));
//        memberIndex.selectPanel.back.addActionListener(e -> card.show(content, "index"));
//        manageIndex.manageSelect.back.addActionListener(e -> card.show(content, "index"));
        this.setTitle("TOTORO RAMEN");
        this.add(content);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(1040, 680);
        this.setLocation((dim.width - this.getWidth()) / 2, (dim.height - this.getHeight()) / 3);
        this.setVisible(true);
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
        WebLookAndFeel.initializeManagers ();

        new MainVersion2();
    }
}
