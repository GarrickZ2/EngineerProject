package gui;

import com.alee.laf.WebLookAndFeel;
import gui.order.Selective;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;


/**
 * @author Zixuan Zhang
 * @version iteration1
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
        WebLookAndFeel.initializeManagers ();

        JFrame jFrame = new JFrame();
        Selective selective = new Selective(new BorderLayout());
        jFrame.getContentPane().add(selective);

        jFrame.setTitle("Test Function");
        jFrame.setBounds(400,400,400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
