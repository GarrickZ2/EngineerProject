package gui.order;

import javax.swing.*;
import java.awt.*;

/**
 * @author Huang
 * @version 1.0
 */
public class Bill extends JPanel {

    ImageIcon img = new ImageIcon("resource/img/1.jpg");

    public JPanel guidance(){

        JLabel lb0, lb1, lb2, lb3, lb4;
        JPanel jp = new JPanel(new GridLayout(6,1));

        lb0 = new JLabel("<Payment>");
        lb1 = new JLabel("Serial Number:200345548218752");
        lb2 = new JLabel("Time:2020-03-28 20:21:15");
        lb3 = new JLabel("Membership Number: M00001");
        lb4 = new JLabel("------------------------------------------------------------------------------------");

        jp.add(lb0);
        jp.add(lb1);
        jp.add(lb2);
        jp.add(lb3);
        jp.add(lb4);

        return jp;
    }

    public JPanel itemList(){

        JLabel lb0, lb1, lb2, lb3;
        JPanel jp = new JPanel(new GridLayout(1,4));


        lb0 = new JLabel(img);
        lb0.setSize(2,2);
        lb1 = new JLabel("sss");
        lb2 = new JLabel("sss");
        lb3 = new JLabel("sss");

        jp.add(lb0);
        jp.add(lb1);
        jp.add(lb2);
        jp.add(lb3);

        return jp;
    }

    public JPanel generalButton(String str){

        ButtonGroup method;
        JLabel suggest = new JLabel();
        JToggleButton bt1 = new JToggleButton();
        JToggleButton bt2 = new JToggleButton();

        JPanel jp = new JPanel(new GridLayout(1,4));

        if(str.equals("Repast")){
            suggest.setText("Dining Method:");
            bt1.setText("Eat in");
            bt2.setText("Take away");
        }
        if(str.equals("Paying")){
            suggest.setText("Paying Method:");
            bt1.setText("Cash");
            bt2.setText("Visa");
        }

        method = new ButtonGroup();
        method.add(bt1);
        method.add(bt2);

        jp.add(suggest);
        jp.add(bt1);
        jp.add(bt2);
        jp.add(new JLabel(""));
        return jp;
    }

    public Bill(){

        this.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new GridLayout(2,1));
        JPanel bottomPanel = new JPanel(new GridLayout(3,1));

        topPanel.add(this.guidance());
        topPanel.add(itemList());

        bottomPanel.add(this.generalButton("Repast"));
        bottomPanel.add(this.generalButton("Paying"));

        this.add(topPanel, BorderLayout.NORTH);
        this.add(bottomPanel,BorderLayout.SOUTH);
        this.setBorder(BorderFactory.createEtchedBorder());
    }


}
