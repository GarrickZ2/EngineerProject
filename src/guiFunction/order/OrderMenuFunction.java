package guiFunction.order;

import gui.order.OrderMenu;

import javax.swing.*;
import java.awt.*;

public class OrderMenuFunction extends JPanel {

    OrderMenu orderMenu;
    public OrderMenuFunction(){
        orderMenu = new OrderMenu();




        this.setLayout(new BorderLayout());
        this.add(orderMenu);
    }
}
