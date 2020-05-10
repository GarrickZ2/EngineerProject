package database;

import database.information.DataType;
import database.information.MemberList;
import database.information.Membership;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Zixuan Zhang
 */
public class UserData extends BaseData{
    private final String addr = "data/membership.csv";

    @Override
    public MemberList loadInfo(){
        ArrayList<Membership> memberships = new ArrayList<Membership>();
        File file = new File(addr);
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((contents = reader.readLine())!=null){
                String[] attributes = contents.split(",");
                Membership membership = new Membership(attributes[0],attributes[1],attributes[2],attributes[3],
                        attributes[4], Integer.parseInt(attributes[5]), attributes[6]);
                memberships.add(membership);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("The necessary file has been broken, please re-install.");
            System.exit(-1);
        }
        return new MemberList(memberships);
    }

    @Override
    public void saveInfo(DataType dataType) {
        MemberList memberList = (MemberList)dataType;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(addr));
            for(Membership membership:memberList.getMsl()){
                writer.write(String.valueOf(membership));
                writer.newLine();
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
