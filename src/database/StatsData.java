package database;

/**
 * @author cyz
 * @version 1.0
 */

import database.information.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class StatsData extends BaseData {
    private final String addr = "data/order.csv";
    public ArrayList<Stats> stat = new ArrayList<Stats>();
    @Override
    public StatsList loadInfo() {
        File file = new File(addr);
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((contents = reader.readLine())!=null){
                String[] attributes = contents.split(",");
                Stats stats = new Stats(attributes[2], attributes[3], attributes[4], Boolean.parseBoolean(attributes[5]),
                        Boolean.parseBoolean(attributes[6]), Boolean.parseBoolean(attributes[7]), Integer.parseInt(attributes[8]),
                        Integer.parseInt(attributes[9]), Integer.parseInt(attributes[10]), Integer.parseInt(attributes[11]), Integer.parseInt(attributes[12]), Integer.parseInt(attributes[13]));
                //todo problems occurred with below code
                stat.add(stats);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("The necessary file has been broken, please re-install.");
            System.exit(-1);
        }

        return new StatsList(stat);
    }

    @Override
    public void saveInfo(DataType dataType) {

    }
}
