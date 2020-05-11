package database.entityList;

import database.interaction.OrderData;
import database.entity.Cuisine;
import database.entity.DataType;
import database.entity.Order;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Zixuan Zhang
 */
public class OrderList extends DataType {

    Date date;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
    private ArrayList<Order> orders;
    OrderData orderData = new OrderData();

    public OrderList(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public OrderList(){
        orderData.loadInfo();
        orders = orderData.orders;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void createOrder(Cuisine cuisine, int eatType, String membershipId){

        Order order = new Order(generateOrderId("orderId"), dateFormat.format(new Date()), cuisine, eatType,
                membershipId, generateOrderId("billId"));
        orders.add(order);
    }

    public String generateOrderId(String select){
        date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddkkmmss");
        String billId = format.format(date);
        long temp = Long.parseLong(billId);
        if("orderId".equals(select)){
            return Long.toHexString(temp);
        }
        if("billId".equals(select)){
            return billId;
        }
        else {
            return "Error: Invalid selection.";
        }
    }

    public void save(){
        orderData.saveInfo(this);
    }
}
