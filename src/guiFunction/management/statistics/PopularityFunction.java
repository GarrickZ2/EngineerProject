package guiFunction.management.statistics;

import database.interaction.UserData;
import database.entityList.MemberList;
import database.entity.Member;
import database.process.PopularityData;
import gui.management.statistics.Popularity;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

/**
 * This method is used to implement the method of Popularity JPanel
 * @author Zixuan Zhang
 */
public class PopularityFunction extends JPanel {
    public Popularity popularity;

    /**
     * This is the constructor of this class.
     * Set the information of Popularity JPanel
     * @throws Exception used to throws the exception of setInformation
     */
    public PopularityFunction() throws Exception{
        popularity = new Popularity();

        setInformation();

        this.setLayout(new BorderLayout());
        this.add(popularity);
    }

    /**
     * This method is used to set the information of JPanel
     * @throws Exception This Exception is throws by PopularityData
     */
    public void setInformation() throws Exception{
        PopularityData data = new PopularityData();
        try {
            popularity.popular_imageCardPanel.add(drawPopular("Soup"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        UserData userData = new UserData();
        MemberList list = userData.loadInfo();
        Member moneyMember = list.getMember(data.getPopularMemberByMoney());
        Member timesMember = list.getMember(data.getPopularMemberByTimes());
        popularity.member_costMost_membershipNumber.setText(moneyMember.getMembershipId());
        popularity.member_costMost_name.setText(moneyMember.getFirstName() + " " + moneyMember.getLastName());
        popularity.member_costMost_TAE.setText(moneyMember.getTelephone() + " / " + moneyMember.geteMail());

        popularity.member_ordersMost_membershipNumber.setText(timesMember.getMembershipId());
        popularity.member_ordersMost_name.setText(timesMember.getFirstName() + " " + timesMember.getLastName());
        popularity.member_ordersMost_TAE.setText(timesMember.getTelephone() + " / " + timesMember.geteMail());

        popularity.mp_garnish.setText(data.getPopularDish());
        popularity.mp_soup.setText(data.getPopularSoup());
        popularity.mp_spiciness.setText("" + data.getPopularSpicy());
    }

    /**
     * This method is used to generate the popularity picture
     * @param type which type of popularity you want to generate
     * @return A JPanel contains the picture
     * @throws Exception Catch the Exception throws by PopularityData.
     */
    public JPanel drawPopular(String type) throws Exception{
        PopularityData popularityData = new PopularityData();
        int[] dataList;
        String[] nameList;
        switch (type){
            case "Soup":
                dataList = popularityData.getSoup();
                nameList = new String[]{"Tonkotsu", "Shoyo", "Shio"};
                break;
            case "Garnish":
                dataList = popularityData.getDishes();
                nameList = new String[]{"Egg", "Chashu", "Shoot", "Nori"};
                break;
            default:
                dataList = popularityData.getSpiciness();
                nameList = new String[]{"0", "1", "2", "3", "4", "5"};
                break;
        }

        DefaultCategoryDataset dateSet = new DefaultCategoryDataset();
        for (int i = 0; i < dataList.length; i++) {
            dateSet.setValue(dataList[i], "1", nameList[i]);
        }
        JFreeChart chart = ChartFactory.createBarChart(type, "Category", "Number", dateSet,
                PlotOrientation.VERTICAL, false, false, false);
        JPanel panel = new ChartPanel(chart);
        Dimension d = new Dimension(200, 200);
        panel.setPreferredSize(d);
        return panel;
    }

}
