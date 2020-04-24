package newgui.management;

import database.MenuData;
import database.information.Menu;
import gui.AlertWindow;

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
    public ManagerPassword managerPassword;
    public MembershipOperation membershipOperation;
    public DataAnalysis dataAnalysis;

    public ManagementIndex(){
        menu = menuData.loadInfo();
        card = new CardLayout();
        main = new JPanel(card);

        menuOperation = new MenuOperation();
        managerPassword = new ManagerPassword();
        membershipOperation = new MembershipOperation();
        dataAnalysis = new DataAnalysis();

        main.add(menuOperation,"menuOperation");
        main.add(managerPassword,"managerPassword");
        main.add(membershipOperation,"membershipOperation");
        main.add(dataAnalysis,"dataAnalysis");

        //======== Index ========
        {
            //======== Index in menuOperation ========
            menuOperation.managerPasswordPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    managerPasswordPanelMouseClicked(e);
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
            managerPassword.menuOperationPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    menuOperationPanelMouseClicked(e);
                }
            });
            managerPassword.membershipOperationPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    membershipOperationPanelMouseClicked(e);
                }
            });
            managerPassword.dataAnalysisPanel.addMouseListener(new MouseAdapter() {
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
            membershipOperation.managerPasswordPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    managerPasswordPanelMouseClicked(e);
                }
            });
            membershipOperation.dataAnalysisPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    dataAnalysisPanelMouseClicked(e);
                }
            });

            //======== Index in DataAnalysis ========
            dataAnalysis.menuOperationPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    menuOperationPanelMouseClicked(e);
                }
            });
            dataAnalysis.managerPasswordPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    managerPasswordPanelMouseClicked(e);
                }
            });
            dataAnalysis.membershipOperationPanel.addMouseListener(new MouseAdapter() {
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
            //todo return button should be finished in outer gui
        }

        //======== managerPassword ========
        {
            //todo
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

    private void managerPasswordPanelMouseClicked(MouseEvent e) {
        card.show(main,"managerPassword");
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
