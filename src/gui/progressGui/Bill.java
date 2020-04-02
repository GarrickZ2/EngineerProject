/*
 * Created by JFormDesigner on Thu Apr 02 09:28:22 GMT+08:00 2020
 */

package gui.progressGui;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jgoodies.forms.factories.*;



/**
 * @author Brainrain
 */
public class Bill extends JPanel {
    public Bill() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        titlePanel = new JPanel();
        title_textPanel = new JPanel();
        title_serialNumber = new JLabel();
        title_time = new JLabel();
        title_membershipNumber = new JLabel();
        itemPanel = new JPanel();
        item_requiredOption = new JPanel();
        item_headPart = new JPanel();
        item_text_requiredOption = new JLabel();
        item_picture = new JLabel();
        item_gapPanel = new JPanel();
        panel7 = new JPanel();
        item_text_gap0 = new JLabel();
        item_listPanel_itemName = new JPanel();
        item_text_soup = new JLabel();
        item_text_noodle = new JLabel();
        item_text_springOnion = new JLabel();
        item_text_spiciness = new JLabel();
        item_listPanel_itemDetail = new JPanel();
        item_text_gap1 = new JLabel();
        item_listPanel_itemVariable = new JPanel();
        item_variable_soup = new JLabel();
        item_variable_noodleType = new JLabel();
        item_variable_springOnion = new JLabel();
        item_variable_spiciness = new JLabel();
        item_additionalOption = new JPanel();
        item_text_additionalOption = new JLabel();
        item_additionalPanel = new JPanel();
        item_text_nori = new JLabel();
        item_variable_isNori = new JLabel();
        item_text_Extra0 = new JLabel();
        item_text_boiledEgg = new JLabel();
        item_variable_isBoiledEgg = new JLabel();
        item_text_Extra1 = new JLabel();
        item_text_shoot = new JLabel();
        item_variable_isShoot = new JLabel();
        item_text_Extra2 = new JLabel();
        item_text_chashu = new JLabel();
        item_variable_isChashu = new JLabel();
        item_text_Extra3 = new JLabel();
        item_addPricePanel = new JPanel();
        item_variable_extraNori = new JLabel();
        item_text_pound0 = new JLabel();
        item_variable_exNoriPrice = new JLabel();
        item_variable_extraBoiledEgg = new JLabel();
        item_text_pound1 = new JLabel();
        item_variable_exBgPrice = new JLabel();
        item_variable_extraShoot = new JLabel();
        item_text_pound2 = new JLabel();
        item_variable_exShootPrice = new JLabel();
        item_variable_extraChashu = new JLabel();
        item_text_pound3 = new JLabel();
        item_variable_exChashuPrice = new JLabel();
        tailPanel = new JPanel();
        tail_optionPanel = new JPanel();
        tail_text_diningMethod = new JLabel();
        tail_tButton_dinning_variable_eatIn = new JToggleButton();
        tail_tButton_dinning_variable_takeAway = new JToggleButton();
        tail_text_payingMethod = new JLabel();
        tail_tButton_paying_cash = new JToggleButton();
        tail_tButton_paying_visa = new JToggleButton();
        tail_totalPricePanel = new JPanel();
        tail_text_totalPrice = new JLabel();
        tail_innerPanel = new JPanel();
        tail_text_pound = new JLabel();
        tail_variable_totalPrice = new JLabel();
        tail_cardChangePanel = new JPanel();
        tail_cardChange_return = new JButton();
        tail_cardChange_settleBill = new JButton();
        ButtonGroup tail_tButtonGroup_payingMethod = new ButtonGroup();
        ButtonGroup tail_tButtonGroup_diningMethod = new ButtonGroup();


        //======== this ========
        setBorder(new CompoundBorder(
            new TitledBorder("Payment"),
            Borders.DLU2));
        setLayout(new BorderLayout());

        //======== titlePanel ========
        {
            titlePanel.setBorder(new EtchedBorder());
            titlePanel.setLayout(new GridLayout());

            //======== title_textPanel ========
            {
                title_textPanel.setLayout(new GridLayout(3, 1));

                //---- title_serialNumber ----
                title_serialNumber.setText("  Serial Number:200345548218752");
                title_textPanel.add(title_serialNumber);

                //---- title_time ----
                title_time.setText("  Time:2020-03-28 20:21:15");
                title_textPanel.add(title_time);

                //---- title_membershipNumber ----
                title_membershipNumber.setText("  Membership Number: 00000001");
                title_textPanel.add(title_membershipNumber);
            }
            titlePanel.add(title_textPanel);
        }
        add(titlePanel, BorderLayout.NORTH);

        //======== itemPanel ========
        {
            itemPanel.setLayout(new GridLayout(2, 0));

            //======== item_requiredOption ========
            {
                item_requiredOption.setBorder(new EtchedBorder());
                item_requiredOption.setLayout(new GridBagLayout());
                ((GridBagLayout)item_requiredOption.getLayout()).columnWidths = new int[] {0, 0, 0, 0};
                ((GridBagLayout)item_requiredOption.getLayout()).rowHeights = new int[] {0, 0};
                ((GridBagLayout)item_requiredOption.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                ((GridBagLayout)item_requiredOption.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

                //======== item_headPart ========
                {
                    item_headPart.setLayout(new GridBagLayout());
                    ((GridBagLayout)item_headPart.getLayout()).columnWidths = new int[] {0, 0, 0, 0};
                    ((GridBagLayout)item_headPart.getLayout()).rowHeights = new int[] {0, 0};
                    ((GridBagLayout)item_headPart.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                    ((GridBagLayout)item_headPart.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

                    //---- item_text_requiredOption ----
                    item_text_requiredOption.setText("  Required Options    ");
                    item_text_requiredOption.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                    item_headPart.add(item_text_requiredOption, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //---- item_picture ----
                    item_picture.setIcon(new ImageIcon(getClass().getResource("/img/1.jpg")));
                    item_headPart.add(item_picture, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //======== item_gapPanel ========
                    {
                        item_gapPanel.setMinimumSize(new Dimension(20, 10));
                    }
                    item_headPart.add(item_gapPanel, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                item_requiredOption.add(item_headPart, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0), 0, 0));

                //======== panel7 ========
                {
                    panel7.setLayout(new BorderLayout());
                    panel7.add(item_text_gap0, BorderLayout.NORTH);

                    //======== item_listPanel_itemName ========
                    {
                        item_listPanel_itemName.setLayout(new GridLayout(4, 1));

                        //---- item_text_soup ----
                        item_text_soup.setText("Soup: ");
                        item_text_soup.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                        item_listPanel_itemName.add(item_text_soup);

                        //---- item_text_noodle ----
                        item_text_noodle.setText("Noodle: ");
                        item_text_noodle.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                        item_listPanel_itemName.add(item_text_noodle);

                        //---- item_text_springOnion ----
                        item_text_springOnion.setText("Spring Onion:");
                        item_text_springOnion.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                        item_listPanel_itemName.add(item_text_springOnion);

                        //---- item_text_spiciness ----
                        item_text_spiciness.setText("Spiciness:");
                        item_text_spiciness.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                        item_listPanel_itemName.add(item_text_spiciness);
                    }
                    panel7.add(item_listPanel_itemName, BorderLayout.WEST);
                }
                item_requiredOption.add(panel7, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0), 0, 0));

                //======== item_listPanel_itemDetail ========
                {
                    item_listPanel_itemDetail.setLayout(new BorderLayout());
                    item_listPanel_itemDetail.add(item_text_gap1, BorderLayout.NORTH);

                    //======== item_listPanel_itemVariable ========
                    {
                        item_listPanel_itemVariable.setLayout(new GridLayout(4, 1));

                        //---- item_variable_soup ----
                        item_variable_soup.setText("  Tonkotsu");
                        item_variable_soup.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                        item_listPanel_itemVariable.add(item_variable_soup);

                        //---- item_variable_noodleType ----
                        item_variable_noodleType.setText("  Soft");
                        item_variable_noodleType.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                        item_listPanel_itemVariable.add(item_variable_noodleType);

                        //---- item_variable_springOnion ----
                        item_variable_springOnion.setText("  No please");
                        item_variable_springOnion.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                        item_listPanel_itemVariable.add(item_variable_springOnion);

                        //---- item_variable_spiciness ----
                        item_variable_spiciness.setText("  5");
                        item_variable_spiciness.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                        item_listPanel_itemVariable.add(item_variable_spiciness);
                    }
                    item_listPanel_itemDetail.add(item_listPanel_itemVariable, BorderLayout.WEST);
                }
                item_requiredOption.add(item_listPanel_itemDetail, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            itemPanel.add(item_requiredOption);

            //======== item_additionalOption ========
            {
                item_additionalOption.setBorder(new EtchedBorder());
                item_additionalOption.setLayout(new GridBagLayout());
                ((GridBagLayout)item_additionalOption.getLayout()).columnWidths = new int[] {0, 0, 0, 0};
                ((GridBagLayout)item_additionalOption.getLayout()).rowHeights = new int[] {0, 0};
                ((GridBagLayout)item_additionalOption.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                ((GridBagLayout)item_additionalOption.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

                //---- item_text_additionalOption ----
                item_text_additionalOption.setText("  Additional Options  ");
                item_text_additionalOption.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                item_additionalOption.add(item_text_additionalOption, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0), 0, 0));

                //======== item_additionalPanel ========
                {
                    item_additionalPanel.setLayout(new GridLayout(4, 3));

                    //---- item_text_nori ----
                    item_text_nori.setText("Nori:");
                    item_text_nori.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                    item_additionalPanel.add(item_text_nori);

                    //---- item_variable_isNori ----
                    item_variable_isNori.setText("  No");
                    item_variable_isNori.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                    item_additionalPanel.add(item_variable_isNori);

                    //---- item_text_Extra0 ----
                    item_text_Extra0.setText("Extra:  ");
                    item_text_Extra0.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                    item_additionalPanel.add(item_text_Extra0);

                    //---- item_text_boiledEgg ----
                    item_text_boiledEgg.setText("Boiled egg:");
                    item_text_boiledEgg.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                    item_additionalPanel.add(item_text_boiledEgg);

                    //---- item_variable_isBoiledEgg ----
                    item_variable_isBoiledEgg.setText("  Yes");
                    item_variable_isBoiledEgg.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                    item_additionalPanel.add(item_variable_isBoiledEgg);

                    //---- item_text_Extra1 ----
                    item_text_Extra1.setText("Extra:  ");
                    item_text_Extra1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                    item_additionalPanel.add(item_text_Extra1);

                    //---- item_text_shoot ----
                    item_text_shoot.setText("Shoot:");
                    item_text_shoot.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                    item_additionalPanel.add(item_text_shoot);

                    //---- item_variable_isShoot ----
                    item_variable_isShoot.setText("  Yes");
                    item_variable_isShoot.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                    item_additionalPanel.add(item_variable_isShoot);

                    //---- item_text_Extra2 ----
                    item_text_Extra2.setText("Extra:  ");
                    item_text_Extra2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                    item_additionalPanel.add(item_text_Extra2);

                    //---- item_text_chashu ----
                    item_text_chashu.setText("Chashu:");
                    item_text_chashu.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                    item_additionalPanel.add(item_text_chashu);

                    //---- item_variable_isChashu ----
                    item_variable_isChashu.setText("  Yes");
                    item_variable_isChashu.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                    item_additionalPanel.add(item_variable_isChashu);

                    //---- item_text_Extra3 ----
                    item_text_Extra3.setText("Extra:  ");
                    item_text_Extra3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                    item_additionalPanel.add(item_text_Extra3);
                }
                item_additionalOption.add(item_additionalPanel, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0), 0, 0));

                //======== item_addPricePanel ========
                {
                    item_addPricePanel.setLayout(new GridLayout(4, 3));

                    //---- item_variable_extraNori ----
                    item_variable_extraNori.setText("0");
                    item_addPricePanel.add(item_variable_extraNori);

                    //---- item_text_pound0 ----
                    item_text_pound0.setText("\uffe1");
                    item_addPricePanel.add(item_text_pound0);

                    //---- item_variable_exNoriPrice ----
                    item_variable_exNoriPrice.setText("0");
                    item_addPricePanel.add(item_variable_exNoriPrice);

                    //---- item_variable_extraBoiledEgg ----
                    item_variable_extraBoiledEgg.setText("0");
                    item_addPricePanel.add(item_variable_extraBoiledEgg);

                    //---- item_text_pound1 ----
                    item_text_pound1.setText("\uffe1");
                    item_addPricePanel.add(item_text_pound1);

                    //---- item_variable_exBgPrice ----
                    item_variable_exBgPrice.setText("0");
                    item_addPricePanel.add(item_variable_exBgPrice);

                    //---- item_variable_extraShoot ----
                    item_variable_extraShoot.setText("1");
                    item_addPricePanel.add(item_variable_extraShoot);

                    //---- item_text_pound2 ----
                    item_text_pound2.setText("\uffe1");
                    item_addPricePanel.add(item_text_pound2);

                    //---- item_variable_exShootPrice ----
                    item_variable_exShootPrice.setText("1");
                    item_addPricePanel.add(item_variable_exShootPrice);

                    //---- item_variable_extraChashu ----
                    item_variable_extraChashu.setText("1");
                    item_addPricePanel.add(item_variable_extraChashu);

                    //---- item_text_pound3 ----
                    item_text_pound3.setText("\uffe1");
                    item_addPricePanel.add(item_text_pound3);

                    //---- item_variable_exChashuPrice ----
                    item_variable_exChashuPrice.setText("2");
                    item_addPricePanel.add(item_variable_exChashuPrice);
                }
                item_additionalOption.add(item_addPricePanel, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            itemPanel.add(item_additionalOption);
        }
        add(itemPanel, BorderLayout.CENTER);

        //======== tailPanel ========
        {
            tailPanel.setLayout(new BorderLayout());

            //======== tail_optionPanel ========
            {
                tail_optionPanel.setLayout(new GridLayout(2, 3));

                //---- tail_text_diningMethod ----
                tail_text_diningMethod.setText("  Dining Method:");
                tail_optionPanel.add(tail_text_diningMethod);

                //---- tail_tButton_dinning_variable_eatIn ----
                tail_tButton_dinning_variable_eatIn.setText("Eat in");
                tail_optionPanel.add(tail_tButton_dinning_variable_eatIn);

                //---- tail_tButton_dinning_variable_takeAway ----
                tail_tButton_dinning_variable_takeAway.setText("Take away");
                tail_optionPanel.add(tail_tButton_dinning_variable_takeAway);

                //---- tail_text_payingMethod ----
                tail_text_payingMethod.setText("  Paying Method:");
                tail_optionPanel.add(tail_text_payingMethod);

                //---- tail_tButton_paying_cash ----
                tail_tButton_paying_cash.setText("Cash");
                tail_optionPanel.add(tail_tButton_paying_cash);

                //---- tail_tButton_paying_visa ----
                tail_tButton_paying_visa.setText("Visa");
                tail_optionPanel.add(tail_tButton_paying_visa);

                tail_tButtonGroup_diningMethod.add(tail_tButton_dinning_variable_eatIn);
                tail_tButtonGroup_diningMethod.add(tail_tButton_dinning_variable_takeAway);
                tail_tButtonGroup_payingMethod.add(tail_tButton_paying_cash);
                tail_tButtonGroup_payingMethod.add(tail_tButton_paying_visa);
            }
            tailPanel.add(tail_optionPanel, BorderLayout.NORTH);

            //======== tail_totalPricePanel ========
            {
                tail_totalPricePanel.setLayout(new GridLayout(1, 2));

                //---- tail_text_totalPrice ----
                tail_text_totalPrice.setText("  Total Price:");
                tail_totalPricePanel.add(tail_text_totalPrice);

                //======== tail_innerPanel ========
                {
                    tail_innerPanel.setLayout(new GridLayout(1, 2));

                    //---- tail_text_pound ----
                    tail_text_pound.setText("\uffe1");
                    tail_text_pound.setHorizontalAlignment(SwingConstants.TRAILING);
                    tail_innerPanel.add(tail_text_pound);

                    //---- tail_variable_totalPrice ----
                    tail_variable_totalPrice.setText("13.99");
                    tail_innerPanel.add(tail_variable_totalPrice);
                }
                tail_totalPricePanel.add(tail_innerPanel);
            }
            tailPanel.add(tail_totalPricePanel, BorderLayout.CENTER);

            //======== tail_cardChangePanel ========
            {
                tail_cardChangePanel.setLayout(new GridLayout(1, 2));

                //---- tail_cardChange_return ----
                tail_cardChange_return.setText("Return");
                tail_cardChangePanel.add(tail_cardChange_return);

                //---- tail_cardChange_settleBill ----
                tail_cardChange_settleBill.setText("Settle");
                tail_cardChangePanel.add(tail_cardChange_settleBill);
            }
            tailPanel.add(tail_cardChangePanel, BorderLayout.SOUTH);
        }
        add(tailPanel, BorderLayout.SOUTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel titlePanel;
    private JPanel title_textPanel;
    private JLabel title_serialNumber;
    private JLabel title_time;
    private JLabel title_membershipNumber;
    private JPanel itemPanel;
    private JPanel item_requiredOption;
    private JPanel item_headPart;
    private JLabel item_text_requiredOption;
    private JLabel item_picture;
    private JPanel item_gapPanel;
    private JPanel panel7;
    private JLabel item_text_gap0;
    private JPanel item_listPanel_itemName;
    private JLabel item_text_soup;
    private JLabel item_text_noodle;
    private JLabel item_text_springOnion;
    private JLabel item_text_spiciness;
    private JPanel item_listPanel_itemDetail;
    private JLabel item_text_gap1;
    private JPanel item_listPanel_itemVariable;
    private JLabel item_variable_soup;
    private JLabel item_variable_noodleType;
    private JLabel item_variable_springOnion;
    private JLabel item_variable_spiciness;
    private JPanel item_additionalOption;
    private JLabel item_text_additionalOption;
    private JPanel item_additionalPanel;
    private JLabel item_text_nori;
    private JLabel item_variable_isNori;
    private JLabel item_text_Extra0;
    private JLabel item_text_boiledEgg;
    private JLabel item_variable_isBoiledEgg;
    private JLabel item_text_Extra1;
    private JLabel item_text_shoot;
    private JLabel item_variable_isShoot;
    private JLabel item_text_Extra2;
    private JLabel item_text_chashu;
    private JLabel item_variable_isChashu;
    private JLabel item_text_Extra3;
    private JPanel item_addPricePanel;
    private JLabel item_variable_extraNori;
    private JLabel item_text_pound0;
    private JLabel item_variable_exNoriPrice;
    private JLabel item_variable_extraBoiledEgg;
    private JLabel item_text_pound1;
    private JLabel item_variable_exBgPrice;
    private JLabel item_variable_extraShoot;
    private JLabel item_text_pound2;
    private JLabel item_variable_exShootPrice;
    private JLabel item_variable_extraChashu;
    private JLabel item_text_pound3;
    private JLabel item_variable_exChashuPrice;
    private JPanel tailPanel;
    private JPanel tail_optionPanel;
    private JLabel tail_text_diningMethod;
    private JToggleButton tail_tButton_dinning_variable_eatIn;
    private JToggleButton tail_tButton_dinning_variable_takeAway;
    private JLabel tail_text_payingMethod;
    private JToggleButton tail_tButton_paying_cash;
    private JToggleButton tail_tButton_paying_visa;
    private JPanel tail_totalPricePanel;
    private JLabel tail_text_totalPrice;
    private JPanel tail_innerPanel;
    private JLabel tail_text_pound;
    private JLabel tail_variable_totalPrice;
    private JPanel tail_cardChangePanel;
    private JButton tail_cardChange_return;
    private JButton tail_cardChange_settleBill;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
