/*
 * Created by JFormDesigner on Sun Apr 19 11:23:24 GMT+08:00 2020
 */

package gui.progressGui;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.*;

/**
 * @author Brainrain
 */
public class OrderMenu extends JPanel {
    public OrderMenu() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panelBoard = new JPanel();
        title = new JPanel();
        title_innerPanel = new JPanel();
        logo = new JLabel();
        body = new JPanel();
        requiredPanel = new JPanel();
        emptyBox0 = new JPanel();
        emptyBox1 = new JPanel();
        emptyBox2 = new JPanel();
        emptyBox3 = new JPanel();
        required_innerPanel = new JPanel();
        noodlePanel = new JPanel();
        label_soup = new JLabel();
        soup1 = new JToggleButton();
        soup2 = new JToggleButton();
        soup3 = new JToggleButton();
        label_noodle = new JLabel();
        noodle1 = new JToggleButton();
        noodle2 = new JToggleButton();
        noodle3 = new JToggleButton();
        label_onion = new JLabel();
        onion1 = new JToggleButton();
        onion2 = new JToggleButton();
        onion3 = new JToggleButton();
        additionalPanel = new JPanel();
        label_nori = new JLabel();
        emptyBox4 = new JPanel();
        nori1 = new JToggleButton();
        nori2 = new JToggleButton();
        label_chashu = new JLabel();
        emptyBox5 = new JPanel();
        chashu1 = new JToggleButton();
        chashu2 = new JToggleButton();
        label_egg = new JLabel();
        emptyBox6 = new JPanel();
        egg1 = new JToggleButton();
        egg2 = new JToggleButton();
        spicinessPanel = new JPanel();
        label_spiciness = new JLabel();
        spice0 = new JToggleButton();
        spice1 = new JToggleButton();
        spice2 = new JToggleButton();
        spice3 = new JToggleButton();
        spice4 = new JToggleButton();
        spice5 = new JToggleButton();
        optionalPanel = new JPanel();
        emptyBox7 = new JPanel();
        emptyBox8 = new JPanel();
        emptyBox9 = new JPanel();
        emptyBox10 = new JPanel();
        optional_innerPanel = new JPanel();
        dishPanel = new JPanel();
        label_right_nori = new JLabel();
        noriAvailable = new JLabel();
        noriPrice = new JLabel();
        noriNumber = new JSpinner();
        label_right_chashu = new JLabel();
        chashuAvailable = new JLabel();
        chashuPrice = new JLabel();
        chashuNumber = new JSpinner();
        label_right_egg = new JLabel();
        eggAvailable = new JLabel();
        eggPrice = new JLabel();
        eggNumber = new JSpinner();
        label_right_shoot = new JLabel();
        shootAvailable = new JLabel();
        shootPrice = new JLabel();
        shootNumber = new JSpinner();
        pricePanel = new JPanel();
        price_topPanel = new JPanel();
        label_required = new JLabel();
        label_pound0 = new JLabel();
        noodlePrice = new JLabel();
        label_optional = new JLabel();
        label_pound1 = new JLabel();
        extraPrice = new JLabel();
        price_bottomPanel = new JPanel();
        label_totalPrice = new JLabel();
        label_pound2 = new JLabel();
        totalPrice = new JLabel();
        bottomPanel = new JPanel();
        storeinfoPanel = new JPanel();
        storeName = new JLabel();
        storeAddress = new JLabel();
        storeTelphone = new JLabel();
        nextPanel = new JPanel();
        emptyBox15 = new JPanel();
        returnButton = new JButton();
        settleButton = new JButton();
        emptyBox16 = new JPanel();
        emptyBox11 = new JPanel();
        emptyBox12 = new JPanel();
        emptyBox13 = new JPanel();
        emptyBox14 = new JPanel();
        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        buttonGroup3 = new ButtonGroup();
        buttonGroup4 = new ButtonGroup();
        buttonGroup5 = new ButtonGroup();
        buttonGroup6 = new ButtonGroup();
        buttonGroup7 = new ButtonGroup();

        //======== this ========
        setLayout(new BorderLayout());

        //======== panelBoard ========
        {
            panelBoard.setBackground(new Color(252, 251, 245));
            panelBoard.setLayout(new MigLayout(
                "insets 0,hidemode 3,gap 0 0",
                // columns
                "[1000,fill]",
                // rows
                "[100,fill]" +
                "[445,fill]" +
                "[75,fill]"));

            //======== title ========
            {
                title.setBackground(new Color(248, 193, 84));
                title.setLayout(new BoxLayout(title, BoxLayout.X_AXIS));

                //======== title_innerPanel ========
                {
                    title_innerPanel.setBackground(new Color(248, 193, 84));
                    title_innerPanel.setLayout(new MigLayout(
                        "insets 0,hidemode 3",
                        // columns
                        "[fill]" +
                        "[grow,fill]" +
                        "[fill]",
                        // rows
                        "[grow,fill]"));

                    //---- logo ----
                    logo.setIcon(new ImageIcon(getClass().getResource("/img/titleLogo.png")));
                    title_innerPanel.add(logo, "cell 1 0");
                }
                title.add(title_innerPanel);
            }
            panelBoard.add(title, "cell 0 0");

            //======== body ========
            {
                body.setBackground(Color.white);
                body.setLayout(new MigLayout(
                    "hidemode 3,gap 0 0",
                    // columns
                    "[616,fill]" +
                    "[380,fill]",
                    // rows
                    "[432]"));

                //======== requiredPanel ========
                {
                    requiredPanel.setBackground(Color.white);
                    requiredPanel.setLayout(new BorderLayout());

                    //======== emptyBox0 ========
                    {
                        emptyBox0.setBackground(Color.white);
                        emptyBox0.setLayout(new BoxLayout(emptyBox0, BoxLayout.X_AXIS));
                    }
                    requiredPanel.add(emptyBox0, BorderLayout.LINE_END);

                    //======== emptyBox1 ========
                    {
                        emptyBox1.setBackground(Color.white);
                        emptyBox1.setLayout(new BoxLayout(emptyBox1, BoxLayout.X_AXIS));
                    }
                    requiredPanel.add(emptyBox1, BorderLayout.PAGE_START);

                    //======== emptyBox2 ========
                    {
                        emptyBox2.setBackground(Color.white);
                        emptyBox2.setLayout(new BoxLayout(emptyBox2, BoxLayout.X_AXIS));
                    }
                    requiredPanel.add(emptyBox2, BorderLayout.PAGE_END);

                    //======== emptyBox3 ========
                    {
                        emptyBox3.setBackground(Color.white);
                        emptyBox3.setLayout(new BoxLayout(emptyBox3, BoxLayout.X_AXIS));
                    }
                    requiredPanel.add(emptyBox3, BorderLayout.LINE_START);

                    //======== required_innerPanel ========
                    {
                        required_innerPanel.setBorder(new TitledBorder("Requried"));
                        required_innerPanel.setBackground(Color.white);
                        required_innerPanel.setLayout(new MigLayout(
                            "hidemode 3,gap 0 8",
                            // columns
                            "[610,fill]",
                            // rows
                            "[185]" +
                            "[185]" +
                            "[62]"));

                        //======== noodlePanel ========
                        {
                            noodlePanel.setBackground(Color.white);
                            noodlePanel.setLayout(new GridLayout(3, 4, 0, 8));

                            //---- label_soup ----
                            label_soup.setText("Soup:");
                            label_soup.setFont(label_soup.getFont().deriveFont(label_soup.getFont().getSize() + 3f));
                            noodlePanel.add(label_soup);

                            //---- soup1 ----
                            soup1.setText("Tonkotsu");
                            soup1.setFont(soup1.getFont().deriveFont(soup1.getFont().getSize() + 3f));
                            noodlePanel.add(soup1);

                            //---- soup2 ----
                            soup2.setText("Shoyo");
                            soup2.setFont(soup2.getFont().deriveFont(soup2.getFont().getSize() + 3f));
                            noodlePanel.add(soup2);

                            //---- soup3 ----
                            soup3.setText("Shio");
                            soup3.setFont(soup3.getFont().deriveFont(soup3.getFont().getSize() + 3f));
                            noodlePanel.add(soup3);

                            //---- label_noodle ----
                            label_noodle.setText("Noodle:");
                            label_noodle.setFont(label_noodle.getFont().deriveFont(label_noodle.getFont().getSize() + 3f));
                            noodlePanel.add(label_noodle);

                            //---- noodle1 ----
                            noodle1.setText("Soft");
                            noodle1.setFont(noodle1.getFont().deriveFont(noodle1.getFont().getSize() + 3f));
                            noodlePanel.add(noodle1);

                            //---- noodle2 ----
                            noodle2.setText("Medium");
                            noodle2.setFont(noodle2.getFont().deriveFont(noodle2.getFont().getSize() + 3f));
                            noodlePanel.add(noodle2);

                            //---- noodle3 ----
                            noodle3.setText("Firm");
                            noodle3.setFont(noodle3.getFont().deriveFont(noodle3.getFont().getSize() + 3f));
                            noodlePanel.add(noodle3);

                            //---- label_onion ----
                            label_onion.setText("Spring onion:");
                            label_onion.setFont(label_onion.getFont().deriveFont(label_onion.getFont().getSize() + 3f));
                            noodlePanel.add(label_onion);

                            //---- onion1 ----
                            onion1.setText("No please");
                            onion1.setFont(onion1.getFont().deriveFont(onion1.getFont().getSize() + 3f));
                            noodlePanel.add(onion1);

                            //---- onion2 ----
                            onion2.setText("Just a little");
                            onion2.setFont(onion2.getFont().deriveFont(onion2.getFont().getSize() + 3f));
                            noodlePanel.add(onion2);

                            //---- onion3 ----
                            onion3.setText("A lot");
                            onion3.setFont(onion3.getFont().deriveFont(onion3.getFont().getSize() + 3f));
                            noodlePanel.add(onion3);
                        }
                        required_innerPanel.add(noodlePanel, "cell 0 0,dock center");

                        //======== additionalPanel ========
                        {
                            additionalPanel.setBackground(Color.white);
                            additionalPanel.setLayout(new GridLayout(3, 4, 0, 8));

                            //---- label_nori ----
                            label_nori.setText("Nori:");
                            label_nori.setFont(label_nori.getFont().deriveFont(label_nori.getFont().getSize() + 3f));
                            additionalPanel.add(label_nori);

                            //======== emptyBox4 ========
                            {
                                emptyBox4.setBackground(Color.white);
                                emptyBox4.setLayout(new BoxLayout(emptyBox4, BoxLayout.X_AXIS));
                            }
                            additionalPanel.add(emptyBox4);

                            //---- nori1 ----
                            nori1.setText("Yes");
                            nori1.setFont(nori1.getFont().deriveFont(nori1.getFont().getSize() + 3f));
                            additionalPanel.add(nori1);

                            //---- nori2 ----
                            nori2.setText("No");
                            nori2.setFont(nori2.getFont().deriveFont(nori2.getFont().getSize() + 3f));
                            additionalPanel.add(nori2);

                            //---- label_chashu ----
                            label_chashu.setText("Chashu:");
                            label_chashu.setFont(label_chashu.getFont().deriveFont(label_chashu.getFont().getSize() + 3f));
                            additionalPanel.add(label_chashu);

                            //======== emptyBox5 ========
                            {
                                emptyBox5.setBackground(Color.white);
                                emptyBox5.setLayout(new BoxLayout(emptyBox5, BoxLayout.X_AXIS));
                            }
                            additionalPanel.add(emptyBox5);

                            //---- chashu1 ----
                            chashu1.setText("Yes");
                            chashu1.setFont(chashu1.getFont().deriveFont(chashu1.getFont().getSize() + 3f));
                            additionalPanel.add(chashu1);

                            //---- chashu2 ----
                            chashu2.setText("No");
                            chashu2.setFont(chashu2.getFont().deriveFont(chashu2.getFont().getSize() + 3f));
                            additionalPanel.add(chashu2);

                            //---- label_egg ----
                            label_egg.setText("Boiled egg:");
                            label_egg.setFont(label_egg.getFont().deriveFont(label_egg.getFont().getSize() + 3f));
                            additionalPanel.add(label_egg);

                            //======== emptyBox6 ========
                            {
                                emptyBox6.setBackground(Color.white);
                                emptyBox6.setLayout(new BoxLayout(emptyBox6, BoxLayout.X_AXIS));
                            }
                            additionalPanel.add(emptyBox6);

                            //---- egg1 ----
                            egg1.setText("Yes");
                            egg1.setFont(egg1.getFont().deriveFont(egg1.getFont().getSize() + 3f));
                            additionalPanel.add(egg1);

                            //---- egg2 ----
                            egg2.setText("No");
                            egg2.setFont(egg2.getFont().deriveFont(egg2.getFont().getSize() + 3f));
                            additionalPanel.add(egg2);
                        }
                        required_innerPanel.add(additionalPanel, "cell 0 1,dock center");

                        //======== spicinessPanel ========
                        {
                            spicinessPanel.setBackground(Color.white);
                            spicinessPanel.setLayout(new GridLayout(1, 7));

                            //---- label_spiciness ----
                            label_spiciness.setText("Spiciness:");
                            label_spiciness.setFont(label_spiciness.getFont().deriveFont(label_spiciness.getFont().getSize() + 3f));
                            spicinessPanel.add(label_spiciness);

                            //---- spice0 ----
                            spice0.setText("0");
                            spice0.setFont(spice0.getFont().deriveFont(spice0.getFont().getSize() + 3f));
                            spicinessPanel.add(spice0);

                            //---- spice1 ----
                            spice1.setText("1");
                            spice1.setFont(spice1.getFont().deriveFont(spice1.getFont().getSize() + 3f));
                            spicinessPanel.add(spice1);

                            //---- spice2 ----
                            spice2.setText("2");
                            spice2.setFont(spice2.getFont().deriveFont(spice2.getFont().getSize() + 3f));
                            spicinessPanel.add(spice2);

                            //---- spice3 ----
                            spice3.setText("3");
                            spice3.setFont(spice3.getFont().deriveFont(spice3.getFont().getSize() + 3f));
                            spicinessPanel.add(spice3);

                            //---- spice4 ----
                            spice4.setText("4");
                            spice4.setFont(spice4.getFont().deriveFont(spice4.getFont().getSize() + 3f));
                            spicinessPanel.add(spice4);

                            //---- spice5 ----
                            spice5.setText("5");
                            spice5.setFont(spice5.getFont().deriveFont(spice5.getFont().getSize() + 3f));
                            spicinessPanel.add(spice5);
                        }
                        required_innerPanel.add(spicinessPanel, "cell 0 2,dock center");
                    }
                    requiredPanel.add(required_innerPanel, BorderLayout.CENTER);
                }
                body.add(requiredPanel, "cell 0 0");

                //======== optionalPanel ========
                {
                    optionalPanel.setBackground(Color.white);
                    optionalPanel.setLayout(new BorderLayout());

                    //======== emptyBox7 ========
                    {
                        emptyBox7.setBackground(Color.white);
                        emptyBox7.setLayout(new BoxLayout(emptyBox7, BoxLayout.X_AXIS));
                    }
                    optionalPanel.add(emptyBox7, BorderLayout.NORTH);

                    //======== emptyBox8 ========
                    {
                        emptyBox8.setBackground(Color.white);
                        emptyBox8.setLayout(new BoxLayout(emptyBox8, BoxLayout.X_AXIS));
                    }
                    optionalPanel.add(emptyBox8, BorderLayout.SOUTH);

                    //======== emptyBox9 ========
                    {
                        emptyBox9.setBackground(Color.white);
                        emptyBox9.setLayout(new BoxLayout(emptyBox9, BoxLayout.X_AXIS));
                    }
                    optionalPanel.add(emptyBox9, BorderLayout.WEST);

                    //======== emptyBox10 ========
                    {
                        emptyBox10.setBackground(Color.white);
                        emptyBox10.setLayout(new BoxLayout(emptyBox10, BoxLayout.X_AXIS));
                    }
                    optionalPanel.add(emptyBox10, BorderLayout.EAST);

                    //======== optional_innerPanel ========
                    {
                        optional_innerPanel.setBorder(null);
                        optional_innerPanel.setBackground(Color.white);
                        optional_innerPanel.setLayout(new MigLayout(
                            "hidemode 3,gap 0 0",
                            // columns
                            "[370,fill]",
                            // rows
                            "[304]" +
                            "[128]"));

                        //======== dishPanel ========
                        {
                            dishPanel.setBorder(new TitledBorder("Optional"));
                            dishPanel.setBackground(Color.white);
                            dishPanel.setLayout(new GridLayout(4, 4, 0, 10));

                            //---- label_right_nori ----
                            label_right_nori.setText("Nori:");
                            label_right_nori.setFont(label_right_nori.getFont().deriveFont(label_right_nori.getFont().getSize() + 3f));
                            dishPanel.add(label_right_nori);

                            //---- noriAvailable ----
                            noriAvailable.setText("Available");
                            noriAvailable.setFont(noriAvailable.getFont().deriveFont(noriAvailable.getFont().getSize() + 3f));
                            dishPanel.add(noriAvailable);

                            //---- noriPrice ----
                            noriPrice.setText("\uffe11");
                            noriPrice.setFont(noriPrice.getFont().deriveFont(noriPrice.getFont().getSize() + 3f));
                            dishPanel.add(noriPrice);

                            //---- noriNumber ----
                            noriNumber.setFont(noriNumber.getFont().deriveFont(noriNumber.getFont().getSize() + 3f));
                            dishPanel.add(noriNumber);

                            //---- label_right_chashu ----
                            label_right_chashu.setText("Chashu:");
                            label_right_chashu.setFont(label_right_chashu.getFont().deriveFont(label_right_chashu.getFont().getSize() + 3f));
                            dishPanel.add(label_right_chashu);

                            //---- chashuAvailable ----
                            chashuAvailable.setText("Available");
                            chashuAvailable.setFont(chashuAvailable.getFont().deriveFont(chashuAvailable.getFont().getSize() + 3f));
                            dishPanel.add(chashuAvailable);

                            //---- chashuPrice ----
                            chashuPrice.setText("\uffe12");
                            chashuPrice.setFont(chashuPrice.getFont().deriveFont(chashuPrice.getFont().getSize() + 3f));
                            dishPanel.add(chashuPrice);

                            //---- chashuNumber ----
                            chashuNumber.setFont(chashuNumber.getFont().deriveFont(chashuNumber.getFont().getSize() + 3f));
                            dishPanel.add(chashuNumber);

                            //---- label_right_egg ----
                            label_right_egg.setText("Boiled egg:");
                            label_right_egg.setFont(label_right_egg.getFont().deriveFont(label_right_egg.getFont().getSize() + 3f));
                            dishPanel.add(label_right_egg);

                            //---- eggAvailable ----
                            eggAvailable.setText("Available");
                            eggAvailable.setFont(eggAvailable.getFont().deriveFont(eggAvailable.getFont().getSize() + 3f));
                            dishPanel.add(eggAvailable);

                            //---- eggPrice ----
                            eggPrice.setText("\uffe11");
                            eggPrice.setFont(eggPrice.getFont().deriveFont(eggPrice.getFont().getSize() + 3f));
                            dishPanel.add(eggPrice);

                            //---- eggNumber ----
                            eggNumber.setFont(eggNumber.getFont().deriveFont(eggNumber.getFont().getSize() + 3f));
                            dishPanel.add(eggNumber);

                            //---- label_right_shoot ----
                            label_right_shoot.setText("Shoot:");
                            label_right_shoot.setFont(label_right_shoot.getFont().deriveFont(label_right_shoot.getFont().getSize() + 3f));
                            dishPanel.add(label_right_shoot);

                            //---- shootAvailable ----
                            shootAvailable.setText("Available");
                            shootAvailable.setFont(shootAvailable.getFont().deriveFont(shootAvailable.getFont().getSize() + 3f));
                            dishPanel.add(shootAvailable);

                            //---- shootPrice ----
                            shootPrice.setText("\uffe11");
                            shootPrice.setFont(shootPrice.getFont().deriveFont(shootPrice.getFont().getSize() + 3f));
                            dishPanel.add(shootPrice);

                            //---- shootNumber ----
                            shootNumber.setFont(shootNumber.getFont().deriveFont(shootNumber.getFont().getSize() + 3f));
                            dishPanel.add(shootNumber);
                        }
                        optional_innerPanel.add(dishPanel, "dock center");

                        //======== pricePanel ========
                        {
                            pricePanel.setBorder(new TitledBorder("Price"));
                            pricePanel.setBackground(Color.white);
                            pricePanel.setLayout(new MigLayout(
                                "hidemode 3,gap 0 5",
                                // columns
                                "[370,fill]",
                                // rows
                                "[80]" +
                                "[40]"));

                            //======== price_topPanel ========
                            {
                                price_topPanel.setBackground(Color.white);
                                price_topPanel.setLayout(new GridLayout(2, 3));

                                //---- label_required ----
                                label_required.setText("Required");
                                label_required.setFont(label_required.getFont().deriveFont(label_required.getFont().getSize() + 3f));
                                price_topPanel.add(label_required);

                                //---- label_pound0 ----
                                label_pound0.setText("\uffe1");
                                label_pound0.setHorizontalAlignment(SwingConstants.TRAILING);
                                label_pound0.setFont(label_pound0.getFont().deriveFont(label_pound0.getFont().getSize() + 3f));
                                price_topPanel.add(label_pound0);

                                //---- noodlePrice ----
                                noodlePrice.setText("9.99");
                                noodlePrice.setFont(noodlePrice.getFont().deriveFont(noodlePrice.getFont().getSize() + 3f));
                                price_topPanel.add(noodlePrice);

                                //---- label_optional ----
                                label_optional.setText("Optional");
                                label_optional.setFont(label_optional.getFont().deriveFont(label_optional.getFont().getSize() + 3f));
                                price_topPanel.add(label_optional);

                                //---- label_pound1 ----
                                label_pound1.setText("\uffe1");
                                label_pound1.setHorizontalAlignment(SwingConstants.TRAILING);
                                label_pound1.setFont(label_pound1.getFont().deriveFont(label_pound1.getFont().getSize() + 3f));
                                price_topPanel.add(label_pound1);

                                //---- extraPrice ----
                                extraPrice.setText("x");
                                extraPrice.setFont(extraPrice.getFont().deriveFont(extraPrice.getFont().getSize() + 3f));
                                price_topPanel.add(extraPrice);
                            }
                            pricePanel.add(price_topPanel, "cell 0 0,dock center");

                            //======== price_bottomPanel ========
                            {
                                price_bottomPanel.setBackground(Color.white);
                                price_bottomPanel.setLayout(new GridLayout(1, 2));

                                //---- label_totalPrice ----
                                label_totalPrice.setText("Total price");
                                label_totalPrice.setFont(label_totalPrice.getFont().deriveFont(label_totalPrice.getFont().getSize() + 3f));
                                price_bottomPanel.add(label_totalPrice);

                                //---- label_pound2 ----
                                label_pound2.setText("\uffe1");
                                label_pound2.setHorizontalAlignment(SwingConstants.TRAILING);
                                label_pound2.setFont(label_pound2.getFont().deriveFont(label_pound2.getFont().getSize() + 3f));
                                price_bottomPanel.add(label_pound2);

                                //---- totalPrice ----
                                totalPrice.setText("9.99+x");
                                totalPrice.setFont(totalPrice.getFont().deriveFont(totalPrice.getFont().getSize() + 3f));
                                price_bottomPanel.add(totalPrice);
                            }
                            pricePanel.add(price_bottomPanel, "cell 0 1,dock center");
                        }
                        optional_innerPanel.add(pricePanel, "cell 0 1");
                    }
                    optionalPanel.add(optional_innerPanel, BorderLayout.CENTER);
                }
                body.add(optionalPanel, "cell 1 0");
            }
            panelBoard.add(body, "cell 0 1");

            //======== bottomPanel ========
            {
                bottomPanel.setBackground(new Color(252, 251, 245));
                bottomPanel.setLayout(new MigLayout(
                    "hidemode 3",
                    // columns
                    "[18,fill]" +
                    "[600,fill]" +
                    "[382,fill]",
                    // rows
                    "[75]"));

                //======== storeinfoPanel ========
                {
                    storeinfoPanel.setBackground(new Color(252, 251, 245));
                    storeinfoPanel.setLayout(new GridLayout(3, 1));

                    //---- storeName ----
                    storeName.setText("TOTORO Ramen");
                    storeinfoPanel.add(storeName);

                    //---- storeAddress ----
                    storeAddress.setText("Address: B15 Baker Street in London");
                    storeinfoPanel.add(storeAddress);

                    //---- storeTelphone ----
                    storeTelphone.setText("Telphone: 44 (0) 203 178 4861");
                    storeinfoPanel.add(storeTelphone);
                }
                bottomPanel.add(storeinfoPanel, "cell 1 0");

                //======== nextPanel ========
                {
                    nextPanel.setBackground(new Color(252, 251, 245));
                    nextPanel.setLayout(new GridLayout(1, 4));

                    //======== emptyBox15 ========
                    {
                        emptyBox15.setBackground(new Color(252, 251, 245));
                        emptyBox15.setLayout(new BoxLayout(emptyBox15, BoxLayout.X_AXIS));
                    }
                    nextPanel.add(emptyBox15);

                    //---- returnButton ----
                    returnButton.setText("Return");
                    nextPanel.add(returnButton);

                    //---- settleButton ----
                    settleButton.setText("Next");
                    nextPanel.add(settleButton);

                    //======== emptyBox16 ========
                    {
                        emptyBox16.setBackground(new Color(252, 251, 245));
                        emptyBox16.setLayout(new BoxLayout(emptyBox16, BoxLayout.X_AXIS));
                    }
                    nextPanel.add(emptyBox16);
                }
                bottomPanel.add(nextPanel, "cell 2 0");
            }
            panelBoard.add(bottomPanel, "cell 0 2");
        }
        add(panelBoard, BorderLayout.CENTER);

        //======== emptyBox11 ========
        {
            emptyBox11.setLayout(new BoxLayout(emptyBox11, BoxLayout.X_AXIS));
        }
        add(emptyBox11, BorderLayout.NORTH);

        //======== emptyBox12 ========
        {
            emptyBox12.setLayout(new BoxLayout(emptyBox12, BoxLayout.X_AXIS));
        }
        add(emptyBox12, BorderLayout.SOUTH);

        //======== emptyBox13 ========
        {
            emptyBox13.setLayout(new BoxLayout(emptyBox13, BoxLayout.X_AXIS));
        }
        add(emptyBox13, BorderLayout.WEST);

        //======== emptyBox14 ========
        {
            emptyBox14.setLayout(new BoxLayout(emptyBox14, BoxLayout.X_AXIS));
        }
        add(emptyBox14, BorderLayout.EAST);

        //---- buttonGroup1 ----
        buttonGroup1.add(soup1);
        buttonGroup1.add(soup2);
        buttonGroup1.add(soup3);

        //---- buttonGroup2 ----
        buttonGroup2.add(noodle1);
        buttonGroup2.add(noodle2);
        buttonGroup2.add(noodle3);

        //---- buttonGroup3 ----
        buttonGroup3.add(onion1);
        buttonGroup3.add(onion2);
        buttonGroup3.add(onion3);

        //---- buttonGroup4 ----
        buttonGroup4.add(nori1);
        buttonGroup4.add(nori2);

        //---- buttonGroup5 ----
        buttonGroup5.add(chashu1);
        buttonGroup5.add(chashu2);

        //---- buttonGroup6 ----
        buttonGroup6.add(egg1);
        buttonGroup6.add(egg2);

        //---- buttonGroup7 ----
        buttonGroup7.add(spice0);
        buttonGroup7.add(spice1);
        buttonGroup7.add(spice2);
        buttonGroup7.add(spice3);
        buttonGroup7.add(spice4);
        buttonGroup7.add(spice5);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panelBoard;
    private JPanel title;
    private JPanel title_innerPanel;
    private JLabel logo;
    private JPanel body;
    private JPanel requiredPanel;
    private JPanel emptyBox0;
    private JPanel emptyBox1;
    private JPanel emptyBox2;
    private JPanel emptyBox3;
    private JPanel required_innerPanel;
    private JPanel noodlePanel;
    private JLabel label_soup;
    private JToggleButton soup1;
    private JToggleButton soup2;
    private JToggleButton soup3;
    private JLabel label_noodle;
    private JToggleButton noodle1;
    private JToggleButton noodle2;
    private JToggleButton noodle3;
    private JLabel label_onion;
    private JToggleButton onion1;
    private JToggleButton onion2;
    private JToggleButton onion3;
    private JPanel additionalPanel;
    private JLabel label_nori;
    private JPanel emptyBox4;
    private JToggleButton nori1;
    private JToggleButton nori2;
    private JLabel label_chashu;
    private JPanel emptyBox5;
    private JToggleButton chashu1;
    private JToggleButton chashu2;
    private JLabel label_egg;
    private JPanel emptyBox6;
    private JToggleButton egg1;
    private JToggleButton egg2;
    private JPanel spicinessPanel;
    private JLabel label_spiciness;
    private JToggleButton spice0;
    private JToggleButton spice1;
    private JToggleButton spice2;
    private JToggleButton spice3;
    private JToggleButton spice4;
    private JToggleButton spice5;
    private JPanel optionalPanel;
    private JPanel emptyBox7;
    private JPanel emptyBox8;
    private JPanel emptyBox9;
    private JPanel emptyBox10;
    private JPanel optional_innerPanel;
    private JPanel dishPanel;
    private JLabel label_right_nori;
    public JLabel noriAvailable;
    public JLabel noriPrice;
    public JSpinner noriNumber;
    private JLabel label_right_chashu;
    public JLabel chashuAvailable;
    public JLabel chashuPrice;
    public JSpinner chashuNumber;
    private JLabel label_right_egg;
    public JLabel eggAvailable;
    public JLabel eggPrice;
    public JSpinner eggNumber;
    private JLabel label_right_shoot;
    public JLabel shootAvailable;
    public JLabel shootPrice;
    public JSpinner shootNumber;
    private JPanel pricePanel;
    private JPanel price_topPanel;
    private JLabel label_required;
    private JLabel label_pound0;
    public JLabel noodlePrice;
    private JLabel label_optional;
    private JLabel label_pound1;
    public JLabel extraPrice;
    private JPanel price_bottomPanel;
    private JLabel label_totalPrice;
    private JLabel label_pound2;
    public JLabel totalPrice;
    private JPanel bottomPanel;
    private JPanel storeinfoPanel;
    private JLabel storeName;
    private JLabel storeAddress;
    private JLabel storeTelphone;
    private JPanel nextPanel;
    private JPanel emptyBox15;
    public JButton returnButton;
    public JButton settleButton;
    private JPanel emptyBox16;
    private JPanel emptyBox11;
    private JPanel emptyBox12;
    private JPanel emptyBox13;
    private JPanel emptyBox14;
    public ButtonGroup buttonGroup1;
    public ButtonGroup buttonGroup2;
    public ButtonGroup buttonGroup3;
    public ButtonGroup buttonGroup4;
    public ButtonGroup buttonGroup5;
    public ButtonGroup buttonGroup6;
    public ButtonGroup buttonGroup7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
