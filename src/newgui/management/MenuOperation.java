/*
 * Created by JFormDesigner on Sun Apr 19 20:41:28 GMT+08:00 2020
 */

package newgui.management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Brainrain
 */
public class MenuOperation extends JPanel {
    public MenuOperation() {
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
        popularityPanel = new JPanel();
        indexLabel_popularity = new JLabel();
        dataAnalysisPanel = new JPanel();
        indexLabel_dataAnalysis = new JLabel();
        membershipOperationPanel = new JPanel();
        indexLabel_membershipOperation = new JLabel();
        emptyBox5 = new JPanel();
        body_innerPanel = new JPanel();
        bi_leftPanel = new JPanel();
        label_menuSuggested = new JLabel();
        suggest_typePanel = new JPanel();
        label_soup = new JLabel();
        soup1 = new JLabel();
        soup2 = new JLabel();
        soup3 = new JLabel();
        label_noodle0 = new JLabel();
        noodle1 = new JLabel();
        noodle2 = new JLabel();
        noodle3 = new JLabel();
        label_onion = new JLabel();
        onion1 = new JLabel();
        onion2 = new JLabel();
        onion3 = new JLabel();
        suggest_spicinessPanel = new JPanel();
        label_spiciness = new JLabel();
        spiciness0 = new JLabel();
        spiciness1 = new JLabel();
        spiciness2 = new JLabel();
        spiciness3 = new JLabel();
        spiciness4 = new JLabel();
        spiciness5 = new JLabel();
        suggest_pricePanel = new JPanel();
        label_name0 = new JLabel();
        label_price = new JLabel();
        label_isAvailable = new JLabel();
        label_noodle1 = new JLabel();
        sugPrice_noodle = new JLabel();
        emptyBox0 = new JPanel();
        label_nori0 = new JLabel();
        sugPrice_nori = new JLabel();
        sugAvailable_nori = new JLabel();
        label_chashu0 = new JLabel();
        sugPrice_chashu = new JLabel();
        sugAvailable_chashu = new JLabel();
        label_egg0 = new JLabel();
        sugPrice_egg = new JLabel();
        sugAvailable_egg = new JLabel();
        label_shoot0 = new JLabel();
        sugPrice_shoot = new JLabel();
        sugAvailable_shoot = new JLabel();
        bi_rightPanel = new JPanel();
        label_menuChange = new JLabel();
        changePanel = new JPanel();
        change_leftPanel = new JPanel();
        label_name1 = new JLabel();
        label_price1 = new JLabel();
        label_noodle2 = new JLabel();
        inputPrice_noodle = new JTextField();
        label_nori1 = new JLabel();
        inputPrice_nori = new JTextField();
        label_chashu1 = new JLabel();
        inputPrice_chashu = new JTextField();
        label_egg1 = new JLabel();
        inputPrice_egg = new JTextField();
        label_shoot1 = new JLabel();
        inputPrice_shoot = new JTextField();
        change_rightPanel = new JPanel();
        label_isAvailable1 = new JLabel();
        emptyBox1 = new JPanel();
        noriAvailablePanel = new JPanel();
        inputAvailable_nori = new JToggleButton();
        inputUnavailable_nori = new JToggleButton();
        chashuAvailablePanel = new JPanel();
        inputAvailable_chashu = new JToggleButton();
        inputUnavailable_chashu = new JToggleButton();
        eggAvailablePanel = new JPanel();
        inputAvailable_egg = new JToggleButton();
        inputUnavailable_egg = new JToggleButton();
        shootAvailablePanel = new JPanel();
        inputAvailable_shoot = new JToggleButton();
        inputUnavailable_shoot = new JToggleButton();
        chang_bottomPanel = new JPanel();
        emptyBox2 = new JPanel();
        buttonsPanel = new JPanel();
        returnButton = new JButton();
        resetButton = new JButton();
        saveButton = new JButton();
        emptyBox3 = new JPanel();
        bottomPanel = new JPanel();
        bottom_innerPanel = new JPanel();
        storeName = new JLabel();
        storeAddress = new JLabel();
        storeTelphone = new JLabel();
        available_noriGroup = new ButtonGroup();
        available_chashuGroup = new ButtonGroup();
        available_eggGroup = new ButtonGroup();
        available_shootGroup = new ButtonGroup();

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
                        menuOperationPanel.setBackground(Color.white);
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

                //======== body_innerPanel ========
                {
                    body_innerPanel.setBackground(Color.white);
                    body_innerPanel.setLayout(new GridBagLayout());
                    ((GridBagLayout)body_innerPanel.getLayout()).columnWidths = new int[] {475, 25, 450, 0};
                    ((GridBagLayout)body_innerPanel.getLayout()).rowHeights = new int[] {370, 0};
                    ((GridBagLayout)body_innerPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                    ((GridBagLayout)body_innerPanel.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                    //======== bi_leftPanel ========
                    {
                        bi_leftPanel.setBackground(Color.white);
                        bi_leftPanel.setLayout(new GridBagLayout());
                        ((GridBagLayout)bi_leftPanel.getLayout()).columnWidths = new int[] {475, 0};
                        ((GridBagLayout)bi_leftPanel.getLayout()).rowHeights = new int[] {35, 108, 36, 216, 0};
                        ((GridBagLayout)bi_leftPanel.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                        ((GridBagLayout)bi_leftPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

                        //---- label_menuSuggested ----
                        label_menuSuggested.setText("Menu suggested");
                        label_menuSuggested.setHorizontalAlignment(SwingConstants.CENTER);
                        label_menuSuggested.setBackground(Color.white);
                        bi_leftPanel.add(label_menuSuggested, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== suggest_typePanel ========
                        {
                            suggest_typePanel.setBorder(new TitledBorder("Type"));
                            suggest_typePanel.setBackground(Color.white);
                            suggest_typePanel.setLayout(new GridLayout(3, 4));

                            //---- label_soup ----
                            label_soup.setText("Soup");
                            label_soup.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                            suggest_typePanel.add(label_soup);

                            //---- soup1 ----
                            soup1.setText("Tonkotsu");
                            suggest_typePanel.add(soup1);

                            //---- soup2 ----
                            soup2.setText("Shoyu");
                            suggest_typePanel.add(soup2);

                            //---- soup3 ----
                            soup3.setText("Shio");
                            suggest_typePanel.add(soup3);

                            //---- label_noodle0 ----
                            label_noodle0.setText("Noodle");
                            label_noodle0.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                            suggest_typePanel.add(label_noodle0);

                            //---- noodle1 ----
                            noodle1.setText("Soft");
                            suggest_typePanel.add(noodle1);

                            //---- noodle2 ----
                            noodle2.setText("Medium");
                            suggest_typePanel.add(noodle2);

                            //---- noodle3 ----
                            noodle3.setText("Firm");
                            suggest_typePanel.add(noodle3);

                            //---- label_onion ----
                            label_onion.setText("Spring onion");
                            label_onion.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                            suggest_typePanel.add(label_onion);

                            //---- onion1 ----
                            onion1.setText("No please");
                            suggest_typePanel.add(onion1);

                            //---- onion2 ----
                            onion2.setText("Just a little");
                            suggest_typePanel.add(onion2);

                            //---- onion3 ----
                            onion3.setText("A lot");
                            suggest_typePanel.add(onion3);
                        }
                        bi_leftPanel.add(suggest_typePanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== suggest_spicinessPanel ========
                        {
                            suggest_spicinessPanel.setBorder(new TitledBorder("Spiciness"));
                            suggest_spicinessPanel.setBackground(Color.white);
                            suggest_spicinessPanel.setLayout(new GridLayout(1, 7));

                            //---- label_spiciness ----
                            label_spiciness.setText("Spiciness");
                            label_spiciness.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                            suggest_spicinessPanel.add(label_spiciness);

                            //---- spiciness0 ----
                            spiciness0.setText("0");
                            spiciness0.setHorizontalAlignment(SwingConstants.CENTER);
                            suggest_spicinessPanel.add(spiciness0);

                            //---- spiciness1 ----
                            spiciness1.setText("1");
                            spiciness1.setHorizontalAlignment(SwingConstants.CENTER);
                            suggest_spicinessPanel.add(spiciness1);

                            //---- spiciness2 ----
                            spiciness2.setText("2");
                            spiciness2.setHorizontalAlignment(SwingConstants.CENTER);
                            suggest_spicinessPanel.add(spiciness2);

                            //---- spiciness3 ----
                            spiciness3.setText("3");
                            spiciness3.setHorizontalAlignment(SwingConstants.CENTER);
                            suggest_spicinessPanel.add(spiciness3);

                            //---- spiciness4 ----
                            spiciness4.setText("4");
                            spiciness4.setHorizontalAlignment(SwingConstants.CENTER);
                            suggest_spicinessPanel.add(spiciness4);

                            //---- spiciness5 ----
                            spiciness5.setText("5");
                            spiciness5.setHorizontalAlignment(SwingConstants.CENTER);
                            suggest_spicinessPanel.add(spiciness5);
                        }
                        bi_leftPanel.add(suggest_spicinessPanel, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== suggest_pricePanel ========
                        {
                            suggest_pricePanel.setBorder(new TitledBorder("Price"));
                            suggest_pricePanel.setBackground(Color.white);
                            suggest_pricePanel.setLayout(new GridLayout(6, 3));

                            //---- label_name0 ----
                            label_name0.setText("Name");
                            label_name0.setForeground(Color.lightGray);
                            suggest_pricePanel.add(label_name0);

                            //---- label_price ----
                            label_price.setText("Price");
                            label_price.setForeground(Color.lightGray);
                            suggest_pricePanel.add(label_price);

                            //---- label_isAvailable ----
                            label_isAvailable.setText("IsAvailable");
                            label_isAvailable.setForeground(Color.lightGray);
                            suggest_pricePanel.add(label_isAvailable);

                            //---- label_noodle1 ----
                            label_noodle1.setText("Noodle");
                            label_noodle1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                            suggest_pricePanel.add(label_noodle1);

                            //---- sugPrice_noodle ----
                            sugPrice_noodle.setText("\uffe19.99");
                            suggest_pricePanel.add(sugPrice_noodle);

                            //======== emptyBox0 ========
                            {
                                emptyBox0.setBackground(Color.white);
                                emptyBox0.setLayout(new BoxLayout(emptyBox0, BoxLayout.X_AXIS));
                            }
                            suggest_pricePanel.add(emptyBox0);

                            //---- label_nori0 ----
                            label_nori0.setText("Nori");
                            label_nori0.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                            suggest_pricePanel.add(label_nori0);

                            //---- sugPrice_nori ----
                            sugPrice_nori.setText("\uffe11");
                            suggest_pricePanel.add(sugPrice_nori);

                            //---- sugAvailable_nori ----
                            sugAvailable_nori.setText("Available");
                            suggest_pricePanel.add(sugAvailable_nori);

                            //---- label_chashu0 ----
                            label_chashu0.setText("Chashu");
                            label_chashu0.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                            suggest_pricePanel.add(label_chashu0);

                            //---- sugPrice_chashu ----
                            sugPrice_chashu.setText("\uffe12");
                            suggest_pricePanel.add(sugPrice_chashu);

                            //---- sugAvailable_chashu ----
                            sugAvailable_chashu.setText("Available");
                            suggest_pricePanel.add(sugAvailable_chashu);

                            //---- label_egg0 ----
                            label_egg0.setText("Boiled egg");
                            label_egg0.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                            suggest_pricePanel.add(label_egg0);

                            //---- sugPrice_egg ----
                            sugPrice_egg.setText("\uffe11");
                            suggest_pricePanel.add(sugPrice_egg);

                            //---- sugAvailable_egg ----
                            sugAvailable_egg.setText("Available");
                            suggest_pricePanel.add(sugAvailable_egg);

                            //---- label_shoot0 ----
                            label_shoot0.setText("Shoot");
                            label_shoot0.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                            suggest_pricePanel.add(label_shoot0);

                            //---- sugPrice_shoot ----
                            sugPrice_shoot.setText("\uffe11");
                            suggest_pricePanel.add(sugPrice_shoot);

                            //---- sugAvailable_shoot ----
                            sugAvailable_shoot.setText("Available");
                            suggest_pricePanel.add(sugAvailable_shoot);
                        }
                        bi_leftPanel.add(suggest_pricePanel, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    body_innerPanel.add(bi_leftPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //======== bi_rightPanel ========
                    {
                        bi_rightPanel.setBackground(Color.white);
                        bi_rightPanel.setLayout(new GridBagLayout());
                        ((GridBagLayout)bi_rightPanel.getLayout()).columnWidths = new int[] {450, 0};
                        ((GridBagLayout)bi_rightPanel.getLayout()).rowHeights = new int[] {36, 35, 216, 108, 0};
                        ((GridBagLayout)bi_rightPanel.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                        ((GridBagLayout)bi_rightPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

                        //---- label_menuChange ----
                        label_menuChange.setText("Menu change");
                        label_menuChange.setHorizontalAlignment(SwingConstants.CENTER);
                        bi_rightPanel.add(label_menuChange, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== changePanel ========
                        {
                            changePanel.setBackground(Color.white);
                            changePanel.setLayout(new GridBagLayout());
                            ((GridBagLayout)changePanel.getLayout()).columnWidths = new int[] {230, 220, 0};
                            ((GridBagLayout)changePanel.getLayout()).rowHeights = new int[] {216, 0};
                            ((GridBagLayout)changePanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                            ((GridBagLayout)changePanel.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                            //======== change_leftPanel ========
                            {
                                change_leftPanel.setBackground(Color.white);
                                change_leftPanel.setLayout(new GridLayout(6, 2));

                                //---- label_name1 ----
                                label_name1.setText("Name");
                                change_leftPanel.add(label_name1);

                                //---- label_price1 ----
                                label_price1.setText("Price");
                                label_price1.setHorizontalAlignment(SwingConstants.CENTER);
                                change_leftPanel.add(label_price1);

                                //---- label_noodle2 ----
                                label_noodle2.setText("Noodle");
                                label_noodle2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                                change_leftPanel.add(label_noodle2);
                                change_leftPanel.add(inputPrice_noodle);

                                //---- label_nori1 ----
                                label_nori1.setText("Nori");
                                label_nori1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                                change_leftPanel.add(label_nori1);
                                change_leftPanel.add(inputPrice_nori);

                                //---- label_chashu1 ----
                                label_chashu1.setText("Chashu");
                                label_chashu1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                                change_leftPanel.add(label_chashu1);
                                change_leftPanel.add(inputPrice_chashu);

                                //---- label_egg1 ----
                                label_egg1.setText("Boiled egg");
                                label_egg1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                                change_leftPanel.add(label_egg1);
                                change_leftPanel.add(inputPrice_egg);

                                //---- label_shoot1 ----
                                label_shoot1.setText("Shoot");
                                label_shoot1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
                                change_leftPanel.add(label_shoot1);
                                change_leftPanel.add(inputPrice_shoot);
                            }
                            changePanel.add(change_leftPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //======== change_rightPanel ========
                            {
                                change_rightPanel.setBackground(Color.white);
                                change_rightPanel.setLayout(new GridLayout(6, 0));

                                //---- label_isAvailable1 ----
                                label_isAvailable1.setText("IsAvailable");
                                label_isAvailable1.setHorizontalAlignment(SwingConstants.CENTER);
                                change_rightPanel.add(label_isAvailable1);

                                //======== emptyBox1 ========
                                {
                                    emptyBox1.setBackground(Color.white);
                                    emptyBox1.setLayout(new BoxLayout(emptyBox1, BoxLayout.X_AXIS));
                                }
                                change_rightPanel.add(emptyBox1);

                                //======== noriAvailablePanel ========
                                {
                                    noriAvailablePanel.setBackground(Color.white);
                                    noriAvailablePanel.setLayout(new GridLayout(1, 2));

                                    //---- inputAvailable_nori ----
                                    inputAvailable_nori.setText("Available");
                                    noriAvailablePanel.add(inputAvailable_nori);

                                    //---- inputUnavailable_nori ----
                                    inputUnavailable_nori.setText("Unavailable");
                                    noriAvailablePanel.add(inputUnavailable_nori);
                                }
                                change_rightPanel.add(noriAvailablePanel);

                                //======== chashuAvailablePanel ========
                                {
                                    chashuAvailablePanel.setBackground(Color.white);
                                    chashuAvailablePanel.setLayout(new GridLayout(1, 2));

                                    //---- inputAvailable_chashu ----
                                    inputAvailable_chashu.setText("Available");
                                    chashuAvailablePanel.add(inputAvailable_chashu);

                                    //---- inputUnavailable_chashu ----
                                    inputUnavailable_chashu.setText("Unavailable");
                                    chashuAvailablePanel.add(inputUnavailable_chashu);
                                }
                                change_rightPanel.add(chashuAvailablePanel);

                                //======== eggAvailablePanel ========
                                {
                                    eggAvailablePanel.setBackground(Color.white);
                                    eggAvailablePanel.setLayout(new GridLayout(1, 2));

                                    //---- inputAvailable_egg ----
                                    inputAvailable_egg.setText("Available");
                                    eggAvailablePanel.add(inputAvailable_egg);

                                    //---- inputUnavailable_egg ----
                                    inputUnavailable_egg.setText("Unavailable");
                                    eggAvailablePanel.add(inputUnavailable_egg);
                                }
                                change_rightPanel.add(eggAvailablePanel);

                                //======== shootAvailablePanel ========
                                {
                                    shootAvailablePanel.setBackground(Color.white);
                                    shootAvailablePanel.setLayout(new GridLayout(1, 2));

                                    //---- inputAvailable_shoot ----
                                    inputAvailable_shoot.setText("Available");
                                    shootAvailablePanel.add(inputAvailable_shoot);

                                    //---- inputUnavailable_shoot ----
                                    inputUnavailable_shoot.setText("Unavailable");
                                    shootAvailablePanel.add(inputUnavailable_shoot);
                                }
                                change_rightPanel.add(shootAvailablePanel);
                            }
                            changePanel.add(change_rightPanel, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));
                        }
                        bi_rightPanel.add(changePanel, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== chang_bottomPanel ========
                        {
                            chang_bottomPanel.setBackground(Color.white);
                            chang_bottomPanel.setLayout(new GridLayout(3, 1));

                            //======== emptyBox2 ========
                            {
                                emptyBox2.setBackground(Color.white);
                                emptyBox2.setLayout(new BoxLayout(emptyBox2, BoxLayout.X_AXIS));
                            }
                            chang_bottomPanel.add(emptyBox2);

                            //======== buttonsPanel ========
                            {
                                buttonsPanel.setBackground(Color.white);
                                buttonsPanel.setLayout(new GridLayout(1, 3));

                                //---- returnButton ----
                                returnButton.setText("Return");
                                buttonsPanel.add(returnButton);

                                //---- resetButton ----
                                resetButton.setText("Reset");
                                buttonsPanel.add(resetButton);

                                //---- saveButton ----
                                saveButton.setText("Save changes");
                                buttonsPanel.add(saveButton);
                            }
                            chang_bottomPanel.add(buttonsPanel);

                            //======== emptyBox3 ========
                            {
                                emptyBox3.setBackground(Color.white);
                                emptyBox3.setLayout(new BoxLayout(emptyBox3, BoxLayout.X_AXIS));
                            }
                            chang_bottomPanel.add(emptyBox3);
                        }
                        bi_rightPanel.add(chang_bottomPanel, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    body_innerPanel.add(bi_rightPanel, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
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

        //---- available_noriGroup ----
        available_noriGroup.add(inputAvailable_nori);
        available_noriGroup.add(inputUnavailable_nori);

        //---- available_chashuGroup ----
        available_chashuGroup.add(inputAvailable_chashu);
        available_chashuGroup.add(inputUnavailable_chashu);

        //---- available_eggGroup ----
        available_eggGroup.add(inputAvailable_egg);
        available_eggGroup.add(inputUnavailable_egg);

        //---- available_shootGroup ----
        available_shootGroup.add(inputAvailable_shoot);
        available_shootGroup.add(inputUnavailable_shoot);
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
    public JPanel popularityPanel;
    private JLabel indexLabel_popularity;
    public JPanel dataAnalysisPanel;
    private JLabel indexLabel_dataAnalysis;
    public JPanel membershipOperationPanel;
    private JLabel indexLabel_membershipOperation;
    private JPanel emptyBox5;
    private JPanel body_innerPanel;
    private JPanel bi_leftPanel;
    private JLabel label_menuSuggested;
    private JPanel suggest_typePanel;
    private JLabel label_soup;
    public JLabel soup1;
    public JLabel soup2;
    public JLabel soup3;
    private JLabel label_noodle0;
    public JLabel noodle1;
    public JLabel noodle2;
    public JLabel noodle3;
    private JLabel label_onion;
    public JLabel onion1;
    public JLabel onion2;
    public JLabel onion3;
    private JPanel suggest_spicinessPanel;
    private JLabel label_spiciness;
    public JLabel spiciness0;
    public JLabel spiciness1;
    public JLabel spiciness2;
    public JLabel spiciness3;
    public JLabel spiciness4;
    public JLabel spiciness5;
    private JPanel suggest_pricePanel;
    private JLabel label_name0;
    private JLabel label_price;
    private JLabel label_isAvailable;
    private JLabel label_noodle1;
    public JLabel sugPrice_noodle;
    private JPanel emptyBox0;
    private JLabel label_nori0;
    public JLabel sugPrice_nori;
    public JLabel sugAvailable_nori;
    private JLabel label_chashu0;
    public JLabel sugPrice_chashu;
    public JLabel sugAvailable_chashu;
    private JLabel label_egg0;
    public JLabel sugPrice_egg;
    public JLabel sugAvailable_egg;
    private JLabel label_shoot0;
    public JLabel sugPrice_shoot;
    public JLabel sugAvailable_shoot;
    private JPanel bi_rightPanel;
    private JLabel label_menuChange;
    private JPanel changePanel;
    private JPanel change_leftPanel;
    private JLabel label_name1;
    private JLabel label_price1;
    private JLabel label_noodle2;
    public JTextField inputPrice_noodle;
    private JLabel label_nori1;
    public JTextField inputPrice_nori;
    private JLabel label_chashu1;
    public JTextField inputPrice_chashu;
    private JLabel label_egg1;
    public JTextField inputPrice_egg;
    private JLabel label_shoot1;
    public JTextField inputPrice_shoot;
    private JPanel change_rightPanel;
    private JLabel label_isAvailable1;
    private JPanel emptyBox1;
    private JPanel noriAvailablePanel;
    public JToggleButton inputAvailable_nori;
    public JToggleButton inputUnavailable_nori;
    private JPanel chashuAvailablePanel;
    public JToggleButton inputAvailable_chashu;
    public JToggleButton inputUnavailable_chashu;
    private JPanel eggAvailablePanel;
    public JToggleButton inputAvailable_egg;
    public JToggleButton inputUnavailable_egg;
    private JPanel shootAvailablePanel;
    public JToggleButton inputAvailable_shoot;
    public JToggleButton inputUnavailable_shoot;
    private JPanel chang_bottomPanel;
    private JPanel emptyBox2;
    private JPanel buttonsPanel;
    public JButton returnButton;
    public JButton resetButton;
    public JButton saveButton;
    private JPanel emptyBox3;
    private JPanel bottomPanel;
    private JPanel bottom_innerPanel;
    private JLabel storeName;
    private JLabel storeAddress;
    private JLabel storeTelphone;
    public ButtonGroup available_noriGroup;
    public ButtonGroup available_chashuGroup;
    public ButtonGroup available_eggGroup;
    public ButtonGroup available_shootGroup;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
