package newgui;

import com.alee.laf.WebLookAndFeel;
import newgui.membership.CreatePanel;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class TestMain extends JFrame {
    Index index;
    CreatePanel createPanel;
    public TestMain(){
        index = new Index();
        this.add(index);

//        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
//        int width = (int)screensize.getWidth();
//        int height = (int)screensize.getHeight();
        this.setSize(1000, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
        WebLookAndFeel.initializeManagers ();
        new TestMain();
    }
}
