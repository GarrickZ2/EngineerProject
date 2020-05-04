package gui.order;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author Yanzhao Chen
 */
public class Recipients extends JFrame implements Runnable{
    JButton confirm;
    String re;
    JPanel main;

    public Recipients(String re) {
        this.re = re;
        main = new JPanel();
        main.setLayout(new BorderLayout());
        JTextArea jTextArea1 = new JTextArea(re);
        jTextArea1.setSize(1000, 500);
        jTextArea1.setEnabled(false);
        setBounds(400, 200, 400, 400);
        jTextArea1.setColumns(50);
        jTextArea1.setRows(5);
        main.add(jTextArea1, BorderLayout.CENTER);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        confirm = new JButton("Confirm");
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Thread.currentThread().interrupt();
                dispose();
            }
        });
        main.add(confirm, BorderLayout.SOUTH);
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                Thread.currentThread().interrupt();
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                Thread.currentThread().interrupt();
            }
        });
        this.add(main);
        this.setVisible(true);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println();
        }
        dispose();
    }

}
