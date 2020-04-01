/*
 * Created by JFormDesigner on Wed Apr 01 20:16:11 CST 2020
 */

package gui.membership;

import java.awt.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class ChangeInfo extends JPanel {
    public ChangeInfo() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel2 = new JPanel();
        title = new JLabel();
        back = new JButton();
        panel1 = new JPanel();
        label1 = new JLabel();
        fNameText = new JTextField();
        label2 = new JLabel();
        lNameText = new JTextField();
        label3 = new JLabel();
        telText = new JTextField();
        label4 = new JLabel();
        emailText = new JTextField();
        panel3 = new JPanel();
        button3 = new JButton();

        //======== this ========
        setLayout(new BorderLayout(5, 5));

        //======== panel2 ========
        {
            panel2.setLayout(new BorderLayout());

            //---- title ----
            title.setText("Change Your Information");
            panel2.add(title, BorderLayout.CENTER);

            //---- back ----
            back.setText("Return");
            panel2.add(back, BorderLayout.WEST);
        }
        add(panel2, BorderLayout.NORTH);

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout(4, 2, 4, 4));

            //---- label1 ----
            label1.setText("First Name:");
            panel1.add(label1);

            //---- fNameText ----
            fNameText.setToolTipText("Please Input Your First Name");
            panel1.add(fNameText);

            //---- label2 ----
            label2.setText("Last Name:");
            panel1.add(label2);
            panel1.add(lNameText);

            //---- label3 ----
            label3.setText("Telephone:");
            panel1.add(label3);
            panel1.add(telText);

            //---- label4 ----
            label4.setText("Email:");
            panel1.add(label4);
            panel1.add(emailText);
        }
        add(panel1, BorderLayout.CENTER);

        //======== panel3 ========
        {
            panel3.setLayout(new BorderLayout());

            //---- button3 ----
            button3.setText("Conform");
            panel3.add(button3, BorderLayout.CENTER);
        }
        add(panel3, BorderLayout.SOUTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel2;
    private JLabel title;
    protected JButton back;
    private JPanel panel1;
    private JLabel label1;
    protected JTextField fNameText;
    private JLabel label2;
    protected JTextField lNameText;
    private JLabel label3;
    protected JTextField telText;
    private JLabel label4;
    protected JTextField emailText;
    private JPanel panel3;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
