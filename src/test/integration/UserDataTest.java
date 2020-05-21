package test.integration;

import database.entityList.MemberList;
import database.interaction.UserData;
import org.junit.Test;

/**
 * @author H
 */
public class UserDataTest {
    UserData ud = new UserData();
    MemberList ml = new MemberList();

    @Test
    public void testLoad(){
        ml = ud.loadInfo();
        System.out.println(ml.getMsl());
    }
}
