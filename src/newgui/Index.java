/*
 * Created by JFormDesigner on Sun Apr 19 10:26:05 CST 2020
 */

package newgui;

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
        panel13 = new JPanel();
        panel14 = new JPanel();
        label5 = new JLabel();
        panel10 = new JPanel();
        panel11 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
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

            //======== panel13 ========
            {
                panel13.setBackground(Color.white);
                panel13.setLayout(new BoxLayout(panel13, BoxLayout.X_AXIS));
            }
            panel1.add(panel13);

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
                panel11.setLayout(new GridLayout(3, 2, 10, 10));

                //---- button1 ----
                button1.setText("Order");
                button1.setPreferredSize(new Dimension(78, 80));
                button1.setBackground(new Color(255, 153, 102));
                button1.setForeground(Color.white);
                button1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                panel11.add(button1);

                //---- button2 ----
                button2.setText("Menu");
                button2.setPreferredSize(new Dimension(78, 80));
                button2.setBackground(new Color(255, 102, 102));
                button2.setForeground(Color.white);
                button2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                panel11.add(button2);

                //---- button3 ----
                button3.setText("I'm VIP");
                button3.setPreferredSize(new Dimension(78, 80));
                button3.setBackground(new Color(51, 255, 255));
                button3.setForeground(Color.white);
                button3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                panel11.add(button3);

                //---- button4 ----
                button4.setText("Become VIP");
                button4.setPreferredSize(new Dimension(78, 80));
                button4.setBackground(new Color(0, 255, 102));
                button4.setForeground(Color.white);
                button4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                panel11.add(button4);

                //---- button5 ----
                button5.setText("I'm Manager");
                button5.setPreferredSize(new Dimension(78, 80));
                button5.setBackground(new Color(153, 153, 255));
                button5.setForeground(Color.white);
                button5.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                panel11.add(button5);

                //---- button6 ----
                button6.setText("Comment");
                button6.setPreferredSize(new Dimension(78, 80));
                button6.setBackground(new Color(255, 102, 255));
                button6.setForeground(Color.white);
                button6.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
                panel11.add(button6);
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
    private JLabel time2;
    private JLabel date2;
    private JPanel panel13;
    private JPanel panel14;
    private JLabel label5;
    private JPanel panel10;
    private JPanel panel11;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JLabel label4;
    private JLabel label3;
    private JPanel panel2;
    private JPanel panel3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
