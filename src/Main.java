import com.alee.laf.WebLookAndFeel;
import guiFunction.IndexFunction;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * The main function to run this program. It create a special look and feel and initialize the Main JFrame.
 * @author Zixuan Zhang
 */
public class Main {

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName() );
        WebLookAndFeel.initializeManagers ();
        //Start the function
        new IndexFunction();
    }
}
