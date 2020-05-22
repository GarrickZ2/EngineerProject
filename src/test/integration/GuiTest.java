package test.integration;

import gui.Index;
import gui.management.MembershipOperation;
import gui.management.MenuOperation;
import gui.management.statistics.DataAnalysis;
import gui.management.statistics.Popularity;
import gui.membership.CreateMember;
import gui.membership.MemberChangeInfo;
import gui.order.OrderMenu;
import gui.order.Payment;
import org.junit.Test;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * @author 44724
 */
public class GuiTest {

    DataAnalysis da = new DataAnalysis();
    Popularity p = new Popularity();
    MembershipOperation mo = new MembershipOperation();
    MenuOperation meo = new MenuOperation();
    CreateMember cm = new CreateMember();
    MemberChangeInfo mci = new MemberChangeInfo();
    OrderMenu om = new OrderMenu();
    Payment pay = new Payment();
    Index i = new Index();

    @Test
    public void testAll(){
        JFrame jf = new JFrame();
        jf.add(da);
//        jf.add(p);
//        jf.add(mo);
//        jf.add(meo);
//        jf.add(cm);
//        jf.add(mci);
//        jf.add(om);
//        jf.add(pay);
//        jf.add(i);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }



}
