package newgui.management;

import database.MenuData;
import database.information.Menu;
import gui.AlertWindow;
import newgui.management.Statistics.Analysis;
import newgui.management.Statistics.DataAnalysis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Huang
 */
public class ManagementIndex extends JPanel {
    MenuData menuData = new MenuData();
    Menu menu;
    CardLayout card;
    JPanel main;
    public MenuOperation menuOperation;
    public Popularity popularity;
    public MembershipOperation membershipOperation;
    public Analysis dataAnalysis;
    CardLayout innerCard;


    public ManagementIndex(){
        menu = menuData.loadInfo();
        card = new CardLayout();
        main = new JPanel(card);

        menuOperation = new MenuOperation();
        popularity = new Popularity();
        membershipOperation = new MembershipOperation();
        try {
            dataAnalysis = new Analysis();
        } catch (Exception ignored) { }
        innerCard = (CardLayout)popularity.popularList_cardPanel.getLayout();

        main.add(menuOperation,"menuOperation");
        main.add(popularity,"managerPassword");
        main.add(membershipOperation,"membershipOperation");
        main.add(dataAnalysis,"dataAnalysis");

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
            popularity.menuOperationPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    menuOperationPanelMouseClicked(e);
                }
            });
            popularity.membershipOperationPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    membershipOperationPanelMouseClicked(e);
                }
            });
            popularity.dataAnalysisPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    dataAnalysisPanelMouseClicked(e);
                }
            });

            //======== Index in MembershipOperation ========
            membershipOperation.menuOperationPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    menuOperationPanelMouseClicked(e);
                }
            });
            membershipOperation.popularityPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    popularityPanelMouseClicked(e);
                }
            });
            membershipOperation.dataAnalysisPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    dataAnalysisPanelMouseClicked(e);
                }
            });

            //======== Index in DataAnalysis ========
            dataAnalysis.dataAnalysis.menuOperationPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    menuOperationPanelMouseClicked(e);
                }
            });
            dataAnalysis.dataAnalysis.popularityPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    popularityPanelMouseClicked(e);
                }
            });
            dataAnalysis.dataAnalysis.membershipOperationPanel.addMouseListener(new MouseAdapter() {
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
                    try {
                        new AlertWindow("The price can not be lower than 0.");
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
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

            popularity.soupCard_garnishPanelButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    garnishCardClicked(e);
                }
            });
            popularity.soupCard_spicinessPanelButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    spicinessCardClicked(e);
                }
            });


            //gCard
            popularity.gCard_soupPanelButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    soupCardClicked(e);
                }
            });
            popularity.gCard_spicinessPanelButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    spicinessCardClicked(e);
                }
            });

            //spiCard

            popularity.spiCard_soupPanelButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    soupCardClicked(e);
                }
            });
            popularity.spiCard_garnishPanelButton.addMouseListener(new MouseAdapter() {
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


    private void menuOperationPanelMouseClicked(MouseEvent e) {
        setMenuSuggest();
        setMenuChange();
        card.show(main,"menuOperation");
    }

    private void dataAnalysisPanelMouseClicked(MouseEvent e) {
        card.show(main,"dataAnalysis");
    }

    private void membershipOperationPanelMouseClicked(MouseEvent e) {
        card.show(main,"membershipOperation");
    }

    private void popularityPanelMouseClicked(MouseEvent e) {
        card.show(main,"managerPassword");
    }

    private void soupCardClicked(MouseEvent e) {

        innerCard.show(popularity.popularList_cardPanel,"soupCard");
    }
    private void garnishCardClicked(MouseEvent e) {
        innerCard.show(popularity.popularList_cardPanel,"gCard");
    }
    private void spicinessCardClicked(MouseEvent e) {
        innerCard.show(popularity.popularList_cardPanel,"spiCard");
    }

    public static boolean isNumber(String information){
        String format = "^[0-9]+(.[0-9]+)?$";
        Pattern pattern = Pattern.compile(format);
        Matcher mat = pattern.matcher(information);
        return mat.find();
    }
    public static boolean isNumber(ArrayList<String> list){
        boolean result = true;
        for(String str : list){
            result = result && isNumber(str);
        }
        return result;
    }

}
