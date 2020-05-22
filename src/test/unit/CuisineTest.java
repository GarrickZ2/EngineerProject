package test.unit;

import database.entity.Cuisine;
import org.junit.Test;

/**
 * @author H
 */
public class CuisineTest {

    Cuisine c = new Cuisine("Tonkotsu","soft","no please",
            true,true,true, 1,2,1,2,3);

    @Test
    public void testCal(){
        System.out.println(c.calculate());
    }
}
