package test.integration;

import database.entity.Menu;
import database.interaction.MenuData;
import org.junit.Test;

public class MenuDataTest {
    Menu m = new Menu();
    MenuData md = new MenuData();
    @Test
    public void testLoad(){
        m = md.loadInfo();
        System.out.println(m);
    }

}
