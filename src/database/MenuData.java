package database;


import database.information.DataType;
import database.information.Menu;

/**
 * @author Zixuan Zhang
 */
public class MenuData extends BaseData{
    private final String addr = "data/menu.csv";

    @Override
    public Menu loadInfo() {
        return null;
    }

    @Override
    public void saveInfo(DataType dataType) {
        Menu menu = (Menu)dataType;
    }
}
