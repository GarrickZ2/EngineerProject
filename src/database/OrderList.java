package database;

import database.information.Order;

import java.util.ArrayList;
import java.util.Date;

public class OrderList {
    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    private ArrayList<Order> orders = new ArrayList<Order>();

    Date date = new Date();

    public OrderList(ArrayList<Order> orders) {
        this.orders = orders;
    }


}
