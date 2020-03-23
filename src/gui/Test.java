package gui;

import com.alee.extended.statusbar.StatusBarLayout;
import com.alee.laf.WebLookAndFeel;
import gui.order.Compulsory;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;


public class Test {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
        WebLookAndFeel.initializeManagers ();
        JFrame j = new JFrame();
        JPanel p = new JPanel(new StatusBarLayout());
        JLabel label = new JLabel("Happy!");
        JProgressBar bar = new JProgressBar(SwingConstants.HORIZONTAL, 20, 100);
        p.add(label);
        p.add(bar);
        j.getContentPane().add(p);
        j.setVisible(true);
    }
}
