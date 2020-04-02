/*
 * Created by JFormDesigner on Thu Apr 02 09:49:35 CST 2020
 */

package gui.management;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.*;

/**
 * @author Brainrain
 */
public class ChangeMenu extends JPanel {
    public ChangeMenu() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        title = new JLabel();
        mid = new JPanel();
        noodleLable = new JLabel();
        noodlePricePanel = new JPanel();
        noodlePriceLabel = new JLabel();
        noodlePrice = new JSpinner();
        noodleAvailablePanel = new JPanel();
        noriLable = new JLabel();
        noriPricePanel = new JPanel();
        noriPriceLable = new JLabel();
        noriPrice = new JSpinner();
        noriAvailablePanel = new JPanel();
        noriAvailable = new JToggleButton();
        noriUnavailable = new JToggleButton();
        eggLabel = new JLabel();
        eggPricePanel = new JPanel();
        eggPriceLabel = new JLabel();
        eggPrice = new JSpinner();
        eggAvailablePanel = new JPanel();
        eggAvailable = new JToggleButton();
        eggUnavailable = new JToggleButton();
        shootLabel = new JLabel();
        shootPricePanel = new JPanel();
        shootPriceLabel = new JLabel();
        shootPrice = new JSpinner();
        shootAvailablePanel = new JPanel();
        shootAvailable = new JToggleButton();
        shootUnavailable = new JToggleButton();
        chashuLabel = new JLabel();
        chashuPricePanel = new JPanel();
        chashuPriceLabel = new JLabel();
        chashuPrice = new JSpinner();
        chashuAvailablePanel = new JPanel();
        chashuAvailable = new JToggleButton();
        chashuUnavailable = new JToggleButton();
        bellow = new JPanel();
        confirm = new JButton();
        back = new JButton();

        //======== this ========
        setLayout(new BorderLayout(5, 5));

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout(1, 1));

            //---- title ----
            title.setText("Change Your Menu");
            title.setHorizontalAlignment(SwingConstants.CENTER);
            title.setForeground(new Color(238, 238, 238));
            title.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            panel1.add(title);
        }
        add(panel1, BorderLayout.NORTH);

        //======== mid ========
        {
            mid.setLayout(new GridLayout(5, 3, 2, 2));

            //---- noodleLable ----
            noodleLable.setText("Noodles:");
            mid.add(noodleLable);

            //======== noodlePricePanel ========
            {
                noodlePricePanel.setLayout(new GridLayout(1, 2));

                //---- noodlePriceLabel ----
                noodlePriceLabel.setText("Price");
                noodlePricePanel.add(noodlePriceLabel);
                noodlePricePanel.add(noodlePrice);
            }
            mid.add(noodlePricePanel);

            //======== noodleAvailablePanel ========
            {
                noodleAvailablePanel.setLayout(new BoxLayout(noodleAvailablePanel, BoxLayout.X_AXIS));
            }
            mid.add(noodleAvailablePanel);

            //---- noriLable ----
            noriLable.setText("Noris:");
            mid.add(noriLable);

            //======== noriPricePanel ========
            {
                noriPricePanel.setLayout(new GridLayout(1, 2));

                //---- noriPriceLable ----
                noriPriceLable.setText("Price");
                noriPricePanel.add(noriPriceLable);
                noriPricePanel.add(noriPrice);
            }
            mid.add(noriPricePanel);

            //======== noriAvailablePanel ========
            {
                noriAvailablePanel.setLayout(new GridLayout(1, 2));

                //---- noriAvailable ----
                noriAvailable.setText("Available");
                noriAvailablePanel.add(noriAvailable);

                //---- noriUnavailable ----
                noriUnavailable.setText("Unavailable");
                noriAvailablePanel.add(noriUnavailable);
            }
            mid.add(noriAvailablePanel);

            //---- eggLabel ----
            eggLabel.setText("Eggs:");
            mid.add(eggLabel);

            //======== eggPricePanel ========
            {
                eggPricePanel.setLayout(new GridLayout(1, 2));

                //---- eggPriceLabel ----
                eggPriceLabel.setText("Price");
                eggPricePanel.add(eggPriceLabel);
                eggPricePanel.add(eggPrice);
            }
            mid.add(eggPricePanel);

            //======== eggAvailablePanel ========
            {
                eggAvailablePanel.setLayout(new GridLayout(1, 2));

                //---- eggAvailable ----
                eggAvailable.setText("Available");
                eggAvailablePanel.add(eggAvailable);

                //---- eggUnavailable ----
                eggUnavailable.setText("Unavailable");
                eggAvailablePanel.add(eggUnavailable);
            }
            mid.add(eggAvailablePanel);

            //---- shootLabel ----
            shootLabel.setText("Shoots:");
            mid.add(shootLabel);

            //======== shootPricePanel ========
            {
                shootPricePanel.setLayout(new GridLayout(1, 2));

                //---- shootPriceLabel ----
                shootPriceLabel.setText("Price");
                shootPricePanel.add(shootPriceLabel);
                shootPricePanel.add(shootPrice);
            }
            mid.add(shootPricePanel);

            //======== shootAvailablePanel ========
            {
                shootAvailablePanel.setLayout(new GridLayout(1, 2));

                //---- shootAvailable ----
                shootAvailable.setText("Available");
                shootAvailablePanel.add(shootAvailable);

                //---- shootUnavailable ----
                shootUnavailable.setText("Unavailable");
                shootAvailablePanel.add(shootUnavailable);
            }
            mid.add(shootAvailablePanel);

            //---- chashuLabel ----
            chashuLabel.setText("Chashu:");
            mid.add(chashuLabel);

            //======== chashuPricePanel ========
            {
                chashuPricePanel.setLayout(new GridLayout(1, 2));

                //---- chashuPriceLabel ----
                chashuPriceLabel.setText("Price");
                chashuPricePanel.add(chashuPriceLabel);
                chashuPricePanel.add(chashuPrice);
            }
            mid.add(chashuPricePanel);

            //======== chashuAvailablePanel ========
            {
                chashuAvailablePanel.setLayout(new GridLayout(1, 2));

                //---- chashuAvailable ----
                chashuAvailable.setText("Available");
                chashuAvailablePanel.add(chashuAvailable);

                //---- chashuUnavailable ----
                chashuUnavailable.setText("Unavailable");
                chashuAvailablePanel.add(chashuUnavailable);
            }
            mid.add(chashuAvailablePanel);
        }
        add(mid, BorderLayout.CENTER);

        //======== bellow ========
        {
            bellow.setLayout(new GridLayout(1, 2));

            //---- confirm ----
            confirm.setText("Confirm");
            bellow.add(confirm);

            //---- back ----
            back.setText("Return");
            bellow.add(back);
        }
        add(bellow, BorderLayout.SOUTH);

        //---- noriGroup ----
        ButtonGroup noriGroup = new ButtonGroup();
        noriGroup.add(noriAvailable);
        noriGroup.add(noriUnavailable);

        //---- eggGroup ----
        ButtonGroup eggGroup = new ButtonGroup();
        eggGroup.add(eggAvailable);
        eggGroup.add(eggUnavailable);

        //---- shootGroup ----
        ButtonGroup shootGroup = new ButtonGroup();
        shootGroup.add(shootAvailable);
        shootGroup.add(shootUnavailable);

        //---- chashuGroup ----
        ButtonGroup chashuGroup = new ButtonGroup();
        chashuGroup.add(chashuAvailable);
        chashuGroup.add(chashuUnavailable);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel title;
    private JPanel mid;
    private JLabel noodleLable;
    public JPanel noodlePricePanel;
    private JLabel noodlePriceLabel;
    private JSpinner noodlePrice;
    private JPanel noodleAvailablePanel;
    private JLabel noriLable;
    private JPanel noriPricePanel;
    private JLabel noriPriceLable;
    private JSpinner noriPrice;
    private JPanel noriAvailablePanel;
    private JToggleButton noriAvailable;
    private JToggleButton noriUnavailable;
    private JLabel eggLabel;
    private JPanel eggPricePanel;
    private JLabel eggPriceLabel;
    private JSpinner eggPrice;
    private JPanel eggAvailablePanel;
    private JToggleButton eggAvailable;
    private JToggleButton eggUnavailable;
    private JLabel shootLabel;
    private JPanel shootPricePanel;
    private JLabel shootPriceLabel;
    private JSpinner shootPrice;
    private JPanel shootAvailablePanel;
    private JToggleButton shootAvailable;
    private JToggleButton shootUnavailable;
    private JLabel chashuLabel;
    private JPanel chashuPricePanel;
    private JLabel chashuPriceLabel;
    private JSpinner chashuPrice;
    private JPanel chashuAvailablePanel;
    private JToggleButton chashuAvailable;
    private JToggleButton chashuUnavailable;
    private JPanel bellow;
    public JButton confirm;
    public JButton back;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
