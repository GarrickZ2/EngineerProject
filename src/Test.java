import com.alee.laf.WebLookAndFeel;
import database.Data;
import database.MemberList;
import database.information.Membership;

import javax.swing.*;

public class Test {
    public static void main ( String[] args )
    {
        // You should work with UI (including installing L&F) inside Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater (new Runnable ()
        {
            public void run ()
            {
                // Install WebLaF as application L&F
                WebLookAndFeel.install ();

                // Create you Swing application here
                // JFrame frame = ...
            }
        } );
    }
}
