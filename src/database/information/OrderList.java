package database.information;

import database.OrderData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Zixuan Zhang
 */
public class OrderList extends DataType{

    Date date;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
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

        Order order = new Order(generateOrderId("orderId"), dateFormat.format(new Date()), cuisine, eatType,
                membershipId, generateOrderId("billId"));
        orders.add(order);
    }

    public String generateOrderId(String select){
        date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddkkmmss");
        String billId = format.format(date);
        long temp = Long.parseLong(billId);
        if(select == "orderId"){
            return Long.toHexString(temp);
        }
        if(select == "billId"){
            return billId;
        }
        else {
            return "Error: Invalid selection.";
        }

    }

    public void save(){
        OrderData orderData = new OrderData();
        orderData.saveInfo(this);
    }
}
