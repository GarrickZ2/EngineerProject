import com.alee.laf.WebLookAndFeel;
import database.MenuData;
import database.UserData;
import database.information.MemberList;
import database.information.Receipt;
import newgui.Index;
import newgui.management.ManagementIndex;
import newgui.membership.CheckPanel;
import newgui.membership.CreateMember;
import newgui.membership.Register;
import newgui.order.OrderGUI;
import newgui.order.Recipients;

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
    ManagementIndex managementIndex;

    public MainVersion2(){
        card = new CardLayout();
        content = new JPanel(card);

        index = new Index();
        orderGui = new OrderGUI(new BorderLayout());
        checkPanel = new CheckPanel();
        register = new Register();
        managementIndex = new ManagementIndex();

        content.add(index, "index");
        content.add(orderGui, "order");
        content.add(register, "register");
        content.add(checkPanel, "check");
        content.add(managementIndex,"management");

        //switch function
        index.dinner.addActionListener(e -> card.show(content, "order"));
        orderGui.orderMenu.returnButton.addActionListener(e -> card.show(content, "index"));
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
        index.management.addActionListener(e -> {
            managementIndex.setMenuSuggest();
            managementIndex.setMenuChange();
            card.show(content,"management");
        });
        checkPanel.memberChangeInfo.returnButton.addActionListener(e -> card.show(content, "index"));
        register.createMember.returnButton.addActionListener(e -> card.show(content, "index"));

        managementIndex.menuOperation.returnButton.addActionListener(e -> card.show(content,"index"));
        //todo
        orderGui.payment.settleButton.addActionListener(e ->{

            if((orderGui.membership == null)){
                orderGui.orderList.createOrder(orderGui.cuisine, orderGui.eatType,"NoMembership");
            }
            else if(orderGui.membership.getMembershipId() == null){
                orderGui.orderList.createOrder(orderGui.cuisine, orderGui.eatType,"NoMembership");
            }else {
                UserData userData = new UserData();
                MemberList memberList = userData.loadInfo();
                orderGui.orderList.createOrder(orderGui.cuisine,orderGui.eatType,orderGui.membership.getMembershipId());
                if (orderGui.usingCoupon){
                    memberList.getMember(orderGui.membership.getMembershipId()).useStamps();
                } else {
                    memberList.getMember(orderGui.membership.getMembershipId()).addStamps();
                }
                memberList.saveMembershipCsv();
            }
            orderGui.orderList.save();
            orderGui.order = orderGui.orderList.getOrders().get(orderGui.orderList.getOrders().size()-1);
            orderGui.receipt = new Receipt(orderGui.order);
            orderGui.receipt.payingMethod = orderGui.payingMethod;
            //check what is the membership
            new Recipients(orderGui.receipt.generateReceipt(true));
            card.show(content,"index");
        });



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
