package database.entityList;

/**
 * @author cyz
 * @version 1.0
 */

import database.interaction.StatsData;
import database.entity.DataType;
import database.entity.Stats;

import java.util.ArrayList;

public class StatsList extends DataType {
    private ArrayList<Stats> stat;
    StatsData statsData = new StatsData();

    public StatsList(ArrayList<Stats> stat) {
        this.stat = stat;
    }

    public StatsList(){
        statsData.loadInfo();
        stat = statsData.stat;
    }

    public ArrayList<Stats> getStats() {
        return stat;
    }

    public void setStats(ArrayList<Stats> orders) {
        this.stat = stat;
    }

    public int getSouptypeQuantity(String str){
        int a=0;
        String keywords = null;
        if(str == null) {
            keywords = "empty";
        }else {
            keywords = str;
        }
        for(Stats temp: stat) {
            if(temp.getSoupType().equals(keywords)) {
                a++;
            }
        }
        System.out.println("The quantity of SoupType is " + str + ":"+ a);

        return a;
    }

    public int getNoodleTypeQuantity(String str){
        int a=0;
        String keywords = null;
        if(str == null) {
            keywords = "empty";
        }else {
            keywords = str;
        }
        for(Stats temp: stat) {
            if(temp.getNoodleType().equals(keywords)) {
                a++;
            }
        }
        System.out.println("The quantity of NoodleType is " + str + ":"+ a);

        return a;
    }

    public int getOnionTypeQuantity(String str){
        int a=0;
        String keywords = null;
        if(str == null) {
            keywords = "empty";
        }else {
            keywords = str;
        }
        for(Stats temp: stat) {
            if(temp.getOnionType().equals(keywords)) {
                a++;
            }
        }
        System.out.println("The quantity of OnionType is " + str + ":" + a);

        return a;
    }

    public int getSpicinessTypeQuantity(int i){
        int quantity=0;
        for(Stats temp: stat) {
            if(temp.getSpiciness()==i) {
                quantity++;
            }
        }
        System.out.println("The quantity of SpicinessType is " + i + ":" + quantity);

        return quantity;
    }

    public int getChashuQuantity(){
        int quantity=0;
        for(Stats temp: stat) {
            if(temp.isChashu()==true)
                quantity=quantity+1;
            quantity = quantity + temp.getExtraChashu();
        }
        System.out.println("The quantity of Chashu is :" + quantity);

        return quantity;
    }

    public int getEggQuantity(){
        int quantity=0;
        for(Stats temp: stat) {
            if(temp.isEgg()==true)
                quantity=quantity+1;
            quantity = quantity + temp.getExtraEgg();
        }
        System.out.println("The quantity of Egg is :" + quantity);

        return quantity;
    }

    public int getNoriQuantity(){
        int quantity=0;
        for(Stats temp: stat) {
            if(temp.isNori()==true)
                quantity=quantity+1;
            quantity = quantity + temp.getExtraNori();
        }
        System.out.println("The quantity of Nori is :" + quantity);

        return quantity;
    }

    public int getShootQuantity(){
        int quantity=0;
        for(Stats temp: stat) {
            quantity = quantity + temp.getExtraShoot();
        }
        System.out.println("The quantity of Shoot is :" + quantity);

        return quantity;
    }

    public void compare(int a, int b, int c, int d, int e, int f){
        int i;

        if(a>=b){
            i=a;
        }else {
            i=b;
        }

        if(i>=c){
            i=i;
        }else{
            i=c;
        }

        if(i>=d){
            i=i;
        }else{
            i=d;
        }

        if(i>=e){
            i=i;
        }else{
            i=e;
        }

        if(i>=f){
            i=i;
        }else{
            i=f;
        }

        if(i==a){
            System.out.println("The most popular Spiciness Type is 0");
        }
        if(i==b){
            System.out.println("The most popular Spiciness Type is 1");
        }
        if(i==c){
            System.out.println("The most popular Spiciness Type is 2");
        }
        if(i==d){
            System.out.println("The most popular Spiciness Type is 3");
        }
        if(i==e){
            System.out.println("The most popular Spiciness Type is 4");
        }
        if(i==f){
            System.out.println("The most popular Spiciness Type is 5");
        }
    }

    public static void main(String[] args){
        StatsList statsList = new StatsList();

        statsList.getSouptypeQuantity("Shoyu");
        statsList.getSouptypeQuantity("Shio");
        statsList.getSouptypeQuantity("Tonkotsu");
        statsList.getNoodleTypeQuantity("Firm");
        statsList.getNoodleTypeQuantity("Soft");
        statsList.getNoodleTypeQuantity("Medium");
        statsList.getChashuQuantity();
        statsList.getEggQuantity();
        statsList.getNoriQuantity();
        statsList.getShootQuantity();
        statsList.getOnionTypeQuantity("Just a little");
        statsList.getOnionTypeQuantity("A lot");
        statsList.getOnionTypeQuantity("No please");
        statsList.compare(
        statsList.getSpicinessTypeQuantity(0),
        statsList.getSpicinessTypeQuantity(1),
        statsList.getSpicinessTypeQuantity(2),
        statsList.getSpicinessTypeQuantity(3),
        statsList.getSpicinessTypeQuantity(4),
        statsList.getSpicinessTypeQuantity(5)
        );
    }
}
