package newgui.management.Statistics;

import database.information.Statistics;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author Zixuan Zhang
 */
public class Analysis extends JPanel implements ActionListener {
    public DataAnalysis dataAnalysis;
    CardLayout card;
    JPanel graphics;
    Statistics statistics;
    public Analysis() throws Exception{
        dataAnalysis = new DataAnalysis();
        statistics = new Statistics();
        statistics.loadData();
        dataAnalysis.button_income.setSelected(true);
        card = new CardLayout();
        graphics = new JPanel(card);
        graphics.add(drawData("Income"), "Income");
        graphics.add(drawData("Orders"), "Orders");
        graphics.add(drawData("Tonkotsu"), "Tonkotsu");
        graphics.add(drawData("Shoyo"), "Shoyo");
        graphics.add(drawData("Shio"), "Shio");
        graphics.add(drawData("Nori"), "Nori");
        graphics.add(drawData("Chashu"), "Chashu");
        graphics.add(drawData("Egg"), "Egg");
        graphics.add(drawData("Shoot"), "Shoot");

        dataAnalysis.button_income.addActionListener(this);
        dataAnalysis.button_chashu.addActionListener(this);
        dataAnalysis.button_egg.addActionListener(this);
        dataAnalysis.button_nori.addActionListener(this);
        dataAnalysis.button_orders.addActionListener(this);
        dataAnalysis.button_shio.addActionListener(this);
        dataAnalysis.button_shoot.addActionListener(this);
        dataAnalysis.button_shoyo.addActionListener(this);
        dataAnalysis.button_tonkotsu.addActionListener(this);

        dataAnalysis.statisticsImageCard.add(graphics);

        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        calendar.setTime(date);
        calendar.add(Calendar.DATE, -7);
        dataAnalysis.weeklyRange.setText(format.format(calendar.getTime())+ " -> "+ format.format(date));
        dataAnalysis.weeklyIncome.setText("£" + statistics.getSumInt(statistics.getIncome()));
        dataAnalysis.weeklyOrders.setText("" + statistics.getSumInt(statistics.getOrders()));
        dataAnalysis.weeklyTonkotsu.setText("" + statistics.getSumInt(statistics.getSoup1()));
        dataAnalysis.weeklyShoyo.setText("" + statistics.getSumInt(statistics.getSoup2()));
        dataAnalysis.weeklyShio.setText("" + statistics.getSumInt(statistics.getSoup3()));
        dataAnalysis.weeklyNori.setText("" + statistics.getSumInt(statistics.getNori()));
        dataAnalysis.weeklyChashu.setText("" + statistics.getSumInt(statistics.getChashu()));
        dataAnalysis.weeklyEgg.setText("" + statistics.getSumInt(statistics.getEgg()));
        dataAnalysis.weeklyShoot.setText("" + statistics.getSumInt(statistics.getShoot()));

        this.setLayout(new BorderLayout());
        this.add(dataAnalysis);
    }

    public JPanel drawData(String type){
        int[] dataList;
        switch (type){
            case "Income":
                dataList = statistics.getIncome();
                break;
            case "Orders":
                dataList = statistics.getOrders();
                break;
            case "Tonkotsu":
                dataList = statistics.getSoup1();
                break;
            case "Shoyo":
                dataList = statistics.getSoup2();
                break;
            case "Shio":
                dataList = statistics.getSoup3();
                break;
            case "Nori":
                dataList = statistics.getNori();
                break;
            case "Chashu":
                dataList = statistics.getChashu();
                break;
            case "Egg":
                dataList = statistics.getEgg();
                break;
            default:
                dataList = statistics.getShoot();
                break;
        }

        TimeSeries timeSeries = new TimeSeries(type);
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy MM dd", Locale.US);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        for(int i = dataList.length - 1; i >= 0; i--){
            String time = format.format(calendar.getTime());
            String[] days = time.split(" ");
            timeSeries.add(new Day(Integer.parseInt(days[2]), Integer.parseInt(days[1]), Integer.parseInt(days[0])),
                    dataList[i]);
            calendar.add(Calendar.DATE, -1);
        }
        TimeSeriesCollection lineDataset = new TimeSeriesCollection();
        lineDataset.addSeries(timeSeries);
        JFreeChart chart = ChartFactory.createTimeSeriesChart(type, "Time", "Amount",
                lineDataset, false, false, false);
        JPanel panel = new ChartPanel(chart);
        Dimension d = new Dimension(200, 200);
        setPreferredSize(d);
        return panel;
    }



    public static void main(String[] args) throws Exception{
        JFrame frame = new JFrame();
        Analysis analysis = new Analysis();
        JPanel panel = analysis.drawData("Income");
        frame.add(panel);

        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JToggleButton button = (JToggleButton)e.getSource();
        card.show(graphics, button.getText());
    }
}
