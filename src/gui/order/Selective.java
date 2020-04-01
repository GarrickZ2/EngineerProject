package gui.order;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zixuan Zhang
 */
public class Selective extends JPanel {
    JPanel main;

    //nori
    int noriCount = 0;
    JPanel noriPanel;
    JCheckBox noriCheck;
    JLabel noriLabel;
    JLabel noriPrice;
    JButton noriMinus;
    JLabel noriNumber;
    JButton noriPlus;
    //egg
    int eggCount = 0;
    JPanel eggPanel;
    JCheckBox eggCheck;
    JLabel eggLabel;
    JLabel eggPrice;
    JButton eggMinus;
    JLabel eggNumber;
    JButton eggPlus;
    //shoot
    int shootCount = 0;
    JPanel shootPanel;
    JCheckBox shootCheck;
    JLabel shootLabel;
    JLabel shootPrice;
    JButton shootMinus;
    JLabel shootNumber;
    JButton shootPlus;
    //chashu
    int chashuCount = 0;
    JPanel chashuPanel;
    JCheckBox chashuCheck;
    JLabel chashuLabel;
    JLabel chashuPrice;
    JButton chashuMinus;
    JLabel chashuNumber;
    JButton chashuPlus;

    public Selective(LayoutManager layoutManager){
        super(layoutManager);

        //nori
        noriCheck = new JCheckBox();
        noriLabel = new JLabel("Extra Nori");
        noriPrice = new JLabel("$ 1 each");
        noriMinus = new JButton("-");
        noriNumber = new JLabel("" + noriCount);
        noriPlus = new JButton("+");

        noriPanel = new JPanel(new GridLayout(1,6));
        noriPanel.add(noriCheck);
        noriPanel.add(noriLabel);
        noriPanel.add(noriPrice);
        noriPanel.add(noriMinus);
        noriPanel.add(noriNumber);
        noriPanel.add(noriPlus);
        noriPanel.setBorder(BorderFactory.createEtchedBorder());


        //egg
        eggCheck = new JCheckBox();
        eggLabel = new JLabel("Extra Eggs");
        eggPrice = new JLabel("$ 1 each");
        eggMinus = new JButton("-");
        eggNumber = new JLabel("0");
        eggPlus = new JButton("+");

        eggPanel = new JPanel(new GridLayout(1,6));
        eggPanel.add(eggCheck);
        eggPanel.add(eggLabel);
        eggPanel.add(eggPrice);
        eggPanel.add(eggMinus);
        eggPanel.add(eggNumber);
        eggPanel.add(eggPlus);
        eggPanel.setBorder(BorderFactory.createEtchedBorder());

        //shoot
        shootCheck = new JCheckBox();
        shootLabel = new JLabel("Extra Shoots");
        shootPrice = new JLabel("$ 1 each");
        shootMinus = new JButton("-");
        shootNumber = new JLabel("0");
        shootPlus = new JButton("+");

        shootPanel = new JPanel(new GridLayout(1,6));
        shootPanel.add(shootCheck);
        shootPanel.add(shootLabel);
        shootPanel.add(shootPrice);
        shootPanel.add(shootMinus);
        shootPanel.add(shootNumber);
        shootPanel.add(shootPlus);
        shootPanel.setBorder(BorderFactory.createEtchedBorder());
        //chashu
        chashuCheck = new JCheckBox();
        chashuLabel = new JLabel("Extra Chashus");
        chashuPrice = new JLabel("$ 1 each");
        chashuMinus = new JButton("-");
        chashuNumber = new JLabel("0");
        chashuPlus = new JButton("+");

        chashuPanel = new JPanel(new GridLayout(1,6));
        chashuPanel.add(chashuCheck);
        chashuPanel.add(chashuLabel);
        chashuPanel.add(chashuPrice);
        chashuPanel.add(chashuMinus);
        chashuPanel.add(chashuNumber);
        chashuPanel.add(chashuPlus);
        chashuPanel.setBorder(BorderFactory.createEtchedBorder());

        main = new JPanel(new GridLayout(4,1));

        main.add(noriPanel);
        main.add(eggPanel);
        main.add(shootPanel);
        main.add(chashuPanel);

        this.add(main);

    }
}
