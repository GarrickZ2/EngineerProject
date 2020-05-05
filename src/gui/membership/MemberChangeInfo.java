/*
 * Created by JFormDesigner on Tue Apr 21 11:14:00 GMT+08:00 2020
 */

package gui.membership;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Brainrain
 */
public class MemberChangeInfo extends JPanel {
    public MemberChangeInfo() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        boardPanel = new JPanel();
        titlePanel = new JPanel();
        logo = new JLabel();
        bodyPanel = new JPanel();
        body_innerPanel = new JPanel();
        left_advertisment = new JLabel();
        body_midPanel = new JPanel();
        changablePanel = new JPanel();
        label_fName = new JLabel();
        sug_fName = new JLabel();
        label_lName = new JLabel();
        sug_lName = new JLabel();
        label_telephone = new JLabel();
        sug_telephone = new JLabel();
        label_eMail = new JLabel();
        sug_eMail = new JLabel();
        unchangablePanel = new JPanel();
        label_membershipNumber = new JLabel();
        membershipNumber = new JLabel();
        label_registrationDate = new JLabel();
        regDate = new JLabel();
        label_couponNumber = new JLabel();
        coupon = new JLabel();
        lastCosumptionPanel = new JPanel();
        label_consumptionTime = new JLabel();
        consumptionTime = new JLabel();
        label_consumptionCost = new JLabel();
        consumptionCost = new JLabel();
        label_consumptionUseCoupon = new JLabel();
        consumptionUseCoupon = new JLabel();
        body_rightPanel = new JPanel();
        right_advertisement = new JLabel();
        changeInfoPanel = new JPanel();
        label_change_fName = new JLabel();
        change_fName = new JTextField();
        label_change_lName = new JLabel();
        change_lName = new JTextField();
        label_change_telephone = new JLabel();
        change_telephone = new JTextField();
        label_change_eMail = new JLabel();
        change_eMail = new JTextField();
        buttonPanel = new JPanel();
        returnButton = new JButton();
        emptyBox0 = new JPanel();
        saveAndChangeButton = new JButton();
        changeSuggestion = new JLabel();
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

                //======== body_innerPanel ========
                {
                    body_innerPanel.setBackground(Color.white);
                    body_innerPanel.setLayout(new GridBagLayout());
                    ((GridBagLayout)body_innerPanel.getLayout()).columnWidths = new int[] {200, 25, 325, 25, 375, 0};
                    ((GridBagLayout)body_innerPanel.getLayout()).rowHeights = new int[] {395, 0};
                    ((GridBagLayout)body_innerPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
                    ((GridBagLayout)body_innerPanel.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                    //---- left_advertisment ----
                    left_advertisment.setIcon(new ImageIcon(getClass().getResource("/img/Advertisement2(395x200).jpg")));
                    body_innerPanel.add(left_advertisment, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //======== body_midPanel ========
                    {
                        body_midPanel.setBackground(Color.white);
                        body_midPanel.setLayout(new GridBagLayout());
                        ((GridBagLayout)body_midPanel.getLayout()).columnWidths = new int[] {325, 0};
                        ((GridBagLayout)body_midPanel.getLayout()).rowHeights = new int[] {156, 117, 5, 117, 0};
                        ((GridBagLayout)body_midPanel.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                        ((GridBagLayout)body_midPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

                        //======== changablePanel ========
                        {
                            changablePanel.setBorder(new TitledBorder("Changable information"));
                            changablePanel.setBackground(Color.white);
                            changablePanel.setLayout(new GridLayout(4, 2));

                            //---- label_fName ----
                            label_fName.setText("First name:");
                            changablePanel.add(label_fName);

                            //---- sug_fName ----
                            sug_fName.setText("Huang");
                            changablePanel.add(sug_fName);

                            //---- label_lName ----
                            label_lName.setText("Last name:");
                            changablePanel.add(label_lName);

                            //---- sug_lName ----
                            sug_lName.setText("Huang");
                            changablePanel.add(sug_lName);

                            //---- label_telephone ----
                            label_telephone.setText("Telephone:");
                            changablePanel.add(label_telephone);

                            //---- sug_telephone ----
                            sug_telephone.setText("15500043370");
                            changablePanel.add(sug_telephone);

                            //---- label_eMail ----
                            label_eMail.setText("E-mail:");
                            changablePanel.add(label_eMail);

                            //---- sug_eMail ----
                            sug_eMail.setText("447243910@qq.com");
                            changablePanel.add(sug_eMail);
                        }
                        body_midPanel.add(changablePanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== unchangablePanel ========
                        {
                            unchangablePanel.setBorder(new TitledBorder("Unchangable information"));
                            unchangablePanel.setBackground(Color.white);
                            unchangablePanel.setLayout(new GridLayout(3, 2));

                            //---- label_membershipNumber ----
                            label_membershipNumber.setText("Membership number:");
                            unchangablePanel.add(label_membershipNumber);

                            //---- membershipNumber ----
                            membershipNumber.setText("00000001");
                            unchangablePanel.add(membershipNumber);

                            //---- label_registrationDate ----
                            label_registrationDate.setText("Registration date:");
                            unchangablePanel.add(label_registrationDate);

                            //---- regDate ----
                            regDate.setText("2020-04-05");
                            unchangablePanel.add(regDate);

                            //---- label_couponNumber ----
                            label_couponNumber.setText("Coupon number:");
                            unchangablePanel.add(label_couponNumber);

                            //---- coupon ----
                            coupon.setText("5");
                            unchangablePanel.add(coupon);
                        }
                        body_midPanel.add(unchangablePanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== lastCosumptionPanel ========
                        {
                            lastCosumptionPanel.setBorder(new TitledBorder("Last Consumption"));
                            lastCosumptionPanel.setBackground(Color.white);
                            lastCosumptionPanel.setLayout(new GridLayout(3, 2));

                            //---- label_consumptionTime ----
                            label_consumptionTime.setText("Time:");
                            lastCosumptionPanel.add(label_consumptionTime);

                            //---- consumptionTime ----
                            consumptionTime.setText("2020-04-05 11:22:30");
                            lastCosumptionPanel.add(consumptionTime);

                            //---- label_consumptionCost ----
                            label_consumptionCost.setText("Cost:");
                            lastCosumptionPanel.add(label_consumptionCost);

                            //---- consumptionCost ----
                            consumptionCost.setText("\uffe111.9");
                            lastCosumptionPanel.add(consumptionCost);

                            //---- label_consumptionUseCoupon ----
                            label_consumptionUseCoupon.setText("Use coupon:");
                            lastCosumptionPanel.add(label_consumptionUseCoupon);

                            //---- consumptionUseCoupon ----
                            consumptionUseCoupon.setText("False");
                            lastCosumptionPanel.add(consumptionUseCoupon);
                        }
                        body_midPanel.add(lastCosumptionPanel, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    body_innerPanel.add(body_midPanel, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //======== body_rightPanel ========
                    {
                        body_rightPanel.setBackground(Color.white);
                        body_rightPanel.setLayout(new GridBagLayout());
                        ((GridBagLayout)body_rightPanel.getLayout()).columnWidths = new int[] {375, 0};
                        ((GridBagLayout)body_rightPanel.getLayout()).rowHeights = new int[] {125, 10, 160, 10, 40, 10, 40, 0};
                        ((GridBagLayout)body_rightPanel.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                        ((GridBagLayout)body_rightPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

                        //---- right_advertisement ----
                        right_advertisement.setIcon(new ImageIcon(getClass().getResource("/img/ad3(125x375).jpg")));
                        body_rightPanel.add(right_advertisement, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== changeInfoPanel ========
                        {
                            changeInfoPanel.setBorder(new TitledBorder(null, "Change your information here", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
                                new Font("Microsoft YaHei UI", Font.BOLD, 12)));
                            changeInfoPanel.setBackground(Color.white);
                            changeInfoPanel.setLayout(new GridBagLayout());
                            ((GridBagLayout)changeInfoPanel.getLayout()).columnWidths = new int[] {25, 120, 195, 25, 0};
                            ((GridBagLayout)changeInfoPanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0};
                            ((GridBagLayout)changeInfoPanel.getLayout()).columnWeights = new double[] {0.0, 1.0, 1.0, 0.0, 1.0E-4};
                            ((GridBagLayout)changeInfoPanel.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0E-4};

                            //---- label_change_fName ----
                            label_change_fName.setText("First name:");
                            changeInfoPanel.add(label_change_fName, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 5, 0), 0, 0));
                            changeInfoPanel.add(change_fName, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 5, 0), 0, 0));

                            //---- label_change_lName ----
                            label_change_lName.setText("Last name:");
                            changeInfoPanel.add(label_change_lName, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 5, 0), 0, 0));
                            changeInfoPanel.add(change_lName, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 5, 0), 0, 0));

                            //---- label_change_telephone ----
                            label_change_telephone.setText("Telephone:");
                            changeInfoPanel.add(label_change_telephone, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 5, 0), 0, 0));
                            changeInfoPanel.add(change_telephone, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 5, 0), 0, 0));

                            //---- label_change_eMail ----
                            label_change_eMail.setText("E-mail:");
                            changeInfoPanel.add(label_change_eMail, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));
                            changeInfoPanel.add(change_eMail, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));
                        }
                        body_rightPanel.add(changeInfoPanel, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== buttonPanel ========
                        {
                            buttonPanel.setBackground(Color.white);
                            buttonPanel.setLayout(new GridLayout(1, 3));

                            //---- returnButton ----
                            returnButton.setText("Return");
                            buttonPanel.add(returnButton);

                            //======== emptyBox0 ========
                            {
                                emptyBox0.setBackground(Color.white);
                                emptyBox0.setLayout(new BoxLayout(emptyBox0, BoxLayout.X_AXIS));
                            }
                            buttonPanel.add(emptyBox0);

                            //---- saveAndChangeButton ----
                            saveAndChangeButton.setText("Check&Change");
                            buttonPanel.add(saveAndChangeButton);
                        }
                        body_rightPanel.add(buttonPanel, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- changeSuggestion ----
                        changeSuggestion.setText("Change successfully/failed");
                        changeSuggestion.setHorizontalAlignment(SwingConstants.CENTER);
                        body_rightPanel.add(changeSuggestion, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    body_innerPanel.add(body_rightPanel, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                bodyPanel.add(body_innerPanel, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
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
    private JPanel body_innerPanel;
    private JLabel left_advertisment;
    private JPanel body_midPanel;
    private JPanel changablePanel;
    private JLabel label_fName;
    public JLabel sug_fName;
    private JLabel label_lName;
    public JLabel sug_lName;
    private JLabel label_telephone;
    public JLabel sug_telephone;
    private JLabel label_eMail;
    public JLabel sug_eMail;
    private JPanel unchangablePanel;
    private JLabel label_membershipNumber;
    public JLabel membershipNumber;
    private JLabel label_registrationDate;
    public JLabel regDate;
    private JLabel label_couponNumber;
    public JLabel coupon;
    private JPanel lastCosumptionPanel;
    private JLabel label_consumptionTime;
    public JLabel consumptionTime;
    private JLabel label_consumptionCost;
    public JLabel consumptionCost;
    private JLabel label_consumptionUseCoupon;
    public JLabel consumptionUseCoupon;
    private JPanel body_rightPanel;
    private JLabel right_advertisement;
    private JPanel changeInfoPanel;
    private JLabel label_change_fName;
    public JTextField change_fName;
    private JLabel label_change_lName;
    public JTextField change_lName;
    private JLabel label_change_telephone;
    public JTextField change_telephone;
    private JLabel label_change_eMail;
    public JTextField change_eMail;
    private JPanel buttonPanel;
    public JButton returnButton;
    private JPanel emptyBox0;
    public JButton saveAndChangeButton;
    private JLabel changeSuggestion;
    private JPanel bottomPanel;
    private JPanel bottom_innerPanel;
    private JLabel storeName;
    private JLabel storeAddress;
    private JLabel storeTelphone;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
