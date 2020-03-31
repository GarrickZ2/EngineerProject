package gui.membership;


import com.alee.demo.api.example.PreviewPanel;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zixuan Zhang
 */
public class CreatePanel extends JPanel{
    JButton back;

    JPanel fNamePanel;
    JLabel fName;
    JTextField fNameText;
    JPanel lNamePanel;
    JLabel lName;
    JTextField lNameText;
    JPanel telPanel;
    JLabel tel;
    JTextField telText;
    JPanel emailPanel;
    JLabel email;
    JTextField emailText;

    JButton commit;

    JPanel up;
    JPanel mid;
    JPanel bellow;

    JPanel main;
    public CreatePanel(LayoutManager layoutManager){
        //up zone
        up = new JPanel(new BorderLayout());
        back = new JButton("Return");
        up.add(back, BorderLayout.WEST);

        //mid zone
        //fName zone
        fNamePanel = new JPanel(new GridLayout(1, 2));
        fName = new JLabel("Please input your first name:");
        fNameText = new JTextField(30);
        fNamePanel.add(fName);
        fNamePanel.add(fNameText);
        //lName zone
        lNamePanel = new JPanel(new GridLayout(1, 2));
        lName = new JLabel("Please input your last name:");
        lNameText = new JTextField(30);
        lNamePanel.add(lName);
        lNamePanel.add(lNameText);
        //tel zone
        telPanel = new JPanel(new GridLayout(1, 2));
        tel = new JLabel("Please input your telephone:");
        telText = new JTextField(30);
        telPanel.add(tel);
        telPanel.add(telText);
        //email zone
        emailPanel = new JPanel(new GridLayout(1, 2));
        email = new JLabel("Please input your email:");
        emailText = new JTextField(10);
        emailPanel.add(email);
        emailPanel.add(emailText);

        mid = new JPanel(new GridLayout(4, 1));
        mid.add(fNamePanel);
        mid.add(lNamePanel);
        mid.add(telPanel);
        mid.add(emailPanel);


        //bellow zone
        bellow = new JPanel(new BorderLayout());
        commit = new JButton("Commit");
        bellow.add(commit);

//        summon
        this.add(bellow, BorderLayout.SOUTH);
        main = new JPanel(new BorderLayout());
        main.add(up, BorderLayout.NORTH);
        main.add(mid, BorderLayout.CENTER);
        main.add(bellow, BorderLayout.SOUTH);
//        this.add(up);
//        this.add(mid);
//        this.add(bellow);
        this.add(main);
    }

}
