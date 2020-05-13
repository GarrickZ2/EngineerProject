package database.process;

import database.interaction.MenuData;
import database.entity.Cuisine;
import database.entity.Menu;
import database.entity.Order;

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

    /**
     *
     * @param order
     */
    public  Receipt(Order order){
        this.order = order;
        cuisine = order.getCuisine();
        menu = menuData.loadInfo();
        payingMethod = order.getPayingMethod();
    }

    public String generateReceipt(){
        String receiptContent = "";
        receiptContent = "<Receipt>" + "\n" + "Serial Number:" + order.getOrderId() + "\n" + "Time:" + order.getDate()
                + "\n" + "Member:" + order.getMembershipId() + "\n";
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
            File f = new File("data/recipients/"+order.getBillId()+".txt");
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

    //clear the data from 7days ago
    public void clear(){
        File folder = new File("/data/recipients/");
        File[] files = folder.listFiles();
        for (File file:files) {
            int date = Integer.parseInt(order.getOrderId().substring(0,8))-7;
            int name = Integer.parseInt(file.getName().substring(0,8));
            if (name<date){
                file.delete();
            }
        }
        System.out.println("File have already been deleted");
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.clear();
    }
}
