package gui.management;

import database.MenuData;
import database.information.Menu;
import gui.AlertWindow;

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
            setChangeMenu();
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

        {
            changeMenu.confirm.addActionListener(e ->{

                double noodle, nori, egg, chashu, shoot;
                String noodleCast, noriCast, eggCast, chashuCast, shootCast;
                noodleCast = String.valueOf(changeMenu.noodlePrice.getValue());
                noriCast = String.valueOf(changeMenu.noriPrice.getValue());
                eggCast = String.valueOf(changeMenu.eggPrice.getValue());
                chashuCast = String.valueOf(changeMenu.chashuPrice.getValue());
                shootCast = String.valueOf(changeMenu.shootPrice.getValue());

                noodle = Double.parseDouble(noodleCast);
                nori = Double.parseDouble(noriCast);
                egg = Double.parseDouble(eggCast);
                chashu = Double.parseDouble(chashuCast);
                shoot = Double.parseDouble(shootCast);

                if(noodle<=0||nori<=0||egg<=0||chashu<=0||shoot<=0){
                    System.out.println("Each value must larger than 0.");
                    try {
                        new AlertWindow("The price can not be lower than 0.");
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                else {
                    menu.setNori(nori);
                    menu.setNoodle(noodle);
                    menu.setShoot(shoot);
                    menu.setChashu(chashu);
                    menu.setEgg(egg);

                    if(changeMenu.noriAvailable.isSelected()){
                        menu.setNoriAvailable(true);
                    }else {
                        menu.setNoriAvailable(false);
                    }

                    if(changeMenu.eggAvailable.isSelected()){
                        menu.setEggAvailable(true);
                    }else {
                        menu.setEggAvailable(false);
                    }

                    if(changeMenu.chashuAvailable.isSelected()){
                        menu.setChashuAvailable(true);
                    }else {
                        menu.setChashuAvailable(false);
                    }

                    if(changeMenu.shootAvailable.isSelected()){
                        menu.setShootAvailable(true);
                    }else {
                        menu.setShootAvailable(false);
                    }

                    menuData.saveInfo(menu);
                    setChangeMenu();
                    card.show(main, "check");
                }


            });
        }

        this.add(main);
    }

    public void setChangeMenu(){
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
    }
}
