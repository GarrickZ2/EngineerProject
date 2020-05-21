package database.process;

import database.entity.Member;
import database.interaction.UserData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * This Class is used to generate the Statistics Report weekly
 */
public class StatisticsReport {
    Statistics statistics = new Statistics();
    PopularityData popularityData = new PopularityData(this.getLastSunday(),7);
    UserData userData = new UserData();

    /**
     * Empty Constructor throws the IOException from PopularityData
     * @throws Exception
     */
    public StatisticsReport() throws Exception {

    }

    /**
     * Generate the statistic format report.
     * @return statistic format string
     */
    public String generateStat(){
        statistics.loadData(this.getLastSunday());

        userData.loadInfo();
        Member MCM =  userData.loadInfo().getMember(popularityData.getPopularMemberByMoney());
        Member MOM = userData.loadInfo().getMember(popularityData.getPopularMemberByTimes());

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");

        String monday = format.format(this.getLastMonday());
        String sunday = format.format(this.getLastSunday());

        StringBuilder receiptContent = new StringBuilder();
        receiptContent.append(" ".repeat(35));
        receiptContent.append("Statistics Report").append("\n");
        receiptContent.append("* * * * * * * * * * ".repeat(5));
        receiptContent.append("\n");
        receiptContent.append(" ".repeat(35));
        receiptContent.append("Weekly Crazy Members").append("\n");

        receiptContent.append(statisticsLineFormat("Member cost most:" + popularityData.getPopularMemberByMoney(), 1)).append(statisticsLineFormat("Member orders most:" + popularityData.getPopularMemberByTimes(), 1)).append("\n");
        receiptContent.append(statisticsLineFormat("Name:" + MCM.getFirstName() + " " + MCM.getLastName(), 1)).append(statisticsLineFormat("Name:" + MOM.getFirstName() + " " + MOM.getLastName(), 1)).append("\n");
        receiptContent.append(statisticsLineFormat("Telephone/E-mail:" + MCM.getTelephone() + "/" + MCM.geteMail(), 1)).append(statisticsLineFormat("Telephone/E-mail:" + MOM.getTelephone() + "/" + MOM.geteMail(), 1)).append("\n");
        receiptContent.append("* * * * * * * * * * ".repeat(5));
        receiptContent.append("\n");
        receiptContent.append(" ".repeat(35));
        receiptContent.append("The Most Popular");
        receiptContent.append("\n");
        receiptContent.append(statisticsLineFormat("The Most Popular Soup:" + popularityData.getPopularSoup(), 2)).append("\n");
        receiptContent.append(statisticsLineFormat("The Most Popular Garnish:" + popularityData.getPopularDish(), 2)).append("\n");
        receiptContent.append(statisticsLineFormat("The Most Popular Spiciness:" + popularityData.getPopularSpicy(), 2)).append("\n");
        receiptContent.append("* * * * * * * * * * ".repeat(5));
        receiptContent.append("\n");
        receiptContent.append(" ".repeat(35));
        receiptContent.append("Weekly Statistics");
        receiptContent.append("\n");
        receiptContent.append(statisticsLineFormat("Statistic range:" + monday + " To " + sunday, 2)).append("\n");
        receiptContent.append(statisticsLineFormat("Weekly income:" + statistics.getSumInt(statistics.getIncome()), 2)).append("\n");
        receiptContent.append(statisticsLineFormat("Orders number:" + statistics.getSumInt(statistics.getOrders()), 2)).append("\n");
        receiptContent.append("Details number: ").append("\n");
        receiptContent.append(" ".repeat(15));
        receiptContent.append(statisticsLineFormat("Tonkotsu:" + statistics.getSumInt(statistics.getSoup1()), 3)).append(statisticsLineFormat("Shoyo:" + statistics.getSumInt(statistics.getSoup2()), 3)).append("\n");
        receiptContent.append(" ".repeat(15));
        receiptContent.append(statisticsLineFormat("Shio:" + statistics.getSumInt(statistics.getSoup3()), 3)).append(statisticsLineFormat("Nori:" + statistics.getSumInt(statistics.getNori()), 3)).append("\n");
        receiptContent.append(" ".repeat(15));
        receiptContent.append(statisticsLineFormat("Chashu:" + statistics.getSumInt(statistics.getChashu()), 3)).append(statisticsLineFormat("Egg:" + statistics.getSumInt(statistics.getEgg()), 3)).append("\n");
        receiptContent.append(" ".repeat(15));
        receiptContent.append(statisticsLineFormat("Shoot:" + statistics.getSumInt(statistics.getShoot()), 3)).append("\n");

        return receiptContent.toString();
    }

    /**
     * Generate the statistic report into the file
     * @param file whether to generate the file
     * @return the statistic format String
     */
    public String generateStat(boolean file){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddkkmmss");
        String name = format.format(new Date());
        if(file){
            File f = new File("data/recipients/"+ name +".txt");
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
                bw.write(generateStat());
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return generateStat();
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

    /**
     * Get the last week's monday Date
     * @return the Date of last week's monday
     */
    public Date getLastMonday(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONDAY), calendar.get(Calendar.DAY_OF_MONTH), 0, 0,0);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        calendar.add(Calendar.DATE,-7);
        return calendar.getTime();
    }

    /**
     * get the last week's sunday
     * @return the Date of the last week's sunday
     */
    public Date getLastSunday(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONDAY), calendar.get(Calendar.DAY_OF_MONTH), 23, 59,59);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        calendar.add(Calendar.DATE,-1);
        return calendar.getTime();
    }


    public static void main(String[] args) throws Exception {
        StatisticsReport s = new StatisticsReport();
        s.generateStat(true);
    }
}
