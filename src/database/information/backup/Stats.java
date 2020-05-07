package database.information.backup;

import database.information.Cuisine;

/**
 * @author cyz
 * @version 1.0
 */

public class Stats {
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



    public Stats(String soupType, String noodleType, String onionType, boolean nori, boolean chashu, boolean egg,
                   int spiciness, int extraNori, int extraEgg, int extraShoot, int extraChashu, int eatType) {
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
        this.eatType = eatType;
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

    public void setEatTypeType(int eatType) {
        this.eatType = eatType;
    }

    public int getEatType() {
        return eatType;
    }
}
