package tdd;

import database.entity.Member;
import database.entityList.MemberList;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author H
 */
public class MemberListTest {
    MemberList ml = new MemberList();
    Member m1 = new Member("00000001","PERSON","A","15500043370","447243910@qq.com",0,"empty");
    Member m2 = new Member("00000002","PERSON","B","15500043371","447243911@qq.com",0,"empty");

    @Test
    public void testFinal(){
        ml.getMsl().add(m2);
        ml.getMsl().add(m1);
        assertEquals(2,MemberList.getFinalNumber(ml.getMsl()));
    }

    @Test
    public void testFormat(){
        assertFalse(MemberList.checkFormat(0,"Abc123"));
        assertFalse(MemberList.checkFormat(1,"11111111111"));
        assertFalse(MemberList.checkFormat(2,"Abc123.zz.xx"));
    }
    @Test
    public void testValidation(){
        assertTrue(MemberList.checkValidation("Tianhe","Huang","15500043370","447243910@qq.com"));
        assertFalse(MemberList.checkValidation("123","Huang","15500043370","447243910@qq.com"));
        assertFalse(MemberList.checkValidation("Tianhe","123","15500043370","447243910@qq.com"));
        assertFalse(MemberList.checkValidation("Tianhe","Huang","11111111111","447243910@qq.com"));
        assertFalse(MemberList.checkValidation("Tianhe","Huang","15500043370","447243910.123.com"));
        assertFalse(MemberList.checkValidation("Tianhe","Huang",null,null));
    }
    @Test
    public void testCreate(){
        ml.createMember("Tianhe","Huang","15500043370","447243910@qq.com");
        ml.createMember("Yuefeng","Hu","18810009295","1341414@qq.com");
        System.out.println(ml.getMsl());
    }
    @Test
    public void checkDelete(){
        ml.getMsl().add(m2);
        ml.getMsl().add(m1);
        assertTrue(ml.deleteMember("00000001"));
        assertFalse(ml.deleteMember("xssxsx"));
        System.out.println(ml.getMsl());
    }
    @Test
    public void checkQuery(){
        ml.getMsl().add(m2);
        ml.getMsl().add(m1);
        assertTrue(ml.queryMember("00000001"));
        assertFalse(ml.queryMember("xssxsx"));
    }
    @Test
    public void checkGetMember(){
        ml.getMsl().add(m2);
        ml.getMsl().add(m1);
        assertEquals(ml.getMember("00000001"),m1);
    }
}
