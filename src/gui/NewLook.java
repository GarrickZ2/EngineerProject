package gui;

import com.alee.extended.debug.TestFrame;
import com.alee.extended.panel.GroupPanel;
import com.alee.laf.WebLookAndFeel;
import com.alee.laf.button.WebButton;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class NewLook {

    public static void main ( final String[] args )
    {
        SwingUtilities.invokeLater ( new Runnable ()
        {
            public void run ()
            {
                try
                {
                    UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
                    WebLookAndFeel.initializeManagers ();

                    final JButton jButton = new JButton ( "Nimbus button" );
                    final WebButton webButton = new WebButton ( "WebLaF button" );
                    TestFrame.show ( new GroupPanel( 5, jButton, webButton ), 5 );
                }
                catch ( final ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException | IllegalAccessException e )
                {
                    e.printStackTrace ();
                }
            }
        } );
    }
}
