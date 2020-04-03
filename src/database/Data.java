/**
 * @version Iteration1
 * @author ZixuanZhang
 * @content Create all the attributes and getters, setters
 * @Todo
 */


package database;

import java.io.*;
import java.util.ArrayList;

import database.information.*;

public class Data {
    private final String userAddr = "data/membership.csv";
    private final String orderAddr = "data/order.csv";
    private final String menuAddr = "data/menu.csv";
    private final String receiptAddr = "data/receipt.txt";

    private String contents = "";
    //readers
    public MemberList loadUserInfo(){
        ArrayList<Membership> memberships = new ArrayList<Membership>();
        File file = new File(userAddr);
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((contents = reader.readLine())!=null){
                String[] attributes = contents.split(",");
                Membership membership = new Membership(attributes[0],attributes[1],attributes[2],attributes[3],
                        attributes[4], Integer.parseInt(attributes[5]));
                memberships.add(membership);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("The necessary file has been broken, please re-install.");
            System.exit(-1);
        }
        return new MemberList(memberships);
    }

    public OrderList loadOrderInfo(){
        ArrayList<Order> orders = new ArrayList<Order>();
        File file = new File(orderAddr);
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

    public void loadMenuInfo(){

    }

    //writers
    public void saveUserInfo(MemberList memberList){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(userAddr));
            for(Membership membership:memberList.getMsl()){
                writer.write(String.valueOf(membership));
                writer.newLine();
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveOrderInfo(OrderList orderList){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(userAddr));
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

    public void saveMenuInfo(){

    }

    public void saveReceipt(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(receiptAddr));
            Cuisine receipt = new Cuisine("Shio", "Soft", "No please", false, true, false,5,0,2,1,3);
            writer.write(receipt.printReceipt());
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
