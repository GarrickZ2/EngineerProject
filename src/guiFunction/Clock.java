package guiFunction;

import database.process.StatisticsReport;
import gui.Index;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Thread Class independent from the Main thread.
 * Used to control the clock on the Index GUI
 * @author Zixuan Zhang
 */
public class Clock extends Thread{
    Index index;
    StatisticsReport report;
    public Clock(Index index){
        this.index = index;
        report = new StatisticsReport();
        report.setRecentDate();
    }

    /**
     * Override for run function in Thread class.
     * Get the time from now and set it on the Index GUI
     */
    @Override
    public void run() {
        //Initialize a time format
        SimpleDateFormat format = new SimpleDateFormat("yyyy MM dd hh:mm:ss");
        while (true){
            Date timer = new Date();
            String[] time = format.format(timer).split(" ");
            String month = "";
            // Replace the month with English words.
            switch (time[1]){
                case "01":
                    month = "January";
                    break;
                case "02":
                    month = "February";
                    break;
                case "03":
                    month = "March";
                    break;
                case "04":
                    month = "April";
                    break;
                case "05":
                    month = "May";
                    break;
                case "06":
                    month = "June";
                    break;
                case "07":
                    month = "July";
                    break;
                case "08":
                    month = "August";
                    break;
                case "09":
                    month = "September";
                    break;
                case "10":
                    month = "October";
                    break;
                case "11":
                    month = "November";
                    break;
                default:
                    month = "December";
                    break;
            }
            index.time2.setText(time[3]);
            index.date2.setText(time[2] + "/" + month + "/" + time[0]);

            if(!report.withInWeek()){
                report.generateStat(true);
                report.setRecent(new Date());
                JOptionPane.showMessageDialog(null, "This week's report is generated in data/report");
            }
        }
    }
}
