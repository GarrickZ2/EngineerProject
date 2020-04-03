package database.information;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {


    public Order(Cuisine cuisine, int eatType, String membershipId) {
        this.cuisine = cuisine;
        this.eatType = eatType;
        this.membershipID = membershipId;
    }

    public Order(String orderId, Date date, Cuisine cuisine, int eatType, String membershipId,
                 String billId) {
        this.orderID = orderId;
        this.date = date;
        this.cuisine = cuisine;
        this.eatType = eatType;
        this.membershipID = membershipId;
        this.amountMoney = cuisine.calculate() + outMoney*eatType;
        this.billID = billId;
    }

    public Order(String orderID, String date, Cuisine cuisine, int eatType,
                 String membershipID, double eatMoney, String billID) {

    }

    public Order(String orderID, String date, Cuisine cuisine, int eatType,
                 String membershipID, double eatMoney, double accountMoney, String billID) {
    }

    private String orderID;
    private Date date;
    private Cuisine cuisine;
    //0 represents eating indoor, 1 represents eating outdoor
    private int eatType;
    private double eatMoney;

    private String membershipID;
    private double amountMoney;
    private String billID;
    private double outMoney = 1.0;




    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Cuisine getCuisine() {
        return cuisine;
    }

    public void setCuisine(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    public int getEatType() {
        return eatType;
    }

    public void setEatType(int eatType) {
        this.eatType = eatType;
    }

    public String getMembershipID() {
        return membershipID;
    }

    public void setMembershipID(String membershipID) {
        this.membershipID = membershipID;
    }

    public double getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(double amountMoney) {
        this.amountMoney = amountMoney;
    }

    public String getBillID() {
        return billID;
    }

    public void setBillID(String billID) {
        this.billID = billID;
    }

    @Override
    public String toString() {
        return orderID + "," + date + "," + cuisine + "," + eatType + "," + membershipID + "," + amountMoney + "," +
                amountMoney + "," + billID;
    }

}
