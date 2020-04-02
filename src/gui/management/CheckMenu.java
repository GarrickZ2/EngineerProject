/*
 * Created by JFormDesigner on Thu Apr 02 12:04:40 CST 2020
 */

package gui.management;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Brainrain
 */
public class CheckMenu extends JPanel {
    public CheckMenu() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        back = new JButton();
        title = new JLabel();
        comPanel = new JPanel();
        soupTypeLabel = new JLabel();
        soup1 = new JLabel();
        soup2 = new JLabel();
        soup3 = new JLabel();
        noodleTypeLabel = new JLabel();
        noodle1 = new JLabel();
        noodle2 = new JLabel();
        noodle3 = new JLabel();
        onionTypeLabel = new JLabel();
        onion1 = new JLabel();
        onion2 = new JLabel();
        onion3 = new JLabel();
        spicePanel = new JPanel();
        spiceTypeLabel = new JLabel();
        spice1 = new JLabel();
        spice2 = new JLabel();
        spice3 = new JLabel();
        spice4 = new JLabel();
        spice5 = new JLabel();
        extraPanel = new JPanel();
        name = new JLabel();
        price = new JLabel();
        isAvailable = new JLabel();
        noodles = new JLabel();
        noodlePrice = new JLabel();
        noodleAvailable = new JLabel();
        nori = new JLabel();
        noriPrice = new JLabel();
        noriAvailable = new JLabel();
        egg = new JLabel();
        eggPrice = new JLabel();
        eggAvailable = new JLabel();
        shoot = new JLabel();
        shootPrice = new JLabel();
        shootAvailable = new JLabel();
        chashu = new JLabel();
        chashuPrice = new JLabel();
        chashuAvailable = new JLabel();
        changePanel = new JPanel();
        box1 = new JPanel();
        change = new JButton();
        box2 = new JPanel();

        //======== this ========
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {0, 62, 421, 107, 0};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 127, 21, 108, 0, 0};
        ((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- back ----
        back.setText("Return");
        add(back, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- title ----
        title.setText("Check Your Menu");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(title.getFont().deriveFont(title.getFont().getSize() + 7f));
        add(title, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== comPanel ========
        {
            comPanel.setBorder(new TitledBorder("Compulsory"));
            comPanel.setLayout(new GridLayout(3, 4, 3, 3));

            //---- soupTypeLabel ----
            soupTypeLabel.setText("Soup Type");
            soupTypeLabel.setFont(soupTypeLabel.getFont().deriveFont(Font.BOLD, soupTypeLabel.getFont().getSize() + 2f));
            soupTypeLabel.setForeground(Color.white);
            soupTypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
            comPanel.add(soupTypeLabel);

            //---- soup1 ----
            soup1.setText("Tonkotsu");
            soup1.setHorizontalAlignment(SwingConstants.CENTER);
            comPanel.add(soup1);

            //---- soup2 ----
            soup2.setText("Shoyu");
            soup2.setHorizontalAlignment(SwingConstants.CENTER);
            comPanel.add(soup2);

            //---- soup3 ----
            soup3.setText("Shio");
            soup3.setHorizontalAlignment(SwingConstants.CENTER);
            comPanel.add(soup3);

            //---- noodleTypeLabel ----
            noodleTypeLabel.setText("Noodle Type");
            noodleTypeLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
            noodleTypeLabel.setForeground(Color.white);
            noodleTypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
            comPanel.add(noodleTypeLabel);

            //---- noodle1 ----
            noodle1.setText("Soft");
            noodle1.setHorizontalAlignment(SwingConstants.CENTER);
            comPanel.add(noodle1);

            //---- noodle2 ----
            noodle2.setText("Medium");
            noodle2.setHorizontalAlignment(SwingConstants.CENTER);
            comPanel.add(noodle2);

            //---- noodle3 ----
            noodle3.setText("Firm");
            noodle3.setHorizontalAlignment(SwingConstants.CENTER);
            comPanel.add(noodle3);

            //---- onionTypeLabel ----
            onionTypeLabel.setText("Spring Onion");
            onionTypeLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
            onionTypeLabel.setForeground(Color.white);
            onionTypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
            comPanel.add(onionTypeLabel);

            //---- onion1 ----
            onion1.setText("No Please");
            onion1.setHorizontalAlignment(SwingConstants.CENTER);
            comPanel.add(onion1);

            //---- onion2 ----
            onion2.setText("Just a little");
            onion2.setHorizontalAlignment(SwingConstants.CENTER);
            comPanel.add(onion2);

            //---- onion3 ----
            onion3.setText("A lot!");
            onion3.setHorizontalAlignment(SwingConstants.CENTER);
            comPanel.add(onion3);
        }
        add(comPanel, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== spicePanel ========
        {
            spicePanel.setBorder(new TitledBorder(""));
            spicePanel.setLayout(new GridLayout(1, 6));

            //---- spiceTypeLabel ----
            spiceTypeLabel.setText("Spiceness");
            spiceTypeLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            spiceTypeLabel.setForeground(Color.white);
            spicePanel.add(spiceTypeLabel);

            //---- spice1 ----
            spice1.setText("1");
            spice1.setHorizontalAlignment(SwingConstants.CENTER);
            spicePanel.add(spice1);

            //---- spice2 ----
            spice2.setText("2");
            spice2.setHorizontalAlignment(SwingConstants.CENTER);
            spicePanel.add(spice2);

            //---- spice3 ----
            spice3.setText("3");
            spice3.setHorizontalAlignment(SwingConstants.CENTER);
            spicePanel.add(spice3);

            //---- spice4 ----
            spice4.setText("4");
            spice4.setHorizontalAlignment(SwingConstants.CENTER);
            spicePanel.add(spice4);

            //---- spice5 ----
            spice5.setText("5");
            spice5.setHorizontalAlignment(SwingConstants.CENTER);
            spicePanel.add(spice5);
        }
        add(spicePanel, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== extraPanel ========
        {
            extraPanel.setBorder(new TitledBorder("Extra"));
            extraPanel.setLayout(new GridLayout(6, 3, 2, 2));

            //---- name ----
            name.setText("Name");
            name.setForeground(Color.white);
            name.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            name.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(name);

            //---- price ----
            price.setText("Price");
            price.setForeground(Color.white);
            price.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            price.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(price);

            //---- isAvailable ----
            isAvailable.setText("IsAvailable");
            isAvailable.setForeground(Color.white);
            isAvailable.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            isAvailable.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(isAvailable);

            //---- noodles ----
            noodles.setText("Noodles");
            noodles.setForeground(Color.white);
            noodles.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            noodles.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(noodles);

            //---- noodlePrice ----
            noodlePrice.setText("$9.9");
            noodlePrice.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(noodlePrice);

            //---- noodleAvailable ----
            noodleAvailable.setText("Available");
            noodleAvailable.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(noodleAvailable);

            //---- nori ----
            nori.setText("Nori");
            nori.setForeground(Color.white);
            nori.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            nori.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(nori);

            //---- noriPrice ----
            noriPrice.setText("$1.0");
            noriPrice.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(noriPrice);

            //---- noriAvailable ----
            noriAvailable.setText("Available");
            noriAvailable.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(noriAvailable);

            //---- egg ----
            egg.setText("Egg");
            egg.setForeground(Color.white);
            egg.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            egg.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(egg);

            //---- eggPrice ----
            eggPrice.setText("$1.0");
            eggPrice.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(eggPrice);

            //---- eggAvailable ----
            eggAvailable.setText("Available");
            eggAvailable.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(eggAvailable);

            //---- shoot ----
            shoot.setText("Shoot");
            shoot.setForeground(Color.white);
            shoot.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            shoot.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(shoot);

            //---- shootPrice ----
            shootPrice.setText("$1.0");
            shootPrice.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(shootPrice);

            //---- shootAvailable ----
            shootAvailable.setText("Available");
            shootAvailable.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(shootAvailable);

            //---- chashu ----
            chashu.setText("Chashu");
            chashu.setForeground(Color.white);
            chashu.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            chashu.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(chashu);

            //---- chashuPrice ----
            chashuPrice.setText("$1.0");
            chashuPrice.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(chashuPrice);

            //---- chashuAvailable ----
            chashuAvailable.setText("Available");
            chashuAvailable.setHorizontalAlignment(SwingConstants.CENTER);
            extraPanel.add(chashuAvailable);
        }
        add(extraPanel, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== changePanel ========
        {
            changePanel.setLayout(new GridLayout(1, 3));

            //======== box1 ========
            {
                box1.setLayout(new BoxLayout(box1, BoxLayout.X_AXIS));
            }
            changePanel.add(box1);

            //---- change ----
            change.setText("Change Menu");
            changePanel.add(change);

            //======== box2 ========
            {
                box2.setLayout(new BoxLayout(box2, BoxLayout.X_AXIS));
            }
            changePanel.add(box2);
        }
        add(changePanel, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JButton back;
    private JLabel title;
    private JPanel comPanel;
    private JLabel soupTypeLabel;
    private JLabel soup1;
    private JLabel soup2;
    private JLabel soup3;
    private JLabel noodleTypeLabel;
    private JLabel noodle1;
    private JLabel noodle2;
    private JLabel noodle3;
    private JLabel onionTypeLabel;
    private JLabel onion1;
    private JLabel onion2;
    private JLabel onion3;
    private JPanel spicePanel;
    private JLabel spiceTypeLabel;
    private JLabel spice1;
    private JLabel spice2;
    private JLabel spice3;
    private JLabel spice4;
    private JLabel spice5;
    private JPanel extraPanel;
    private JLabel name;
    private JLabel price;
    private JLabel isAvailable;
    private JLabel noodles;
    private JLabel noodlePrice;
    private JLabel noodleAvailable;
    private JLabel nori;
    private JLabel noriPrice;
    private JLabel noriAvailable;
    private JLabel egg;
    private JLabel eggPrice;
    private JLabel eggAvailable;
    private JLabel shoot;
    private JLabel shootPrice;
    private JLabel shootAvailable;
    private JLabel chashu;
    private JLabel chashuPrice;
    private JLabel chashuAvailable;
    private JPanel changePanel;
    private JPanel box1;
    public JButton change;
    private JPanel box2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
