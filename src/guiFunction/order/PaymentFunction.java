package guiFunction.order;

import gui.order.Payment;

import javax.swing.*;
import java.awt.*;

public class PaymentFunction extends JPanel {
    Payment payment;
    public PaymentFunction(){
        payment = new Payment();



        this.setLayout(new BorderLayout());
        this.add(payment);
    }
}
