/*
 * Created by JFormDesigner on Fri Apr 24 13:13:35 GMT+08:00 2020
 */

package gui.membership;

import java.awt.*;
import javax.swing.*;

/**
 * This is the frame of our create member graphic user interface
 * This page is used to give customers interface to create their member account
 * @author H
 */
public class CreateMember extends JPanel {
    /**
     * Use constructor to create the frame
     */
    public CreateMember() {
        initComponents();
    }
    /**
     * Initialize all components, consist and decorate.
     */
    private void initComponents() {
        boardPanel = new JPanel();
        titlePanel = new JPanel();
        logo = new JLabel();
        bodyPanel = new JPanel();
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel15 = new JPanel();
        label7 = new JLabel();
        panel10 = new JPanel();
        panel8 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        panel7 = new JPanel();
        fNameText = new JTextField();
        lNameText = new JTextField();
        telText = new JTextField();
        emailText = new JTextField();
        panel11 = new JPanel();
        panel12 = new JPanel();
        returnButton = new JButton();
        create = new JButton();
        panel13 = new JPanel();
        panel9 = new JPanel();
        panel14 = new JPanel();
        panel16 = new JPanel();
        label2 = new JLabel();
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
                ((GridBagLayout)bodyPanel.getLayout()).rowHeights = new int[] {25, 395, 25, 0};
                ((GridBagLayout)bodyPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                ((GridBagLayout)bodyPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                //======== panel1 ========
                {
                    panel1.setLayout(new GridBagLayout());
                    ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {284, 466, 200, 0};
                    ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {395, 0};
                    ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                    ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                    //---- label1 ----
                    label1.setIcon(new ImageIcon(getClass().getResource("/img/ad1(395x284).jpg")));
                    panel1.add(label1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //======== panel2 ========
                    {
                        panel2.setBackground(Color.white);
                        panel2.setLayout(new GridBagLayout());
                        ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {35, 396, 35, 0};
                        ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {40, 335, 20, 0};
                        ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                        ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                        //======== panel3 ========
                        {
                            panel3.setBackground(new Color(233, 221, 196));
                            panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
                        }
                        panel2.add(panel3, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== panel15 ========
                        {
                            panel15.setBackground(new Color(233, 221, 196));
                            panel15.setLayout(new GridLayout());

                            //---- label7 ----
                            label7.setText("CreateMemberFunction");
                            label7.setHorizontalAlignment(SwingConstants.CENTER);
                            label7.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                            panel15.add(label7);
                        }
                        panel2.add(panel15, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== panel10 ========
                        {
                            panel10.setBackground(new Color(233, 221, 196));
                            panel10.setLayout(new BoxLayout(panel10, BoxLayout.X_AXIS));
                        }
                        panel2.add(panel10, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== panel8 ========
                        {
                            panel8.setBackground(new Color(233, 221, 196));
                            panel8.setLayout(new BoxLayout(panel8, BoxLayout.X_AXIS));
                        }
                        panel2.add(panel8, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== panel4 ========
                        {
                            panel4.setBackground(new Color(233, 221, 196));
                            panel4.setLayout(new GridBagLayout());
                            ((GridBagLayout)panel4.getLayout()).columnWidths = new int[] {396, 0};
                            ((GridBagLayout)panel4.getLayout()).rowHeights = new int[] {270, 65, 0};
                            ((GridBagLayout)panel4.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                            ((GridBagLayout)panel4.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

                            //======== panel5 ========
                            {
                                panel5.setBackground(new Color(233, 221, 196));
                                panel5.setLayout(new GridBagLayout());
                                ((GridBagLayout)panel5.getLayout()).columnWidths = new int[] {111, 285, 0};
                                ((GridBagLayout)panel5.getLayout()).rowHeights = new int[] {260, 0};
                                ((GridBagLayout)panel5.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                                ((GridBagLayout)panel5.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                                //======== panel6 ========
                                {
                                    panel6.setBackground(new Color(233, 221, 196));
                                    panel6.setLayout(new GridLayout(4, 1, 0, 20));

                                    //---- label3 ----
                                    label3.setText("First name:");
                                    panel6.add(label3);

                                    //---- label4 ----
                                    label4.setText("Last name:");
                                    panel6.add(label4);

                                    //---- label5 ----
                                    label5.setText("Telephone:");
                                    panel6.add(label5);

                                    //---- label6 ----
                                    label6.setText("E-mail:");
                                    panel6.add(label6);
                                }
                                panel5.add(panel6, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                    new Insets(0, 0, 0, 16), 0, 0));

                                //======== panel7 ========
                                {
                                    panel7.setBackground(new Color(233, 221, 196));
                                    panel7.setLayout(new GridLayout(4, 0, 0, 20));
                                    panel7.add(fNameText);
                                    panel7.add(lNameText);
                                    panel7.add(telText);
                                    panel7.add(emailText);
                                }
                                panel5.add(panel7, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                    new Insets(0, 0, 0, 0), 0, 0));
                            }
                            panel4.add(panel5, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 10, 0), 0, 0));

                            //======== panel11 ========
                            {
                                panel11.setBackground(new Color(233, 221, 196));
                                panel11.setLayout(new GridBagLayout());
                                ((GridBagLayout)panel11.getLayout()).columnWidths = new int[] {15, 356, 15, 0};
                                ((GridBagLayout)panel11.getLayout()).rowHeights = new int[] {15, 35, 15, 0};
                                ((GridBagLayout)panel11.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                                ((GridBagLayout)panel11.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                                //======== panel12 ========
                                {
                                    panel12.setBackground(new Color(233, 221, 196));
                                    panel12.setLayout(new GridLayout(1, 2, 20, 0));

                                    //---- returnButton ----
                                    returnButton.setText("Return");
                                    panel12.add(returnButton);

                                    //---- create ----
                                    create.setText("Check and create");
                                    panel12.add(create);
                                }
                                panel11.add(panel12, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                    new Insets(0, 0, 0, 0), 0, 0));
                            }
                            panel4.add(panel11, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));
                        }
                        panel2.add(panel4, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== panel13 ========
                        {
                            panel13.setBackground(new Color(233, 221, 196));
                            panel13.setLayout(new BoxLayout(panel13, BoxLayout.X_AXIS));
                        }
                        panel2.add(panel13, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== panel9 ========
                        {
                            panel9.setBackground(new Color(233, 221, 196));
                            panel9.setLayout(new BoxLayout(panel9, BoxLayout.X_AXIS));
                        }
                        panel2.add(panel9, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== panel14 ========
                        {
                            panel14.setBackground(new Color(233, 221, 196));
                            panel14.setLayout(new BoxLayout(panel14, BoxLayout.X_AXIS));
                        }
                        panel2.add(panel14, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== panel16 ========
                        {
                            panel16.setBackground(new Color(233, 221, 196));
                            panel16.setLayout(new BoxLayout(panel16, BoxLayout.X_AXIS));
                        }
                        panel2.add(panel16, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    panel1.add(panel2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //---- label2 ----
                    label2.setIcon(new ImageIcon(getClass().getResource("/img/Advertisement2(395x200).jpg")));
                    panel1.add(label2, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                bodyPanel.add(panel1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
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
    }

    private JPanel boardPanel;
    private JPanel titlePanel;
    private JLabel logo;
    private JPanel bodyPanel;
    private JPanel panel1;
    private JLabel label1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel15;
    private JLabel label7;
    private JPanel panel10;
    private JPanel panel8;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JPanel panel7;
    public JTextField fNameText;
    public JTextField lNameText;
    public JTextField telText;
    public JTextField emailText;
    private JPanel panel11;
    private JPanel panel12;
    public JButton returnButton;
    public JButton create;
    private JPanel panel13;
    private JPanel panel9;
    private JPanel panel14;
    private JPanel panel16;
    private JLabel label2;
    private JPanel bottomPanel;
    private JPanel bottom_innerPanel;
    private JLabel storeName;
    private JLabel storeAddress;
    private JLabel storeTelphone;
}
