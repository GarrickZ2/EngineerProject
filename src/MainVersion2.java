import com.alee.laf.WebLookAndFeel;
import database.MenuData;
import database.UserData;
import database.information.MemberList;
import newgui.Index;
import newgui.membership.CheckPanel;
import newgui.membership.CreateMember;
import newgui.membership.Register;
import newgui.order.OrderGUI;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
/**
 * @author Zixuan Zhang
 */
public class MainVersion2 extends JFrame {
    CardLayout card;
    JPanel content;
    Index index;
    OrderGUI orderGui;
    CreateMember createMember;
    CheckPanel checkPanel;
    Register register;


    public MainVersion2(){
        card = new CardLayout();
        content = new JPanel(card);

        index = new Index();
        orderGui = new OrderGUI(new BorderLayout());
        checkPanel = new CheckPanel();
        register = new Register();

        content.add(index, "index");
        content.add(orderGui, "order");
        content.add(register, "register");
        content.add(checkPanel, "check");

        //switch function
        index.dinner.addActionListener(e -> card.show(content, "order"));
        orderGui.orderMenu.returnButton.addActionListener(e -> {
            card.show(content, "index");
        });
        index.becomeVip.addActionListener(e -> card.show(content, "register"));
        index.isVip.addActionListener(e -> {
            while (true) {
                String number = JOptionPane.showInputDialog("Please Input Your VIP Number");
                if (number == null) {
                    return;
                }
                UserData userData = new UserData();
                MemberList memberList = userData.loadInfo();
                if (memberList.queryMember(number)) {
                    checkPanel.membership = memberList.getMember(number);
                    checkPanel.setMessage();
                    card.show(content, "check");
                    return;
                }
                JOptionPane.showMessageDialog(null, "Doesn't exist this account!");
            }
        });
        checkPanel.memberChangeInfo.returnButton.addActionListener(e -> card.show(content, "index"));
        register.createMember.returnButton.addActionListener(e -> card.show(content, "index"));

        //todo



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
