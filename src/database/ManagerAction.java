package database;

import database.information.Menu;

import java.sql.SQLOutput;

/**
 * @author Huang
 * @version 1.0
 */
public class ManagerAction {

    MenuData menuData = new MenuData();
    Menu menu = menuData.loadInfo();

    public void changeLocationMenuData(int row, int column, double price){
        if(column == 1){
            if(price <= 0){
                System.out.println("Error: The price you input is below 0.");
                return;
            }
            switch (row){
                case 1:
                    menu.setNoodle(price);
                    break;
                case 2:
                    menu.setNori(price);
                    break;
                case 3:
                    menu.setEgg(price);
                    break;
                case 4:
                    menu.setChashu(price);
                    break;
                case 5:
                    menu.setShoot(price);
                    break;
                default:
                    System.out.println("Error: No such data.");
                    break;
            }
        }else if(column == 2){
            switch (row){
                case 2:
                    menu.setNoriAvailable(!menu.isNoriAvailable());
                    break;
                case 3:
                    menu.setEggAvailable(!menu.isEggAvailable());
                    break;
                case 4:
                    menu.setChashuAvailable(!menu.isChashuAvailable());
                    break;
                case 5:
                    menu.setShootAvailable(!menu.isShootAvailable());
                    break;
                default:
                    System.out.println("Error: No such data.");
                    break;
            }
        }else {
            System.out.println("Error: No such column.");
        }
        menuData.saveInfo(menu);
    }

    public static void main(String[] args) {
        ManagerAction managerAction = new ManagerAction();
        managerAction.changeLocationMenuData(2,2,9.9);
    }
}
