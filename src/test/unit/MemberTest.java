package test.unit;

import database.entity.Member;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author H
 */
public class MemberTest {

    Member m = new Member("00000001","th","H","15500043370",
            "447243910@qq.com",30,"empty");
    @Test
    public void testRegDate(){
        m.setRegistrationDate(new Date());
        System.out.println(m.getRegistrationDate());
    }
    @Test
    public void testAdd(){
        int x = m.getStamps();
        m.addStamps();
        assertEquals(x+1,m.getStamps());
    }
    @Test
    public void testUse(){
        int x = m.getStamps();
        m.useStamps();
        assertEquals(x-10,m.getStamps());
    }
}
