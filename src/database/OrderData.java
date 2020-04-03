package database;

import database.information.Cuisine;
import database.information.DataType;
import database.information.Order;
import database.information.OrderList;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Zixuan Zhang
 */
public class OrderData extends BaseData {
    private final String addr = "data/order.csv";

    @Override
    public OrderList loadInfo() {
        ArrayList<Order> orders = new ArrayList<Order>();
        File file = new File(addr);
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((contents = reader.readLine())!=null){
                String[] attributes = contents.split(",");
                Cuisine cuisine = new Cuisine(attributes[2], attributes[3], attributes[4], Boolean.parseBoolean(attributes[5]),
                        Boolean.parseBoolean(attributes[6]), Boolean.parseBoolean(attributes[7]), Integer.parseInt(attributes[8]),
                        Integer.parseInt(attributes[9]), Integer.parseInt(attributes[10]), Integer.parseInt(attributes[11]), Integer.parseInt(attributes[12]));
                //todo problems occurred with below code

                Order order = new Order(attributes[0], attributes[1], cuisine, Integer.parseInt(attributes[3]),
                        attributes[4], Double.parseDouble(attributes[5]), attributes[6]);
                orders.add(order);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("The necessary file has been broken, please re-install.");
            System.exit(-1);
        }
        return new OrderList(orders);
    }

    @Override
    public void saveInfo(DataType dataType) {
        OrderList orderList = (OrderList)dataType;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(addr));
            for(Order order:orderList.getOrders()){
                System.out.println(order);
                writer.write(String.valueOf(order));
                writer.newLine();
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
