/*
 * Created by JFormDesigner on Fri Apr 03 14:57:34 CST 2020
 */

package gui.order;

import java.awt.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class Select extends JPanel {
    public Select() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        noriLabel = new JLabel();
        noriPrice = new JLabel();
        noriAvailable = new JLabel();
        noriNumber = new JSpinner();
        eggLabel = new JLabel();
        eggPrice = new JLabel();
        eggAvailable = new JLabel();
        eggNumber = new JSpinner();
        shootLabel = new JLabel();
        shootPrice = new JLabel();
        shootAvailable = new JLabel();
        shootNumber = new JSpinner();
        chashuLabel = new JLabel();
        chashuPrice = new JLabel();
        chashuAvailable = new JLabel();
        chashuNumber = new JSpinner();
        panel2 = new JPanel();
        last = new JButton();
        panel3 = new JPanel();
        panel4 = new JPanel();
        next = new JButton();

        //======== this ========
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {0, 448, 0, 0};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 244, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout(4, 4));

            //---- noriLabel ----
            noriLabel.setText("Nori");
            noriLabel.setHorizontalAlignment(SwingConstants.CENTER);
            noriLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            panel1.add(noriLabel);

            //---- noriPrice ----
            noriPrice.setText("$ 1 each");
            noriPrice.setHorizontalAlignment(SwingConstants.CENTER);
            panel1.add(noriPrice);

            //---- noriAvailable ----
            noriAvailable.setText("Available");
            noriAvailable.setHorizontalAlignment(SwingConstants.CENTER);
            panel1.add(noriAvailable);
            panel1.add(noriNumber);

            //---- eggLabel ----
            eggLabel.setText("Egg");
            eggLabel.setHorizontalAlignment(SwingConstants.CENTER);
            eggLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            panel1.add(eggLabel);

            //---- eggPrice ----
            eggPrice.setText("$ 1 each");
            eggPrice.setHorizontalAlignment(SwingConstants.CENTER);
            panel1.add(eggPrice);

            //---- eggAvailable ----
            eggAvailable.setText("Available");
            eggAvailable.setHorizontalAlignment(SwingConstants.CENTER);
            panel1.add(eggAvailable);
            panel1.add(eggNumber);

            //---- shootLabel ----
            shootLabel.setText("Shoot");
            shootLabel.setHorizontalAlignment(SwingConstants.CENTER);
            shootLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            panel1.add(shootLabel);

            //---- shootPrice ----
            shootPrice.setText("$ 1 each");
            shootPrice.setHorizontalAlignment(SwingConstants.CENTER);
            panel1.add(shootPrice);

            //---- shootAvailable ----
            shootAvailable.setText("Available");
            shootAvailable.setHorizontalAlignment(SwingConstants.CENTER);
            panel1.add(shootAvailable);
            panel1.add(shootNumber);

            //---- chashuLabel ----
            chashuLabel.setText("Chashu");
            chashuLabel.setHorizontalAlignment(SwingConstants.CENTER);
            chashuLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            panel1.add(chashuLabel);

            //---- chashuPrice ----
            chashuPrice.setText("$ 1 each");
            chashuPrice.setHorizontalAlignment(SwingConstants.CENTER);
            panel1.add(chashuPrice);

            //---- chashuAvailable ----
            chashuAvailable.setText("Available");
            chashuAvailable.setHorizontalAlignment(SwingConstants.CENTER);
            panel1.add(chashuAvailable);
            panel1.add(chashuNumber);
        }
        add(panel1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayout(1, 4));

            //---- last ----
            last.setText("Last");
            panel2.add(last);

            //======== panel3 ========
            {
                panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
            }
            panel2.add(panel3);

            //======== panel4 ========
            {
                panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));
            }
            panel2.add(panel4);

            //---- next ----
            next.setText("Next");
            panel2.add(next);
        }
        add(panel2, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel noriLabel;
    public JLabel noriPrice;
    public JLabel noriAvailable;
    public JSpinner noriNumber;
    private JLabel eggLabel;
    public JLabel eggPrice;
    public JLabel eggAvailable;
    public JSpinner eggNumber;
    private JLabel shootLabel;
    public JLabel shootPrice;
    public JLabel shootAvailable;
    public JSpinner shootNumber;
    private JLabel chashuLabel;
    public JLabel chashuPrice;
    public JLabel chashuAvailable;
    public JSpinner chashuNumber;
    private JPanel panel2;
    public JButton last;
    private JPanel panel3;
    private JPanel panel4;
    public JButton next;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
