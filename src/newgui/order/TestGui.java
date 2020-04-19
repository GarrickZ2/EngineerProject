package newgui.order;

import com.alee.laf.WebLookAndFeel;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class TestGui {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
        WebLookAndFeel.initializeManagers ();
        JFrame jf = new JFrame();
        OrderMenu o = new OrderMenu();
        jf.add(o);
        jf.setVisible(true);
        jf.pack();
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
