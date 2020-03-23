package gui.order;

import javax.swing.*;
import java.awt.*;

public class Compulsory extends JPanel {

    JPanel section1;

    JPanel soupPanel;
    JLabel soupLabel;
    ButtonGroup soupGroup;
    JRadioButton soup1;
    JRadioButton soup2;
    JRadioButton soup3;

    JPanel noodlesPanel;
    JLabel noodlesLabel;
    ButtonGroup noodlesGroup;
    JRadioButton noodles1;
    JRadioButton noodles2;
    JRadioButton noodles3;

    JPanel onionPanel;
    JLabel onionLabel;
    ButtonGroup onionGroup;
    JRadioButton onion1;
    JRadioButton onion2;
    JRadioButton onion3;

    JPanel section2;

    JPanel noriPanel;
    JLabel noriLabel;
    ButtonGroup noriGroup;
    JRadioButton nori1;
    JRadioButton nori2;

    JPanel chashuPanel;
    JLabel chashuLabel;
    ButtonGroup chashuGroup;
    JRadioButton chashu1;
    JRadioButton chashu2;

    JPanel eggPanel;
    JLabel eggLabel;
    ButtonGroup eggGroup;
    JRadioButton egg1;
    JRadioButton egg2;

    JPanel section3;
    JLabel spiceLabel;
    ButtonGroup spiceGroup;
    JRadioButton spice1;
    JRadioButton spice2;
    JRadioButton spice3;
    JRadioButton spice4;
    JRadioButton spice5;

    public Compulsory(LayoutManager layoutManager){
        //section1
        //soup
        soup1 = new JRadioButton("Tonkotsu");
        soup2 = new JRadioButton("Shoyu");
        soup3 = new JRadioButton("Shio");

        soupGroup = new ButtonGroup();
        soupGroup.add(soup1);
        soupGroup.add(soup2);
        soupGroup.add(soup3);

        soupLabel = new JLabel("Soup:");
        soupPanel = new JPanel(new GridLayout(1, 4));
        soupPanel.add(soupLabel);
        soupPanel.add(soup1);
        soupPanel.add(soup2);
        soupPanel.add(soup3);

        //noodles
        noodles1 = new JRadioButton("Soft");
        noodles2 = new JRadioButton("Medium");
        noodles3 = new JRadioButton("Firm");

        noodlesGroup = new ButtonGroup();
        noodlesGroup.add(noodles1);
        noodlesGroup.add(noodles2);
        noodlesGroup.add(noodles3);

        noodlesLabel = new JLabel("Noodles:");
        noodlesPanel = new JPanel(new GridLayout(1, 4));
        noodlesPanel.add(noodlesLabel);
        noodlesPanel.add(noodles1);
        noodlesPanel.add(noodles2);
        noodlesPanel.add(noodles3);

        //onion
//        noodles
        section1 = new JPanel(new GridLayout(3,1));
        section1.add(soupPanel);
        section1.add(noodlesPanel);



        this.add(section1);
    }
}
