package gui.management;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zixuan Zhang
 */
public class ManageIndex extends JPanel {
    CardLayout card;
    JPanel main;

    public ManageSelect manageSelect;
    CheckMenu checkMenu;
    ChangeMenu changeMenu;
    public ManageIndex(){
        card = new CardLayout();
        main = new JPanel(card);
        manageSelect = new ManageSelect();
        checkMenu = new CheckMenu();
        changeMenu = new ChangeMenu();

        main.add(manageSelect, "select");
        main.add(checkMenu, "check");
        main.add(changeMenu, "change");

        manageSelect.checkMenu.addActionListener(e -> card.show(main, "check"));

        checkMenu.change.addActionListener(e -> card.show(main, "change"));
        checkMenu.back.addActionListener(e -> card.show(main, "select"));

        changeMenu.back.addActionListener(e -> card.show(main, "check"));
        //TODO changeMenu.confirm


        this.add(main);
    }
}
