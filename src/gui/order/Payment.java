/*
 * Created by JFormDesigner on Fri Apr 03 18:44:03 GMT+08:00 2020
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

    public void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        titlePanel = new JPanel();
        snLabel = new JLabel();
        serialNumber = new JLabel();
        timeLabel = new JLabel();
        time = new JLabel();
        membershipLabel = new JLabel();
        membershipNumber = new JLabel();
        itemLabel = new JLabel();
        itemPanel0 = new JPanel();
        noodlePicture = new JLabel();
        itemLabelList = new JPanel();
        soupLabel = new JLabel();
        noodleLabel = new JLabel();
        onionLabel = new JLabel();
        spicinessLabel = new JLabel();
        itemLabelList1 = new JPanel();
        soup = new JLabel();
        noodle = new JLabel();
        onion = new JLabel();
        spiciness = new JLabel();
        itemLabelList2 = new JPanel();
        noodlePrice = new JLabel();
        noodlePrice1 = new JLabel();
        onionPrice = new JLabel();
        spicinessPrice = new JLabel();
        itemPanel1 = new JPanel();
        noriLabel = new JLabel();
        nori = new JLabel();
        extraLabel0 = new JLabel();
        extraNori = new JLabel();
        noriPrice = new JLabel();
        eggLabel = new JLabel();
        egg = new JLabel();
        extraLabel1 = new JLabel();
        extraEgg = new JLabel();
        eggPrice = new JLabel();
        shootLabel = new JLabel();
        shoot = new JLabel();
        extraLabel2 = new JLabel();
        extraShoot = new JLabel();
        shootPrice = new JLabel();
        chashuLabel = new JLabel();
        chashu = new JLabel();
        extraLabel3 = new JLabel();
        extraChashu = new JLabel();
        chashuPrice = new JLabel();
        methodPanel = new JPanel();
        dinningLabel = new JLabel();
        eatIn = new JToggleButton();
        takeAway = new JToggleButton();
        payingLabel = new JLabel();
        cash = new JToggleButton();
        visa = new JToggleButton();
        totalPricePanel = new JPanel();
        totalPriceLabel = new JLabel();
        totalPrice = new JLabel();
        bottomPanel = new JPanel();
        returnButton = new JButton();
        emptyBox = new JPanel();
        settleButton = new JButton();
        diningMethod = new ButtonGroup();
        payingMethod = new ButtonGroup();

        //======== this ========
        setBorder(new TitledBorder("Payment"));
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {55, 481, 50, 0};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {25, 50, 20, 105, 105, 55, 20, 30, 20, 0};
        ((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //======== titlePanel ========
        {
            titlePanel.setLayout(new GridLayout(3, 2));

            //---- snLabel ----
            snLabel.setText("Serial Number:");
            titlePanel.add(snLabel);

            //---- serialNumber ----
            serialNumber.setText("200345548218752");
            serialNumber.setHorizontalTextPosition(SwingConstants.RIGHT);
            serialNumber.setHorizontalAlignment(SwingConstants.TRAILING);
            titlePanel.add(serialNumber);

            //---- timeLabel ----
            timeLabel.setText("Time:");
            titlePanel.add(timeLabel);

            //---- time ----
            time.setText("2020-04-03 18:49:20");
            time.setHorizontalAlignment(SwingConstants.TRAILING);
            titlePanel.add(time);

            //---- membershipLabel ----
            membershipLabel.setText("Membership Number:");
            titlePanel.add(membershipLabel);

            //---- membershipNumber ----
            membershipNumber.setText("00000001");
            membershipNumber.setHorizontalAlignment(SwingConstants.TRAILING);
            titlePanel.add(membershipNumber);
        }
        add(titlePanel, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- itemLabel ----
        itemLabel.setText("Items:");
        add(itemLabel, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== itemPanel0 ========
        {
            itemPanel0.setBorder(new EtchedBorder());
            itemPanel0.setLayout(new GridLayout(1, 4));

            //---- noodlePicture ----
            noodlePicture.setIcon(new ImageIcon(getClass().getResource("/img/1.jpg")));
            itemPanel0.add(noodlePicture);

            //======== itemLabelList ========
            {
                itemLabelList.setLayout(new GridLayout(4, 0));

                //---- soupLabel ----
                soupLabel.setText("Soup:");
                itemLabelList.add(soupLabel);

                //---- noodleLabel ----
                noodleLabel.setText("Noodle:");
                itemLabelList.add(noodleLabel);

                //---- onionLabel ----
                onionLabel.setText("Spring onion:");
                itemLabelList.add(onionLabel);

                //---- spicinessLabel ----
                spicinessLabel.setText("Spiciness:");
                itemLabelList.add(spicinessLabel);
            }
            itemPanel0.add(itemLabelList);

            //======== itemLabelList1 ========
            {
                itemLabelList1.setLayout(new GridLayout(4, 0));

                //---- soup ----
                soup.setText("Tonkotsu");
                itemLabelList1.add(soup);

                //---- noodle ----
                noodle.setText("Soft");
                itemLabelList1.add(noodle);

                //---- onion ----
                onion.setText("No please");
                itemLabelList1.add(onion);

                //---- spiciness ----
                spiciness.setText("5");
                itemLabelList1.add(spiciness);
            }
            itemPanel0.add(itemLabelList1);

            //======== itemLabelList2 ========
            {
                itemLabelList2.setLayout(new GridLayout(4, 0));

                //---- noodlePrice ----
                noodlePrice.setText("\uffe19.99");
                noodlePrice.setHorizontalAlignment(SwingConstants.TRAILING);
                itemLabelList2.add(noodlePrice);

                //---- noodlePrice1 ----
                noodlePrice1.setText("\uffe10");
                noodlePrice1.setHorizontalAlignment(SwingConstants.TRAILING);
                itemLabelList2.add(noodlePrice1);

                //---- onionPrice ----
                onionPrice.setText("\uffe10");
                onionPrice.setHorizontalAlignment(SwingConstants.TRAILING);
                itemLabelList2.add(onionPrice);

                //---- spicinessPrice ----
                spicinessPrice.setText("\uffe10");
                spicinessPrice.setHorizontalAlignment(SwingConstants.TRAILING);
                itemLabelList2.add(spicinessPrice);
            }
            itemPanel0.add(itemLabelList2);
        }
        add(itemPanel0, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== itemPanel1 ========
        {
            itemPanel1.setBorder(new EtchedBorder());
            itemPanel1.setLayout(new GridLayout(4, 5));

            //---- noriLabel ----
            noriLabel.setText("Nori:");
            itemPanel1.add(noriLabel);

            //---- nori ----
            nori.setText("Yes");
            nori.setHorizontalAlignment(SwingConstants.CENTER);
            itemPanel1.add(nori);

            //---- extraLabel0 ----
            extraLabel0.setText("Extra:");
            extraLabel0.setHorizontalAlignment(SwingConstants.TRAILING);
            itemPanel1.add(extraLabel0);

            //---- extraNori ----
            extraNori.setText("0");
            extraNori.setHorizontalAlignment(SwingConstants.CENTER);
            itemPanel1.add(extraNori);

            //---- noriPrice ----
            noriPrice.setText("\uffe10");
            noriPrice.setHorizontalAlignment(SwingConstants.TRAILING);
            itemPanel1.add(noriPrice);

            //---- eggLabel ----
            eggLabel.setText("Boiled egg:");
            itemPanel1.add(eggLabel);

            //---- egg ----
            egg.setText("Yes");
            egg.setHorizontalAlignment(SwingConstants.CENTER);
            itemPanel1.add(egg);

            //---- extraLabel1 ----
            extraLabel1.setText("Extra:");
            extraLabel1.setHorizontalAlignment(SwingConstants.TRAILING);
            itemPanel1.add(extraLabel1);

            //---- extraEgg ----
            extraEgg.setText("0");
            extraEgg.setHorizontalAlignment(SwingConstants.CENTER);
            itemPanel1.add(extraEgg);

            //---- eggPrice ----
            eggPrice.setText("\uffe10");
            eggPrice.setHorizontalAlignment(SwingConstants.TRAILING);
            itemPanel1.add(eggPrice);

            //---- shootLabel ----
            shootLabel.setText("Shoot:");
            itemPanel1.add(shootLabel);

            //---- shoot ----
            shoot.setText("No");
            shoot.setHorizontalAlignment(SwingConstants.CENTER);
            itemPanel1.add(shoot);

            //---- extraLabel2 ----
            extraLabel2.setText("Extra:");
            extraLabel2.setHorizontalAlignment(SwingConstants.TRAILING);
            itemPanel1.add(extraLabel2);

            //---- extraShoot ----
            extraShoot.setText("0");
            extraShoot.setHorizontalAlignment(SwingConstants.CENTER);
            itemPanel1.add(extraShoot);

            //---- shootPrice ----
            shootPrice.setText("\uffe10");
            shootPrice.setHorizontalAlignment(SwingConstants.TRAILING);
            itemPanel1.add(shootPrice);

            //---- chashuLabel ----
            chashuLabel.setText("Chashu:");
            itemPanel1.add(chashuLabel);

            //---- chashu ----
            chashu.setText("Yes");
            chashu.setHorizontalAlignment(SwingConstants.CENTER);
            itemPanel1.add(chashu);

            //---- extraLabel3 ----
            extraLabel3.setText("Extra:");
            extraLabel3.setHorizontalAlignment(SwingConstants.TRAILING);
            itemPanel1.add(extraLabel3);

            //---- extraChashu ----
            extraChashu.setText("1");
            extraChashu.setHorizontalAlignment(SwingConstants.CENTER);
            itemPanel1.add(extraChashu);

            //---- chashuPrice ----
            chashuPrice.setText("\uffe12");
            chashuPrice.setHorizontalAlignment(SwingConstants.TRAILING);
            itemPanel1.add(chashuPrice);
        }
        add(itemPanel1, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== methodPanel ========
        {
            methodPanel.setBorder(new EtchedBorder());
            methodPanel.setLayout(new GridLayout(2, 3));

            //---- dinningLabel ----
            dinningLabel.setText("Dining method:");
            methodPanel.add(dinningLabel);

            //---- eatIn ----
            eatIn.setText("Eat in");
            methodPanel.add(eatIn);

            //---- takeAway ----
            takeAway.setText("Take away");
            methodPanel.add(takeAway);

            //---- payingLabel ----
            payingLabel.setText("Paying method:");
            methodPanel.add(payingLabel);

            //---- cash ----
            cash.setText("Cash");
            methodPanel.add(cash);

            //---- visa ----
            visa.setText("Visa");
            methodPanel.add(visa);
        }
        add(methodPanel, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== totalPricePanel ========
        {
            totalPricePanel.setLayout(new GridLayout(1, 2));

            //---- totalPriceLabel ----
            totalPriceLabel.setText("Total price:");
            totalPricePanel.add(totalPriceLabel);

            //---- totalPrice ----
            totalPrice.setText("\uffe111.99");
            totalPrice.setHorizontalAlignment(SwingConstants.TRAILING);
            totalPricePanel.add(totalPrice);
        }
        add(totalPricePanel, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== bottomPanel ========
        {
            bottomPanel.setLayout(new GridLayout(1, 3));

            //---- returnButton ----
            returnButton.setText("Return");
            bottomPanel.add(returnButton);

            //======== emptyBox ========
            {
                emptyBox.setLayout(new BoxLayout(emptyBox, BoxLayout.X_AXIS));
            }
            bottomPanel.add(emptyBox);

            //---- settleButton ----
            settleButton.setText("Settle");
            bottomPanel.add(settleButton);
        }
        add(bottomPanel, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- diningMethod ----
        diningMethod.add(eatIn);
        diningMethod.add(takeAway);

        //---- payingMethod ----
        payingMethod.add(cash);
        payingMethod.add(visa);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel titlePanel;
    public JLabel snLabel;
    public JLabel serialNumber;
    public JLabel timeLabel;
    public JLabel time;
    public JLabel membershipLabel;
    public JLabel membershipNumber;
    public JLabel itemLabel;
    public JPanel itemPanel0;
    public JLabel noodlePicture;
    public JPanel itemLabelList;
    public JLabel soupLabel;
    public JLabel noodleLabel;
    public JLabel onionLabel;
    public JLabel spicinessLabel;
    public JPanel itemLabelList1;
    public JLabel soup;
    public JLabel noodle;
    public JLabel onion;
    public JLabel spiciness;
    public JPanel itemLabelList2;
    public JLabel noodlePrice;
    public JLabel noodlePrice1;
    public JLabel onionPrice;
    public JLabel spicinessPrice;
    public JPanel itemPanel1;
    public JLabel noriLabel;
    public JLabel nori;
    public JLabel extraLabel0;
    public JLabel extraNori;
    public JLabel noriPrice;
    public JLabel eggLabel;
    public JLabel egg;
    public JLabel extraLabel1;
    public JLabel extraEgg;
    public JLabel eggPrice;
    public JLabel shootLabel;
    public JLabel shoot;
    public JLabel extraLabel2;
    public JLabel extraShoot;
    public JLabel shootPrice;
    public JLabel chashuLabel;
    public JLabel chashu;
    public JLabel extraLabel3;
    public JLabel extraChashu;
    public JLabel chashuPrice;
    public JPanel methodPanel;
    public JLabel dinningLabel;
    public JToggleButton eatIn;
    public JToggleButton takeAway;
    public JLabel payingLabel;
    public JToggleButton cash;
    public JToggleButton visa;
    public JPanel totalPricePanel;
    public JLabel totalPriceLabel;
    public JLabel totalPrice;
    public JPanel bottomPanel;
    public JButton returnButton;
    public JPanel emptyBox;
    public JButton settleButton;
    public ButtonGroup diningMethod;
    public ButtonGroup payingMethod;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
