import com.alee.laf.WebLookAndFeel;
import guiFunction.IndexFunction;
import install.Install;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.io.File;

/**
 * The main function to run this program. It create a special look and feel and initialize the Main JFrame.
 * @author Zixuan Zhang
 */
public class Main {

    public static void main(String[] args) throws Exception {
        //Start the function
        if (args.length == 0) {
            File f = new File("data");
            if(!f.exists()){
                new Install(1);
            }
            UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName() );
            WebLookAndFeel.initializeManagers ();
            new IndexFunction();
        } else {
            String input  = args[0];
            if("-install".equals(input)){
                new Install(1);
            }else if ("-repair".equals(input)){
                new Install(0);
            }else if("-uninstall".equals(input)){
                new Install(-1);
            } else if("-run".equals(input)){
                UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName() );
                WebLookAndFeel.initializeManagers ();
                new IndexFunction();
            }else {
                System.out.println("Your input isn't right, please input the right code\n" +
                        "-install   : install or re-install all the data file\n" +
                        "-repair    : repair the impaired file, data from unimpaired file won't lose\n" +
                        "-uninstall : uninstall all the necessary file.\n" +
                        "-run       : run the main method");
            }
        }
    }
}
