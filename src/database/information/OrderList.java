package database.information;

import com.alee.managers.animation.easing.Back;
import database.Data;
import database.OrderData;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

    public void createOrder(Cuisine cuisine, int eatType, String membershipId){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddkkmm");
        String billId = format.format(date);
        int temp = Integer.parseInt(billId);
        String orderId = Integer.toHexString(temp);
        Order order = new Order(orderId, date, cuisine, eatType, membershipId, billId);
        orders.add(order);
    }

    public void save(){
        OrderData orderData = new OrderData();
        orderData.saveInfo(this);
    }


}
