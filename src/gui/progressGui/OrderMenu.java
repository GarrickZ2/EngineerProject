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
        panel1 = new JPanel();
        panel29 = new JPanel();
        label28 = new JLabel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel5 = new JPanel();
        panel4 = new JPanel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();
        panel9 = new JPanel();
        label1 = new JLabel();
        toggleButton1 = new JToggleButton();
        toggleButton2 = new JToggleButton();
        toggleButton3 = new JToggleButton();
        label2 = new JLabel();
        toggleButton4 = new JToggleButton();
        toggleButton5 = new JToggleButton();
        toggleButton6 = new JToggleButton();
        label3 = new JLabel();
        toggleButton7 = new JToggleButton();
        toggleButton8 = new JToggleButton();
        toggleButton9 = new JToggleButton();
        panel10 = new JPanel();
        label4 = new JLabel();
        panel14 = new JPanel();
        toggleButton10 = new JToggleButton();
        toggleButton11 = new JToggleButton();
        label5 = new JLabel();
        panel13 = new JPanel();
        toggleButton13 = new JToggleButton();
        toggleButton14 = new JToggleButton();
        label6 = new JLabel();
        panel12 = new JPanel();
        toggleButton16 = new JToggleButton();
        toggleButton17 = new JToggleButton();
        panel11 = new JPanel();
        label7 = new JLabel();
        toggleButton19 = new JToggleButton();
        toggleButton20 = new JToggleButton();
        toggleButton21 = new JToggleButton();
        toggleButton22 = new JToggleButton();
        toggleButton23 = new JToggleButton();
        toggleButton24 = new JToggleButton();
        panel17 = new JPanel();
        panel19 = new JPanel();
        panel20 = new JPanel();
        panel21 = new JPanel();
        panel22 = new JPanel();
        panel23 = new JPanel();
        panel24 = new JPanel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        spinner1 = new JSpinner();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        spinner2 = new JSpinner();
        label14 = new JLabel();
        label15 = new JLabel();
        label16 = new JLabel();
        spinner3 = new JSpinner();
        label17 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        spinner4 = new JSpinner();
        panel25 = new JPanel();
        panel27 = new JPanel();
        label22 = new JLabel();
        label23 = new JLabel();
        label24 = new JLabel();
        label25 = new JLabel();
        label26 = new JLabel();
        label27 = new JLabel();
        panel28 = new JPanel();
        label31 = new JLabel();
        label32 = new JLabel();
        label33 = new JLabel();
        panel30 = new JPanel();
        panel36 = new JPanel();
        label34 = new JLabel();
        label30 = new JLabel();
        label29 = new JLabel();
        panel33 = new JPanel();
        panel38 = new JPanel();
        panel34 = new JPanel();
        button1 = new JButton();
        panel35 = new JPanel();
        panel15 = new JPanel();
        panel16 = new JPanel();
        panel18 = new JPanel();
        panel26 = new JPanel();

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

            //======== panel1 ========
            {
                panel1.setBackground(new Color(248, 193, 84));
                panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

                //======== panel29 ========
                {
                    panel29.setBackground(new Color(248, 193, 84));
                    panel29.setLayout(new MigLayout(
                        "insets 0,hidemode 3",
                        // columns
                        "[fill]" +
                        "[grow,fill]" +
                        "[fill]",
                        // rows
                        "[grow,fill]"));

                    //---- label28 ----
                    label28.setIcon(new ImageIcon(getClass().getResource("/img/titleLogo.png")));
                    panel29.add(label28, "cell 1 0");
                }
                panel1.add(panel29);
            }
            panelBoard.add(panel1, "cell 0 0");

            //======== panel2 ========
            {
                panel2.setBackground(Color.white);
                panel2.setLayout(new MigLayout(
                    "hidemode 3,gap 0 0",
                    // columns
                    "[616,fill]" +
                    "[380,fill]",
                    // rows
                    "[432]"));

                //======== panel3 ========
                {
                    panel3.setBackground(Color.white);
                    panel3.setLayout(new BorderLayout());

                    //======== panel5 ========
                    {
                        panel5.setBackground(Color.white);
                        panel5.setLayout(new BoxLayout(panel5, BoxLayout.X_AXIS));
                    }
                    panel3.add(panel5, BorderLayout.LINE_END);

                    //======== panel4 ========
                    {
                        panel4.setBackground(Color.white);
                        panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));
                    }
                    panel3.add(panel4, BorderLayout.PAGE_START);

                    //======== panel6 ========
                    {
                        panel6.setBackground(Color.white);
                        panel6.setLayout(new BoxLayout(panel6, BoxLayout.X_AXIS));
                    }
                    panel3.add(panel6, BorderLayout.PAGE_END);

                    //======== panel7 ========
                    {
                        panel7.setBackground(Color.white);
                        panel7.setLayout(new BoxLayout(panel7, BoxLayout.X_AXIS));
                    }
                    panel3.add(panel7, BorderLayout.LINE_START);

                    //======== panel8 ========
                    {
                        panel8.setBorder(new TitledBorder("Requried"));
                        panel8.setBackground(Color.white);
                        panel8.setLayout(new MigLayout(
                            "hidemode 3,gap 0 8",
                            // columns
                            "[610,fill]",
                            // rows
                            "[185]" +
                            "[185]" +
                            "[62]"));

                        //======== panel9 ========
                        {
                            panel9.setBackground(Color.white);
                            panel9.setLayout(new GridLayout(3, 4, 0, 8));

                            //---- label1 ----
                            label1.setText("Soup:");
                            panel9.add(label1);

                            //---- toggleButton1 ----
                            toggleButton1.setText("Tonkotsu");
                            panel9.add(toggleButton1);

                            //---- toggleButton2 ----
                            toggleButton2.setText("Shoyo");
                            panel9.add(toggleButton2);

                            //---- toggleButton3 ----
                            toggleButton3.setText("Shio");
                            panel9.add(toggleButton3);

                            //---- label2 ----
                            label2.setText("Noodle:");
                            panel9.add(label2);

                            //---- toggleButton4 ----
                            toggleButton4.setText("Soft");
                            panel9.add(toggleButton4);

                            //---- toggleButton5 ----
                            toggleButton5.setText("Medium");
                            panel9.add(toggleButton5);

                            //---- toggleButton6 ----
                            toggleButton6.setText("Firm");
                            panel9.add(toggleButton6);

                            //---- label3 ----
                            label3.setText("Spring onion:");
                            panel9.add(label3);

                            //---- toggleButton7 ----
                            toggleButton7.setText("No please");
                            panel9.add(toggleButton7);

                            //---- toggleButton8 ----
                            toggleButton8.setText("Just a little");
                            panel9.add(toggleButton8);

                            //---- toggleButton9 ----
                            toggleButton9.setText("A lot");
                            panel9.add(toggleButton9);
                        }
                        panel8.add(panel9, "cell 0 0,dock center");

                        //======== panel10 ========
                        {
                            panel10.setBackground(Color.white);
                            panel10.setLayout(new GridLayout(3, 4, 0, 8));

                            //---- label4 ----
                            label4.setText("Nori:");
                            panel10.add(label4);

                            //======== panel14 ========
                            {
                                panel14.setBackground(Color.white);
                                panel14.setLayout(new BoxLayout(panel14, BoxLayout.X_AXIS));
                            }
                            panel10.add(panel14);

                            //---- toggleButton10 ----
                            toggleButton10.setText("Yes");
                            panel10.add(toggleButton10);

                            //---- toggleButton11 ----
                            toggleButton11.setText("No");
                            panel10.add(toggleButton11);

                            //---- label5 ----
                            label5.setText("Chashu:");
                            panel10.add(label5);

                            //======== panel13 ========
                            {
                                panel13.setBackground(Color.white);
                                panel13.setLayout(new BoxLayout(panel13, BoxLayout.X_AXIS));
                            }
                            panel10.add(panel13);

                            //---- toggleButton13 ----
                            toggleButton13.setText("Yes");
                            panel10.add(toggleButton13);

                            //---- toggleButton14 ----
                            toggleButton14.setText("No");
                            panel10.add(toggleButton14);

                            //---- label6 ----
                            label6.setText("Boiled egg:");
                            panel10.add(label6);

                            //======== panel12 ========
                            {
                                panel12.setBackground(Color.white);
                                panel12.setLayout(new BoxLayout(panel12, BoxLayout.X_AXIS));
                            }
                            panel10.add(panel12);

                            //---- toggleButton16 ----
                            toggleButton16.setText("Yes");
                            panel10.add(toggleButton16);

                            //---- toggleButton17 ----
                            toggleButton17.setText("No");
                            panel10.add(toggleButton17);
                        }
                        panel8.add(panel10, "cell 0 1,dock center");

                        //======== panel11 ========
                        {
                            panel11.setBackground(Color.white);
                            panel11.setLayout(new GridLayout(1, 7));

                            //---- label7 ----
                            label7.setText("Spiciness:");
                            panel11.add(label7);

                            //---- toggleButton19 ----
                            toggleButton19.setText("0");
                            panel11.add(toggleButton19);

                            //---- toggleButton20 ----
                            toggleButton20.setText("1");
                            panel11.add(toggleButton20);

                            //---- toggleButton21 ----
                            toggleButton21.setText("2");
                            panel11.add(toggleButton21);

                            //---- toggleButton22 ----
                            toggleButton22.setText("3");
                            panel11.add(toggleButton22);

                            //---- toggleButton23 ----
                            toggleButton23.setText("4");
                            panel11.add(toggleButton23);

                            //---- toggleButton24 ----
                            toggleButton24.setText("5");
                            panel11.add(toggleButton24);
                        }
                        panel8.add(panel11, "cell 0 2,dock center");
                    }
                    panel3.add(panel8, BorderLayout.CENTER);
                }
                panel2.add(panel3, "cell 0 0");

                //======== panel17 ========
                {
                    panel17.setBackground(Color.white);
                    panel17.setLayout(new BorderLayout());

                    //======== panel19 ========
                    {
                        panel19.setBackground(Color.white);
                        panel19.setLayout(new BoxLayout(panel19, BoxLayout.X_AXIS));
                    }
                    panel17.add(panel19, BorderLayout.NORTH);

                    //======== panel20 ========
                    {
                        panel20.setBackground(Color.white);
                        panel20.setLayout(new BoxLayout(panel20, BoxLayout.X_AXIS));
                    }
                    panel17.add(panel20, BorderLayout.SOUTH);

                    //======== panel21 ========
                    {
                        panel21.setBackground(Color.white);
                        panel21.setLayout(new BoxLayout(panel21, BoxLayout.X_AXIS));
                    }
                    panel17.add(panel21, BorderLayout.WEST);

                    //======== panel22 ========
                    {
                        panel22.setBackground(Color.white);
                        panel22.setLayout(new BoxLayout(panel22, BoxLayout.X_AXIS));
                    }
                    panel17.add(panel22, BorderLayout.EAST);

                    //======== panel23 ========
                    {
                        panel23.setBorder(null);
                        panel23.setBackground(Color.white);
                        panel23.setLayout(new MigLayout(
                            "hidemode 3,gap 0 0",
                            // columns
                            "[370,fill]",
                            // rows
                            "[304]" +
                            "[128]"));

                        //======== panel24 ========
                        {
                            panel24.setBorder(new TitledBorder("Optional"));
                            panel24.setBackground(Color.white);
                            panel24.setLayout(new GridLayout(4, 4, 0, 10));

                            //---- label8 ----
                            label8.setText("Nori:");
                            panel24.add(label8);

                            //---- label9 ----
                            label9.setText("Available");
                            panel24.add(label9);

                            //---- label10 ----
                            label10.setText("\uffe11");
                            panel24.add(label10);
                            panel24.add(spinner1);

                            //---- label11 ----
                            label11.setText("Chashu:");
                            panel24.add(label11);

                            //---- label12 ----
                            label12.setText("Available");
                            panel24.add(label12);

                            //---- label13 ----
                            label13.setText("\uffe12");
                            panel24.add(label13);
                            panel24.add(spinner2);

                            //---- label14 ----
                            label14.setText("Boiled egg:");
                            panel24.add(label14);

                            //---- label15 ----
                            label15.setText("Available");
                            panel24.add(label15);

                            //---- label16 ----
                            label16.setText("\uffe11");
                            panel24.add(label16);
                            panel24.add(spinner3);

                            //---- label17 ----
                            label17.setText("Shoot:");
                            panel24.add(label17);

                            //---- label18 ----
                            label18.setText("Available");
                            panel24.add(label18);

                            //---- label19 ----
                            label19.setText("\uffe11");
                            panel24.add(label19);
                            panel24.add(spinner4);
                        }
                        panel23.add(panel24, "dock center");

                        //======== panel25 ========
                        {
                            panel25.setBorder(new TitledBorder("Price"));
                            panel25.setBackground(Color.white);
                            panel25.setLayout(new MigLayout(
                                "hidemode 3,gap 0 5",
                                // columns
                                "[370,fill]",
                                // rows
                                "[80]" +
                                "[40]"));

                            //======== panel27 ========
                            {
                                panel27.setBackground(Color.white);
                                panel27.setLayout(new GridLayout(2, 3));

                                //---- label22 ----
                                label22.setText("Required");
                                panel27.add(label22);

                                //---- label23 ----
                                label23.setText("\uffe1");
                                label23.setHorizontalAlignment(SwingConstants.TRAILING);
                                panel27.add(label23);

                                //---- label24 ----
                                label24.setText("9.99");
                                panel27.add(label24);

                                //---- label25 ----
                                label25.setText("Optional");
                                panel27.add(label25);

                                //---- label26 ----
                                label26.setText("\uffe1");
                                label26.setHorizontalAlignment(SwingConstants.TRAILING);
                                panel27.add(label26);

                                //---- label27 ----
                                label27.setText("x");
                                panel27.add(label27);
                            }
                            panel25.add(panel27, "cell 0 0,dock center");

                            //======== panel28 ========
                            {
                                panel28.setBackground(Color.white);
                                panel28.setLayout(new GridLayout(1, 2));

                                //---- label31 ----
                                label31.setText("Total price");
                                panel28.add(label31);

                                //---- label32 ----
                                label32.setText("\uffe1");
                                label32.setHorizontalAlignment(SwingConstants.TRAILING);
                                panel28.add(label32);

                                //---- label33 ----
                                label33.setText("9.99+x");
                                panel28.add(label33);
                            }
                            panel25.add(panel28, "cell 0 1,dock center");
                        }
                        panel23.add(panel25, "cell 0 1");
                    }
                    panel17.add(panel23, BorderLayout.CENTER);
                }
                panel2.add(panel17, "cell 1 0");
            }
            panelBoard.add(panel2, "cell 0 1");

            //======== panel30 ========
            {
                panel30.setBackground(new Color(252, 251, 245));
                panel30.setLayout(new MigLayout(
                    "hidemode 3",
                    // columns
                    "[18,fill]" +
                    "[600,fill]" +
                    "[382,fill]",
                    // rows
                    "[75]"));

                //======== panel36 ========
                {
                    panel36.setBackground(new Color(252, 251, 245));
                    panel36.setLayout(new GridLayout(3, 1));

                    //---- label34 ----
                    label34.setText("TOTORO Ramen");
                    panel36.add(label34);

                    //---- label30 ----
                    label30.setText("Address: B15 Baker Street in London");
                    panel36.add(label30);

                    //---- label29 ----
                    label29.setText("Telphone: 44 (0) 203 178 4861");
                    panel36.add(label29);
                }
                panel30.add(panel36, "cell 1 0");

                //======== panel33 ========
                {
                    panel33.setBackground(new Color(252, 251, 245));
                    panel33.setLayout(new GridLayout(1, 4));

                    //======== panel38 ========
                    {
                        panel38.setBackground(new Color(252, 251, 245));
                        panel38.setLayout(new BoxLayout(panel38, BoxLayout.X_AXIS));
                    }
                    panel33.add(panel38);

                    //======== panel34 ========
                    {
                        panel34.setBackground(new Color(252, 251, 245));
                        panel34.setLayout(new BoxLayout(panel34, BoxLayout.X_AXIS));
                    }
                    panel33.add(panel34);

                    //---- button1 ----
                    button1.setText("Settle");
                    panel33.add(button1);

                    //======== panel35 ========
                    {
                        panel35.setBackground(new Color(252, 251, 245));
                        panel35.setLayout(new BoxLayout(panel35, BoxLayout.X_AXIS));
                    }
                    panel33.add(panel35);
                }
                panel30.add(panel33, "cell 2 0");
            }
            panelBoard.add(panel30, "cell 0 2");
        }
        add(panelBoard, BorderLayout.CENTER);

        //======== panel15 ========
        {
            panel15.setLayout(new BoxLayout(panel15, BoxLayout.X_AXIS));
        }
        add(panel15, BorderLayout.NORTH);

        //======== panel16 ========
        {
            panel16.setLayout(new BoxLayout(panel16, BoxLayout.X_AXIS));
        }
        add(panel16, BorderLayout.SOUTH);

        //======== panel18 ========
        {
            panel18.setLayout(new BoxLayout(panel18, BoxLayout.X_AXIS));
        }
        add(panel18, BorderLayout.WEST);

        //======== panel26 ========
        {
            panel26.setLayout(new BoxLayout(panel26, BoxLayout.X_AXIS));
        }
        add(panel26, BorderLayout.EAST);

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(toggleButton1);
        buttonGroup1.add(toggleButton2);
        buttonGroup1.add(toggleButton3);

        //---- buttonGroup2 ----
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(toggleButton4);
        buttonGroup2.add(toggleButton5);
        buttonGroup2.add(toggleButton6);

        //---- buttonGroup3 ----
        ButtonGroup buttonGroup3 = new ButtonGroup();
        buttonGroup3.add(toggleButton7);
        buttonGroup3.add(toggleButton8);
        buttonGroup3.add(toggleButton9);

        //---- buttonGroup4 ----
        ButtonGroup buttonGroup4 = new ButtonGroup();
        buttonGroup4.add(toggleButton10);
        buttonGroup4.add(toggleButton11);

        //---- buttonGroup5 ----
        ButtonGroup buttonGroup5 = new ButtonGroup();
        buttonGroup5.add(toggleButton13);
        buttonGroup5.add(toggleButton14);

        //---- buttonGroup6 ----
        ButtonGroup buttonGroup6 = new ButtonGroup();
        buttonGroup6.add(toggleButton16);
        buttonGroup6.add(toggleButton17);

        //---- buttonGroup7 ----
        ButtonGroup buttonGroup7 = new ButtonGroup();
        buttonGroup7.add(toggleButton19);
        buttonGroup7.add(toggleButton20);
        buttonGroup7.add(toggleButton21);
        buttonGroup7.add(toggleButton22);
        buttonGroup7.add(toggleButton23);
        buttonGroup7.add(toggleButton24);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panelBoard;
    private JPanel panel1;
    private JPanel panel29;
    private JLabel label28;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel5;
    private JPanel panel4;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel panel8;
    private JPanel panel9;
    private JLabel label1;
    private JToggleButton toggleButton1;
    private JToggleButton toggleButton2;
    private JToggleButton toggleButton3;
    private JLabel label2;
    private JToggleButton toggleButton4;
    private JToggleButton toggleButton5;
    private JToggleButton toggleButton6;
    private JLabel label3;
    private JToggleButton toggleButton7;
    private JToggleButton toggleButton8;
    private JToggleButton toggleButton9;
    private JPanel panel10;
    private JLabel label4;
    private JPanel panel14;
    private JToggleButton toggleButton10;
    private JToggleButton toggleButton11;
    private JLabel label5;
    private JPanel panel13;
    private JToggleButton toggleButton13;
    private JToggleButton toggleButton14;
    private JLabel label6;
    private JPanel panel12;
    private JToggleButton toggleButton16;
    private JToggleButton toggleButton17;
    private JPanel panel11;
    private JLabel label7;
    private JToggleButton toggleButton19;
    private JToggleButton toggleButton20;
    private JToggleButton toggleButton21;
    private JToggleButton toggleButton22;
    private JToggleButton toggleButton23;
    private JToggleButton toggleButton24;
    private JPanel panel17;
    private JPanel panel19;
    private JPanel panel20;
    private JPanel panel21;
    private JPanel panel22;
    private JPanel panel23;
    private JPanel panel24;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JSpinner spinner1;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JSpinner spinner2;
    private JLabel label14;
    private JLabel label15;
    private JLabel label16;
    private JSpinner spinner3;
    private JLabel label17;
    private JLabel label18;
    private JLabel label19;
    private JSpinner spinner4;
    private JPanel panel25;
    private JPanel panel27;
    private JLabel label22;
    private JLabel label23;
    private JLabel label24;
    private JLabel label25;
    private JLabel label26;
    private JLabel label27;
    private JPanel panel28;
    private JLabel label31;
    private JLabel label32;
    private JLabel label33;
    private JPanel panel30;
    private JPanel panel36;
    private JLabel label34;
    private JLabel label30;
    private JLabel label29;
    private JPanel panel33;
    private JPanel panel38;
    private JPanel panel34;
    private JButton button1;
    private JPanel panel35;
    private JPanel panel15;
    private JPanel panel16;
    private JPanel panel18;
    private JPanel panel26;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
