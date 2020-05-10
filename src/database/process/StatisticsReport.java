package database.process;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class StatisticsReport {
    public String generateReceipt(){
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

        receiptContent = receiptContent + statisticsLineFormat("Member cost most:",1) + statisticsLineFormat("Member orders most:",1) + "\n";
        receiptContent = receiptContent + statisticsLineFormat("Name:",1) + statisticsLineFormat("Name:",1) +"\n";
        receiptContent = receiptContent + statisticsLineFormat("Telephone/E-mail:",1) + statisticsLineFormat("Telephone/E-mail:",1) +"\n";
        for(int i = 0; i<5;i++){
            receiptContent = receiptContent + "* * * * * * * * * * ";
        }
        receiptContent = receiptContent +"\n";
        for(int i=0; i<35; i++){
            receiptContent = receiptContent + " ";
        }
        receiptContent = receiptContent + "The Most Popular";
        receiptContent = receiptContent +"\n";
        receiptContent = receiptContent + statisticsLineFormat("The Most Popular Soup:",2) + "\n";
        receiptContent = receiptContent + statisticsLineFormat("The Most Popular Garnish:",2) + "\n";
        receiptContent = receiptContent + statisticsLineFormat("The Most Popular Spiciness:",2) + "\n";
        for(int i = 0; i<5;i++){
            receiptContent = receiptContent + "* * * * * * * * * * ";
        }
        receiptContent = receiptContent + "\n";
        for(int i=0; i<35; i++){
            receiptContent = receiptContent + " ";
        }
        receiptContent = receiptContent + "Weekly Statistics";
        receiptContent = receiptContent + "\n";
        receiptContent = receiptContent + statisticsLineFormat("Statistic range:",2) + "\n";
        receiptContent = receiptContent + statisticsLineFormat("Weekly income:",2) + "\n";
        receiptContent = receiptContent + statisticsLineFormat("Orders number:",2) + "\n";
        receiptContent = receiptContent + "Details number: " + "\n";
        for(int i=0; i<15; i++){
            receiptContent = receiptContent + " ";
        }
        receiptContent = receiptContent + statisticsLineFormat("Tonkotsu:",3) + statisticsLineFormat("Shoyo:",3) + "\n";
        for(int i=0; i<15; i++){
            receiptContent = receiptContent + " ";
        }
        receiptContent = receiptContent + statisticsLineFormat("Shio:",3) + statisticsLineFormat("Nori:",3) + "\n";
        for(int i=0; i<15; i++){
            receiptContent = receiptContent + " ";
        }
        receiptContent = receiptContent + statisticsLineFormat("Chashu:",3) +statisticsLineFormat("Egg:",3)+ "\n";
        for(int i=0; i<15; i++){
            receiptContent = receiptContent + " ";
        }
        receiptContent = receiptContent + statisticsLineFormat("Shoot:",3)+ "\n";

        return receiptContent;
    }

    public String generateReceipt(boolean file){
        if(file){
            File f = new File("data/recipients/"+ "Report" +".txt");
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



    public static void main(String[] args) {
        StatisticsReport s = new StatisticsReport();
        s.generateReceipt(true);
    }
}
