package gui;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Receipt extends JFrame {
    private JTextArea jTextArea1;

    public Receipt(String re) {
        jTextArea1 = new JTextArea(re);//需要在换行的地方加入\n
        jTextArea1.setSize(1000, 500);
        jTextArea1.setEnabled(false);
        setLayout(null);
        setBounds(400, 200, 400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jTextArea1.setColumns(50);
        jTextArea1.setRows(5);
        add(jTextArea1);
    }
}
