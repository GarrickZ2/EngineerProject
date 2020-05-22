/*
 * Created by JFormDesigner on Fri Apr 24 14:02:53 GMT+08:00 2020
 */

package gui.management;

import java.awt.*;
import javax.swing.*;

/**
 * This is the frame of our membership operation graphic user interface
 * This page is used to change and check members' information, by manager
 * @author H
 */
public class MembershipOperation extends JPanel {
    /**
     * Use constructor to create the frame
     */
    public MembershipOperation() {
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
        body_innerPanel = new JPanel();
        searchPanel = new JPanel();
        search_input = new JTextField();
        searchButton = new JButton();
        memberInfo_titlePanel = new JPanel();
        label_membershipNumber = new JLabel();
        membeshipNumber = new JLabel();
        consumptionDetailTitlePanel = new JPanel();
        label_consumptionDetail = new JLabel();
        panel12 = new JPanel();
        label_serialNumber = new JLabel();
        serialNumber = new JLabel();
        membershipListPane = new JScrollPane();
        membershipList = new JList();
        memberInfoPanel = new JPanel();
        memberTablePanel = new JPanel();
        label_name = new JLabel();
        name = new JLabel();
        label_telephone = new JLabel();
        telephone = new JLabel();
        label_eMail = new JLabel();
        eMail = new JLabel();
        label_stamps = new JLabel();
        stamps = new JLabel();
        memberInfo_bottomPanel = new JPanel();
        stampAdditionPanel = new JPanel();
        label_addStamps = new JLabel();
        stampAddition_buttonPanel = new JPanel();
        addStamps_plus1 = new JButton();
        addStamps_plus5 = new JButton();
        addStamps_plus10 = new JButton();
        consuptionListPane = new JScrollPane();
        consumpList = new JList();
        consumptionDetailBodyPanel = new JPanel();
        detail_timePanel = new JPanel();
        label_consumptionTime = new JLabel();
        consumptionTime = new JLabel();
        detail_goodsIndexPanel = new JPanel();
        label_goodsName = new JLabel();
        detail_goodsIndexInnerPanel = new JPanel();
        label_goodsNumber = new JLabel();
        label_goodsSingle = new JLabel();
        label_goodsTotal = new JLabel();
        detail_noodlePanel = new JPanel();
        label_noodle = new JLabel();
        detail_noodleInnerPanel = new JPanel();
        noodleNumber = new JLabel();
        noodleSingle = new JLabel();
        noodlePrice = new JLabel();
        detail_noriPanel = new JPanel();
        label_nori = new JLabel();
        detail_noriInnerPanel = new JPanel();
        noriNumber = new JLabel();
        noriSingle = new JLabel();
        noriPrice = new JLabel();
        detail_chashuPanel = new JPanel();
        label_chashu = new JLabel();
        detail_chashuInnerPanel = new JPanel();
        chashuNumber = new JLabel();
        chashuSingle = new JLabel();
        chashuPrice = new JLabel();
        detail_eggPanel = new JPanel();
        label_egg = new JLabel();
        detail_eggInnerPanel = new JPanel();
        eggNumber = new JLabel();
        eggSingle = new JLabel();
        eggPrice = new JLabel();
        detail_shootPanel = new JPanel();
        label_shoot = new JLabel();
        detail_shootInnerPanel = new JPanel();
        shootNumber = new JLabel();
        shootSingle = new JLabel();
        shootPrice = new JLabel();
        detail_packingPanel = new JPanel();
        label_packing = new JLabel();
        detail_packingInnerPanel = new JPanel();
        packingNumber = new JLabel();
        packingSingle = new JLabel();
        packingPrice = new JLabel();
        detail_diningMethodPanel = new JPanel();
        label_diningMethod = new JLabel();
        diningMethod = new JLabel();
        detail_useCouponPanel = new JPanel();
        label_useCoupon = new JLabel();
        useCoupon = new JLabel();
        detail_totalPricePanel = new JPanel();
        label_totalPrice = new JLabel();
        totalPrice = new JLabel();
        detail_payingMethodPanel = new JPanel();
        label_payingMethod = new JLabel();
        payingMethod = new JLabel();
        detail_buttonsPanel = new JPanel();
        resetAdditionStampsButton = new JButton();
        returnButton = new JButton();
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

                    //======== popularityPanel ========
                    {
                        popularityPanel.setBackground(new Color(242, 156, 59, 0));
                        popularityPanel.setLayout(new GridLayout());

                        //---- indexLabel_popularity ----
                        indexLabel_popularity.setText("Popularity");
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
                        membershipOperationPanel.setBackground(Color.white);
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
                    ((GridBagLayout)body_innerPanel.getLayout()).columnWidths = new int[] {200, 20, 340, 20, 370, 0};
                    ((GridBagLayout)body_innerPanel.getLayout()).rowHeights = new int[] {20, 30, 10, 335, 0};
                    ((GridBagLayout)body_innerPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
                    ((GridBagLayout)body_innerPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

                    //======== searchPanel ========
                    {
                        searchPanel.setBackground(Color.white);
                        searchPanel.setLayout(new GridBagLayout());
                        ((GridBagLayout)searchPanel.getLayout()).columnWidths = new int[] {130, 70, 0};
                        ((GridBagLayout)searchPanel.getLayout()).rowHeights = new int[] {30, 0};
                        ((GridBagLayout)searchPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                        ((GridBagLayout)searchPanel.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};
                        searchPanel.add(search_input, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 5), 0, 0));

                        //---- searchButton ----
                        searchButton.setText("Search");
                        searchPanel.add(searchButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    body_innerPanel.add(searchPanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //======== memberInfo_titlePanel ========
                    {
                        memberInfo_titlePanel.setBackground(Color.white);
                        memberInfo_titlePanel.setLayout(new GridBagLayout());
                        ((GridBagLayout)memberInfo_titlePanel.getLayout()).columnWidths = new int[] {200, 140, 0};
                        ((GridBagLayout)memberInfo_titlePanel.getLayout()).rowHeights = new int[] {30, 0};
                        ((GridBagLayout)memberInfo_titlePanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                        ((GridBagLayout)memberInfo_titlePanel.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                        //---- label_membershipNumber ----
                        label_membershipNumber.setText("Member Number -");
                        label_membershipNumber.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                        memberInfo_titlePanel.add(label_membershipNumber, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- membeshipNumber ----
                        membeshipNumber.setText("00000001");
                        membeshipNumber.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                        memberInfo_titlePanel.add(membeshipNumber, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    body_innerPanel.add(memberInfo_titlePanel, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //======== consumptionDetailTitlePanel ========
                    {
                        consumptionDetailTitlePanel.setBackground(Color.white);
                        consumptionDetailTitlePanel.setLayout(new GridLayout(1, 2));

                        //---- label_consumptionDetail ----
                        label_consumptionDetail.setText("Consumption Detail");
                        label_consumptionDetail.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                        consumptionDetailTitlePanel.add(label_consumptionDetail);

                        //======== panel12 ========
                        {
                            panel12.setBackground(Color.white);
                            panel12.setLayout(new GridLayout(1, 2));

                            //---- label_serialNumber ----
                            label_serialNumber.setText("Serial No.");
                            label_serialNumber.setHorizontalAlignment(SwingConstants.TRAILING);
                            panel12.add(label_serialNumber);

                            //---- serialNumber ----
                            serialNumber.setText("125f4768763c");
                            serialNumber.setHorizontalAlignment(SwingConstants.TRAILING);
                            panel12.add(serialNumber);
                        }
                        consumptionDetailTitlePanel.add(panel12);
                    }
                    body_innerPanel.add(consumptionDetailTitlePanel, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //======== membershipListPane ========
                    {
                        membershipListPane.setViewportView(membershipList);
                    }
                    body_innerPanel.add(membershipListPane, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //======== memberInfoPanel ========
                    {
                        memberInfoPanel.setBackground(Color.white);
                        memberInfoPanel.setLayout(new GridBagLayout());
                        ((GridBagLayout)memberInfoPanel.getLayout()).columnWidths = new int[] {310, 0};
                        ((GridBagLayout)memberInfoPanel.getLayout()).rowHeights = new int[] {120, 215, 0};
                        ((GridBagLayout)memberInfoPanel.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                        ((GridBagLayout)memberInfoPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

                        //======== memberTablePanel ========
                        {
                            memberTablePanel.setBackground(Color.white);
                            memberTablePanel.setLayout(new GridBagLayout());
                            ((GridBagLayout)memberTablePanel.getLayout()).columnWidths = new int[] {100, 240, 0};
                            ((GridBagLayout)memberTablePanel.getLayout()).rowHeights = new int[] {30, 30, 30, 30, 0};
                            ((GridBagLayout)memberTablePanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                            ((GridBagLayout)memberTablePanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

                            //---- label_name ----
                            label_name.setText("Name:");
                            memberTablePanel.add(label_name, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //---- name ----
                            name.setText("Huang Tianhe");
                            name.setHorizontalAlignment(SwingConstants.CENTER);
                            memberTablePanel.add(name, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //---- label_telephone ----
                            label_telephone.setText("Telephone:");
                            memberTablePanel.add(label_telephone, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //---- telephone ----
                            telephone.setText("15500043370");
                            telephone.setHorizontalAlignment(SwingConstants.CENTER);
                            memberTablePanel.add(telephone, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //---- label_eMail ----
                            label_eMail.setText("E-mail:");
                            memberTablePanel.add(label_eMail, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //---- eMail ----
                            eMail.setText("447243910@qq.com");
                            eMail.setHorizontalAlignment(SwingConstants.CENTER);
                            memberTablePanel.add(eMail, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //---- label_stamps ----
                            label_stamps.setText("Stamps:");
                            memberTablePanel.add(label_stamps, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //---- stamps ----
                            stamps.setText("5");
                            stamps.setHorizontalAlignment(SwingConstants.CENTER);
                            memberTablePanel.add(stamps, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));
                        }
                        memberInfoPanel.add(memberTablePanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //======== memberInfo_bottomPanel ========
                        {
                            memberInfo_bottomPanel.setBackground(Color.white);
                            memberInfo_bottomPanel.setLayout(new GridBagLayout());
                            ((GridBagLayout)memberInfo_bottomPanel.getLayout()).columnWidths = new int[] {0, 0};
                            ((GridBagLayout)memberInfo_bottomPanel.getLayout()).rowHeights = new int[] {30, 20, 223, 0};
                            ((GridBagLayout)memberInfo_bottomPanel.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                            ((GridBagLayout)memberInfo_bottomPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                            //======== stampAdditionPanel ========
                            {
                                stampAdditionPanel.setBackground(Color.white);
                                stampAdditionPanel.setLayout(new GridBagLayout());
                                ((GridBagLayout)stampAdditionPanel.getLayout()).columnWidths = new int[] {100, 240, 0};
                                ((GridBagLayout)stampAdditionPanel.getLayout()).rowHeights = new int[] {30, 0};
                                ((GridBagLayout)stampAdditionPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                                ((GridBagLayout)stampAdditionPanel.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                                //---- label_addStamps ----
                                label_addStamps.setText("Add stamps");
                                stampAdditionPanel.add(label_addStamps, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                    new Insets(0, 0, 0, 0), 0, 0));

                                //======== stampAddition_buttonPanel ========
                                {
                                    stampAddition_buttonPanel.setBackground(Color.white);
                                    stampAddition_buttonPanel.setLayout(new GridLayout(1, 3));

                                    //---- addStamps_plus1 ----
                                    addStamps_plus1.setText("-1");
                                    stampAddition_buttonPanel.add(addStamps_plus1);

                                    //---- addStamps_plus5 ----
                                    addStamps_plus5.setText("+1");
                                    stampAddition_buttonPanel.add(addStamps_plus5);

                                    //---- addStamps_plus10 ----
                                    addStamps_plus10.setText("+5");
                                    stampAddition_buttonPanel.add(addStamps_plus10);
                                }
                                stampAdditionPanel.add(stampAddition_buttonPanel, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                    new Insets(0, 0, 0, 0), 0, 0));
                            }
                            memberInfo_bottomPanel.add(stampAdditionPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));

                            //======== consuptionListPane ========
                            {
                                consuptionListPane.setViewportView(consumpList);
                            }
                            memberInfo_bottomPanel.add(consuptionListPane, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));
                        }
                        memberInfoPanel.add(memberInfo_bottomPanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    body_innerPanel.add(memberInfoPanel, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //======== consumptionDetailBodyPanel ========
                    {
                        consumptionDetailBodyPanel.setBackground(Color.white);
                        consumptionDetailBodyPanel.setLayout(new GridLayout(13, 1));

                        //======== detail_timePanel ========
                        {
                            detail_timePanel.setBackground(Color.white);
                            detail_timePanel.setLayout(new GridLayout(1, 2));

                            //---- label_consumptionTime ----
                            label_consumptionTime.setText("Time:");
                            detail_timePanel.add(label_consumptionTime);

                            //---- consumptionTime ----
                            consumptionTime.setText("2020-05-03 17:29:56");
                            consumptionTime.setHorizontalAlignment(SwingConstants.TRAILING);
                            detail_timePanel.add(consumptionTime);
                        }
                        consumptionDetailBodyPanel.add(detail_timePanel);

                        //======== detail_goodsIndexPanel ========
                        {
                            detail_goodsIndexPanel.setBackground(new Color(255, 239, 217));
                            detail_goodsIndexPanel.setLayout(new GridLayout(1, 2));

                            //---- label_goodsName ----
                            label_goodsName.setText("Goods name");
                            detail_goodsIndexPanel.add(label_goodsName);

                            //======== detail_goodsIndexInnerPanel ========
                            {
                                detail_goodsIndexInnerPanel.setBackground(new Color(255, 239, 217));
                                detail_goodsIndexInnerPanel.setLayout(new GridLayout(1, 3));

                                //---- label_goodsNumber ----
                                label_goodsNumber.setText("Number");
                                label_goodsNumber.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_goodsIndexInnerPanel.add(label_goodsNumber);

                                //---- label_goodsSingle ----
                                label_goodsSingle.setText("Single");
                                label_goodsSingle.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_goodsIndexInnerPanel.add(label_goodsSingle);

                                //---- label_goodsTotal ----
                                label_goodsTotal.setText("Total");
                                label_goodsTotal.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_goodsIndexInnerPanel.add(label_goodsTotal);
                            }
                            detail_goodsIndexPanel.add(detail_goodsIndexInnerPanel);
                        }
                        consumptionDetailBodyPanel.add(detail_goodsIndexPanel);

                        //======== detail_noodlePanel ========
                        {
                            detail_noodlePanel.setBackground(Color.white);
                            detail_noodlePanel.setLayout(new GridLayout(1, 2));

                            //---- label_noodle ----
                            label_noodle.setText("Shoyo (Medium, A lot)");
                            detail_noodlePanel.add(label_noodle);

                            //======== detail_noodleInnerPanel ========
                            {
                                detail_noodleInnerPanel.setBackground(Color.white);
                                detail_noodleInnerPanel.setLayout(new GridLayout(1, 3));

                                //---- noodleNumber ----
                                noodleNumber.setText("1");
                                noodleNumber.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_noodleInnerPanel.add(noodleNumber);

                                //---- noodleSingle ----
                                noodleSingle.setText("\u00a39.0");
                                noodleSingle.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_noodleInnerPanel.add(noodleSingle);

                                //---- noodlePrice ----
                                noodlePrice.setText("\u00a39.0");
                                noodlePrice.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_noodleInnerPanel.add(noodlePrice);
                            }
                            detail_noodlePanel.add(detail_noodleInnerPanel);
                        }
                        consumptionDetailBodyPanel.add(detail_noodlePanel);

                        //======== detail_noriPanel ========
                        {
                            detail_noriPanel.setBackground(Color.white);
                            detail_noriPanel.setLayout(new GridLayout(1, 2));

                            //---- label_nori ----
                            label_nori.setText("Nori");
                            detail_noriPanel.add(label_nori);

                            //======== detail_noriInnerPanel ========
                            {
                                detail_noriInnerPanel.setBackground(Color.white);
                                detail_noriInnerPanel.setLayout(new GridLayout(1, 3));

                                //---- noriNumber ----
                                noriNumber.setText("1");
                                noriNumber.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_noriInnerPanel.add(noriNumber);

                                //---- noriSingle ----
                                noriSingle.setText("\u00a31.0");
                                noriSingle.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_noriInnerPanel.add(noriSingle);

                                //---- noriPrice ----
                                noriPrice.setText("\u00a31.0");
                                noriPrice.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_noriInnerPanel.add(noriPrice);
                            }
                            detail_noriPanel.add(detail_noriInnerPanel);
                        }
                        consumptionDetailBodyPanel.add(detail_noriPanel);

                        //======== detail_chashuPanel ========
                        {
                            detail_chashuPanel.setBackground(Color.white);
                            detail_chashuPanel.setLayout(new GridLayout(1, 2));

                            //---- label_chashu ----
                            label_chashu.setText("Chashu");
                            detail_chashuPanel.add(label_chashu);

                            //======== detail_chashuInnerPanel ========
                            {
                                detail_chashuInnerPanel.setBackground(Color.white);
                                detail_chashuInnerPanel.setLayout(new GridLayout(1, 3));

                                //---- chashuNumber ----
                                chashuNumber.setText("1");
                                chashuNumber.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_chashuInnerPanel.add(chashuNumber);

                                //---- chashuSingle ----
                                chashuSingle.setText("\u00a32.0");
                                chashuSingle.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_chashuInnerPanel.add(chashuSingle);

                                //---- chashuPrice ----
                                chashuPrice.setText("\u00a32.0");
                                chashuPrice.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_chashuInnerPanel.add(chashuPrice);
                            }
                            detail_chashuPanel.add(detail_chashuInnerPanel);
                        }
                        consumptionDetailBodyPanel.add(detail_chashuPanel);

                        //======== detail_eggPanel ========
                        {
                            detail_eggPanel.setBackground(Color.white);
                            detail_eggPanel.setLayout(new GridLayout(1, 2));

                            //---- label_egg ----
                            label_egg.setText("Egg");
                            detail_eggPanel.add(label_egg);

                            //======== detail_eggInnerPanel ========
                            {
                                detail_eggInnerPanel.setBackground(Color.white);
                                detail_eggInnerPanel.setLayout(new GridLayout(1, 3));

                                //---- eggNumber ----
                                eggNumber.setText("1");
                                eggNumber.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_eggInnerPanel.add(eggNumber);

                                //---- eggSingle ----
                                eggSingle.setText("\u00a31.0");
                                eggSingle.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_eggInnerPanel.add(eggSingle);

                                //---- eggPrice ----
                                eggPrice.setText("\u00a31.0");
                                eggPrice.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_eggInnerPanel.add(eggPrice);
                            }
                            detail_eggPanel.add(detail_eggInnerPanel);
                        }
                        consumptionDetailBodyPanel.add(detail_eggPanel);

                        //======== detail_shootPanel ========
                        {
                            detail_shootPanel.setBackground(Color.white);
                            detail_shootPanel.setLayout(new GridLayout(1, 2));

                            //---- label_shoot ----
                            label_shoot.setText("Shoot");
                            detail_shootPanel.add(label_shoot);

                            //======== detail_shootInnerPanel ========
                            {
                                detail_shootInnerPanel.setBackground(Color.white);
                                detail_shootInnerPanel.setLayout(new GridLayout(1, 3));

                                //---- shootNumber ----
                                shootNumber.setText("1");
                                shootNumber.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_shootInnerPanel.add(shootNumber);

                                //---- shootSingle ----
                                shootSingle.setText("\u00a31.0");
                                shootSingle.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_shootInnerPanel.add(shootSingle);

                                //---- shootPrice ----
                                shootPrice.setText("\u00a31.0");
                                shootPrice.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_shootInnerPanel.add(shootPrice);
                            }
                            detail_shootPanel.add(detail_shootInnerPanel);
                        }
                        consumptionDetailBodyPanel.add(detail_shootPanel);

                        //======== detail_packingPanel ========
                        {
                            detail_packingPanel.setBackground(Color.white);
                            detail_packingPanel.setLayout(new GridLayout(1, 2));

                            //---- label_packing ----
                            label_packing.setText("Packing");
                            detail_packingPanel.add(label_packing);

                            //======== detail_packingInnerPanel ========
                            {
                                detail_packingInnerPanel.setBackground(Color.white);
                                detail_packingInnerPanel.setLayout(new GridLayout(1, 3));

                                //---- packingNumber ----
                                packingNumber.setText("1");
                                packingNumber.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_packingInnerPanel.add(packingNumber);

                                //---- packingSingle ----
                                packingSingle.setText("\u00a31.0");
                                packingSingle.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_packingInnerPanel.add(packingSingle);

                                //---- packingPrice ----
                                packingPrice.setText("\u00a31.0");
                                packingPrice.setHorizontalAlignment(SwingConstants.CENTER);
                                detail_packingInnerPanel.add(packingPrice);
                            }
                            detail_packingPanel.add(detail_packingInnerPanel);
                        }
                        consumptionDetailBodyPanel.add(detail_packingPanel);

                        //======== detail_diningMethodPanel ========
                        {
                            detail_diningMethodPanel.setBackground(Color.white);
                            detail_diningMethodPanel.setLayout(new GridLayout(1, 2));

                            //---- label_diningMethod ----
                            label_diningMethod.setText("Dining method:");
                            detail_diningMethodPanel.add(label_diningMethod);

                            //---- diningMethod ----
                            diningMethod.setText("Take away");
                            diningMethod.setHorizontalAlignment(SwingConstants.CENTER);
                            detail_diningMethodPanel.add(diningMethod);
                        }
                        consumptionDetailBodyPanel.add(detail_diningMethodPanel);

                        //======== detail_useCouponPanel ========
                        {
                            detail_useCouponPanel.setBackground(Color.white);
                            detail_useCouponPanel.setLayout(new GridLayout(1, 2));

                            //---- label_useCoupon ----
                            label_useCoupon.setText("Use Coupon:");
                            detail_useCouponPanel.add(label_useCoupon);

                            //---- useCoupon ----
                            useCoupon.setText("False");
                            useCoupon.setHorizontalAlignment(SwingConstants.CENTER);
                            detail_useCouponPanel.add(useCoupon);
                        }
                        consumptionDetailBodyPanel.add(detail_useCouponPanel);

                        //======== detail_totalPricePanel ========
                        {
                            detail_totalPricePanel.setBackground(new Color(255, 239, 217));
                            detail_totalPricePanel.setLayout(new GridLayout(1, 2));

                            //---- label_totalPrice ----
                            label_totalPrice.setText("Total price:");
                            detail_totalPricePanel.add(label_totalPrice);

                            //---- totalPrice ----
                            totalPrice.setText("\u00a315.0");
                            totalPrice.setHorizontalAlignment(SwingConstants.CENTER);
                            detail_totalPricePanel.add(totalPrice);
                        }
                        consumptionDetailBodyPanel.add(detail_totalPricePanel);

                        //======== detail_payingMethodPanel ========
                        {
                            detail_payingMethodPanel.setBackground(Color.white);
                            detail_payingMethodPanel.setLayout(new GridLayout(1, 2));

                            //---- label_payingMethod ----
                            label_payingMethod.setText("Paying method:");
                            detail_payingMethodPanel.add(label_payingMethod);

                            //---- payingMethod ----
                            payingMethod.setText("Visa");
                            payingMethod.setHorizontalAlignment(SwingConstants.CENTER);
                            detail_payingMethodPanel.add(payingMethod);
                        }
                        consumptionDetailBodyPanel.add(detail_payingMethodPanel);

                        //======== detail_buttonsPanel ========
                        {
                            detail_buttonsPanel.setBackground(Color.white);
                            detail_buttonsPanel.setLayout(new GridLayout(1, 3));

                            //---- resetAdditionStampsButton ----
                            resetAdditionStampsButton.setText("Reset stamp");
                            detail_buttonsPanel.add(resetAdditionStampsButton);

                            //---- returnButton ----
                            returnButton.setText("Return");
                            detail_buttonsPanel.add(returnButton);

                            //---- printButton ----
                            printButton.setText("Print");
                            detail_buttonsPanel.add(printButton);
                        }
                        consumptionDetailBodyPanel.add(detail_buttonsPanel);
                    }
                    body_innerPanel.add(consumptionDetailBodyPanel, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0,
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
    public JPanel popularityPanel;
    private JLabel indexLabel_popularity;
    public JPanel dataAnalysisPanel;
    private JLabel indexLabel_dataAnalysis;
    public JPanel membershipOperationPanel;
    private JLabel indexLabel_membershipOperation;
    private JPanel emptyBox5;
    private JPanel body_innerPanel;
    private JPanel searchPanel;
    public JTextField search_input;
    public JButton searchButton;
    private JPanel memberInfo_titlePanel;
    private JLabel label_membershipNumber;
    public JLabel membeshipNumber;
    private JPanel consumptionDetailTitlePanel;
    private JLabel label_consumptionDetail;
    private JPanel panel12;
    private JLabel label_serialNumber;
    public JLabel serialNumber;
    private JScrollPane membershipListPane;
    public JList membershipList;
    private JPanel memberInfoPanel;
    private JPanel memberTablePanel;
    private JLabel label_name;
    public JLabel name;
    private JLabel label_telephone;
    public JLabel telephone;
    private JLabel label_eMail;
    public JLabel eMail;
    private JLabel label_stamps;
    public JLabel stamps;
    private JPanel memberInfo_bottomPanel;
    private JPanel stampAdditionPanel;
    private JLabel label_addStamps;
    private JPanel stampAddition_buttonPanel;
    public JButton addStamps_plus1;
    public JButton addStamps_plus5;
    public JButton addStamps_plus10;
    private JScrollPane consuptionListPane;
    public JList consumpList;
    private JPanel consumptionDetailBodyPanel;
    private JPanel detail_timePanel;
    private JLabel label_consumptionTime;
    public JLabel consumptionTime;
    private JPanel detail_goodsIndexPanel;
    private JLabel label_goodsName;
    private JPanel detail_goodsIndexInnerPanel;
    private JLabel label_goodsNumber;
    private JLabel label_goodsSingle;
    private JLabel label_goodsTotal;
    private JPanel detail_noodlePanel;
    public JLabel label_noodle;
    private JPanel detail_noodleInnerPanel;
    public JLabel noodleNumber;
    public JLabel noodleSingle;
    public JLabel noodlePrice;
    private JPanel detail_noriPanel;
    private JLabel label_nori;
    private JPanel detail_noriInnerPanel;
    public JLabel noriNumber;
    public JLabel noriSingle;
    public JLabel noriPrice;
    private JPanel detail_chashuPanel;
    private JLabel label_chashu;
    private JPanel detail_chashuInnerPanel;
    public JLabel chashuNumber;
    public JLabel chashuSingle;
    public JLabel chashuPrice;
    private JPanel detail_eggPanel;
    private JLabel label_egg;
    private JPanel detail_eggInnerPanel;
    public JLabel eggNumber;
    public JLabel eggSingle;
    public JLabel eggPrice;
    private JPanel detail_shootPanel;
    private JLabel label_shoot;
    private JPanel detail_shootInnerPanel;
    public JLabel shootNumber;
    public JLabel shootSingle;
    public JLabel shootPrice;
    private JPanel detail_packingPanel;
    private JLabel label_packing;
    private JPanel detail_packingInnerPanel;
    public JLabel packingNumber;
    public JLabel packingSingle;
    public JLabel packingPrice;
    private JPanel detail_diningMethodPanel;
    private JLabel label_diningMethod;
    public JLabel diningMethod;
    private JPanel detail_useCouponPanel;
    private JLabel label_useCoupon;
    public JLabel useCoupon;
    private JPanel detail_totalPricePanel;
    private JLabel label_totalPrice;
    public JLabel totalPrice;
    private JPanel detail_payingMethodPanel;
    private JLabel label_payingMethod;
    public JLabel payingMethod;
    private JPanel detail_buttonsPanel;
    public JButton resetAdditionStampsButton;
    public JButton returnButton;
    public JButton printButton;
    private JPanel bottomPanel;
    private JPanel bottom_innerPanel;
    private JLabel storeName;
    private JLabel storeAddress;
    private JLabel storeTelphone;
}
