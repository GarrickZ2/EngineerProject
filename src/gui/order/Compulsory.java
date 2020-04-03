/*
 * Created by JFormDesigner on Fri Apr 03 15:13:45 GMT+08:00 2020
 */

package gui.order;

import com.alee.laf.WebLookAndFeel;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * @author Brainrain
 */
public class Compulsory extends JPanel {
    public Compulsory() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        section1 = new JPanel();
        soupLabel = new JLabel();
        soup1 = new JToggleButton();
        soup2 = new JToggleButton();
        soup3 = new JToggleButton();
        noodleLabel = new JLabel();
        noode1 = new JToggleButton();
        noode2 = new JToggleButton();
        noode3 = new JToggleButton();
        onionLabel = new JLabel();
        onion1 = new JToggleButton();
        onion2 = new JToggleButton();
        onion3 = new JToggleButton();
        section2 = new JPanel();
        noriLabel = new JLabel();
        emptyBox0 = new JPanel();
        nori1 = new JToggleButton();
        nori2 = new JToggleButton();
        chashuLabel = new JLabel();
        emptyBox1 = new JPanel();
        chashu1 = new JToggleButton();
        chashu2 = new JToggleButton();
        eggLabel = new JLabel();
        emptyBox2 = new JPanel();
        egg1 = new JToggleButton();
        egg2 = new JToggleButton();
        section3 = new JPanel();
        spiceLabel = new JLabel();
        spice0 = new JToggleButton();
        spice1 = new JToggleButton();
        spice2 = new JToggleButton();
        spice3 = new JToggleButton();
        spice4 = new JToggleButton();
        spice5 = new JToggleButton();
        section4 = new JPanel();
        resetButton = new JButton();
        emptyBox3 = new JPanel();
        emptyBox4 = new JPanel();
        emptyBox5 = new JPanel();
        emptyBox6 = new JPanel();
        nextButton = new JButton();
        soupGroup = new ButtonGroup();
        noodleGroup = new ButtonGroup();
        onionGroup = new ButtonGroup();
        noriGroup = new ButtonGroup();
        chashuGroup = new ButtonGroup();
        eggGroup = new ButtonGroup();
        spiceGroup = new ButtonGroup();

        //======== this ========
        setBorder(new TitledBorder("Required Option"));
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {55, 481, 50, 0};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {55, 125, 125, 45, 15, 45, 10, 0};
        ((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //======== section1 ========
        {
            section1.setBorder(new EtchedBorder());
            section1.setLayout(new GridLayout(3, 4));

            //---- soupLabel ----
            soupLabel.setText("Soup:");
            section1.add(soupLabel);

            //---- soup1 ----
            soup1.setText("Tonkotsu");
            section1.add(soup1);

            //---- soup2 ----
            soup2.setText("Shoyu");
            section1.add(soup2);

            //---- soup3 ----
            soup3.setText("Shio");
            section1.add(soup3);

            //---- noodleLabel ----
            noodleLabel.setText("Noodle:");
            section1.add(noodleLabel);

            //---- noode1 ----
            noode1.setText("Soft");
            section1.add(noode1);

            //---- noode2 ----
            noode2.setText("Medium");
            section1.add(noode2);

            //---- noode3 ----
            noode3.setText("Firm");
            section1.add(noode3);

            //---- onionLabel ----
            onionLabel.setText("Spring Onion:");
            section1.add(onionLabel);

            //---- onion1 ----
            onion1.setText("No please");
            section1.add(onion1);

            //---- onion2 ----
            onion2.setText("Just a little");
            section1.add(onion2);

            //---- onion3 ----
            onion3.setText("A lot");
            section1.add(onion3);
        }
        add(section1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== section2 ========
        {
            section2.setBorder(new EtchedBorder());
            section2.setLayout(new GridLayout(3, 4));

            //---- noriLabel ----
            noriLabel.setText("Nori:");
            section2.add(noriLabel);

            //======== emptyBox0 ========
            {
                emptyBox0.setLayout(new BoxLayout(emptyBox0, BoxLayout.X_AXIS));
            }
            section2.add(emptyBox0);

            //---- nori1 ----
            nori1.setText("Yes");
            section2.add(nori1);

            //---- nori2 ----
            nori2.setText("No");
            section2.add(nori2);

            //---- chashuLabel ----
            chashuLabel.setText("Chashu:");
            section2.add(chashuLabel);

            //======== emptyBox1 ========
            {
                emptyBox1.setLayout(new BoxLayout(emptyBox1, BoxLayout.X_AXIS));
            }
            section2.add(emptyBox1);

            //---- chashu1 ----
            chashu1.setText("Yes");
            section2.add(chashu1);

            //---- chashu2 ----
            chashu2.setText("No");
            section2.add(chashu2);

            //---- eggLabel ----
            eggLabel.setText("Boiled egg:");
            section2.add(eggLabel);

            //======== emptyBox2 ========
            {
                emptyBox2.setLayout(new BoxLayout(emptyBox2, BoxLayout.X_AXIS));
            }
            section2.add(emptyBox2);

            //---- egg1 ----
            egg1.setText("Yes");
            section2.add(egg1);

            //---- egg2 ----
            egg2.setText("No");
            section2.add(egg2);
        }
        add(section2, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== section3 ========
        {
            section3.setBorder(new EtchedBorder());
            section3.setLayout(new GridLayout(1, 6));

            //---- spiceLabel ----
            spiceLabel.setText("Spiciness:");
            section3.add(spiceLabel);

            //---- spice0 ----
            spice0.setText("0");
            section3.add(spice0);

            //---- spice1 ----
            spice1.setText("1");
            section3.add(spice1);

            //---- spice2 ----
            spice2.setText("2");
            section3.add(spice2);

            //---- spice3 ----
            spice3.setText("3");
            section3.add(spice3);

            //---- spice4 ----
            spice4.setText("4");
            section3.add(spice4);

            //---- spice5 ----
            spice5.setText("5");
            section3.add(spice5);
        }
        add(section3, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== section4 ========
        {
            section4.setLayout(new GridLayout(1, 6));

            //---- resetButton ----
            resetButton.setText("Reset");
            section4.add(resetButton);

            //======== emptyBox3 ========
            {
                emptyBox3.setLayout(new BoxLayout(emptyBox3, BoxLayout.X_AXIS));
            }
            section4.add(emptyBox3);

            //======== emptyBox4 ========
            {
                emptyBox4.setLayout(new BoxLayout(emptyBox4, BoxLayout.X_AXIS));
            }
            section4.add(emptyBox4);

            //======== emptyBox5 ========
            {
                emptyBox5.setLayout(new BoxLayout(emptyBox5, BoxLayout.X_AXIS));
            }
            section4.add(emptyBox5);

            //======== emptyBox6 ========
            {
                emptyBox6.setLayout(new BoxLayout(emptyBox6, BoxLayout.X_AXIS));
            }
            section4.add(emptyBox6);

            //---- nextButton ----
            nextButton.setText("Next");
            section4.add(nextButton);
        }
        add(section4, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- soupGroup ----
        soupGroup.add(soup1);
        soupGroup.add(soup2);
        soupGroup.add(soup3);

        //---- noodleGroup ----
        noodleGroup.add(noode1);
        noodleGroup.add(noode2);
        noodleGroup.add(noode3);

        //---- onionGroup ----
        onionGroup.add(onion1);
        onionGroup.add(onion2);
        onionGroup.add(onion3);

        //---- noriGroup ----
        noriGroup.add(nori1);
        noriGroup.add(nori2);

        //---- chashuGroup ----
        chashuGroup.add(chashu1);
        chashuGroup.add(chashu2);

        //---- eggGroup ----
        eggGroup.add(egg1);
        eggGroup.add(egg2);

        //---- spiceGroup ----
        spiceGroup.add(spice0);
        spiceGroup.add(spice1);
        spiceGroup.add(spice2);
        spiceGroup.add(spice3);
        spiceGroup.add(spice4);
        spiceGroup.add(spice5);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel section1;
    private JLabel soupLabel;
    public JToggleButton soup1;
    public JToggleButton soup2;
    public JToggleButton soup3;
    private JLabel noodleLabel;
    public JToggleButton noode1;
    public JToggleButton noode2;
    public JToggleButton noode3;
    private JLabel onionLabel;
    public JToggleButton onion1;
    public JToggleButton onion2;
    public JToggleButton onion3;
    private JPanel section2;
    private JLabel noriLabel;
    private JPanel emptyBox0;
    public JToggleButton nori1;
    public JToggleButton nori2;
    private JLabel chashuLabel;
    private JPanel emptyBox1;
    public JToggleButton chashu1;
    public JToggleButton chashu2;
    private JLabel eggLabel;
    private JPanel emptyBox2;
    public JToggleButton egg1;
    public JToggleButton egg2;
    private JPanel section3;
    private JLabel spiceLabel;
    public JToggleButton spice0;
    public JToggleButton spice1;
    public JToggleButton spice2;
    public JToggleButton spice3;
    public JToggleButton spice4;
    public JToggleButton spice5;
    private JPanel section4;
    public JButton resetButton;
    private JPanel emptyBox3;
    private JPanel emptyBox4;
    private JPanel emptyBox5;
    private JPanel emptyBox6;
    public JButton nextButton;
    public ButtonGroup soupGroup;
    public ButtonGroup noodleGroup;
    public ButtonGroup onionGroup;
    public ButtonGroup noriGroup;
    public ButtonGroup chashuGroup;
    public ButtonGroup eggGroup;
    public ButtonGroup spiceGroup;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
        WebLookAndFeel.initializeManagers ();

        JFrame test = new JFrame("Test");

        Compulsory compulsory = new Compulsory();
        test.add(compulsory);

        test.pack();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}
