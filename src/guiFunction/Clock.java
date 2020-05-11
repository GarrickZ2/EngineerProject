package guiFunction;

import gui.Index;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zzx
 */
public class Clock extends Thread{
    Index index;
    public Clock(Index index){
        this.index = index;
    }
    @Override
    public void run() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy MM dd hh:mm:ss");
        while (true){
            Date timer = new Date();
            String[] time = format.format(timer).split(" ");
            String month = "";
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

        }
    }
}
