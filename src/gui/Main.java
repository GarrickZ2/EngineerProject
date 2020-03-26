package gui;

import com.alee.laf.WebLookAndFeel;

import javax.swing.*;
import javax.swing.plaf.IconUIResource;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class Main extends JFrame {
    JPanel content;
    Index index;
    public Main(){
        content = new JPanel(new CardLayout());

        index = new Index(new BorderLayout());
        content.add(index);
        this.add(content);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLocation(400, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
        WebLookAndFeel.initializeManagers ();

        Main m = new Main();
    }
}
