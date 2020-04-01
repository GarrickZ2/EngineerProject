package gui.order;

import javax.swing.*;
import javax.xml.stream.FactoryConfigurationError;
import java.awt.*;

public class Compulsory extends JPanel {
    JLabel title;
    JPanel section1;

    JPanel soupPanel;
    JLabel soupLabel;
    ButtonGroup soupGroup;
    JToggleButton soup1;
    JToggleButton soup2;
    JToggleButton soup3;

    JPanel noodlesPanel;
    JLabel noodlesLabel;
    ButtonGroup noodlesGroup;
    JToggleButton noodles1;
    JToggleButton noodles2;
    JToggleButton noodles3;

    JPanel onionPanel;
    JLabel onionLabel;
    ButtonGroup onionGroup;
    JToggleButton onion1;
    JToggleButton onion2;
    JToggleButton onion3;

    JPanel section2;

    JPanel noriPanel;
    JLabel noriLabel;
    ButtonGroup noriGroup;
    JToggleButton nori1;
    JToggleButton nori2;

    JPanel chashuPanel;
    JLabel chashuLabel;
    ButtonGroup chashuGroup;
    JToggleButton chashu1;
    JToggleButton chashu2;

    JPanel eggPanel;
    JLabel eggLabel;
    ButtonGroup eggGroup;
    JToggleButton egg1;
    JToggleButton egg2;

    JPanel section3;
    JLabel spiceLabel;
    ButtonGroup spiceGroup;
    JToggleButton spice1;
    JToggleButton spice2;
    JToggleButton spice3;
    JToggleButton spice4;
    JToggleButton spice5;

    public Compulsory(LayoutManager layoutManager){
        //section1
        //soup
        soup1 = new JToggleButton("Tonkotsu");
        soup2 = new JToggleButton("Shoyu");
        soup3 = new JToggleButton("Shio");

        soupGroup = new ButtonGroup();
        soupGroup.add(soup1);
        soupGroup.add(soup2);
        soupGroup.add(soup3);
        soup1.setSelected(true);

        soupLabel = new JLabel("Soup:");
        soupPanel = new JPanel(new GridLayout(1, 4));
        soupPanel.add(soupLabel);
        soupPanel.add(soup1);
        soupPanel.add(soup2);
        soupPanel.add(soup3);

        //noodles
        noodles1 = new JToggleButton("Soft");
        noodles2 = new JToggleButton("Medium");
        noodles3 = new JToggleButton("Firm");

        noodlesGroup = new ButtonGroup();
        noodlesGroup.add(noodles1);
        noodlesGroup.add(noodles2);
        noodlesGroup.add(noodles3);
        noodles1.setSelected(true);

        noodlesLabel = new JLabel("Noodles:");
        noodlesPanel = new JPanel(new GridLayout(1, 4));
        noodlesPanel.add(noodlesLabel);
        noodlesPanel.add(noodles1);
        noodlesPanel.add(noodles2);
        noodlesPanel.add(noodles3);

        //onion
        onion1 = new JToggleButton("No Please!");
        onion2 = new JToggleButton("Just a little");
        onion3 = new JToggleButton("A lot!");

        onionGroup = new ButtonGroup();
        onionGroup.add(onion1);
        onionGroup.add(onion2);
        onionGroup.add(onion3);
        onion1.setSelected(true);

        onionLabel = new JLabel("Spring onion:");
        onionPanel = new JPanel(new GridLayout(1,4));
        onionPanel.add(onionLabel);
        onionPanel.add(onion1);
        onionPanel.add(onion2);
        onionPanel.add(onion3);

        section1 = new JPanel(new GridLayout(3,1));
        section1.add(soupPanel);
        section1.add(noodlesPanel);
        section1.add(onionPanel);

        //section2
        //Nori
        noriLabel = new JLabel("Nori:");

        nori1 = new JToggleButton("Yes");
        nori2 = new JToggleButton("No");

        noriGroup = new ButtonGroup();
        noriGroup.add(nori1);
        noriGroup.add(nori2);
        nori2.setSelected(true);

        noriPanel = new JPanel(new GridLayout(1,3));
        noriPanel.add(noriLabel);
        noriPanel.add(nori1);
        noriPanel.add(nori2);
        //Chashu
        chashuLabel = new JLabel("Chashu:");

        chashu1 = new JToggleButton("Yes");
        chashu2 = new JToggleButton("No");

        chashuGroup = new ButtonGroup();
        chashuGroup.add(chashu1);
        chashuGroup.add(chashu2);
        chashu2.setSelected(true);

        chashuPanel = new JPanel(new GridLayout(1,3));
        chashuPanel.add(chashuLabel);
        chashuPanel.add(chashu1);
        chashuPanel.add(chashu2);
        //Boiled egg
        eggLabel = new JLabel("Boiled egg:");

        egg1 = new JToggleButton("Yes");
        egg2 = new JToggleButton("No");

        eggGroup = new ButtonGroup();
        eggGroup.add(egg1);
        eggGroup.add(egg2);
        egg2.setSelected(true);

        eggPanel = new JPanel(new GridLayout(1,3));
        eggPanel.add(eggLabel);
        eggPanel.add(egg1);
        eggPanel.add(egg2);

        section2 = new JPanel(new GridLayout(3, 1));
        section2.add(noriPanel);
        section2.add(chashuPanel);
        section2.add(eggPanel);

        //section3
        //spice
        spiceLabel = new JLabel("Spiciness:");
        spiceLabel.setOpaque(false);
        spiceLabel.setBackground(Color.RED);
        spiceLabel.setBackground(Color.WHITE);

        spice1 = new JToggleButton("1");
        spice2 = new JToggleButton("2");
        spice3 = new JToggleButton("3");
        spice4 = new JToggleButton("4");
        spice5 = new JToggleButton("5");

        spiceGroup = new ButtonGroup();
        spiceGroup.add(spice1);
        spiceGroup.add(spice2);
        spiceGroup.add(spice3);
        spiceGroup.add(spice4);
        spiceGroup.add(spice5);
        spice1.setSelected(true);

        section3 = new JPanel(new GridLayout(1,6));
        section3.add(spiceLabel);
        section3.add(spice1);
        section3.add(spice2);
        section3.add(spice3);
        section3.add(spice4);
        section3.add(spice5);

        //Border Style
        section1.setBorder(BorderFactory.createEtchedBorder());
        section2.setBorder(BorderFactory.createEtchedBorder());
        section3.setBorder(BorderFactory.createEtchedBorder());

        this.add(section1);
        this.add(section2);
        this.add(section3);
    }
}
