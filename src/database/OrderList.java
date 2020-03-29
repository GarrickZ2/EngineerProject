package database;

import database.information.Cuisine;
import database.information.Order;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Zixuan Zhang
 */
public class OrderList {
    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    private ArrayList<Order> orders;

    public OrderList(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void createOrders(String orderId, String date, Cuisine cuisine, int eatType, String membershipId,
                             double amountMoney, String billId){
        Order order = new Order(orderId, date, cuisine, eatType, membershipId, amountMoney, billId);
        orders.add(order);
    }

    public void save(){
        Data date = new Data();
        date.saveOrderInfo(this);
    }



}
