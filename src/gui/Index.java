/*
 * Created by JFormDesigner on Sun Apr 19 10:26:05 CST 2020
 */

package gui;

import java.awt.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class Index extends JPanel {
    public Index() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        panel9 = new JPanel();
        time2 = new JLabel();
        date2 = new JLabel();
        panel14 = new JPanel();
        label5 = new JLabel();
        panel10 = new JPanel();
        panel11 = new JPanel();
        panel4 = new JPanel();
        dinner = new JButton();
        panel5 = new JPanel();
        isVip = new JButton();
        becomeVip = new JButton();
        panel7 = new JPanel();
        management = new JButton();
        exit = new JButton();
        label4 = new JLabel();
        label3 = new JLabel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        //======== this ========
        setBackground(Color.white);
        setLayout(new BorderLayout(5, 50));

        //======== panel1 ========
        {
            panel1.setBackground(Color.white);
            panel1.setLayout(new GridLayout(1, 5));

            //======== panel9 ========
            {
                panel9.setBackground(Color.white);
                panel9.setLayout(new GridLayout(2, 1));

                //---- time2 ----
                time2.setText("12:00");
                time2.setHorizontalAlignment(SwingConstants.CENTER);
                time2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 30));
                panel9.add(time2);

                //---- date2 ----
                date2.setText("19th April 2020");
                date2.setHorizontalAlignment(SwingConstants.CENTER);
                date2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
                panel9.add(date2);
            }
            panel1.add(panel9);

            //======== panel14 ========
            {
                panel14.setBackground(Color.white);
                panel14.setLayout(new BoxLayout(panel14, BoxLayout.X_AXIS));
            }
            panel1.add(panel14);

            //---- label5 ----
            label5.setText("TOTORO RAMEN");
            label5.setVerticalAlignment(SwingConstants.BOTTOM);
            label5.setHorizontalAlignment(SwingConstants.CENTER);
            label5.setFont(new Font("Microsoft YaHei UI", Font.BOLD | Font.ITALIC, 14));
            panel1.add(label5);
        }
        add(panel1, BorderLayout.NORTH);

        //======== panel10 ========
        {
            panel10.setBackground(Color.white);
            panel10.setLayout(new GridLayout(1, 2, 30, 0));

            //======== panel11 ========
            {
                panel11.setLayout(new GridLayout(3, 1, 10, 10));

                //======== panel4 ========
                {
                    panel4.setLayout(new GridLayout(1, 1));

                    //---- dinner ----
                    dinner.setText("Order");
                    dinner.setPreferredSize(new Dimension(78, 80));
                    dinner.setBackground(new Color(255, 153, 102));
                    dinner.setForeground(Color.white);
                    dinner.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                    panel4.add(dinner);
                }
                panel11.add(panel4);

                //======== panel5 ========
                {
                    panel5.setLayout(new GridLayout(1, 2));

                    //---- isVip ----
                    isVip.setText("I'm VIP");
                    isVip.setPreferredSize(new Dimension(78, 80));
                    isVip.setBackground(new Color(51, 255, 255));
                    isVip.setForeground(Color.white);
                    isVip.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                    panel5.add(isVip);

                    //---- becomeVip ----
                    becomeVip.setText("Become VIP");
                    becomeVip.setPreferredSize(new Dimension(78, 80));
                    becomeVip.setBackground(new Color(0, 255, 102));
                    becomeVip.setForeground(Color.white);
                    becomeVip.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                    panel5.add(becomeVip);
                }
                panel11.add(panel5);

                //======== panel7 ========
                {
                    panel7.setLayout(new GridLayout(1, 2));

                    //---- management ----
                    management.setText("I'm Manager");
                    management.setPreferredSize(new Dimension(78, 80));
                    management.setBackground(new Color(153, 153, 255));
                    management.setForeground(Color.white);
                    management.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                    panel7.add(management);

                    //---- exit ----
                    exit.setText("EXIT");
                    exit.setPreferredSize(new Dimension(78, 80));
                    exit.setBackground(new Color(255, 102, 255));
                    exit.setForeground(Color.white);
                    exit.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                    panel7.add(exit);
                }
                panel11.add(panel7);
            }
            panel10.add(panel11);

            //---- label4 ----
            label4.setIcon(new ImageIcon(getClass().getResource("/img/ramen.jpg")));
            panel10.add(label4);
        }
        add(panel10, BorderLayout.CENTER);

        //---- label3 ----
        label3.setText("CopyRight");
        label3.setHorizontalAlignment(SwingConstants.RIGHT);
        add(label3, BorderLayout.SOUTH);

        //======== panel2 ========
        {
            panel2.setPreferredSize(new Dimension(50, 0));
            panel2.setBackground(Color.white);
            panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
        }
        add(panel2, BorderLayout.WEST);

        //======== panel3 ========
        {
            panel3.setPreferredSize(new Dimension(50, 0));
            panel3.setBackground(Color.white);
            panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        }
        add(panel3, BorderLayout.EAST);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JPanel panel9;
    public JLabel time2;
    public JLabel date2;
    private JPanel panel14;
    private JLabel label5;
    private JPanel panel10;
    private JPanel panel11;
    private JPanel panel4;
    public JButton dinner;
    private JPanel panel5;
    public JButton isVip;
    public JButton becomeVip;
    private JPanel panel7;
    public JButton management;
    public JButton exit;
    private JLabel label4;
    private JLabel label3;
    private JPanel panel2;
    private JPanel panel3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
