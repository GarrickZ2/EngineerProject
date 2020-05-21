package database.entityList;

import database.interaction.OrderData;
import database.entity.Cuisine;
import database.entity.DataType;
import database.entity.Order;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * OrderList Class, a type of DataType, used to store all the information of OrderList.
 * @author Zixuan Zhang
 */
public class OrderList extends DataType {

    Date date;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
    private ArrayList<Order> orders;
    OrderData orderData = new OrderData();

    /**
     * A construct input the order list and initialize a new Order List Class
     * @param orders the ArrayList Orders
     */
    public OrderList(ArrayList<Order> orders) {
        this.orders = orders;
    }

    /**
     * A construct load data from database
     */
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

    /**
     * Create a new order for users
     * @param cuisine the cuisine class
     * @param eatType the eat type of user
     * @param membershipId the id of member
     */
    public void createOrder(Cuisine cuisine, int eatType, String membershipId){

        Order order = new Order(generateOrderId("orderId"), dateFormat.format(new Date()), cuisine, eatType,
                membershipId, generateOrderId("billId"));
        orders.add(order);
    }

    /**
     * Automatically generate the id for this order
     * @param select "orderId" means generate a order id, "billId" means generate a bill id
     * @return the id generated
     */
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

    /**
     * Save the information of orders into the database.
     */
    public void save(){
        orderData.saveInfo(this);
    }
}
