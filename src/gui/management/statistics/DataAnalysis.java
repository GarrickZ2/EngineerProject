/*
 * Created by JFormDesigner on Fri Apr 24 14:00:13 GMT+08:00 2020
 */

package gui.management.statistics;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * This is the frame of our data analysis graphic user interface
 * This page is used to check weekly analysis of each items
 * @author H
 */
public class DataAnalysis extends JPanel {
    /**
     * Use constructor to create the frame
     */
    public DataAnalysis() {
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
        popularityPanel = new JPanel();
        indexLabel_popularity = new JLabel();
        dataAnalysisPanel = new JPanel();
        indexLabel_dataAnalysis = new JLabel();
        membershipOperationPanel = new JPanel();
        indexLabel_membershipOperation = new JLabel();
        emptyBox5 = new JPanel();
        suggestionPanel = new JPanel();
        sug_outerPanel = new JPanel();
        switchCard = new JPanel();
        switch_outerPanel = new JPanel();
        switch_statisticsListPanel = new JPanel();
        button_income = new JToggleButton();
        button_orders = new JToggleButton();
        button_tonkotsu = new JToggleButton();
        button_shoyo = new JToggleButton();
        button_shio = new JToggleButton();
        button_nori = new JToggleButton();
        button_chashu = new JToggleButton();
        button_egg = new JToggleButton();
        button_shoot = new JToggleButton();
        statisticsImageCard = new JPanel();
        statisticsDataCard = new JPanel();
        weeklyPanel = new JPanel();
        label_title_monthlyStatistics = new JLabel();
        weeklyBodyPanel = new JPanel();
        weekly_hedPanel = new JPanel();
        label_statisticRange = new JLabel();
        weeklyRange = new JLabel();
        label_weeklyIncome = new JLabel();
        weeklyIncome = new JLabel();
        label_weeklyOrders = new JLabel();
        weeklyOrders = new JLabel();
        weekly_footPanel = new JPanel();
        label_tonkotsu = new JLabel();
        weeklyTonkotsu = new JLabel();
        label_nori = new JLabel();
        weeklyNori = new JLabel();
        label_shoyo = new JLabel();
        weeklyShoyo = new JLabel();
        label_chashu = new JLabel();
        weeklyChashu = new JLabel();
        label_shio = new JLabel();
        weeklyShio = new JLabel();
        label_egg = new JLabel();
        weeklyEgg = new JLabel();
        emptyBox6 = new JPanel();
        emptyBox7 = new JPanel();
        label_shoot = new JLabel();
        weeklyShoot = new JLabel();
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

                    //======== popularityPanel ========
                    {
                        popularityPanel.setBackground(new Color(242, 156, 59, 0));
                        popularityPanel.setLayout(new GridLayout());

                        //---- indexLabel_popularity ----
                        indexLabel_popularity.setText("PopularityData");
                        indexLabel_popularity.setHorizontalAlignment(SwingConstants.CENTER);
                        popularityPanel.add(indexLabel_popularity);
                    }
                    indexPanel.add(popularityPanel, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
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

                //======== suggestionPanel ========
                {
                    suggestionPanel.setBackground(Color.white);
                    suggestionPanel.setLayout(new GridBagLayout());
                    ((GridBagLayout)suggestionPanel.getLayout()).columnWidths = new int[] {950, 0};
                    ((GridBagLayout)suggestionPanel.getLayout()).rowHeights = new int[] {20, 375, 0};
                    ((GridBagLayout)suggestionPanel.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                    ((GridBagLayout)suggestionPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

                    //======== sug_outerPanel ========
                    {
                        sug_outerPanel.setLayout(new GridBagLayout());
                        ((GridBagLayout)sug_outerPanel.getLayout()).columnWidths = new int[] {950, 0};
                        ((GridBagLayout)sug_outerPanel.getLayout()).rowHeights = new int[] {375, 0};
                        ((GridBagLayout)sug_outerPanel.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                        ((GridBagLayout)sug_outerPanel.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                        //======== switchCard ========
                        {
                            switchCard.setLayout(new CardLayout());

                            //======== switch_outerPanel ========
                            {
                                switch_outerPanel.setBackground(Color.white);
                                switch_outerPanel.setLayout(new GridBagLayout());
                                ((GridBagLayout)switch_outerPanel.getLayout()).columnWidths = new int[] {100, 20, 350, 20, 460, 0};
                                ((GridBagLayout)switch_outerPanel.getLayout()).rowHeights = new int[] {375, 0};
                                ((GridBagLayout)switch_outerPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
                                ((GridBagLayout)switch_outerPanel.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                                //======== switch_statisticsListPanel ========
                                {
                                    switch_statisticsListPanel.setBackground(Color.white);
                                    switch_statisticsListPanel.setLayout(new GridLayout(9, 1));

                                    //---- button_income ----
                                    button_income.setText("Income");
                                    switch_statisticsListPanel.add(button_income);

                                    //---- button_orders ----
                                    button_orders.setText("Orders");
                                    switch_statisticsListPanel.add(button_orders);

                                    //---- button_tonkotsu ----
                                    button_tonkotsu.setText("Tonkotsu");
                                    switch_statisticsListPanel.add(button_tonkotsu);

                                    //---- button_shoyo ----
                                    button_shoyo.setText("Shoyo");
                                    switch_statisticsListPanel.add(button_shoyo);

                                    //---- button_shio ----
                                    button_shio.setText("Shio");
                                    switch_statisticsListPanel.add(button_shio);

                                    //---- button_nori ----
                                    button_nori.setText("Nori");
                                    switch_statisticsListPanel.add(button_nori);

                                    //---- button_chashu ----
                                    button_chashu.setText("Chashu");
                                    switch_statisticsListPanel.add(button_chashu);

                                    //---- button_egg ----
                                    button_egg.setText("Egg");
                                    switch_statisticsListPanel.add(button_egg);

                                    //---- button_shoot ----
                                    button_shoot.setText("Shoot");
                                    switch_statisticsListPanel.add(button_shoot);
                                }
                                switch_outerPanel.add(switch_statisticsListPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                    new Insets(0, 0, 0, 0), 0, 0));

                                //======== statisticsImageCard ========
                                {
                                    statisticsImageCard.setLayout(new BorderLayout());
                                }
                                switch_outerPanel.add(statisticsImageCard, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                    new Insets(0, 0, 0, 0), 0, 0));

                                //======== statisticsDataCard ========
                                {
                                    statisticsDataCard.setLayout(new CardLayout());

                                    //======== weeklyPanel ========
                                    {
                                        weeklyPanel.setBackground(new Color(223, 217, 213));
                                        weeklyPanel.setLayout(new GridBagLayout());
                                        ((GridBagLayout)weeklyPanel.getLayout()).columnWidths = new int[] {300, 0};
                                        ((GridBagLayout)weeklyPanel.getLayout()).rowHeights = new int[] {45, 330, 0};
                                        ((GridBagLayout)weeklyPanel.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                                        ((GridBagLayout)weeklyPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

                                        //---- label_title_monthlyStatistics ----
                                        label_title_monthlyStatistics.setText("Weekly Statistics");
                                        label_title_monthlyStatistics.setHorizontalAlignment(SwingConstants.CENTER);
                                        label_title_monthlyStatistics.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                                        weeklyPanel.add(label_title_monthlyStatistics, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                            new Insets(0, 0, 0, 0), 0, 0));

                                        //======== weeklyBodyPanel ========
                                        {
                                            weeklyBodyPanel.setBackground(new Color(248, 245, 239));
                                            weeklyBodyPanel.setLayout(new GridBagLayout());
                                            ((GridBagLayout)weeklyBodyPanel.getLayout()).columnWidths = new int[] {460, 0};
                                            ((GridBagLayout)weeklyBodyPanel.getLayout()).rowHeights = new int[] {150, 180, 0};
                                            ((GridBagLayout)weeklyBodyPanel.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                                            ((GridBagLayout)weeklyBodyPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

                                            //======== weekly_hedPanel ========
                                            {
                                                weekly_hedPanel.setBackground(new Color(248, 245, 239));
                                                weekly_hedPanel.setLayout(new GridLayout(3, 2));

                                                //---- label_statisticRange ----
                                                label_statisticRange.setText("Statistic range:");
                                                weekly_hedPanel.add(label_statisticRange);

                                                //---- weeklyRange ----
                                                weeklyRange.setText("2020-05-04 -> 2020-05-11");
                                                weekly_hedPanel.add(weeklyRange);

                                                //---- label_weeklyIncome ----
                                                label_weeklyIncome.setText("Weekly income:");
                                                weekly_hedPanel.add(label_weeklyIncome);

                                                //---- weeklyIncome ----
                                                weeklyIncome.setText("\u00a3 2000");
                                                weekly_hedPanel.add(weeklyIncome);

                                                //---- label_weeklyOrders ----
                                                label_weeklyOrders.setText("Orders number:");
                                                weekly_hedPanel.add(label_weeklyOrders);

                                                //---- weeklyOrders ----
                                                weeklyOrders.setText("100");
                                                weekly_hedPanel.add(weeklyOrders);
                                            }
                                            weeklyBodyPanel.add(weekly_hedPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                                new Insets(0, 0, 0, 0), 0, 0));

                                            //======== weekly_footPanel ========
                                            {
                                                weekly_footPanel.setBorder(new TitledBorder("Details number"));
                                                weekly_footPanel.setBackground(new Color(248, 245, 239));
                                                weekly_footPanel.setLayout(new GridLayout(4, 4));

                                                //---- label_tonkotsu ----
                                                label_tonkotsu.setText("Tonkotsu:");
                                                weekly_footPanel.add(label_tonkotsu);

                                                //---- weeklyTonkotsu ----
                                                weeklyTonkotsu.setText("10");
                                                weekly_footPanel.add(weeklyTonkotsu);

                                                //---- label_nori ----
                                                label_nori.setText("Nori:");
                                                weekly_footPanel.add(label_nori);

                                                //---- weeklyNori ----
                                                weeklyNori.setText("10");
                                                weekly_footPanel.add(weeklyNori);

                                                //---- label_shoyo ----
                                                label_shoyo.setText("Shoyo:");
                                                weekly_footPanel.add(label_shoyo);

                                                //---- weeklyShoyo ----
                                                weeklyShoyo.setText("10");
                                                weekly_footPanel.add(weeklyShoyo);

                                                //---- label_chashu ----
                                                label_chashu.setText("Chashu:");
                                                weekly_footPanel.add(label_chashu);

                                                //---- weeklyChashu ----
                                                weeklyChashu.setText("10");
                                                weekly_footPanel.add(weeklyChashu);

                                                //---- label_shio ----
                                                label_shio.setText("Shio:");
                                                weekly_footPanel.add(label_shio);

                                                //---- weeklyShio ----
                                                weeklyShio.setText("10");
                                                weekly_footPanel.add(weeklyShio);

                                                //---- label_egg ----
                                                label_egg.setText("Egg:");
                                                weekly_footPanel.add(label_egg);

                                                //---- weeklyEgg ----
                                                weeklyEgg.setText("10");
                                                weekly_footPanel.add(weeklyEgg);

                                                //======== emptyBox6 ========
                                                {
                                                    emptyBox6.setBackground(new Color(248, 245, 239));
                                                    emptyBox6.setLayout(new BoxLayout(emptyBox6, BoxLayout.X_AXIS));
                                                }
                                                weekly_footPanel.add(emptyBox6);

                                                //======== emptyBox7 ========
                                                {
                                                    emptyBox7.setBackground(new Color(248, 245, 239));
                                                    emptyBox7.setLayout(new BoxLayout(emptyBox7, BoxLayout.X_AXIS));
                                                }
                                                weekly_footPanel.add(emptyBox7);

                                                //---- label_shoot ----
                                                label_shoot.setText("Shoot:");
                                                weekly_footPanel.add(label_shoot);

                                                //---- weeklyShoot ----
                                                weeklyShoot.setText("10");
                                                weekly_footPanel.add(weeklyShoot);
                                            }
                                            weeklyBodyPanel.add(weekly_footPanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                                new Insets(0, 0, 0, 0), 0, 0));
                                        }
                                        weeklyPanel.add(weeklyBodyPanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                            new Insets(0, 0, 0, 0), 0, 0));
                                    }
                                    statisticsDataCard.add(weeklyPanel, "card1");
                                }
                                switch_outerPanel.add(statisticsDataCard, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,
                                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                    new Insets(0, 0, 0, 0), 0, 0));
                            }
                            switchCard.add(switch_outerPanel, "card1");
                        }
                        sug_outerPanel.add(switchCard, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    suggestionPanel.add(sug_outerPanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                bodyPanel.add(suggestionPanel, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
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

        //---- statisticsContentGroup ----
        ButtonGroup statisticsContentGroup = new ButtonGroup();
        statisticsContentGroup.add(button_income);
        statisticsContentGroup.add(button_orders);
        statisticsContentGroup.add(button_tonkotsu);
        statisticsContentGroup.add(button_shoyo);
        statisticsContentGroup.add(button_shio);
        statisticsContentGroup.add(button_nori);
        statisticsContentGroup.add(button_chashu);
        statisticsContentGroup.add(button_egg);
        statisticsContentGroup.add(button_shoot);

    }

    private JPanel boardPanel;
    private JPanel titlePanel;
    private JLabel logo;
    private JPanel bodyPanel;
    private JPanel emptyBox4;
    private JPanel indexPanel;
    public JPanel menuOperationPanel;
    private JLabel indexLabel_menuOperation;
    public JPanel popularityPanel;
    private JLabel indexLabel_popularity;
    public JPanel dataAnalysisPanel;
    private JLabel indexLabel_dataAnalysis;
    public JPanel membershipOperationPanel;
    private JLabel indexLabel_membershipOperation;
    private JPanel emptyBox5;
    private JPanel suggestionPanel;
    private JPanel sug_outerPanel;
    private JPanel switchCard;
    private JPanel switch_outerPanel;
    private JPanel switch_statisticsListPanel;
    public JToggleButton button_income;
    public JToggleButton button_orders;
    public JToggleButton button_tonkotsu;
    public JToggleButton button_shoyo;
    public JToggleButton button_shio;
    public JToggleButton button_nori;
    public JToggleButton button_chashu;
    public JToggleButton button_egg;
    public JToggleButton button_shoot;
    public JPanel statisticsImageCard;
    private JPanel statisticsDataCard;
    private JPanel weeklyPanel;
    private JLabel label_title_monthlyStatistics;
    private JPanel weeklyBodyPanel;
    private JPanel weekly_hedPanel;
    private JLabel label_statisticRange;
    public JLabel weeklyRange;
    private JLabel label_weeklyIncome;
    public JLabel weeklyIncome;
    private JLabel label_weeklyOrders;
    public JLabel weeklyOrders;
    private JPanel weekly_footPanel;
    private JLabel label_tonkotsu;
    public JLabel weeklyTonkotsu;
    private JLabel label_nori;
    public JLabel weeklyNori;
    private JLabel label_shoyo;
    public JLabel weeklyShoyo;
    private JLabel label_chashu;
    public JLabel weeklyChashu;
    private JLabel label_shio;
    public JLabel weeklyShio;
    private JLabel label_egg;
    public JLabel weeklyEgg;
    private JPanel emptyBox6;
    private JPanel emptyBox7;
    private JLabel label_shoot;
    public JLabel weeklyShoot;
    private JPanel bottomPanel;
    private JPanel bottom_innerPanel;
    private JLabel storeName;
    private JLabel storeAddress;
    private JLabel storeTelphone;

}
