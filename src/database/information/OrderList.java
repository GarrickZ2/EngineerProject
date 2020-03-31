package database.information;

import database.OrderData;

import java.util.ArrayList;

/**
 * @author Zixuan Zhang
 */
public class OrderList extends DataType{
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
        OrderData orderData = new OrderData();
        orderData.saveInfo(this);
    }



}
