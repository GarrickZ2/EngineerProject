package database.information;

import database.Data;
import database.UserData;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Huang
 * @version 1.2
 */
public class MemberList extends DataType{

	private ArrayList<Membership> msl;

	public MemberList(ArrayList<Membership> msl) {
		this.msl = msl;
	}
	public MemberList() {
		msl = new ArrayList<Membership>();
	}

	public ArrayList<Membership> getMsl() {
		return msl;
	}


	public void setMsl(ArrayList<Membership> msl) {
		this.msl = msl;
	}


	public static boolean checkPhoneFormat(String telephone) {
		if(telephone == null) {
			return false;
		}
		// Todo Some problem with this pattern character
		final Pattern pat = Pattern.compile("^[1][3578][0-9]{9}$");
		Matcher mat = pat.matcher(telephone);	
		return mat.find();					
	}
	
	public static boolean checkEmailFormat(String email)  
    {
		if(email == null) {
			return false;
		}
		final String pattern1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(pattern1);  
        Matcher mat = pattern.matcher(email);  
        return mat.find(); 
    }
	
	public String createMember(String firstName,String lastName,String telephone,String eMail) {
		
		//Check whether the data is empty
		if(firstName == null||lastName == null||(telephone == null&&eMail == null)) {
			System.out.println("Error type 01: Null message input, name is empty or both telephone and e-mail are null");
		}
		
		//Check whether the format is correct
		else if((firstName.matches("[a-zA-Z]+")&&lastName.matches("[a-zA-Z]+"))&&(checkPhoneFormat(telephone)||checkEmailFormat(eMail))){
			
			
			//Check whether the telephone and e-mail provided is used
			if(!this.queryMember(telephone)&&!this.queryMember(eMail)) {
				
				//Create a new object Membership
				Membership ms = new Membership();
				
				//Set the data
				ms.setFirstName(firstName);
				ms.setLastName(lastName);
				if(telephone == null) {
					ms.seteMail(eMail);
				}
				else {
					ms.setTelephone(telephone);
				}
				ms.setStamps(0);
				
				//Get the lastest membershipID
				if(msl.size()==0) {
					ms.setMembershipId("M000001");
					msl.add(ms);
					return ms.getMembershipId();
				}else {
					String lastId = msl.get(msl.size()-1).getMembershipId();
					
					//The digital part of new ID is the latest ID plus 1 
					String alaphPart = lastId.substring(0,1);
					String numPart= lastId.substring(1,lastId.length());
					int y;
					y = Integer.parseInt(numPart);
					String temp = String.valueOf(y+1);
					
					//Check whether the number of members is over the max capacity of present format
					if(temp.length()>numPart.length()) {
						System.out.println("Original number of membership is full.");
					}else {
						while(true) {
							if(temp.length()!=numPart.length()) {
								temp = "0"+temp;
							}else{ break;}
						}
						
						//Generate the new ID
						ms.setMembershipId(alaphPart + temp);
						msl.add(ms);
						return ms.getMembershipId();
					}
				}
			}
			else {
				System.out.println("Error type 03: Telephone or E-mail address has been already used");
			}
		}
		else {
			System.out.println("Error type 02: Invalid format of telephone or e-mail address");
		}
		return "Please check the data input";
	}
	
	public boolean deleteMember(String id) {
		
		for(Membership ms :msl) {
			if(ms.getMembershipId().equals(id)) {
				msl.remove(ms);
				return true;
			}
		}
		return false;
	}
	
	public boolean queryMember(String str) {
		String keywords = null;
		if(str == null) {
			keywords = "empty";
		}else {
			keywords = str;
		}
		for(Membership temp: msl) {
			if(temp.getMembershipId().equals(keywords) || temp.getTelephone().equals(keywords) || temp.geteMail().equals(keywords)) {
				return true;
			}
		}
		return false;
	}
	public void save(){
		System.out.println(this);
		UserData userData = new UserData();
		userData.saveInfo(this);
	}


	public static void main(String[] s) {
		MemberList list = new MemberList();
		Membership m = new Membership("M0001","Tian", "Huang", "15500043370", null,0);
		list.msl.add(m);
		System.out.println("Create: "+list.createMember("Tian", "Huang", "15500043371", null));
	}

	@Override
	public String toString() {
		StringBuilder content = new StringBuilder();
		for(Membership m : getMsl()){
			content.append(m).append("\n");
		}
		return content.toString();
	}
}
