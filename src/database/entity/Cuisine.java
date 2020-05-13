package database.entity;

import database.interaction.MenuData;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This is Cuisine Class, used to store the information of a cuisine ordered by customer.
 * It provide some getter and setter methods for attributes.
 * And also a calculate method to get the money for this cuisine.
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


    /**
     * Cuisine constructor to initialize a cuisine class. It inputs all the attributes and create the new instance
     * @param soupType The type of soup customer ordered.
     * @param noodleType The type of noodle customer ordered.
     * @param onionType The type pf onion customer ordered.
     * @param nori Whether customer order a nori.
     * @param chashu Whether customer order a chashu.
     * @param egg Whether customer orders a egg.
     * @param spiciness The spiciness customer opt
     * @param extraNori The extra number of Nori customer ordered
     * @param extraEgg The extra number of Egg customer ordered
     * @param extraShoot The extra number of shoot customer ordered
     * @param extraChashu The extra number of Chashu customer ordered
     */
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

    /**
     * getter method for soupType
     * @return String soupType
     */
    public String getSoupType() {
        return soupType;
    }

    /**
     * setter method for SoupType
     * @param soupType String type of soup
     */
    public void setSoupType(String soupType) {
        this.soupType = soupType;
    }

    /**
     * getter method for noodle type
     * @return String noodle
     */
    public String getNoodleType() {
        return noodleType;
    }

    /**
     * setter method for noodle type
     * @param noodleType the type of noodle
     */
    public void setNoodleType(String noodleType) {
        this.noodleType = noodleType;
    }

    /**
     * getter method for onionType
     * @return the type of onion
     */
    public String getOnionType() {
        return onionType;
    }

    /**
     * setter method for onionType
     * @param onionType the type of onion
     */
    public void setOnionType(String onionType) {
        this.onionType = onionType;
    }

    /**
     * get whether customer opt nori
     * @return boolean data
     */
    public boolean isNori() {
        return nori;
    }

    /**
     * setter for Nori
     * @param nori boolean type for nori
     */
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

    /**
     * The override for toString, arrange attributes into an csv file.
     * @return type of String
     */
    @Override
    public String toString() {
        return soupType + "," + noodleType + "," +onionType + "," +nori + "," +chashu + "," +
                egg + "," +spiciness + "," +extraNori + "," +extraEgg + "," +extraShoot + "," +extraChashu;
    }

    /**
     * Calculate the total money of one cuisine
     * @return the total money of
     */
    public double calculate(){
        MenuData menuData = new MenuData();
        Menu menu = menuData.loadInfo();

        return getExtraChashu()*menu.getChashu() + getExtraEgg()*menu.getEgg() + getExtraNori()*menu.getNori()
                + getExtraShoot()*menu.getShoot() + 1 * menu.getNoodle();
    }
}
