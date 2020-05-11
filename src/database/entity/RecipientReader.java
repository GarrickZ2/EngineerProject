package database.entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class RecipientReader {
    private double noodle;
    private double nori;
    private double egg;
    private double shoot;
    private double chashu;
    private double noodlePrice;
    private double noriPrice;
    private double eggPrice;
    private double shootPrice;
    private double chashuPrice;
    private double noodleTotalPrice;
    private double noriTotalPrice;
    private double eggTotalPrice;
    private double shootTotalPrice;
    private double chashuTotalPrice;
    private String payingMethod;

    public RecipientReader(String recipientsName) throws Exception{
        File file = new File("data/recipients/"+ recipientsName +".txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        boolean flag = true;
        int lineNum = 0;
        while (flag){
            String line = reader.readLine();
            if (line == null){
                break;
            }else {
                lineNum++;
                if (lineNum==7){
                    this.noodle = Double.parseDouble(line.substring(46,57));
                    this.noodlePrice = Double.parseDouble(line.substring(58,69));
                    this.noodleTotalPrice = Double.parseDouble(line.substring(70,81));
                }
                if (lineNum==8){
                    this.nori =Double.parseDouble(line.substring(46,57));
                    this.noriPrice = Double.parseDouble(line.substring(58,69));
                    this.noriTotalPrice = Double.parseDouble(line.substring(70,81));
                }
                if (lineNum==9){
                    this.egg =Double.parseDouble(line.substring(46,57));
                    this.eggPrice = Double.parseDouble(line.substring(58,69));
                    this.eggTotalPrice = Double.parseDouble(line.substring(70,81));
                }
                if (lineNum==10){
                    this.shoot =Double.parseDouble(line.substring(46,57));
                    this.shootPrice = Double.parseDouble(line.substring(58,69));
                    this.shootTotalPrice = Double.parseDouble(line.substring(70,81));
                }
                if (lineNum==11){
                    this.chashu =Double.parseDouble(line.substring(46,57));
                    this.chashuPrice = Double.parseDouble(line.substring(58,69));
                    this.chashuTotalPrice = Double.parseDouble(line.substring(70,81));
                }
                if (lineNum==14){
                    this.payingMethod = line.substring(70,81);
                }
            }
        }
    }
    public double getNoodle() {
        return noodle;
    }

    public void setNoodle(double noodle) {
        this.noodle = noodle;
    }

    public double getNori() {
        return nori;
    }

    public void setNori(double nori) {
        this.nori = nori;
    }

    public double getEgg() {
        return egg;
    }

    public void setEgg(double egg) {
        this.egg = egg;
    }

    public double getShoot() {
        return shoot;
    }

    public void setShoot(double shoot) {
        this.shoot = shoot;
    }

    public double getChashu() {
        return chashu;
    }

    public void setChashu(double chashu) {
        this.chashu = chashu;
    }

    public double getNoodlePrice() {
        return noodlePrice;
    }

    public double getNoriPrice() {
        return noriPrice;
    }

    public double getEggPrice() {
        return eggPrice;
    }

    public double getShootPrice() {
        return shootPrice;
    }

    public double getChashuPrice() {
        return chashuPrice;
    }

    public double getNoodleTotalPrice() { return noodleTotalPrice; }

    public double getNoriTotalPrice() {
        return noriTotalPrice;
    }

    public double getEggTotalPrice() {
        return eggTotalPrice;
    }

    public double getShootTotalPrice() {
        return shootTotalPrice;
    }

    public double getChashuTotalPrice() {
        return chashuTotalPrice;
    }

    public String getPayingMethod() {
        return payingMethod;
    }

    public static void main(String[] args) throws Exception{
        RecipientReader recipientReader = new RecipientReader("20200503172956");
        System.out.println(recipientReader.getNoodle());
        System.out.println(recipientReader.getNoodlePrice());
        System.out.println(recipientReader.getNoodleTotalPrice());
        System.out.println(recipientReader.getNori());
        System.out.println(recipientReader.getEgg());
        System.out.println(recipientReader.getShoot());
        System.out.println(recipientReader.getChashu());
        System.out.println(recipientReader.getPayingMethod());
    }
}
