package gui;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 * @author YanZhao Chen
 */
public class Receipt extends JFrame {

    public Receipt(String re) {
        JTextArea jTextArea1 = new JTextArea(re);
        jTextArea1.setSize(1000, 500);
        jTextArea1.setEnabled(false);
        setLayout(null);
        setBounds(400, 200, 400, 400);
        jTextArea1.setColumns(50);
        jTextArea1.setRows(5);
        add(jTextArea1);
    }
}
