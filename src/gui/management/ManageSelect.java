/*
 * Created by JFormDesigner on Thu Apr 02 11:02:06 CST 2020
 */

package gui.management;

import java.awt.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class ManageSelect extends JPanel {
    public ManageSelect() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        panel2 = new JPanel();
        back = new JButton();
        panel12 = new JPanel();
        panel11 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel10 = new JPanel();
        checkMenu = new JButton();
        checkData = new JButton();
        panel6 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();
        panel9 = new JPanel();

        //======== this ========
        setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout(3, 4, 10, 10));

            //======== panel2 ========
            {
                panel2.setLayout(new GridLayout(2, 2));

                //---- back ----
                back.setText("Return");
                panel2.add(back);

                //======== panel12 ========
                {
                    panel12.setLayout(new BoxLayout(panel12, BoxLayout.X_AXIS));
                }
                panel2.add(panel12);

                //======== panel11 ========
                {
                    panel11.setLayout(new BoxLayout(panel11, BoxLayout.X_AXIS));
                }
                panel2.add(panel11);
            }
            panel1.add(panel2);

            //======== panel3 ========
            {
                panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
            }
            panel1.add(panel3);

            //======== panel4 ========
            {
                panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));
            }
            panel1.add(panel4);

            //======== panel5 ========
            {
                panel5.setLayout(new BoxLayout(panel5, BoxLayout.X_AXIS));
            }
            panel1.add(panel5);

            //======== panel10 ========
            {
                panel10.setLayout(new BoxLayout(panel10, BoxLayout.X_AXIS));
            }
            panel1.add(panel10);

            //---- checkMenu ----
            checkMenu.setText("Check Menu");
            panel1.add(checkMenu);

            //---- checkData ----
            checkData.setText("Check Data");
            panel1.add(checkData);

            //======== panel6 ========
            {
                panel6.setLayout(new BoxLayout(panel6, BoxLayout.X_AXIS));
            }
            panel1.add(panel6);

            //======== panel7 ========
            {
                panel7.setLayout(new BoxLayout(panel7, BoxLayout.X_AXIS));
            }
            panel1.add(panel7);

            //======== panel8 ========
            {
                panel8.setLayout(new BoxLayout(panel8, BoxLayout.X_AXIS));
            }
            panel1.add(panel8);

            //======== panel9 ========
            {
                panel9.setLayout(new BoxLayout(panel9, BoxLayout.X_AXIS));
            }
            panel1.add(panel9);
        }
        add(panel1, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JPanel panel2;
    public JButton back;
    private JPanel panel12;
    private JPanel panel11;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel10;
    public JButton checkMenu;
    public JButton checkData;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel panel8;
    private JPanel panel9;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
