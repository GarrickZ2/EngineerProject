import com.alee.laf.WebLookAndFeel;
import guiFunction.IndexFunction;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Main {

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
        WebLookAndFeel.initializeManagers ();

        new IndexFunction();
    }
}
