/**
 * @author All team members
 */

import database.MenuData;
import database.information.Menu;
import org.junit.Test;

import javax.swing.*;

public class TestFunction {

    @Test
    public void testMenu(){
        String a = JOptionPane.showInputDialog("Input:");
        System.out.println(a);
        if(a==null){
            System.out.println("Right");
        }else {
            System.out.println("wrong");
        }
    }
}
