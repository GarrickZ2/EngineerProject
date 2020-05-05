package guiFunction;

import com.alee.laf.WebLookAndFeel;
import database.UserData;
import database.information.MemberList;
import database.information.Receipt;
import gui.Index;
import guiFunction.management.ManagementIndex;
import guiFunction.membership.MemberChangeInfoFunction;
import gui.membership.CreateMember;
import guiFunction.membership.CreateMemberFunction;
import guiFunction.order.OrderGuiFunction;
import gui.order.Recipients;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
/**
 * @author Zixuan Zhang
 */
public class IndexFunction extends JFrame {
    CardLayout card;
    JPanel content;
    Index index;
    OrderGuiFunction orderGuiFunction;
    CreateMember createMember;
    MemberChangeInfoFunction memberChangeInfoFunction;
    CreateMemberFunction createMemberFunction;
    ManagementIndex managementIndex;

    public IndexFunction() throws Exception{
        card = new CardLayout();
        content = new JPanel(card);

        index = new Index();
        orderGuiFunction = new OrderGuiFunction(new BorderLayout());
        memberChangeInfoFunction = new MemberChangeInfoFunction();
        createMemberFunction = new CreateMemberFunction();
        managementIndex = new ManagementIndex();

        content.add(index, "index");
        content.add(orderGuiFunction, "order");
        content.add(createMemberFunction, "createMemberFunction");
        content.add(memberChangeInfoFunction, "check");
        content.add(managementIndex,"management");

        //switch function
        index.dinner.addActionListener(e -> {
            //qing chu shu ju
            orderGuiFunction.setMenu();
            orderGuiFunction.clearOrder();
            card.show(content, "order");
        });
        orderGuiFunction.orderMenu.returnButton.addActionListener(e -> card.show(content, "index"));
        index.becomeVip.addActionListener(e -> card.show(content, "createMemberFunction"));
        index.isVip.addActionListener(e -> {
            while (true) {
                String number = JOptionPane.showInputDialog("Please Input Your VIP Number");
                if (number == null) {
                    return;
                }
                UserData userData = new UserData();
                MemberList memberList = userData.loadInfo();
                if (memberList.queryMember(number)) {
                    memberChangeInfoFunction.membership = memberList.getMember(number);
                    memberChangeInfoFunction.setMessage();
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
        memberChangeInfoFunction.memberChangeInfo.returnButton.addActionListener(e -> card.show(content, "index"));
        createMemberFunction.createMember.returnButton.addActionListener(e -> card.show(content, "index"));

        managementIndex.menuOperation.returnButton.addActionListener(e -> card.show(content,"index"));
        managementIndex.popularity.popularity.returnButton.addActionListener(e -> card.show(content,"index"));
        //todo
        orderGuiFunction.payment.settleButton.addActionListener(e ->{

            if((orderGuiFunction.membership == null)){
                orderGuiFunction.orderList.createOrder(orderGuiFunction.cuisine, orderGuiFunction.eatType,"NoMembership");
            } else if(orderGuiFunction.membership.getMembershipId() == null){
                orderGuiFunction.orderList.createOrder(orderGuiFunction.cuisine, orderGuiFunction.eatType,"NoMembership");
            }else {
                UserData userData = new UserData();
                MemberList memberList = userData.loadInfo();
                orderGuiFunction.orderList.createOrder(orderGuiFunction.cuisine, orderGuiFunction.eatType, orderGuiFunction.membership.getMembershipId());
                if (orderGuiFunction.usingCoupon){
                    memberList.getMember(orderGuiFunction.membership.getMembershipId()).useStamps();

                    System.out.println(memberList.getMember(orderGuiFunction.membership.getMembershipId()).getStamps());
                } else {
                    memberList.getMember(orderGuiFunction.membership.getMembershipId()).addStamps();
                }
                memberList.saveMembershipCsv();
            }
            orderGuiFunction.orderList.save();
            orderGuiFunction.order = orderGuiFunction.orderList.getOrders().get(orderGuiFunction.orderList.getOrders().size()-1);
            orderGuiFunction.receipt = new Receipt(orderGuiFunction.order);
            orderGuiFunction.receipt.payingMethod = orderGuiFunction.payingMethod;
            //check what is the membership
            new Recipients(orderGuiFunction.receipt.generateReceipt(true));
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


}
