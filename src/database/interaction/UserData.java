package database.interaction;

import database.entity.DataType;
import database.entity.Member;
import database.entityList.MemberList;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Zixuan Zhang
 */
public class UserData extends BaseData{
    private final String addr = "data/member.csv";

    @Override
    public MemberList loadInfo(){
        ArrayList<Member> members = new ArrayList<Member>();
        File file = new File(addr);
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((contents = reader.readLine())!=null){
                String[] attributes = contents.split(",");
                Member member = new Member(attributes[0],attributes[1],attributes[2],attributes[3],
                        attributes[4], Integer.parseInt(attributes[5]), attributes[6]);
                members.add(member);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("The necessary file has been broken, please re-install.");
            System.exit(-1);
        }
        return new MemberList(members);
    }

    @Override
    public void saveInfo(DataType dataType) {
        MemberList memberList = (MemberList)dataType;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(addr));
            for(Member member :memberList.getMsl()){
                writer.write(String.valueOf(member));
                writer.newLine();
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
