package database.interaction;

import database.entity.Cuisine;
import database.entity.DataType;
import database.entity.Order;
import database.entityList.OrderList;

import java.io.*;
import java.util.ArrayList;

/**
 * OrderData Class, a type of BaseData, used to access to order.csv
 * @author Zixuan Zhang
 */
public class OrderData extends BaseData {
    private final String addr = "data/order.csv";
    public ArrayList<Order> orders = new ArrayList<Order>();

    /**
     * load information from order.csv
     * @return OrderList Class store all the information of order
     */
    @Override
    public OrderList loadInfo() {
        File file = new File(addr);
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((contents = reader.readLine())!=null){
                String[] attributes = contents.split(",");
                Cuisine cuisine = new Cuisine(attributes[2], attributes[3], attributes[4], Boolean.parseBoolean(attributes[5]),
                        Boolean.parseBoolean(attributes[6]), Boolean.parseBoolean(attributes[7]), Integer.parseInt(attributes[8]),
                        Integer.parseInt(attributes[9]), Integer.parseInt(attributes[10]), Integer.parseInt(attributes[11]), Integer.parseInt(attributes[12]));
                //todo problems occurred with below code

                Order order = new Order(attributes[0], attributes[1], cuisine, Integer.parseInt(attributes[13]),
                        attributes[14], Double.parseDouble(attributes[16]), attributes[17], attributes[18]);
                orders.add(order);
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("The necessary file has been broken, please re-install.");
            System.exit(-1);
        }
        return new OrderList(orders);
    }

    /**
     * Save all the information of OrderList.
     * @param dataType Input the DataType which you want to store.
     */
    @Override
    public void saveInfo(DataType dataType) {
        OrderList orderList = (OrderList)dataType;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(addr));
            for(Order order:orderList.getOrders()){
                writer.write(String.valueOf(order));
//                writer.newLine();
                String ip = "new Order()";
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
