package guiFunction.management;

import database.interaction.MenuData;
import database.entity.Menu;
import gui.management.MenuOperation;
import guiFunction.management.statistics.DataAnalysisFunction;
import guiFunction.management.statistics.PopularityFunction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This is the Class to implement the methods to MenuOperation and MembershipOperation and connected them together
 * And connect the DataAnalysis and Popularity Class.
 * @author Huang
 */
public class ManagementIndex extends JPanel {
    MenuData menuData = new MenuData();
    Menu menu;
    public CardLayout card;
    JPanel main;
    public MenuOperation menuOperation;
    public PopularityFunction popularity;
    public MembershipOperationFunction membershipOperation;
    public DataAnalysisFunction dataDataAnalysisFunction;
    CardLayout innerCard;

    /**
     * This is the constructor for ManagementIndex
     * @throws Exception The Exception of SimpleFormat's parse()
     */
    public ManagementIndex() throws Exception{
        menu = menuData.loadInfo();
        card = new CardLayout();
        main = new JPanel(card);

        menuOperation = new MenuOperation();
        popularity = new PopularityFunction();
        membershipOperation = new MembershipOperationFunction();
        dataDataAnalysisFunction = new DataAnalysisFunction();
        innerCard = (CardLayout)popularity.popularity.popularList_cardPanel.getLayout();

        main.add(menuOperation,"menuOperation");
        main.add(popularity,"managerPassword");
        main.add(membershipOperation,"membershipOperation");
        main.add(dataDataAnalysisFunction,"dataDataAnalysisFunction");

        //======== Index ========
        {
            //======== Index in menuOperation ========
            menuOperation.popularityPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    popularityPanelMouseClicked(e);
                }
            });
            menuOperation.membershipOperationPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    membershipOperationPanelMouseClicked(e);
                }
            });
            menuOperation.dataAnalysisPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    dataAnalysisPanelMouseClicked(e);
                }
            });
            //======== Index in ManagerPassword ========
            popularity.popularity.menuOperationPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    menuOperationPanelMouseClicked(e);
                }
            });
            popularity.popularity.membershipOperationPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    membershipOperationPanelMouseClicked(e);
                }
            });
            popularity.popularity.dataAnalysisPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    dataAnalysisPanelMouseClicked(e);
                }
            });

            //======== Index in MembershipOperation ========
            membershipOperation.membershipOperation.menuOperationPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    menuOperationPanelMouseClicked(e);
                }
            });
            membershipOperation.membershipOperation.popularityPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    popularityPanelMouseClicked(e);
                }
            });
            membershipOperation.membershipOperation.dataAnalysisPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    dataAnalysisPanelMouseClicked(e);
                }
            });

            //======== Index in DataAnalysis ========
            dataDataAnalysisFunction.dataAnalysis.menuOperationPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    menuOperationPanelMouseClicked(e);
                }
            });
            dataDataAnalysisFunction.dataAnalysis.popularityPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    popularityPanelMouseClicked(e);
                }
            });
            dataDataAnalysisFunction.dataAnalysis.membershipOperationPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    membershipOperationPanelMouseClicked(e);
                }
            });
        }

        //======== MenuOperation ========
        {
            setMenuSuggest();
            setMenuChange();
            menuOperation.saveButton.addActionListener(e ->{

                double noodle, nori, egg, chashu, shoot;
                String noodleCast, noriCast, eggCast, chashuCast, shootCast;
                noodleCast = menuOperation.inputPrice_noodle.getText();
                noriCast = menuOperation.inputPrice_nori.getText();
                eggCast = menuOperation.inputPrice_egg.getText();
                chashuCast = menuOperation.inputPrice_chashu.getText();
                shootCast = menuOperation.inputPrice_shoot.getText();

                ArrayList<String> input = new ArrayList<>();
                input.add(noodleCast);
                input.add(noriCast);
                input.add(eggCast);
                input.add(chashuCast);
                input.add(shootCast);

                if(!isNumber(input)){
                    System.out.println("Not number!");
                    //TODO Generate a window to suggest
                    return;
                }

                noodle = Double.parseDouble(noodleCast);
                nori = Double.parseDouble(noriCast);
                egg = Double.parseDouble(eggCast);
                chashu = Double.parseDouble(chashuCast);
                shoot = Double.parseDouble(shootCast);

                if(noodle<=0||nori<=0||egg<=0||chashu<=0||shoot<=0){
                    System.out.println("Each value must larger than 0.");
                }
                else {
                    menu.setNori(nori);
                    menu.setNoodle(noodle);
                    menu.setShoot(shoot);
                    menu.setChashu(chashu);
                    menu.setEgg(egg);

                    if(menuOperation.inputAvailable_nori.isSelected()){
                        menu.setNoriAvailable(true);
                    }else {
                        menu.setNoriAvailable(false);
                    }

                    if(menuOperation.inputAvailable_egg.isSelected()){
                        menu.setEggAvailable(true);
                    }else {
                        menu.setEggAvailable(false);
                    }

                    if(menuOperation.inputAvailable_chashu.isSelected()){
                        menu.setChashuAvailable(true);
                    }else {
                        menu.setChashuAvailable(false);
                    }

                    if(menuOperation.inputAvailable_shoot.isSelected()){
                        menu.setShootAvailable(true);
                    }else {
                        menu.setShootAvailable(false);
                    }

                    menuData.saveInfo(menu);
                    setMenuSuggest();
                    setMenuChange();
                }
            });
            menuOperation.resetButton.addActionListener(e -> setMenuChange());
        }

        //======== popularity ========
        {
            //soupCard

            popularity.popularity.soupCard_garnishPanelButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    garnishCardClicked(e);
                }
            });
            popularity.popularity.soupCard_spicinessPanelButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    spicinessCardClicked(e);
                }
            });


            //gCard
            popularity.popularity.gCard_soupPanelButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    soupCardClicked(e);
                }
            });
            popularity.popularity.gCard_spicinessPanelButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    spicinessCardClicked(e);
                }
            });

            //spiCard

            popularity.popularity.spiCard_soupPanelButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    soupCardClicked(e);
                }
            });
            popularity.popularity.spiCard_garnishPanelButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    garnishCardClicked(e);
                }
            });
        }

        //======== MembershipOperation ========
        {
            //todo
        }
        //======== DataAnalysis ========
        {
            //todo
        }

        this.add(main);
    }

    /**
     * This method is used to set the original information of menu
     */
    public void setMenuSuggest(){
        menuOperation.sugPrice_noodle.setText("£" + menu.getNoodle());
        menuOperation.sugPrice_nori.setText("£" + menu.getNori());
        menuOperation.sugPrice_egg.setText("£" + menu.getEgg());
        menuOperation.sugPrice_chashu.setText("£" + menu.getChashu());
        menuOperation.sugPrice_shoot.setText("£" + menu.getShoot());
        if(menu.isNoriAvailable()){
            menuOperation.sugAvailable_nori.setText("Available");
        }else {
            menuOperation.sugAvailable_nori.setText("Unavailable");
        }
        if(menu.isChashuAvailable()){
            menuOperation.sugAvailable_chashu.setText("Available");
        }else {
            menuOperation.sugAvailable_chashu.setText("Unavailable");
        }
        if(menu.isShootAvailable()){
            menuOperation.sugAvailable_shoot.setText("Available");
        }else {
            menuOperation.sugAvailable_shoot.setText("Unavailable");
        }
        if(menu.isEggAvailable()){
            menuOperation.sugAvailable_egg.setText("Available");
        }else {
            menuOperation.sugAvailable_egg.setText("Unavailable");
        }
    }

    /**
     * This method is used to change the information of menu and save it to the database.
     */
    public void setMenuChange(){
        menuOperation.inputPrice_noodle.setText("" + menu.getNoodle());
        menuOperation.inputPrice_nori.setText("" + menu.getNori());
        menuOperation.inputPrice_egg.setText("" + menu.getEgg());
        menuOperation.inputPrice_chashu.setText("" + menu.getChashu());
        menuOperation.inputPrice_shoot.setText("" + menu.getShoot());
        if(menu.isNoriAvailable()){
            menuOperation.inputAvailable_nori.setSelected(true);
        }else {
            menuOperation.inputUnavailable_nori.setSelected(true);
        }
        if(menu.isChashuAvailable()){
            menuOperation.inputAvailable_chashu.setSelected(true);
        }else {
            menuOperation.inputUnavailable_chashu.setSelected(true);
        }
        if(menu.isShootAvailable()){
            menuOperation.inputAvailable_shoot.setSelected(true);
        }else {
            menuOperation.inputUnavailable_shoot.setSelected(true);
        }
        if(menu.isEggAvailable()){
            menuOperation.inputAvailable_egg.setSelected(true);
        }else {
            menuOperation.inputUnavailable_egg.setSelected(true);
        }
    }

    /**
     * This method is used to change the menu's information and change the cardLayout
     * @param e ignored mouse event
     */
    private void menuOperationPanelMouseClicked(MouseEvent e) {
        setMenuSuggest();
        setMenuChange();
        card.show(main,"menuOperation");
    }

    /**
     * This method is used to change the cardlayout
     * @param e ignored mouse event
     */
    private void dataAnalysisPanelMouseClicked(MouseEvent e) {
        card.show(main,"dataDataAnalysisFunction");
    }

    /**
     * This method is used to change the cardLayout
     * @param e ignored mouse event
     */
    private void membershipOperationPanelMouseClicked(MouseEvent e) {
        card.show(main,"membershipOperation");
    }

    /**
     * This method is used to change the cardLayout
     * @param e ignored mouse event
     */
    private void popularityPanelMouseClicked(MouseEvent e) {
        card.show(main,"managerPassword");
    }

    /**
     * This method is used to change the cardLayout and try to add the new picture on the panel
     * @param e ignored mouse event
     */
    private void soupCardClicked(MouseEvent e) {
        innerCard.show(popularity.popularity.popularList_cardPanel,"soupCard");
        try {
            popularity.popularity.popular_imageCardPanel.add(popularity.drawPopular("Soup"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is used to change the cardLayout and try to add the new picture on the panel
     * @param e ignored mouse event
     */
    private void garnishCardClicked(MouseEvent e) {
        innerCard.show(popularity.popularity.popularList_cardPanel,"gCard");
        try {
            popularity.popularity.popular_imageCardPanel.add(popularity.drawPopular("Garnish"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is used to change the cardLayout and try to add the new picture on the panel
     * @param e ignored mouse event
     */
    private void spicinessCardClicked(MouseEvent e) {
        innerCard.show(popularity.popularity.popularList_cardPanel,"spiCard");
        try {
            popularity.popularity.popular_imageCardPanel.add(popularity.drawPopular("Spiciness"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * To judge whether all the information is formulated by number
     * @param information the string you want to check
     * @return boolean value whether this is constructed by number
     */
    public static boolean isNumber(String information){
        String format = "^[0-9]+(.[0-9]+)?$";
        Pattern pattern = Pattern.compile(format);
        Matcher mat = pattern.matcher(information);
        return mat.find();
    }

    /**
     * Input the whole list and judge whether the whole list is constructed by number
     * @param list the ArrayList you want to check
     * @return boolean value whether the whole list is constructed by number
     */
    public static boolean isNumber(ArrayList<String> list){
        boolean result = true;
        for(String str : list){
            result = result && isNumber(str);
        }
        return result;
    }

}
