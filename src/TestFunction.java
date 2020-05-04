/**
 * @author All team members
 */

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.*;

import javax.swing.*;


public class TestFunction{
    public TestFunction(){
        TimeSeries timeSeries1 = new TimeSeries("A");
        TimeSeriesDataItem item = new TimeSeriesDataItem(new Day(), 2);
        timeSeries1.add(item);
        item = new TimeSeriesDataItem(new Week(3, 2020), 20);
        timeSeries1.add(item);
        TimeSeriesCollection lineDataset = new TimeSeriesCollection();
        lineDataset.addSeries(timeSeries1);
        JFreeChart chart = ChartFactory.createTimeSeriesChart("Time line Graph", "M", "H",
                lineDataset, false, false, false);
        JPanel jPanel = new ChartPanel(chart);
        JFrame frame = new JFrame("JFreechart Test");
        frame.add(jPanel);
        frame.setBounds(0, 0, 400, 600);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new TestFunction();
    }
}
