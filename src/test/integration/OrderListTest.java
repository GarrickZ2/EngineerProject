package test.integration;

import database.entity.Cuisine;
import database.entityList.OrderList;
import org.junit.Test;

/**
 * @author H
 */
public class OrderListTest {

    OrderList ol = new OrderList();
    Cuisine c = new Cuisine("Tonkotsu","soft","no please",
            true,true,true, 1,2,1,2,3);
    @Test
    public void testGenerate(){
        System.out.println(ol.generateOrderId("billId"));
        System.out.println(ol.generateOrderId("orderId"));
        System.out.println(ol.generateOrderId("xx"));
    }
    @Test
    public void testCreate(){
        ol.createOrder(c,1,"00000001");
        System.out.println(ol.getOrders());
    }

}
