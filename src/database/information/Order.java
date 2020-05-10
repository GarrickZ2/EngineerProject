package database.information;


public class Order {

    private String orderId;
    private String date;
    private Cuisine cuisine;
    //0 represents eat in, 1 represents take away
    private int eatType;
    private double eatMoney;

    private String membershipId;
    private double amountMoney;
    private String billId;
    final private double outMoney = 1.0;

    public String getPayingMethod() {
        return payingMethod;
    }

    public void setPayingMethod(String payingMethod) {
        this.payingMethod = payingMethod;
    }

    private String payingMethod;

    public Order(Cuisine cuisine, int eatType, String membershipId) {
        this.cuisine = cuisine;
        this.eatType = eatType;
        this.membershipId = membershipId;
    }

    public Order(String orderId, String date, Cuisine cuisine, int eatType, String membershipId,
                 double amountMoney, String billId, String payingMethod) {
        this.orderId = orderId;
        this.date = date;
        this.cuisine = cuisine;
        this.eatType = eatType;
        this.eatMoney = cuisine.calculate();
        this.membershipId = membershipId;
        this.amountMoney = amountMoney;
        this.billId = billId;
        this.payingMethod = payingMethod;
    }

    public Order(String orderId, String date, Cuisine cuisine, int eatType, String membershipId,
                 String billId) {
        this.orderId = orderId;
        this.date = date;
        this.cuisine = cuisine;
        this.eatType = eatType;
        this.eatMoney = cuisine.calculate();
        this.membershipId = membershipId;
        this.amountMoney = eatMoney + outMoney*eatType;
        this.billId = billId;
        this.payingMethod = null;
    }


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    public double getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(double amountMoney) {
        this.amountMoney = amountMoney;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    @Override
    public String toString() {
        return orderId + "," + date + "," + cuisine + "," + eatType + "," + membershipId + "," + amountMoney + "," +
                amountMoney + "," + billId + "," + payingMethod;
    }

}
