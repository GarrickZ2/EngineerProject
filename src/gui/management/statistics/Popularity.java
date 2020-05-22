/*
 * Created by JFormDesigner on Fri Apr 24 14:02:25 GMT+08:00 2020
 */

package gui.management.statistics;

import java.awt.*;
import javax.swing.*;

/**
 * This is the frame of our popularity graphic user interface
 * This page is used to statistic what's the most popular soup ,etc.
 * @author H
 */
public class Popularity extends JPanel {
    /**
     * Use constructor to create the frame
     */
    public Popularity() {
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
        body_innerPanel = new JPanel();
        body_leftPanel = new JPanel();
        label_members = new JLabel();
        membersTablePanel = new JPanel();
        filledBox0 = new JPanel();
        label_member_costMost = new JLabel();
        filledBox1 = new JPanel();
        member_costMost_membershipNumber = new JLabel();
        label_member_costMost_name = new JLabel();
        member_costMost_name = new JLabel();
        label_member_costMost_TAE = new JLabel();
        member_costMost_TAE = new JLabel();
        filledBox2 = new JPanel();
        label_member_ordersMost = new JLabel();
        filledBox3 = new JPanel();
        member_ordersMost_membershipNumber = new JLabel();
        label_member_ordersMost_name = new JLabel();
        member_ordersMost_name = new JLabel();
        label_member_ordersMost_TAE = new JLabel();
        member_ordersMost_TAE = new JLabel();
        innerLogoPanel = new JPanel();
        logoImage = new JLabel();
        body_rightPanel = new JPanel();
        label_mostPopular = new JLabel();
        popularTablePanel = new JPanel();
        label_mp_soup = new JLabel();
        mp_soup = new JLabel();
        label_mp_garnish = new JLabel();
        mp_garnish = new JLabel();
        label_mp_spiciness = new JLabel();
        mp_spiciness = new JLabel();
        statisticsImagesHeadPanel = new JPanel();
        label_statisticsImages = new JLabel();
        statisticsImagesFootPanel = new JPanel();
        popularList_cardPanel = new JPanel();
        popularList_soupCardPanel = new JPanel();
        soupCard_soupPanelButton = new JPanel();
        label_soupCard_soup = new JLabel();
        soupCard_garnishPanelButton = new JPanel();
        label_soupCard_garnish = new JLabel();
        soupCard_spicinessPanelButton = new JPanel();
        label_soupCard_spiciness = new JLabel();
        popularList_garnishCardPanel = new JPanel();
        gCard_soupPanelButton = new JPanel();
        label_gCard_soup = new JLabel();
        gCard_garnishPanelButton = new JPanel();
        label_gCard_garnish = new JLabel();
        gCard_spicinessPanelButton = new JPanel();
        label_gCard_spiciness = new JLabel();
        popularList_spicinessCardPanel = new JPanel();
        spiCard_soupPanelButton = new JPanel();
        label_spiCard_soup = new JLabel();
        spiCard_garnishPanelButton = new JPanel();
        label_spiCard_garnish = new JLabel();
        spiCard_spicinessPanelButton = new JPanel();
        label_spiCard_spiciness = new JLabel();
        popular_imageCardPanel = new JPanel();
        buttonPanel = new JPanel();
        returnButton = new JButton();
        refreshButton = new JButton();
        printButton = new JButton();
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
                        managerPasswordPanel.setBackground(Color.white);
                        managerPasswordPanel.setLayout(new GridLayout());

                        //---- indexLabel_managerPassword ----
                        indexLabel_managerPassword.setText("Popularity");
                        indexLabel_managerPassword.setHorizontalAlignment(SwingConstants.CENTER);
                        managerPasswordPanel.add(indexLabel_managerPassword);
                    }
                    indexPanel.add(managerPasswordPanel, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //======== dataAnalysisPanel ========
                    {
                        dataAnalysisPanel.setBackground(new Color(242, 156, 59, 0));
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
                        indexLabel_membershipOperation.setText("Member operation");
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

                //======== body_innerPanel ========
                {
                    body_innerPanel.setBackground(Color.white);
                    body_innerPanel.setLayout(new GridBagLayout());
                    ((GridBagLayout)body_innerPanel.getLayout()).columnWidths = new int[] {360, 20, 570, 0};
                    ((GridBagLayout)body_innerPanel.getLayout()).rowHeights = new int[] {20, 375, 0, 0};
                    ((GridBagLayout)body_innerPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                    ((GridBagLayout)body_innerPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                    //======== body_leftPanel ========
                    {
                        body_leftPanel.setBackground(Color.white);
                        body_leftPanel.setLayout(new GridBagLayout());
                        ((GridBagLayout)body_leftPanel.getLayout()).columnWidths = new int[] {360, 0};
                        ((GridBagLayout)body_leftPanel.getLayout()).rowHeights = new int[] {40, 180, 10, 145, 0};
                        ((GridBagLayout)body_leftPanel.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                        ((GridBagLayout)body_leftPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

                        //---- label_members ----
                        label_members.setText("Weekly Crazy Members");
                        label_members.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                        label_members.setHorizontalAlignment(SwingConstants.CENTER);
                        body_leftPanel.add(label_members, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== membersTablePanel ========
                        {
                            membersTablePanel.setBackground(new Color(255, 222, 217));
                            membersTablePanel.setLayout(new GridBagLayout());
                            ((GridBagLayout)membersTablePanel.getLayout()).columnWidths = new int[] {130, 230, 0};
                            ((GridBagLayout)membersTablePanel.getLayout()).rowHeights = new int[] {30, 30, 30, 30, 30, 30, 0};
                            ((GridBagLayout)membersTablePanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                            ((GridBagLayout)membersTablePanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

                            //======== filledBox0 ========
                            {
                                filledBox0.setBackground(new Color(202, 118, 118));
                                filledBox0.setLayout(new BoxLayout(filledBox0, BoxLayout.X_AXIS));

                                //---- label_member_costMost ----
                                label_member_costMost.setText("Member cost most:");
                                filledBox0.add(label_member_costMost);
                            }
                            membersTablePanel.add(filledBox0, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //======== filledBox1 ========
                            {
                                filledBox1.setBackground(new Color(202, 118, 118));
                                filledBox1.setLayout(new BoxLayout(filledBox1, BoxLayout.X_AXIS));

                                //---- member_costMost_membershipNumber ----
                                member_costMost_membershipNumber.setText("00000002");
                                filledBox1.add(member_costMost_membershipNumber);
                            }
                            membersTablePanel.add(filledBox1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //---- label_member_costMost_name ----
                            label_member_costMost_name.setText("Name:");
                            membersTablePanel.add(label_member_costMost_name, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //---- member_costMost_name ----
                            member_costMost_name.setText("Zhang Zixuan");
                            membersTablePanel.add(member_costMost_name, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //---- label_member_costMost_TAE ----
                            label_member_costMost_TAE.setText("Telephone / E-mail:");
                            membersTablePanel.add(label_member_costMost_TAE, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //---- member_costMost_TAE ----
                            member_costMost_TAE.setText("15500043370 / 447243910@qq.com");
                            membersTablePanel.add(member_costMost_TAE, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //======== filledBox2 ========
                            {
                                filledBox2.setBackground(new Color(202, 118, 118));
                                filledBox2.setLayout(new BoxLayout(filledBox2, BoxLayout.X_AXIS));

                                //---- label_member_ordersMost ----
                                label_member_ordersMost.setText("Member orders most:");
                                filledBox2.add(label_member_ordersMost);
                            }
                            membersTablePanel.add(filledBox2, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //======== filledBox3 ========
                            {
                                filledBox3.setBackground(new Color(202, 118, 118));
                                filledBox3.setLayout(new BoxLayout(filledBox3, BoxLayout.X_AXIS));

                                //---- member_ordersMost_membershipNumber ----
                                member_ordersMost_membershipNumber.setText("00000001");
                                filledBox3.add(member_ordersMost_membershipNumber);
                            }
                            membersTablePanel.add(filledBox3, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //---- label_member_ordersMost_name ----
                            label_member_ordersMost_name.setText("Name:");
                            membersTablePanel.add(label_member_ordersMost_name, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //---- member_ordersMost_name ----
                            member_ordersMost_name.setText("Huang Tianhe");
                            membersTablePanel.add(member_ordersMost_name, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //---- label_member_ordersMost_TAE ----
                            label_member_ordersMost_TAE.setText("Telephone / E-mail:");
                            membersTablePanel.add(label_member_ordersMost_TAE, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //---- member_ordersMost_TAE ----
                            member_ordersMost_TAE.setText("15500043370 / 447243910@qq.com");
                            membersTablePanel.add(member_ordersMost_TAE, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));
                        }
                        body_leftPanel.add(membersTablePanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== innerLogoPanel ========
                        {
                            innerLogoPanel.setLayout(new GridLayout());

                            //---- logoImage ----
                            logoImage.setIcon(new ImageIcon(getClass().getResource("/img/145x360LOGO.jpg")));
                            innerLogoPanel.add(logoImage);
                        }
                        body_leftPanel.add(innerLogoPanel, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    body_innerPanel.add(body_leftPanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //======== body_rightPanel ========
                    {
                        body_rightPanel.setBackground(Color.white);
                        body_rightPanel.setLayout(new GridBagLayout());
                        ((GridBagLayout)body_rightPanel.getLayout()).columnWidths = new int[] {570, 0};
                        ((GridBagLayout)body_rightPanel.getLayout()).rowHeights = new int[] {40, 90, 10, 30, 170, 5, 30, 0};
                        ((GridBagLayout)body_rightPanel.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                        ((GridBagLayout)body_rightPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

                        //---- label_mostPopular ----
                        label_mostPopular.setText("Most PopularityFunction");
                        label_mostPopular.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                        label_mostPopular.setHorizontalAlignment(SwingConstants.CENTER);
                        body_rightPanel.add(label_mostPopular, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== popularTablePanel ========
                        {
                            popularTablePanel.setBackground(new Color(255, 222, 217));
                            popularTablePanel.setLayout(new GridLayout(3, 2));

                            //---- label_mp_soup ----
                            label_mp_soup.setText("Most PopularityFunction Soup:");
                            popularTablePanel.add(label_mp_soup);

                            //---- mp_soup ----
                            mp_soup.setText("Tonkotsu");
                            popularTablePanel.add(mp_soup);

                            //---- label_mp_garnish ----
                            label_mp_garnish.setText("Most PopularityFunction Garnish:");
                            popularTablePanel.add(label_mp_garnish);

                            //---- mp_garnish ----
                            mp_garnish.setText("Chashu");
                            popularTablePanel.add(mp_garnish);

                            //---- label_mp_spiciness ----
                            label_mp_spiciness.setText("Most PopularityFunction Spiciness:");
                            popularTablePanel.add(label_mp_spiciness);

                            //---- mp_spiciness ----
                            mp_spiciness.setText("2");
                            popularTablePanel.add(mp_spiciness);
                        }
                        body_rightPanel.add(popularTablePanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== statisticsImagesHeadPanel ========
                        {
                            statisticsImagesHeadPanel.setBackground(new Color(202, 118, 118));
                            statisticsImagesHeadPanel.setLayout(new GridLayout(1, 3));

                            //---- label_statisticsImages ----
                            label_statisticsImages.setText("Statistics Images");
                            label_statisticsImages.setHorizontalAlignment(SwingConstants.CENTER);
                            label_statisticsImages.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                            statisticsImagesHeadPanel.add(label_statisticsImages);
                        }
                        body_rightPanel.add(statisticsImagesHeadPanel, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== statisticsImagesFootPanel ========
                        {
                            statisticsImagesFootPanel.setBackground(Color.white);
                            statisticsImagesFootPanel.setLayout(new GridBagLayout());
                            ((GridBagLayout)statisticsImagesFootPanel.getLayout()).columnWidths = new int[] {170, 400, 0};
                            ((GridBagLayout)statisticsImagesFootPanel.getLayout()).rowHeights = new int[] {170, 0};
                            ((GridBagLayout)statisticsImagesFootPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                            ((GridBagLayout)statisticsImagesFootPanel.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                            //======== popularList_cardPanel ========
                            {
                                popularList_cardPanel.setLayout(new CardLayout());

                                //======== popularList_soupCardPanel ========
                                {
                                    popularList_soupCardPanel.setBackground(Color.white);
                                    popularList_soupCardPanel.setLayout(new GridLayout(3, 0));

                                    //======== soupCard_soupPanelButton ========
                                    {
                                        soupCard_soupPanelButton.setBackground(new Color(237, 237, 237, 53));
                                        soupCard_soupPanelButton.setLayout(new GridLayout());

                                        //---- label_soupCard_soup ----
                                        label_soupCard_soup.setText("Soup");
                                        label_soupCard_soup.setHorizontalAlignment(SwingConstants.CENTER);
                                        label_soupCard_soup.setBackground(new Color(204, 204, 204));
                                        soupCard_soupPanelButton.add(label_soupCard_soup);
                                    }
                                    popularList_soupCardPanel.add(soupCard_soupPanelButton);

                                    //======== soupCard_garnishPanelButton ========
                                    {
                                        soupCard_garnishPanelButton.setBackground(new Color(255, 222, 217));
                                        soupCard_garnishPanelButton.setLayout(new GridLayout());

                                        //---- label_soupCard_garnish ----
                                        label_soupCard_garnish.setText("Garnish");
                                        label_soupCard_garnish.setHorizontalAlignment(SwingConstants.CENTER);
                                        soupCard_garnishPanelButton.add(label_soupCard_garnish);
                                    }
                                    popularList_soupCardPanel.add(soupCard_garnishPanelButton);

                                    //======== soupCard_spicinessPanelButton ========
                                    {
                                        soupCard_spicinessPanelButton.setBackground(new Color(255, 222, 217));
                                        soupCard_spicinessPanelButton.setLayout(new GridLayout());

                                        //---- label_soupCard_spiciness ----
                                        label_soupCard_spiciness.setText("Spiciness");
                                        label_soupCard_spiciness.setHorizontalAlignment(SwingConstants.CENTER);
                                        soupCard_spicinessPanelButton.add(label_soupCard_spiciness);
                                    }
                                    popularList_soupCardPanel.add(soupCard_spicinessPanelButton);
                                }
                                popularList_cardPanel.add(popularList_soupCardPanel, "soupCard");

                                //======== popularList_garnishCardPanel ========
                                {
                                    popularList_garnishCardPanel.setBackground(Color.white);
                                    popularList_garnishCardPanel.setLayout(new GridLayout(3, 0));

                                    //======== gCard_soupPanelButton ========
                                    {
                                        gCard_soupPanelButton.setBackground(new Color(255, 222, 217));
                                        gCard_soupPanelButton.setLayout(new GridLayout());

                                        //---- label_gCard_soup ----
                                        label_gCard_soup.setText("Soup");
                                        label_gCard_soup.setHorizontalAlignment(SwingConstants.CENTER);
                                        gCard_soupPanelButton.add(label_gCard_soup);
                                    }
                                    popularList_garnishCardPanel.add(gCard_soupPanelButton);

                                    //======== gCard_garnishPanelButton ========
                                    {
                                        gCard_garnishPanelButton.setBackground(new Color(237, 237, 237, 53));
                                        gCard_garnishPanelButton.setLayout(new GridLayout());

                                        //---- label_gCard_garnish ----
                                        label_gCard_garnish.setText("Garnish");
                                        label_gCard_garnish.setHorizontalAlignment(SwingConstants.CENTER);
                                        gCard_garnishPanelButton.add(label_gCard_garnish);
                                    }
                                    popularList_garnishCardPanel.add(gCard_garnishPanelButton);

                                    //======== gCard_spicinessPanelButton ========
                                    {
                                        gCard_spicinessPanelButton.setBackground(new Color(255, 222, 217));
                                        gCard_spicinessPanelButton.setLayout(new GridLayout());

                                        //---- label_gCard_spiciness ----
                                        label_gCard_spiciness.setText("Spiciness");
                                        label_gCard_spiciness.setHorizontalAlignment(SwingConstants.CENTER);
                                        gCard_spicinessPanelButton.add(label_gCard_spiciness);
                                    }
                                    popularList_garnishCardPanel.add(gCard_spicinessPanelButton);
                                }
                                popularList_cardPanel.add(popularList_garnishCardPanel, "gCard");

                                //======== popularList_spicinessCardPanel ========
                                {
                                    popularList_spicinessCardPanel.setBackground(Color.white);
                                    popularList_spicinessCardPanel.setLayout(new GridLayout(3, 0));

                                    //======== spiCard_soupPanelButton ========
                                    {
                                        spiCard_soupPanelButton.setBackground(new Color(255, 222, 217));
                                        spiCard_soupPanelButton.setLayout(new GridLayout());

                                        //---- label_spiCard_soup ----
                                        label_spiCard_soup.setText("Soup");
                                        label_spiCard_soup.setHorizontalAlignment(SwingConstants.CENTER);
                                        spiCard_soupPanelButton.add(label_spiCard_soup);
                                    }
                                    popularList_spicinessCardPanel.add(spiCard_soupPanelButton);

                                    //======== spiCard_garnishPanelButton ========
                                    {
                                        spiCard_garnishPanelButton.setBackground(new Color(255, 222, 217));
                                        spiCard_garnishPanelButton.setLayout(new GridLayout());

                                        //---- label_spiCard_garnish ----
                                        label_spiCard_garnish.setText("Garnish");
                                        label_spiCard_garnish.setHorizontalAlignment(SwingConstants.CENTER);
                                        spiCard_garnishPanelButton.add(label_spiCard_garnish);
                                    }
                                    popularList_spicinessCardPanel.add(spiCard_garnishPanelButton);

                                    //======== spiCard_spicinessPanelButton ========
                                    {
                                        spiCard_spicinessPanelButton.setBackground(new Color(237, 237, 237, 53));
                                        spiCard_spicinessPanelButton.setLayout(new GridLayout());

                                        //---- label_spiCard_spiciness ----
                                        label_spiCard_spiciness.setText("Spiciness");
                                        label_spiCard_spiciness.setHorizontalAlignment(SwingConstants.CENTER);
                                        spiCard_spicinessPanelButton.add(label_spiCard_spiciness);
                                    }
                                    popularList_spicinessCardPanel.add(spiCard_spicinessPanelButton);
                                }
                                popularList_cardPanel.add(popularList_spicinessCardPanel, "spiCard");
                            }
                            statisticsImagesFootPanel.add(popularList_cardPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //======== popular_imageCardPanel ========
                            {
                                popular_imageCardPanel.setBackground(new Color(237, 237, 237, 53));
                                popular_imageCardPanel.setLayout(new BorderLayout());
                            }
                            statisticsImagesFootPanel.add(popular_imageCardPanel, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));
                        }
                        body_rightPanel.add(statisticsImagesFootPanel, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== buttonPanel ========
                        {
                            buttonPanel.setBackground(Color.white);
                            buttonPanel.setLayout(new GridLayout(1, 3));

                            //---- returnButton ----
                            returnButton.setText("Return");
                            buttonPanel.add(returnButton);

                            //---- refreshButton ----
                            refreshButton.setText("Refresh");
                            buttonPanel.add(refreshButton);

                            //---- printButton ----
                            printButton.setText("Print report");
                            buttonPanel.add(printButton);
                        }
                        body_rightPanel.add(buttonPanel, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    body_innerPanel.add(body_rightPanel, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
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

    }


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
    private JPanel body_innerPanel;
    private JPanel body_leftPanel;
    private JLabel label_members;
    private JPanel membersTablePanel;
    private JPanel filledBox0;
    private JLabel label_member_costMost;
    JPanel filledBox1;
    public JLabel member_costMost_membershipNumber;
    private JLabel label_member_costMost_name;
    public JLabel member_costMost_name;
    private JLabel label_member_costMost_TAE;
    public JLabel member_costMost_TAE;
    private JPanel filledBox2;
    private JLabel label_member_ordersMost;
    JPanel filledBox3;
    public JLabel member_ordersMost_membershipNumber;
    private JLabel label_member_ordersMost_name;
    public JLabel member_ordersMost_name;
    private JLabel label_member_ordersMost_TAE;
    public JLabel member_ordersMost_TAE;
    private JPanel innerLogoPanel;
    private JLabel logoImage;
    private JPanel body_rightPanel;
    private JLabel label_mostPopular;
    private JPanel popularTablePanel;
    private JLabel label_mp_soup;
    public JLabel mp_soup;
    private JLabel label_mp_garnish;
    public JLabel mp_garnish;
    private JLabel label_mp_spiciness;
    public JLabel mp_spiciness;
    private JPanel statisticsImagesHeadPanel;
    private JLabel label_statisticsImages;
    private JPanel statisticsImagesFootPanel;
    public JPanel popularList_cardPanel;
    public JPanel popularList_soupCardPanel;
    public JPanel soupCard_soupPanelButton;
    public JLabel label_soupCard_soup;
    public JPanel soupCard_garnishPanelButton;
    public JLabel label_soupCard_garnish;
    public JPanel soupCard_spicinessPanelButton;
    private JLabel label_soupCard_spiciness;
    public JPanel popularList_garnishCardPanel;
    public JPanel gCard_soupPanelButton;
    public JLabel label_gCard_soup;
    public JPanel gCard_garnishPanelButton;
    public JLabel label_gCard_garnish;
    public JPanel gCard_spicinessPanelButton;
    public JLabel label_gCard_spiciness;
    public JPanel popularList_spicinessCardPanel;
    public JPanel spiCard_soupPanelButton;
    public JLabel label_spiCard_soup;
    public JPanel spiCard_garnishPanelButton;
    public JLabel label_spiCard_garnish;
    public JPanel spiCard_spicinessPanelButton;
    public JLabel label_spiCard_spiciness;
    public JPanel popular_imageCardPanel;
    private JPanel buttonPanel;
    public JButton returnButton;
    private JButton refreshButton;
    private JButton printButton;
    private JPanel bottomPanel;
    private JPanel bottom_innerPanel;
    private JLabel storeName;
    private JLabel storeAddress;
    private JLabel storeTelphone;


}
