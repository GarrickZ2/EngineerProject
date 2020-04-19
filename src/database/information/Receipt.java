package database.information;

import database.MenuData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Receipt {

    public Order order;
    public Menu menu;
    public Cuisine cuisine;

    public String payingMethod;

    MenuData menuData = new MenuData();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public Receipt(){

    }

    public  Receipt(Order order){
        this.order = order;
        cuisine = order.getCuisine();
        menu = menuData.loadInfo();
    }

    public String generateReceipt(){
        String receiptContent = "";
        receiptContent = "<Receipt>" + "\n" + "Serial Number:" + order.getOrderId() + "\n" + "Time:" + order.getDate()
                + "\n" + order.getMembershipId() + "\n";
        for(int i = 0; i<15;i++){
            receiptContent = receiptContent + "-----";
        }
        receiptContent = receiptContent +"\n" + receiptLineFormat("Menu" , 0) + receiptLineFormat("Number" , 1)
                + receiptLineFormat("Single" ,1) + receiptLineFormat(" Price", 1) + "\n"
                + receiptLineFormat("Noodle(" + cuisine.getSoupType() + ", "+ cuisine.getNoodleType() +", " + cuisine.getOnionType() +")",0);
        receiptContent = receiptContent + receiptLineFormat("  1",1) + receiptLineFormat("￡" + menu.getNoodle(),1)
                + receiptLineFormat("￡" + menu.getNoodle(),1) + "\n";

        receiptContent = receiptContent + receiptLineFormat("Nori",0) + receiptLineFormat("  " + cuisine.getExtraNori(),1)
                + receiptLineFormat("￡" + menu.getNori(), 1) + receiptLineFormat("￡" + menu.getNori()*cuisine.getExtraNori(),1) + "\n";

        receiptContent = receiptContent + receiptLineFormat("Egg",0) + receiptLineFormat("  " + cuisine.getExtraEgg(),1)
                + receiptLineFormat("￡" + menu.getEgg(), 1) + receiptLineFormat("￡" + menu.getEgg()*cuisine.getExtraEgg(),1) + "\n";

        receiptContent = receiptContent + receiptLineFormat("Shoot",0) + receiptLineFormat("  " + cuisine.getExtraShoot(),1)
                + receiptLineFormat("￡" + menu.getShoot(), 1) + receiptLineFormat("￡" + menu.getShoot()*cuisine.getExtraShoot(),1) + "\n";


        receiptContent = receiptContent + receiptLineFormat("Chashu",0) + receiptLineFormat("  " + cuisine.getExtraChashu(),1)
                + receiptLineFormat("￡" + menu.getChashu(), 1) + receiptLineFormat("￡" + menu.getChashu()*cuisine.getExtraChashu(),1) + "\n";
        for(int i = 0; i<15;i++){
            receiptContent = receiptContent + "-----";
        }
        receiptContent = receiptContent + "\n" + receiptLineFormat("Total",0) + receiptLineFormat("",1)
                + receiptLineFormat("",1) + receiptLineFormat(" ￡" + order.getAmountMoney(),1) + "\n"
                + receiptLineFormat("Paying Method:",0) + receiptLineFormat("",1)
                + receiptLineFormat("",1) + receiptLineFormat(" " + payingMethod, 1) + "\n";
        for(int i = 0; i<15;i++){
            receiptContent = receiptContent + "=====";
        }
        receiptContent = receiptContent + "\nPrint Time:" + dateFormat.format(new Date())
                + "\nAddress: Totoro Ramen, B15 Baker Street in London\nTel: 44 (0) 203 178 4861" + "\n\n";

        return receiptContent;
    }

    public String generateReceipt(boolean file){
        if(file){
            File f = new File("data/receipt.txt");
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

    //0 - name 1 - number
    public String receiptLineFormat(String line , int type){
        int nameLength = 45;
        int numberLength = 12;
        int length = 0;

        if(type == 0){
            length = nameLength;
        }else if(type == 1){
            length = numberLength;
        }

        String content = "";

        for(int i=0;i<length;i++){
            if(line.length() > i){
                content = content + line.charAt(i);
            }else{
                content = content + " ";
            }
        }

        return content;
    }

    public static void main(String[] args) {
        String s = "QiShiWoShiNiBaBa";
        Receipt receipt = new Receipt();
        System.out.println(receipt.receiptLineFormat(s,0)+"MaDe");

    }
}
