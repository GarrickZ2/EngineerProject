/*
 * Created by JFormDesigner on Sun Apr 19 16:51:11 GMT+08:00 2020
 */

package gui.order;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Brainrain
 */
public class Payment extends JPanel {
    public Payment() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        boardPanel = new JPanel();
        titlePanel = new JPanel();
        logo = new JLabel();
        body = new JPanel();
        body_innerPanel = new JPanel();
        advertisementPanel = new JPanel();
        advertisement = new JLabel();
        MessageBoardPanel = new JPanel();
        mb_leftPanel = new JPanel();
        informtionPanel = new JPanel();
        label_serialNumber = new JLabel();
        serialNumber = new JLabel();
        label_time = new JLabel();
        time = new JLabel();
        itemPanel = new JPanel();
        item_topPanel = new JPanel();
        noodleInfo_list = new JPanel();
        label_soup = new JLabel();
        label_noodle = new JLabel();
        label_onion = new JLabel();
        label_spiciness = new JLabel();
        noodleInfo_variable = new JPanel();
        soup = new JLabel();
        noodle = new JLabel();
        onion = new JLabel();
        spiciness = new JLabel();
        noodleInfo_empty = new JPanel();
        emptyBox0 = new JPanel();
        emptyBox1 = new JPanel();
        emptyBox2 = new JPanel();
        emptyBox3 = new JPanel();
        soupPicturePanel = new JPanel();
        soupPicture = new JLabel();
        item_bottomPanel = new JPanel();
        label_nori = new JLabel();
        nori = new JLabel();
        label_extra0 = new JLabel();
        extraNori = new JLabel();
        label_chashu = new JLabel();
        chashu = new JLabel();
        label_extra1 = new JLabel();
        extraChashu = new JLabel();
        label_egg = new JLabel();
        egg = new JLabel();
        label_extra2 = new JLabel();
        extraEgg = new JLabel();
        label_shoot = new JLabel();
        shoot = new JLabel();
        label_extra3 = new JLabel();
        extraShoot = new JLabel();
        methodPanel = new JPanel();
        label_diningMethod = new JLabel();
        eatIn = new JToggleButton();
        takeAway = new JToggleButton();
        label_payingMethod = new JLabel();
        cash = new JToggleButton();
        visa = new JToggleButton();
        mb_rightPanel = new JPanel();
        membershipPanel = new JPanel();
        memIdPanel = new JPanel();
        label_memberId = new JLabel();
        membershipNumberInput = new JTextField();
        checkButtonPanel = new JPanel();
        checkButton = new JButton();
        emptyBox4 = new JPanel();
        emptyBox5 = new JPanel();
        identifiedInformation = new JLabel();
        userGreeting = new JLabel();
        memidSuggestPanel = new JPanel();
        label_memberIdSug = new JLabel();
        membershipNumber = new JLabel();
        couponPanel = new JPanel();
        label_coupon = new JLabel();
        coupon = new JLabel();
        useCoupon = new JCheckBox();
        billPanel = new JPanel();
        label_foodCost = new JLabel();
        noodlePrice = new JLabel();
        label_extraCost = new JLabel();
        extraPrice = new JLabel();
        label_packingCost = new JLabel();
        packingPrice = new JLabel();
        label_totalCost = new JLabel();
        totalPrice = new JLabel();
        panel1 = new JPanel();
        returnButton = new JButton();
        settleButton = new JButton();
        bottomPanel = new JPanel();
        bottom_innerPanel = new JPanel();
        storeName = new JLabel();
        storeAddress = new JLabel();
        storeTelphone = new JLabel();
        panel6 = new JPanel();
        diningMethod = new ButtonGroup();
        payingMethod = new ButtonGroup();

        //======== this ========
        setLayout(new BorderLayout());

        //======== panel2 ========
        {
            panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
        }
        add(panel2, BorderLayout.NORTH);

        //======== panel3 ========
        {
            panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
        }
        add(panel3, BorderLayout.SOUTH);

        //======== panel4 ========
        {
            panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));
        }
        add(panel4, BorderLayout.WEST);

        //======== boardPanel ========
        {
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

            //======== body ========
            {
                body.setBackground(Color.white);
                body.setLayout(new GridBagLayout());
                ((GridBagLayout)body.getLayout()).columnWidths = new int[] {25, 950, 25, 0};
                ((GridBagLayout)body.getLayout()).rowHeights = new int[] {25, 395, 25, 0};
                ((GridBagLayout)body.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                ((GridBagLayout)body.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                //======== body_innerPanel ========
                {
                    body_innerPanel.setLayout(new GridBagLayout());
                    ((GridBagLayout)body_innerPanel.getLayout()).columnWidths = new int[] {300, 650, 0};
                    ((GridBagLayout)body_innerPanel.getLayout()).rowHeights = new int[] {395, 0};
                    ((GridBagLayout)body_innerPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                    ((GridBagLayout)body_innerPanel.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                    //======== advertisementPanel ========
                    {
                        advertisementPanel.setBackground(Color.white);
                        advertisementPanel.setLayout(new GridBagLayout());
                        ((GridBagLayout)advertisementPanel.getLayout()).columnWidths = new int[] {15, 270, 15, 0};
                        ((GridBagLayout)advertisementPanel.getLayout()).rowHeights = new int[] {15, 15, 375, 0};
                        ((GridBagLayout)advertisementPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                        ((GridBagLayout)advertisementPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                        //---- advertisement ----
                        advertisement.setIcon(new ImageIcon(getClass().getResource("/img/adPoster.jpg")));
                        advertisementPanel.add(advertisement, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    body_innerPanel.add(advertisementPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //======== MessageBoardPanel ========
                    {
                        MessageBoardPanel.setLayout(new GridBagLayout());
                        ((GridBagLayout)MessageBoardPanel.getLayout()).columnWidths = new int[] {430, 220, 0};
                        ((GridBagLayout)MessageBoardPanel.getLayout()).rowHeights = new int[] {400, 0};
                        ((GridBagLayout)MessageBoardPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                        ((GridBagLayout)MessageBoardPanel.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                        //======== mb_leftPanel ========
                        {
                            mb_leftPanel.setLayout(new GridBagLayout());
                            ((GridBagLayout)mb_leftPanel.getLayout()).columnWidths = new int[] {430, 0};
                            ((GridBagLayout)mb_leftPanel.getLayout()).rowHeights = new int[] {65, 265, 65, 0};
                            ((GridBagLayout)mb_leftPanel.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                            ((GridBagLayout)mb_leftPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                            //======== informtionPanel ========
                            {
                                informtionPanel.setBorder(new TitledBorder("Information"));
                                informtionPanel.setBackground(Color.white);
                                informtionPanel.setLayout(new GridLayout(2, 2));

                                //---- label_serialNumber ----
                                label_serialNumber.setText("Serial Number:");
                                informtionPanel.add(label_serialNumber);

                                //---- serialNumber ----
                                serialNumber.setText("200345548218752");
                                serialNumber.setHorizontalAlignment(SwingConstants.TRAILING);
                                informtionPanel.add(serialNumber);

                                //---- label_time ----
                                label_time.setText("Time:");
                                informtionPanel.add(label_time);

                                //---- time ----
                                time.setText("2020-04-03 18:49:20");
                                time.setHorizontalAlignment(SwingConstants.TRAILING);
                                informtionPanel.add(time);
                            }
                            mb_leftPanel.add(informtionPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //======== itemPanel ========
                            {
                                itemPanel.setBorder(new TitledBorder("Item"));
                                itemPanel.setBackground(Color.white);
                                itemPanel.setLayout(new GridLayout(2, 1));

                                //======== item_topPanel ========
                                {
                                    item_topPanel.setBackground(Color.white);
                                    item_topPanel.setLayout(new GridLayout(1, 4));

                                    //======== noodleInfo_list ========
                                    {
                                        noodleInfo_list.setBackground(Color.white);
                                        noodleInfo_list.setLayout(new GridLayout(4, 1));

                                        //---- label_soup ----
                                        label_soup.setText("Soup:");
                                        noodleInfo_list.add(label_soup);

                                        //---- label_noodle ----
                                        label_noodle.setText("Noodle:");
                                        noodleInfo_list.add(label_noodle);

                                        //---- label_onion ----
                                        label_onion.setText("Spring onion:");
                                        noodleInfo_list.add(label_onion);

                                        //---- label_spiciness ----
                                        label_spiciness.setText("Spiciness:");
                                        noodleInfo_list.add(label_spiciness);
                                    }
                                    item_topPanel.add(noodleInfo_list);

                                    //======== noodleInfo_variable ========
                                    {
                                        noodleInfo_variable.setBackground(Color.white);
                                        noodleInfo_variable.setLayout(new GridLayout(4, 1));

                                        //---- soup ----
                                        soup.setText("Tonkotsu");
                                        noodleInfo_variable.add(soup);

                                        //---- noodle ----
                                        noodle.setText("Soft");
                                        noodleInfo_variable.add(noodle);

                                        //---- onion ----
                                        onion.setText("No please");
                                        noodleInfo_variable.add(onion);

                                        //---- spiciness ----
                                        spiciness.setText("5");
                                        noodleInfo_variable.add(spiciness);
                                    }
                                    item_topPanel.add(noodleInfo_variable);

                                    //======== noodleInfo_empty ========
                                    {
                                        noodleInfo_empty.setBackground(Color.white);
                                        noodleInfo_empty.setLayout(new GridLayout(4, 1));

                                        //======== emptyBox0 ========
                                        {
                                            emptyBox0.setBackground(Color.white);
                                            emptyBox0.setLayout(new BoxLayout(emptyBox0, BoxLayout.X_AXIS));
                                        }
                                        noodleInfo_empty.add(emptyBox0);

                                        //======== emptyBox1 ========
                                        {
                                            emptyBox1.setBackground(Color.white);
                                            emptyBox1.setLayout(new BoxLayout(emptyBox1, BoxLayout.X_AXIS));
                                        }
                                        noodleInfo_empty.add(emptyBox1);

                                        //======== emptyBox2 ========
                                        {
                                            emptyBox2.setBackground(Color.white);
                                            emptyBox2.setLayout(new BoxLayout(emptyBox2, BoxLayout.X_AXIS));
                                        }
                                        noodleInfo_empty.add(emptyBox2);

                                        //======== emptyBox3 ========
                                        {
                                            emptyBox3.setBackground(Color.white);
                                            emptyBox3.setLayout(new BoxLayout(emptyBox3, BoxLayout.X_AXIS));
                                        }
                                        noodleInfo_empty.add(emptyBox3);
                                    }
                                    item_topPanel.add(noodleInfo_empty);

                                    //======== soupPicturePanel ========
                                    {
                                        soupPicturePanel.setBackground(Color.white);
                                        soupPicturePanel.setLayout(new BorderLayout());

                                        //---- soupPicture ----
                                        soupPicture.setIcon(new ImageIcon(getClass().getResource("/img/1.jpg")));
                                        soupPicturePanel.add(soupPicture, BorderLayout.CENTER);
                                    }
                                    item_topPanel.add(soupPicturePanel);
                                }
                                itemPanel.add(item_topPanel);

                                //======== item_bottomPanel ========
                                {
                                    item_bottomPanel.setBackground(Color.white);
                                    item_bottomPanel.setLayout(new GridLayout(4, 4));

                                    //---- label_nori ----
                                    label_nori.setText("Nori(free):");
                                    item_bottomPanel.add(label_nori);

                                    //---- nori ----
                                    nori.setText("Yes");
                                    item_bottomPanel.add(nori);

                                    //---- label_extra0 ----
                                    label_extra0.setText("Extra number:");
                                    item_bottomPanel.add(label_extra0);

                                    //---- extraNori ----
                                    extraNori.setText("1");
                                    item_bottomPanel.add(extraNori);

                                    //---- label_chashu ----
                                    label_chashu.setText("Chashu(free):");
                                    item_bottomPanel.add(label_chashu);

                                    //---- chashu ----
                                    chashu.setText("Yes");
                                    item_bottomPanel.add(chashu);

                                    //---- label_extra1 ----
                                    label_extra1.setText("Extra number:");
                                    item_bottomPanel.add(label_extra1);

                                    //---- extraChashu ----
                                    extraChashu.setText("1");
                                    item_bottomPanel.add(extraChashu);

                                    //---- label_egg ----
                                    label_egg.setText("Egg(free):");
                                    item_bottomPanel.add(label_egg);

                                    //---- egg ----
                                    egg.setText("Yes");
                                    item_bottomPanel.add(egg);

                                    //---- label_extra2 ----
                                    label_extra2.setText("Extra number:");
                                    item_bottomPanel.add(label_extra2);

                                    //---- extraEgg ----
                                    extraEgg.setText("1");
                                    item_bottomPanel.add(extraEgg);

                                    //---- label_shoot ----
                                    label_shoot.setText("Shoot:");
                                    item_bottomPanel.add(label_shoot);

                                    //---- shoot ----
                                    shoot.setText("No");
                                    item_bottomPanel.add(shoot);

                                    //---- label_extra3 ----
                                    label_extra3.setText("Extra number:");
                                    item_bottomPanel.add(label_extra3);

                                    //---- extraShoot ----
                                    extraShoot.setText("1");
                                    item_bottomPanel.add(extraShoot);
                                }
                                itemPanel.add(item_bottomPanel);
                            }
                            mb_leftPanel.add(itemPanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //======== methodPanel ========
                            {
                                methodPanel.setBorder(new TitledBorder("Method"));
                                methodPanel.setBackground(Color.white);
                                methodPanel.setLayout(new GridLayout(2, 4));

                                //---- label_diningMethod ----
                                label_diningMethod.setText("Dining method:");
                                methodPanel.add(label_diningMethod);

                                //---- eatIn ----
                                eatIn.setText("Eat in");
                                methodPanel.add(eatIn);

                                //---- takeAway ----
                                takeAway.setText("Take away");
                                methodPanel.add(takeAway);

                                //---- label_payingMethod ----
                                label_payingMethod.setText("Paying method:");
                                methodPanel.add(label_payingMethod);

                                //---- cash ----
                                cash.setText("Cash");
                                methodPanel.add(cash);

                                //---- visa ----
                                visa.setText("Visa");
                                methodPanel.add(visa);
                            }
                            mb_leftPanel.add(methodPanel, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));
                        }
                        MessageBoardPanel.add(mb_leftPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== mb_rightPanel ========
                        {
                            mb_rightPanel.setBackground(Color.white);
                            mb_rightPanel.setLayout(new GridBagLayout());
                            ((GridBagLayout)mb_rightPanel.getLayout()).columnWidths = new int[] {220, 0};
                            ((GridBagLayout)mb_rightPanel.getLayout()).rowHeights = new int[] {200, 160, 45, 0, 0};
                            ((GridBagLayout)mb_rightPanel.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                            ((GridBagLayout)mb_rightPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

                            //======== membershipPanel ========
                            {
                                membershipPanel.setBorder(new TitledBorder("Totoro Member"));
                                membershipPanel.setBackground(Color.white);
                                membershipPanel.setLayout(new GridBagLayout());
                                ((GridBagLayout)membershipPanel.getLayout()).columnWidths = new int[] {220, 0};
                                ((GridBagLayout)membershipPanel.getLayout()).rowHeights = new int[] {25, 20, 25, 25, 25, 25, 25, 0};
                                ((GridBagLayout)membershipPanel.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                                ((GridBagLayout)membershipPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

                                //======== memIdPanel ========
                                {
                                    memIdPanel.setBackground(Color.white);
                                    memIdPanel.setLayout(new GridBagLayout());
                                    ((GridBagLayout)memIdPanel.getLayout()).columnWidths = new int[] {75, 145, 0};
                                    ((GridBagLayout)memIdPanel.getLayout()).rowHeights = new int[] {25, 0};
                                    ((GridBagLayout)memIdPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                                    ((GridBagLayout)memIdPanel.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                                    //---- label_memberId ----
                                    label_memberId.setText("Member id:");
                                    memIdPanel.add(label_memberId, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                        new Insets(0, 0, 0, 0), 0, 0));
                                    memIdPanel.add(membershipNumberInput, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                        new Insets(0, 0, 0, 0), 0, 0));
                                }
                                membershipPanel.add(memIdPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                    new Insets(0, 0, 0, 0), 0, 0));

                                //======== checkButtonPanel ========
                                {
                                    checkButtonPanel.setBackground(Color.white);
                                    checkButtonPanel.setLayout(new BorderLayout());

                                    //---- checkButton ----
                                    checkButton.setText("Check");
                                    checkButtonPanel.add(checkButton, BorderLayout.SOUTH);

                                    //======== emptyBox4 ========
                                    {
                                        emptyBox4.setBackground(Color.white);
                                        emptyBox4.setLayout(new BoxLayout(emptyBox4, BoxLayout.X_AXIS));
                                    }
                                    checkButtonPanel.add(emptyBox4, BorderLayout.EAST);

                                    //======== emptyBox5 ========
                                    {
                                        emptyBox5.setBackground(Color.white);
                                        emptyBox5.setLayout(new BoxLayout(emptyBox5, BoxLayout.X_AXIS));
                                    }
                                    checkButtonPanel.add(emptyBox5, BorderLayout.WEST);
                                }
                                membershipPanel.add(checkButtonPanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                    new Insets(0, 0, 0, 0), 0, 0));

                                //---- identifiedInformation ----
                                identifiedInformation.setText("Identified Successfully");
                                identifiedInformation.setHorizontalAlignment(SwingConstants.CENTER);
                                membershipPanel.add(identifiedInformation, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                    new Insets(0, 0, 0, 0), 0, 0));

                                //---- userGreeting ----
                                userGreeting.setText("Hello, dear xxx");
                                membershipPanel.add(userGreeting, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                    new Insets(0, 0, 0, 0), 0, 0));

                                //======== memidSuggestPanel ========
                                {
                                    memidSuggestPanel.setBackground(Color.white);
                                    memidSuggestPanel.setLayout(new GridLayout(1, 2));

                                    //---- label_memberIdSug ----
                                    label_memberIdSug.setText("Member ID:");
                                    memidSuggestPanel.add(label_memberIdSug);

                                    //---- membershipNumber ----
                                    membershipNumber.setText("00000001");
                                    membershipNumber.setHorizontalAlignment(SwingConstants.TRAILING);
                                    memidSuggestPanel.add(membershipNumber);
                                }
                                membershipPanel.add(memidSuggestPanel, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                    new Insets(0, 0, 0, 0), 0, 0));

                                //======== couponPanel ========
                                {
                                    couponPanel.setBackground(Color.white);
                                    couponPanel.setLayout(new GridLayout(1, 2));

                                    //---- label_coupon ----
                                    label_coupon.setText("Coupon:");
                                    couponPanel.add(label_coupon);

                                    //---- coupon ----
                                    coupon.setText("5");
                                    coupon.setHorizontalAlignment(SwingConstants.TRAILING);
                                    couponPanel.add(coupon);
                                }
                                membershipPanel.add(couponPanel, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
                                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                    new Insets(0, 0, 0, 0), 0, 0));

                                //---- useCoupon ----
                                useCoupon.setText("Use my Coupons to pay this bill");
                                useCoupon.setBackground(Color.white);
                                membershipPanel.add(useCoupon, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
                                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                    new Insets(0, 0, 0, 0), 0, 0));
                            }
                            mb_rightPanel.add(membershipPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //======== billPanel ========
                            {
                                billPanel.setBorder(new TitledBorder("Bill"));
                                billPanel.setBackground(Color.white);
                                billPanel.setLayout(new GridLayout(4, 2));

                                //---- label_foodCost ----
                                label_foodCost.setText("Noodle Charge:");
                                billPanel.add(label_foodCost);

                                //---- noodlePrice ----
                                noodlePrice.setText("\uffe1");
                                billPanel.add(noodlePrice);

                                //---- label_extraCost ----
                                label_extraCost.setText("Extra Charge");
                                billPanel.add(label_extraCost);

                                //---- extraPrice ----
                                extraPrice.setText("\uffe1");
                                billPanel.add(extraPrice);

                                //---- label_packingCost ----
                                label_packingCost.setText("Packing Charge:");
                                billPanel.add(label_packingCost);

                                //---- packingPrice ----
                                packingPrice.setText("\uffe1");
                                billPanel.add(packingPrice);

                                //---- label_totalCost ----
                                label_totalCost.setText("Total Price:");
                                billPanel.add(label_totalCost);

                                //---- totalPrice ----
                                totalPrice.setText("\uffe1");
                                billPanel.add(totalPrice);
                            }
                            mb_rightPanel.add(billPanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //======== panel1 ========
                            {
                                panel1.setBackground(Color.white);
                                panel1.setLayout(new GridLayout(1, 2));

                                //---- returnButton ----
                                returnButton.setText("Return");
                                panel1.add(returnButton);

                                //---- settleButton ----
                                settleButton.setText("Pay");
                                panel1.add(settleButton);
                            }
                            mb_rightPanel.add(panel1, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));
                        }
                        MessageBoardPanel.add(mb_rightPanel, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    body_innerPanel.add(MessageBoardPanel, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                body.add(body_innerPanel, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            boardPanel.add(body, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
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

        //======== panel6 ========
        {
            panel6.setLayout(new BoxLayout(panel6, BoxLayout.X_AXIS));
        }
        add(panel6, BorderLayout.EAST);

        //---- diningMethod ----
        diningMethod.add(eatIn);
        diningMethod.add(takeAway);

        //---- payingMethod ----
        payingMethod.add(cash);
        payingMethod.add(visa);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel boardPanel;
    private JPanel titlePanel;
    private JLabel logo;
    private JPanel body;
    private JPanel body_innerPanel;
    private JPanel advertisementPanel;
    private JLabel advertisement;
    private JPanel MessageBoardPanel;
    private JPanel mb_leftPanel;
    private JPanel informtionPanel;
    private JLabel label_serialNumber;
    public JLabel serialNumber;
    private JLabel label_time;
    public JLabel time;
    private JPanel itemPanel;
    private JPanel item_topPanel;
    private JPanel noodleInfo_list;
    private JLabel label_soup;
    private JLabel label_noodle;
    private JLabel label_onion;
    private JLabel label_spiciness;
    private JPanel noodleInfo_variable;
    public JLabel soup;
    public JLabel noodle;
    public JLabel onion;
    public JLabel spiciness;
    private JPanel noodleInfo_empty;
    private JPanel emptyBox0;
    private JPanel emptyBox1;
    private JPanel emptyBox2;
    private JPanel emptyBox3;
    private JPanel soupPicturePanel;
    private JLabel soupPicture;
    private JPanel item_bottomPanel;
    private JLabel label_nori;
    public JLabel nori;
    private JLabel label_extra0;
    public JLabel extraNori;
    private JLabel label_chashu;
    public JLabel chashu;
    private JLabel label_extra1;
    public JLabel extraChashu;
    private JLabel label_egg;
    public JLabel egg;
    private JLabel label_extra2;
    public JLabel extraEgg;
    private JLabel label_shoot;
    public JLabel shoot;
    private JLabel label_extra3;
    public JLabel extraShoot;
    private JPanel methodPanel;
    private JLabel label_diningMethod;
    public JToggleButton eatIn;
    public JToggleButton takeAway;
    private JLabel label_payingMethod;
    public JToggleButton cash;
    public JToggleButton visa;
    private JPanel mb_rightPanel;
    private JPanel membershipPanel;
    private JPanel memIdPanel;
    private JLabel label_memberId;
    public JTextField membershipNumberInput;
    private JPanel checkButtonPanel;
    public JButton checkButton;
    private JPanel emptyBox4;
    private JPanel emptyBox5;
    public JLabel identifiedInformation;
    public JLabel userGreeting;
    private JPanel memidSuggestPanel;
    private JLabel label_memberIdSug;
    public JLabel membershipNumber;
    private JPanel couponPanel;
    private JLabel label_coupon;
    public JLabel coupon;
    public JCheckBox useCoupon;
    private JPanel billPanel;
    private JLabel label_foodCost;
    public JLabel noodlePrice;
    private JLabel label_extraCost;
    public JLabel extraPrice;
    private JLabel label_packingCost;
    public JLabel packingPrice;
    private JLabel label_totalCost;
    public JLabel totalPrice;
    private JPanel panel1;
    public JButton returnButton;
    public JButton settleButton;
    private JPanel bottomPanel;
    private JPanel bottom_innerPanel;
    private JLabel storeName;
    private JLabel storeAddress;
    private JLabel storeTelphone;
    private JPanel panel6;
    public ButtonGroup diningMethod;
    public ButtonGroup payingMethod;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
