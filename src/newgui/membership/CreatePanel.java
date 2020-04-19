/*
 * Created by JFormDesigner on Sun Apr 19 10:49:20 CST 2020
 */

package newgui.membership;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.*;

/**
 * @author Brainrain
 */
public class CreatePanel extends JPanel {
    public CreatePanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label3 = new JLabel();
        panel4 = new JPanel();
        panel2 = new JPanel();
        panel7 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        panel13 = new JPanel();
        textField2 = new JTextField();
        panel12 = new JPanel();
        panel8 = new JPanel();
        label2 = new JLabel();
        textField3 = new JTextField();
        panel15 = new JPanel();
        textField4 = new JTextField();
        panel14 = new JPanel();
        panel6 = new JPanel();
        panel3 = new JPanel();
        panel10 = new JPanel();
        panel11 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        panel9 = new JPanel();

        //======== this ========
        setPreferredSize(new Dimension(1600, 287));
        setBackground(new Color(238, 238, 238));
        setLayout(new BorderLayout());

        //---- label3 ----
        label3.setText("Singup For Romoro");
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setForeground(Color.black);
        label3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 36));
        label3.setPreferredSize(new Dimension(261, 50));
        add(label3, BorderLayout.NORTH);

        //======== panel4 ========
        {
            panel4.setPreferredSize(new Dimension(550, 0));
            panel4.setOpaque(false);
            panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));
        }
        add(panel4, BorderLayout.WEST);

        //======== panel2 ========
        {
            panel2.setBorder(new BevelBorder(BevelBorder.LOWERED));
            panel2.setBackground(new Color(204, 204, 204));
            panel2.setLayout(new GridLayout(2, 1));

            //======== panel7 ========
            {
                panel7.setBackground(new Color(153, 153, 153));
                panel7.setLayout(new GridLayout(5, 1, 0, 10));

                //---- label1 ----
                label1.setText("Input Your Personal Information:");
                label1.setBackground(new Color(102, 255, 102));
                label1.setForeground(new Color(238, 238, 238));
                label1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                panel7.add(label1);

                //---- textField1 ----
                textField1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                textField1.setText("Your Last Name");
                textField1.setToolTipText("Your First Name");
                textField1.setCaretColor(new Color(204, 204, 204));
                textField1.setForeground(new Color(204, 204, 204));
                textField1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 10));
                textField1.setPreferredSize(new Dimension(110, 20));
                textField1.setMinimumSize(new Dimension(49, 20));
                panel7.add(textField1);

                //======== panel13 ========
                {
                    panel13.setBackground(new Color(153, 153, 153));
                    panel13.setLayout(new BoxLayout(panel13, BoxLayout.X_AXIS));
                }
                panel7.add(panel13);

                //---- textField2 ----
                textField2.setText("Your First Name");
                textField2.setForeground(new Color(204, 204, 204));
                textField2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 10));
                textField2.setPreferredSize(new Dimension(110, 20));
                textField2.setMinimumSize(new Dimension(49, 20));
                panel7.add(textField2);

                //======== panel12 ========
                {
                    panel12.setBackground(new Color(153, 153, 153));
                    panel12.setLayout(new BoxLayout(panel12, BoxLayout.X_AXIS));
                }
                panel7.add(panel12);
            }
            panel2.add(panel7);

            //======== panel8 ========
            {
                panel8.setBackground(new Color(153, 153, 153));
                panel8.setLayout(new GridLayout(5, 1, 0, 10));

                //---- label2 ----
                label2.setText("Input Your Account Information:");
                label2.setBackground(new Color(102, 255, 102));
                label2.setForeground(new Color(238, 238, 238));
                label2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                panel8.add(label2);

                //---- textField3 ----
                textField3.setText("Your Telephone Number");
                textField3.setForeground(new Color(204, 204, 204));
                textField3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 10));
                textField3.setPreferredSize(new Dimension(110, 20));
                textField3.setMinimumSize(new Dimension(49, 20));
                panel8.add(textField3);

                //======== panel15 ========
                {
                    panel15.setBackground(new Color(153, 153, 153));
                    panel15.setLayout(new BoxLayout(panel15, BoxLayout.X_AXIS));
                }
                panel8.add(panel15);

                //---- textField4 ----
                textField4.setText("Your Email Number");
                textField4.setForeground(new Color(204, 204, 204));
                textField4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 10));
                textField4.setPreferredSize(new Dimension(110, 20));
                textField4.setMinimumSize(new Dimension(49, 20));
                panel8.add(textField4);

                //======== panel14 ========
                {
                    panel14.setBackground(new Color(153, 153, 153));
                    panel14.setLayout(new BoxLayout(panel14, BoxLayout.X_AXIS));
                }
                panel8.add(panel14);
            }
            panel2.add(panel8);
        }
        add(panel2, BorderLayout.CENTER);

        //======== panel6 ========
        {
            panel6.setOpaque(false);
            panel6.setPreferredSize(new Dimension(550, 0));
            panel6.setBackground(new Color(204, 204, 204));
            panel6.setLayout(new BoxLayout(panel6, BoxLayout.X_AXIS));
        }
        add(panel6, BorderLayout.EAST);

        //======== panel3 ========
        {
            panel3.setPreferredSize(new Dimension(780, 40));
            panel3.setBackground(new Color(238, 238, 238));
            panel3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
            panel3.setLayout(new GridLayout(1, 3));

            //======== panel10 ========
            {
                panel10.setBackground(new Color(238, 238, 238));
                panel10.setLayout(new BoxLayout(panel10, BoxLayout.X_AXIS));
            }
            panel3.add(panel10);

            //======== panel11 ========
            {
                panel11.setBackground(new Color(238, 238, 238));
                panel11.setLayout(new GridLayout(1, 2, 100, 0));

                //---- button1 ----
                button1.setText("Confirm");
                button1.setPreferredSize(new Dimension(78, 60));
                button1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                panel11.add(button1);

                //---- button2 ----
                button2.setText("Return");
                button2.setPreferredSize(new Dimension(78, 60));
                button2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
                panel11.add(button2);
            }
            panel3.add(panel11);

            //======== panel9 ========
            {
                panel9.setBackground(new Color(238, 238, 238));
                panel9.setLayout(new BoxLayout(panel9, BoxLayout.X_AXIS));
            }
            panel3.add(panel9);
        }
        add(panel3, BorderLayout.SOUTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label3;
    private JPanel panel4;
    private JPanel panel2;
    private JPanel panel7;
    private JLabel label1;
    private JTextField textField1;
    private JPanel panel13;
    private JTextField textField2;
    private JPanel panel12;
    private JPanel panel8;
    private JLabel label2;
    private JTextField textField3;
    private JPanel panel15;
    private JTextField textField4;
    private JPanel panel14;
    private JPanel panel6;
    private JPanel panel3;
    private JPanel panel10;
    private JPanel panel11;
    private JButton button1;
    private JButton button2;
    private JPanel panel9;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
