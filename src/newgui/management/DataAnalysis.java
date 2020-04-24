/*
 * Created by JFormDesigner on Fri Apr 24 14:00:13 GMT+08:00 2020
 */

package newgui.management;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Brainrain
 */
public class DataAnalysis extends JPanel {
    public DataAnalysis() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        boardPanel = new JPanel();
        titlePanel = new JPanel();
        logo = new JLabel();
        bodyPanel = new JPanel();
        emptyBox4 = new JPanel();
        indexPanel = new JPanel();
        menuOperationPanel = new JPanel();
        indexLabel_menuOperation = new JLabel();
        managerPasswordPanel = new JPanel();
        indexLabel_managerPassword = new JLabel();
        dataAnalysisPanel = new JPanel();
        indexLabel_dataAnalysis = new JLabel();
        membershipOperationPanel = new JPanel();
        indexLabel_membershipOperation = new JLabel();
        emptyBox5 = new JPanel();
        bottomPanel = new JPanel();
        bottom_innerPanel = new JPanel();
        storeName = new JLabel();
        storeAddress = new JLabel();
        storeTelphone = new JLabel();

        //======== this ========
        setLayout(new BorderLayout());

        //======== boardPanel ========
        {
            boardPanel.setBackground(Color.white);
            boardPanel.setLayout(new GridBagLayout());
            ((GridBagLayout)boardPanel.getLayout()).columnWidths = new int[] {1000, 0};
            ((GridBagLayout)boardPanel.getLayout()).rowHeights = new int[] {100, 445, 75, 0};
            ((GridBagLayout)boardPanel.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
            ((GridBagLayout)boardPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

            //======== titlePanel ========
            {
                titlePanel.setBackground(new Color(248, 193, 84));
                titlePanel.setLayout(new GridBagLayout());
                ((GridBagLayout)titlePanel.getLayout()).columnWidths = new int[] {25, 950, 25, 0};
                ((GridBagLayout)titlePanel.getLayout()).rowHeights = new int[] {100, 0};
                ((GridBagLayout)titlePanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                ((GridBagLayout)titlePanel.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                //---- logo ----
                logo.setIcon(new ImageIcon(getClass().getResource("/img/titleLogo.png")));
                titlePanel.add(logo, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            boardPanel.add(titlePanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));

            //======== bodyPanel ========
            {
                bodyPanel.setBackground(Color.white);
                bodyPanel.setLayout(new GridBagLayout());
                ((GridBagLayout)bodyPanel.getLayout()).columnWidths = new int[] {25, 950, 25, 0};
                ((GridBagLayout)bodyPanel.getLayout()).rowHeights = new int[] {30, 395, 20, 0};
                ((GridBagLayout)bodyPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                ((GridBagLayout)bodyPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                //======== emptyBox4 ========
                {
                    emptyBox4.setBackground(new Color(242, 156, 59, 86));
                    emptyBox4.setLayout(new BoxLayout(emptyBox4, BoxLayout.X_AXIS));
                }
                bodyPanel.add(emptyBox4, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));

                //======== indexPanel ========
                {
                    indexPanel.setBackground(new Color(242, 156, 59, 86));
                    indexPanel.setLayout(new GridBagLayout());
                    ((GridBagLayout)indexPanel.getLayout()).columnWidths = new int[] {150, 150, 150, 150, 350, 0};
                    ((GridBagLayout)indexPanel.getLayout()).rowHeights = new int[] {30, 0};
                    ((GridBagLayout)indexPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
                    ((GridBagLayout)indexPanel.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                    //======== menuOperationPanel ========
                    {
                        menuOperationPanel.setBackground(new Color(242, 156, 59, 0));
                        menuOperationPanel.setLayout(new GridLayout(1, 1));

                        //---- indexLabel_menuOperation ----
                        indexLabel_menuOperation.setText("Menu operation");
                        indexLabel_menuOperation.setHorizontalAlignment(SwingConstants.CENTER);
                        menuOperationPanel.add(indexLabel_menuOperation);
                    }
                    indexPanel.add(menuOperationPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //======== managerPasswordPanel ========
                    {
                        managerPasswordPanel.setBackground(new Color(242, 156, 59, 0));
                        managerPasswordPanel.setLayout(new GridLayout());

                        //---- indexLabel_managerPassword ----
                        indexLabel_managerPassword.setText("Manager password");
                        indexLabel_managerPassword.setHorizontalAlignment(SwingConstants.CENTER);
                        managerPasswordPanel.add(indexLabel_managerPassword);
                    }
                    indexPanel.add(managerPasswordPanel, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //======== dataAnalysisPanel ========
                    {
                        dataAnalysisPanel.setBackground(Color.white);
                        dataAnalysisPanel.setLayout(new GridLayout());

                        //---- indexLabel_dataAnalysis ----
                        indexLabel_dataAnalysis.setText("Data analysis");
                        indexLabel_dataAnalysis.setHorizontalAlignment(SwingConstants.CENTER);
                        indexLabel_dataAnalysis.setBackground(new Color(242, 156, 59, 86));
                        dataAnalysisPanel.add(indexLabel_dataAnalysis);
                    }
                    indexPanel.add(dataAnalysisPanel, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //======== membershipOperationPanel ========
                    {
                        membershipOperationPanel.setBackground(new Color(242, 156, 59, 0));
                        membershipOperationPanel.setLayout(new GridLayout());

                        //---- indexLabel_membershipOperation ----
                        indexLabel_membershipOperation.setText("Membership operation");
                        indexLabel_membershipOperation.setHorizontalAlignment(SwingConstants.CENTER);
                        indexLabel_membershipOperation.setBackground(new Color(242, 242, 242, 0));
                        membershipOperationPanel.add(indexLabel_membershipOperation);
                    }
                    indexPanel.add(membershipOperationPanel, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                bodyPanel.add(indexPanel, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));

                //======== emptyBox5 ========
                {
                    emptyBox5.setBackground(new Color(242, 156, 59, 86));
                    emptyBox5.setLayout(new BoxLayout(emptyBox5, BoxLayout.X_AXIS));
                }
                bodyPanel.add(emptyBox5, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            boardPanel.add(bodyPanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));

            //======== bottomPanel ========
            {
                bottomPanel.setBackground(new Color(252, 251, 245));
                bottomPanel.setLayout(new GridBagLayout());
                ((GridBagLayout)bottomPanel.getLayout()).columnWidths = new int[] {20, 990, 0};
                ((GridBagLayout)bottomPanel.getLayout()).rowHeights = new int[] {5, 65, 5, 0};
                ((GridBagLayout)bottomPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                ((GridBagLayout)bottomPanel.getLayout()).rowWeights = new double[] {0.0, 1.0, 0.0, 1.0E-4};

                //======== bottom_innerPanel ========
                {
                    bottom_innerPanel.setBackground(new Color(252, 251, 245));
                    bottom_innerPanel.setLayout(new GridLayout(3, 1));

                    //---- storeName ----
                    storeName.setText("TOTORO Ramen");
                    storeName.setBackground(new Color(252, 251, 245));
                    bottom_innerPanel.add(storeName);

                    //---- storeAddress ----
                    storeAddress.setText("Address: B15 Baker Street in London");
                    bottom_innerPanel.add(storeAddress);

                    //---- storeTelphone ----
                    storeTelphone.setText("Telphone: 44 (0) 203 178 4861");
                    bottom_innerPanel.add(storeTelphone);
                }
                bottomPanel.add(bottom_innerPanel, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            boardPanel.add(bottomPanel, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        add(boardPanel, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel boardPanel;
    private JPanel titlePanel;
    private JLabel logo;
    private JPanel bodyPanel;
    private JPanel emptyBox4;
    private JPanel indexPanel;
    public JPanel menuOperationPanel;
    private JLabel indexLabel_menuOperation;
    public JPanel managerPasswordPanel;
    private JLabel indexLabel_managerPassword;
    public JPanel dataAnalysisPanel;
    private JLabel indexLabel_dataAnalysis;
    public JPanel membershipOperationPanel;
    private JLabel indexLabel_membershipOperation;
    private JPanel emptyBox5;
    private JPanel bottomPanel;
    private JPanel bottom_innerPanel;
    private JLabel storeName;
    private JLabel storeAddress;
    private JLabel storeTelphone;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
