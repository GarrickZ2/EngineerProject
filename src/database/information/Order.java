package database.information;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {


    public Order(Cuisine cuisine, int eatType, String membershipID) {
        this.cuisine = cuisine;
        this.eatType = eatType;
        this.membershipID = membershipID;
    }

    public Order(String orderID, String date, Cuisine cuisine, int eatType, String membershipID,
                 double amountMoney, String billID) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.orderID = orderID;
        try {
            this.date = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.cuisine = cuisine;
        this.eatType = eatType;
        this.membershipID = membershipID;
        this.amountMoney = amountMoney;
        this.billID = billID;
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
