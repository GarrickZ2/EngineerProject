package database.process;

import database.entity.Member;
import database.entity.Order;
import database.entityList.MemberList;
import database.interaction.OrderData;
import database.interaction.UserData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class StatisticsReport {
    Statistics statistics = new Statistics();
    PopularityData popularityData = new PopularityData(this.getLastSunday(),7);
    UserData userData = new UserData();

    public StatisticsReport() throws Exception {

    }


    public String generateReceipt(){
        statistics.loadData(this.getLastSunday());

        userData.loadInfo();
        Member MCM =  userData.loadInfo().getMember(popularityData.getPopularMemberByMoney());
        Member MOM = userData.loadInfo().getMember(popularityData.getPopularMemberByTimes());

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");

        String monday = format.format(this.getLastMonday());
        String sunday = format.format(this.getLastSunday());

        String receiptContent = "";
        for(int i=0; i<35; i++){
            receiptContent = receiptContent + " ";
        }
        receiptContent = receiptContent + "Statistics Report" + "\n";
        for(int i = 0; i<5;i++){
            receiptContent = receiptContent + "* * * * * * * * * * ";
        }
        receiptContent = receiptContent +"\n" ;
        for(int i=0; i<35; i++){
            receiptContent = receiptContent + " ";
        }
        receiptContent = receiptContent + "Weekly Crazy Members" + "\n";

        receiptContent = receiptContent + statisticsLineFormat("Member cost most:" + popularityData.getPopularMemberByMoney(),1) + statisticsLineFormat("Member orders most:" + popularityData.getPopularMemberByTimes(),1) + "\n";
        receiptContent = receiptContent + statisticsLineFormat("Name:" + MCM.getFirstName() + " " + MCM.getLastName(),1) + statisticsLineFormat("Name:" + MOM.getFirstName() + " " + MOM.getLastName(),1) +"\n";
        receiptContent = receiptContent + statisticsLineFormat("Telephone/E-mail:" + MCM.getTelephone() +"/" +MCM.geteMail(),1) + statisticsLineFormat("Telephone/E-mail:" + MOM.getTelephone() + "/" + MOM.geteMail(),1) +"\n";
        for(int i = 0; i<5;i++){
            receiptContent = receiptContent + "* * * * * * * * * * ";
        }
        receiptContent = receiptContent +"\n";
        for(int i=0; i<35; i++){
            receiptContent = receiptContent + " ";
        }
        receiptContent = receiptContent + "The Most Popular";
        receiptContent = receiptContent +"\n";
        receiptContent = receiptContent + statisticsLineFormat("The Most Popular Soup:" + popularityData.getPopularSoup(),2) + "\n";
        receiptContent = receiptContent + statisticsLineFormat("The Most Popular Garnish:" + popularityData.getPopularDish(),2) + "\n";
        receiptContent = receiptContent + statisticsLineFormat("The Most Popular Spiciness:" + popularityData.getPopularSpicy(),2) + "\n";
        for(int i = 0; i<5;i++){
            receiptContent = receiptContent + "* * * * * * * * * * ";
        }
        receiptContent = receiptContent + "\n";
        for(int i=0; i<35; i++){
            receiptContent = receiptContent + " ";
        }
        receiptContent = receiptContent + "Weekly Statistics";
        receiptContent = receiptContent + "\n";
        receiptContent = receiptContent + statisticsLineFormat("Statistic range:" + monday + " To " + sunday ,2) + "\n";
        receiptContent = receiptContent + statisticsLineFormat("Weekly income:" + statistics.getSumInt(statistics.getIncome()),2) + "\n";
        receiptContent = receiptContent + statisticsLineFormat("Orders number:" + statistics.getSumInt(statistics.getOrders()),2) + "\n";
        receiptContent = receiptContent + "Details number: " + "\n";
        for(int i=0; i<15; i++){
            receiptContent = receiptContent + " ";
        }
        receiptContent = receiptContent + statisticsLineFormat("Tonkotsu:" + statistics.getSumInt(statistics.getSoup1()),3) + statisticsLineFormat("Shoyo:" + statistics.getSumInt(statistics.getSoup2()),3) + "\n";
        for(int i=0; i<15; i++){
            receiptContent = receiptContent + " ";
        }
        receiptContent = receiptContent + statisticsLineFormat("Shio:" + statistics.getSumInt(statistics.getSoup3()),3) + statisticsLineFormat("Nori:" + statistics.getSumInt(statistics.getNori()),3) + "\n";
        for(int i=0; i<15; i++){
            receiptContent = receiptContent + " ";
        }
        receiptContent = receiptContent + statisticsLineFormat("Chashu:" +statistics.getSumInt(statistics.getChashu()),3) +statisticsLineFormat("Egg:" + statistics.getSumInt(statistics.getEgg()),3)+ "\n";
        for(int i=0; i<15; i++){
            receiptContent = receiptContent + " ";
        }
        receiptContent = receiptContent + statisticsLineFormat("Shoot:" + statistics.getSumInt(statistics.getShoot()),3)+ "\n";

        return receiptContent;
    }

    public String generateReceipt(boolean file){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddkkmmss");
        String name = format.format(new Date());
        if(file){
            File f = new File("data/recipients/"+ name +".txt");
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
                bw.write(generateReceipt());
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return generateReceipt();
    }

    public String statisticsLineFormat(String line , int type){
        int nameLength = 54;
        int numberLength = 75;
        int number = 35;
        int length = 0;

        if(type == 1){
            length = nameLength;
        }else if(type == 2){
            length = numberLength;
        }
        else if(type == 3){
            length = number;
        }

        StringBuilder content = new StringBuilder();

        for(int i=0;i<length;i++){
            if(line.length() > i){
                content.append(line.charAt(i));
            }else{
                content.append(" ");
            }
        }

        return content.toString();
    }

    public Date getLastMonday(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONDAY), calendar.get(Calendar.DAY_OF_MONTH), 0, 0,0);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        calendar.add(Calendar.DATE,-7);
        return calendar.getTime();
    }

    public Date getLastSunday(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONDAY), calendar.get(Calendar.DAY_OF_MONTH), 23, 59,59);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        calendar.add(Calendar.DATE,-1);
        return calendar.getTime();
    }


    public static void main(String[] args) throws Exception {
        StatisticsReport s = new StatisticsReport();
        s.generateReceipt(true);
    }
}
