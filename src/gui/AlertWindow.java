package gui;

import javax.swing.*;
import java.awt.*;

/**
 * @author Huang
 */
public class AlertWindow extends JFrame {

    public AlertWindow(){
        System.out.println("Please remember to finish the alert window later");
    }
    public AlertWindow(String alertContent) throws InterruptedException {

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        JLabel label = new JLabel();
        label.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
        label.setSize(350,0);
        this.setTitle("Error");
        this.add(label);
        this.JlabelSetText(label,alertContent);

        this.pack();
        this.setLocation((dim.width - this.getWidth()) / 2, (dim.height - this.getHeight()) / 3);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void JlabelSetText(JLabel jLabel, String longString)
            throws InterruptedException {
        if(longString == null){
            longString = "Unidentified error occurs.";
        }
        StringBuilder builder = new StringBuilder("<html>");
        char[] chars = longString.toCharArray();
        FontMetrics fontMetrics = jLabel.getFontMetrics(jLabel.getFont());
        int start = 0;
        int len = 0;
        while (start + len < longString.length()) {
            while (true) {
                len++;
                if (start + len > longString.length()) {
                    break;
                }
                if (fontMetrics.charsWidth(chars, start, len)
                        > jLabel.getWidth()) {
                    break;
                }
            }
            builder.append(chars, start, len-1).append("<br/>");
            start = start + len - 1;
            len = 0;
        }
        builder.append(chars, start, longString.length()-start);
        builder.append("</html>");
        jLabel.setText(builder.toString());
    }
}
