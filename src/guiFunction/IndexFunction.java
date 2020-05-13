package guiFunction;

import database.interaction.UserData;
import database.entityList.MemberList;
import database.process.Receipt;
import gui.Index;
import guiFunction.management.ManagementIndex;
import guiFunction.membership.MemberChangeInfoFunction;
import guiFunction.membership.CreateMemberFunction;
import guiFunction.order.OrderGuiFunction;
import gui.order.Recipients;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Zixuan Zhang
 */
public class IndexFunction extends JFrame {
    CardLayout card;
    JPanel content;
    Index index;
    OrderGuiFunction orderGuiFunction;
    MemberChangeInfoFunction memberChangeInfoFunction;
    CreateMemberFunction createMemberFunction;
    ManagementIndex managementIndex;

    /**
     * 
     * @throws Exception
     */
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
                    memberChangeInfoFunction.member = memberList.getMember(number);
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
            managementIndex.membershipOperation.initialize();
            card.show(content,"management");
        });
        memberChangeInfoFunction.memberChangeInfo.returnButton.addActionListener(e -> card.show(content, "index"));
        createMemberFunction.createMember.returnButton.addActionListener(e -> card.show(content, "index"));
        createMemberFunction.createMember.create.addActionListener(e -> card.show(content, "index"));

        managementIndex.menuOperation.returnButton.addActionListener(e -> card.show(content,"index"));
        managementIndex.popularity.popularity.returnButton.addActionListener(e -> card.show(content,"index"));
        //todo
        orderGuiFunction.payment.settleButton.addActionListener(e ->{

            if((orderGuiFunction.member == null)){
                orderGuiFunction.orderList.createOrder(orderGuiFunction.cuisine, orderGuiFunction.eatType,"NoMembership");
            } else if(orderGuiFunction.member.getMembershipId() == null){
                orderGuiFunction.orderList.createOrder(orderGuiFunction.cuisine, orderGuiFunction.eatType,"NoMembership");
            }else {
                UserData userData = new UserData();
                MemberList memberList = userData.loadInfo();
                orderGuiFunction.orderList.createOrder(orderGuiFunction.cuisine, orderGuiFunction.eatType, orderGuiFunction.member.getMembershipId());
                if (orderGuiFunction.usingCoupon){
                    memberList.getMember(orderGuiFunction.member.getMembershipId()).useStamps();

                    System.out.println(memberList.getMember(orderGuiFunction.member.getMembershipId()).getStamps());
                } else {
                    memberList.getMember(orderGuiFunction.member.getMembershipId()).addStamps();
                }
                memberList.getMember(orderGuiFunction.member.getMembershipId()).setLastOrder(
                        orderGuiFunction.orderList.getOrders().get(orderGuiFunction.orderList.getOrders().size() - 1).getOrderId()
                );
                memberList.saveMembershipCsv();
            }
            orderGuiFunction.orderList.save();
            orderGuiFunction.order = orderGuiFunction.orderList.getOrders().get(orderGuiFunction.orderList.getOrders().size()-1);

            if(orderGuiFunction.usingCoupon){
                orderGuiFunction.order.setPayingMethod("Coupon");
            }else {
                if(orderGuiFunction.payment.cash.isSelected()){
                    orderGuiFunction.order.setPayingMethod("Cash");
                }else {
                    orderGuiFunction.order.setPayingMethod("Visa");
                }
            }
            System.out.println(orderGuiFunction.order.getPayingMethod());

            orderGuiFunction.receipt = new Receipt(orderGuiFunction.order);
            orderGuiFunction.receipt.payingMethod = orderGuiFunction.payingMethod;
            //check what is the member
            new Recipients(orderGuiFunction.receipt.generateReceipt(true));
            card.show(content,"index");
        });

        managementIndex.membershipOperation.membershipOperation.returnButton.addActionListener(e ->
                card.show(content, "index"));


        //set for exit button's function
        index.exit.addActionListener(e -> System.exit(0));

        this.setTitle("TOTORO RAMEN");
        this.add(content);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(1040, 680);
        this.setLocation((dim.width - this.getWidth()) / 2, (dim.height - this.getHeight()) / 3);
        this.setVisible(true);

        Clock clock = new Clock(index);
        clock.start();
    }

}
