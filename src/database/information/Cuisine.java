package database.information;

import database.MenuData;

import java.util.Date;

/**
 * @author Huang
 * @version 1.0
 * @author Zixuan Zhang
 * @version 1.1
 */
public class Cuisine {
    private String soupType;
    private String noodleType;
    private String onionType;

    private boolean nori;

    private boolean chashu;
    private boolean egg;

    private int spiciness;

    private int extraNori;
    private int extraEgg;
    private int extraShoot;
    private int extraChashu;

    private String orderID;
    private String date;
    private Cuisine cuisine;
    //0 represents eating indoor, 1 represents eating outdoor
    private int eatType;

    private String membershipID;
    private double amountMoney;
    private String billID;



    public Cuisine(String soupType, String noodleType, String onionType, boolean nori, boolean chashu, boolean egg,
                   int spiciness, int extraNori, int extraEgg, int extraShoot, int extraChashu) {
        this.soupType = soupType;
        this.noodleType = noodleType;
        this.onionType = onionType;
        this.nori = nori;
        this.chashu = chashu;
        this.egg = egg;
        this.spiciness = spiciness;
        this.extraNori = extraNori;
        this.extraEgg = extraEgg;
        this.extraShoot = extraShoot;
        this.extraChashu = extraChashu;
    }

    public String getSoupType() {
        return soupType;
    }

    public void setSoupType(String soupType) {
        this.soupType = soupType;
    }

    public String getNoodleType() {
        return noodleType;
    }

    public void setNoodleType(String noodleType) {
        this.noodleType = noodleType;
    }

    public String getOnionType() {
        return onionType;
    }

    public void setOnionType(String onionType) {
        this.onionType = onionType;
    }

    public boolean isNori() {
        return nori;
    }

    public void setNori(boolean nori) {
        this.nori = nori;
    }

    public boolean isChashu() {
        return chashu;
    }

    public void setChashu(boolean chashu) {
        this.chashu = chashu;
    }

    public boolean isEgg() {
        return egg;
    }

    public void setEgg(boolean egg) {
        this.egg = egg;
    }

    public int getSpiciness() {
        return spiciness;
    }

    public void setSpiciness(int spiciness) {
        this.spiciness = spiciness;
    }

    public int getExtraNori() {
        return extraNori;
    }

    public void setExtraNori(int extraNori) {
        this.extraNori = extraNori;
    }

    public int getExtraEgg() {
        return extraEgg;
    }

    public void setExtraEgg(int extraEgg) {
        this.extraEgg = extraEgg;
    }

    public int getExtraShoot() {
        return extraShoot;
    }

    public void setExtraShoot(int extraShoot) {
        this.extraShoot = extraShoot;
    }

    public int getExtraChashu() {
        return extraChashu;
    }

    public void setExtraChashu(int extraChashu) {
        this.extraChashu = extraChashu;
    }

    @Override
    public String toString() {
        return soupType + "," + noodleType + "," +onionType + "," +nori + "," +chashu + "," +
                egg + "," +spiciness + "," +extraNori + "," +extraEgg + "," +extraShoot + "," +extraChashu;
    }

    public String printReceipt(){
        Cuisine a = new Cuisine("Shio", "Soft", "No please", true, false, false,5,0,2,1,3);
        Order order = new Order("123", new Date(), a, 1, "123", "212");

        String type =this.soupType + "," + this.noodleType + "," + this.onionType;
        if(this.nori){
            type = type + "," + "nori";
        }
        if(this.chashu){
            type = type + "," + "chashu";
        }
        if(this.egg){
            type = type + "," + "egg";
        }
        type = type + "," + this.spiciness;

        return "\t\t\t\t            --Receipt--\r\n"+
                "\r\n" +
                "账单号：" + order.getBillID() + "\r\n"  +
                "开单时间：" + order.getDate() +"\r\n"+
                "结账时间：" + order.getDate() +"\r\n"+
                "会员编号："+ order.getMembershipID() + "\r\n"+
                "---------------------------------------------------------------------------\r\n"+
                "Menu \t\t\t\t\t\t\t                        数量 \t 单价\t  金额\r\n"+
                "Noddles("+ type + ")  \t         1\t     9.9\t  9.9\r\n"+
                "+Nori\t\t\t\t\t\t\t                         "+ this.extraNori + "\t     1.0\t  " + (1.0*this.extraNori) +"\r\n"+
                "+Egg\t\t\t\t\t\t\t                         " + this.extraEgg + "       2.0\t  " + (2.0*this.extraEgg) +"\r\n"+
                "+Shoot\t\t\t\t\t\t\t                         " + this.extraShoot +  "       1.0\t  " + (1.0*this.extraShoot) +"\r\n"+
                "+Chashu\t\t\t\t\t\t\t                         " + this.extraChashu + "       2.0\t  " + (2.0*this.extraChashu) + "\r\n"+
                "----------------------------------------------------------------------------\r\n"+
                "\r\n"+
                "合计\t\t\t\t\t\t\t                " + (1+this.extraNori+this.extraEgg+this.extraShoot+this.extraChashu ) + "     \t\t     "+ (9.9+1.0*this.extraNori+1.0*this.extraEgg+1.0*this.extraShoot+2.0*this.extraChashu) +"\r\n"+
                "\r\n"+
                "银行卡支付\t\t\t\t\t\t\t\t                         "+(9.9+1.0*this.extraNori+1.0*this.extraEgg+1.0*this.extraShoot+2.0*this.extraChashu)+"\r\n"+
                "\r\n"+
                "============================================================================\r\n"+
                "\t\t\t        打印时间：2022-3-14 17：05：23\r\n" +
                "		伦敦市力王区贝克街B15号龙猫拉面 电话： 44 (0) 203 178 4861\r\n";
    }

    public double calculate(){
        MenuData menuData = new MenuData();
        Menu menu = menuData.loadInfo();

        return getExtraChashu()*menu.getChashu() + getExtraEgg()*menu.getEgg() + getExtraNori()*menu.getNori()
                + getExtraShoot()*menu.getShoot() + 1 * menu.getNoodle();
    }
}
