package database.entity;

/**
 * This is the Entity Class for Order. This class used to store the information about user's order.
 * @author Zixuan Zhang
 */
public class Order extends DataType{

    private String orderId;
    private String date;
    private Cuisine cuisine;
    /**
     *    0 represents eat in, 1 represents take away
     */
    private int eatType;
    private double eatMoney;
    private String payingMethod;

    private String membershipId;
    private double amountMoney;
    private String billId;
    final private double outMoney = 1.0;

    /**
     * The first constructor used to read information from database and store it into an initialization
     * @param orderId the id for this order
     * @param date the order finishing date
     * @param cuisine the cuisine class
     * @param eatType the eat type for user
     * @param membershipId the id for member
     * @param amountMoney the total money cost
     * @param billId the bill id for this order
     * @param payingMethod the paying method for user
     */
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

    /**
     * This constructor used when person finishing one order. To initialize a totally new order.
     *@param orderId the id for this order
     * @param date the order finishing date
     * @param cuisine the cuisine class
     * @param eatType the eat type for user
     * @param membershipId the id for member
     * @param billId the bill id for this order
     */
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

    public String getPayingMethod() {
        return payingMethod;
    }

    public void setPayingMethod(String payingMethod) {
        this.payingMethod = payingMethod;
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

    /**
     * Arrange the information into a csv format.
     * @return the string of csv format
     */
    @Override
    public String toString() {
        return orderId + "," + date + "," + cuisine + "," + eatType + "," + membershipId + "," + amountMoney + "," +
                amountMoney + "," + billId + "," + payingMethod;
    }

}
