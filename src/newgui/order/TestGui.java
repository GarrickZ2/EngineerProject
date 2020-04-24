package newgui.order;

import com.alee.laf.WebLookAndFeel;
import newgui.management.ManagementIndex;
import newgui.management.MenuOperation;
import newgui.membership.CreateMember;
import newgui.membership.MemberChangeInfo;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class TestGui {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
        WebLookAndFeel.initializeManagers ();
        JFrame jf = new JFrame();
        OrderMenu o = new OrderMenu();
        Payment p = new Payment();
        MenuOperation mo = new MenuOperation();
        MemberChangeInfo mci = new MemberChangeInfo();
        CreateMember cm = new CreateMember();
        ManagementIndex mix = new ManagementIndex();
        jf.add(mix);
        jf.setVisible(true);
        jf.pack();
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
