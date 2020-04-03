package gui.management;

import database.MenuData;
import database.information.Menu;

import javax.swing.*;
import java.awt.*;

/**
 * @author Zixuan Zhang
 */
public class ManageIndex extends JPanel {
    MenuData menuData = new MenuData();
    Menu menu;

    CardLayout card;
    JPanel main;

    public ManageSelect manageSelect;
    CheckMenu checkMenu;
    ChangeMenu changeMenu;
    public ManageIndex(){
        menu = menuData.loadInfo();
        card = new CardLayout();
        main = new JPanel(card);
        manageSelect = new ManageSelect();
        checkMenu = new CheckMenu();
        changeMenu = new ChangeMenu();

        main.add(manageSelect, "select");
        main.add(checkMenu, "check");
        main.add(changeMenu, "change");

        manageSelect.checkMenu.addActionListener(e -> {
            checkMenu.noodlePrice.setText("$" + menu.getNoodle());
            checkMenu.noriPrice.setText("$" + menu.getNori());
            checkMenu.eggPrice.setText("$" + menu.getEgg());
            checkMenu.chashuPrice.setText("$" + menu.getChashu());
            checkMenu.shootPrice.setText("$" + menu.getChashu());
            if(menu.isNoriAvailable()){
                checkMenu.noriAvailable.setText("Available");
            }else {
                checkMenu.noriAvailable.setText("Unavailable");
            }
            if(menu.isChashuAvailable()){
                checkMenu.chashuAvailable.setText("Available");
            }else {
                checkMenu.chashuAvailable.setText("Unavailable");
            }
            if(menu.isShootAvailable()){
                checkMenu.shootAvailable.setText("Available");
            }else {
                checkMenu.shootAvailable.setText("Unavailable");
            }
            if(menu.isEggAvailable()){
                checkMenu.eggAvailable.setText("Available");
            }else {
                checkMenu.eggAvailable.setText("Unavailable");
            }
            card.show(main, "check");
        });

        checkMenu.change.addActionListener(e -> {
            changeMenu.noodlePrice.setValue(menu.getNoodle());
            changeMenu.noriPrice.setValue(menu.getNori());
            changeMenu.eggPrice.setValue(menu.getEgg());
            changeMenu.chashuPrice.setValue(menu.getChashu());
            changeMenu.shootPrice.setValue(menu.getChashu());
            if(menu.isNoriAvailable()){
                changeMenu.noriAvailable.setSelected(true);
            }else {
                changeMenu.noriUnavailable.setSelected(true);
            }
            if(menu.isChashuAvailable()){
                changeMenu.chashuAvailable.setSelected(true);
            }else {
                changeMenu.chashuUnavailable.setSelected(true);
            }
            if(menu.isShootAvailable()){
                changeMenu.shootAvailable.setSelected(true);
            }else {
                changeMenu.shootUnavailable.setSelected(true);
            }
            if(menu.isEggAvailable()){
                changeMenu.eggAvailable.setSelected(true);
            }else {
                changeMenu.eggUnavailable.setSelected(true);
            }
            card.show(main, "change");
        });
        checkMenu.back.addActionListener(e -> card.show(main, "select"));

        changeMenu.back.addActionListener(e -> card.show(main, "check"));
        //TODO changeMenu.confirm


        this.add(main);
    }
}
