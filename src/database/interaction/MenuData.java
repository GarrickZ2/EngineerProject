package database.interaction;


import database.entity.DataType;
import database.entity.Menu;

import java.io.*;

/**
 * @author Zixuan Zhang
 */
public class MenuData extends BaseData{
    private final String addr = "data/menu.csv";

    @Override
    public Menu loadInfo() {
        Menu menu = new Menu();
        File file = new File(addr);
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));

            contents = reader.readLine();
            String[] attributes = contents.split(",");
            menu.setNoodle(Double.parseDouble(attributes[0]));

            contents = reader.readLine();
            attributes = contents.split(",");
            menu.setNori(Double.parseDouble(attributes[0]));
            menu.setNoriAvailable(Boolean.parseBoolean(attributes[1]));

            contents = reader.readLine();
            attributes = contents.split(",");
            menu.setEgg(Double.parseDouble(attributes[0]));
            menu.setEggAvailable(Boolean.parseBoolean(attributes[1]));

            contents = reader.readLine();
            attributes = contents.split(",");
            menu.setShoot(Double.parseDouble(attributes[0]));
            menu.setShootAvailable(Boolean.parseBoolean(attributes[1]));

            contents = reader.readLine();
            attributes = contents.split(",");
            menu.setChashu(Double.parseDouble(attributes[0]));
            menu.setChashuAvailable(Boolean.parseBoolean(attributes[1]));

            reader.close();
        } catch (Exception e) {
            System.out.println("The necessary file has been broken, please re-install.");
            System.exit(-1);
        }
        return menu;
    }

    @Override
    public void saveInfo(DataType dataType) {
        Menu menu = (Menu)dataType;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(addr));

            writer.write(""+menu.getNoodle());
            writer.newLine();

            writer.write("" + menu.getNori() + "," + menu.isNoriAvailable());
            writer.newLine();

            writer.write("" + menu.getEgg() + "," + menu.isEggAvailable());
            writer.newLine();

            writer.write("" + menu.getShoot() + "," + menu.isShootAvailable());
            writer.newLine();

            writer.write("" + menu.getChashu() + "," + menu.isChashuAvailable());
            writer.newLine();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
