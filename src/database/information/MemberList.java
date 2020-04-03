package database.information;

import database.UserData;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Huang
 * @version 1.4
 */
public class MemberList extends DataType {

	private ArrayList<Membership> msl;
	final private static int membershipIdLength = 8;
	private boolean fileChanged = false;

	public MemberList() {
		msl = new ArrayList<Membership>();
	}
	public MemberList(ArrayList<Membership> msl) {
		this.msl = msl;
	}

	public ArrayList<Membership> getMsl() {
		return msl;
	}


	public void setMembershipList(ArrayList<Membership> msl) {
		this.msl = msl;
	}

	public static boolean checkFormat(int mode, String information){

		if(information == null){
			return false;
		}

		String format = null;
		//Mode 0: Name
		final String pattern0 = "[a-zA-Z]+$";
		//Mode 1: Tel
		final String pattern1 = "^[1][3578][0-9]{9}$";
		//Mode 2: Email
		final String pattern2 = "^([a-z0-9A-Z]+[-|.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		switch (mode){
			case 0:
				format = pattern0; break;
			case 1:
				format = pattern1; break;
			case 2:
				format = pattern2; break;
			default:
				System.out.println("Waring: Default case occurs.");
				return false;
		}
		Pattern pattern = Pattern.compile(format);
		Matcher mat = pattern.matcher(information);
		return mat.find();
	}

	public static boolean checkValidation(String firstName, String lastName, String telephone, String eMail){

		boolean validation = false;

		//Check if both fName and lName are not null
		if((firstName != null)&&(lastName != null)){
			//Check if both formats of first and last name are right
			if(checkFormat(0,firstName)&&checkFormat(0,lastName)){
				//Check if both tel and email are not null
				if((telephone != null) && (eMail != null)){
					//Check if both formats of telephone and email are right
					if(checkFormat(1,telephone)&&checkFormat(2,eMail)){
						//All conditions are met return true
						validation = true;
					}
				}
				//Else: One of telephone and email is null
				else{
					//Check if telephone is not null(Email is null)
					if(telephone != null){
						//Check if telephone format is right
						if(checkFormat(1,telephone)){
							//All conditions are met return true
							validation = true;
						}
					}
					//Else: Email is not null(Telephone is null)
					else {
						//Check if email format is right
						if(checkFormat(2,eMail)){
							//All conditions are met return true
							validation = true;
						}
						//Else: The last situation both telephone and email are null(It's for changeTnfo method)
						else{
							validation = true;
						}
					}
				}
			}
		}
		return validation;
	}

	public String createMember(String firstName, String lastName, String telephone, String eMail) {
		fileChanged = true;
		if((telephone==null)&&(eMail==null)){
			return "Error: Invalid data input.";
		}
		//Check the validation of inputs
		if(checkValidation(firstName, lastName, telephone, eMail)){
			//Check if telephone or email exists
			if((!this.queryMember(telephone))&&(!this.queryMember(eMail))){
				//Create a new object Membership
				Membership ms = new Membership();

				//Set the data
				ms.setFirstName(firstName);
				ms.setLastName(lastName);
				ms.setTelephone(telephone);
				ms.seteMail(eMail);
				ms.setStamps(0);

				//Get the lastest membershipID
				if(msl.size()==0) {
					ms.setMembershipId("00000001");
					msl.add(ms);
					return ms.getMembershipId();
				}else {
					String lastID = msl.get(msl.size()-1).getMembershipId();
					int idValue = Integer.parseInt(lastID);
					String temp = String.valueOf(idValue+1);

					//Check whether the number of members is over the max capacity of present format
					if(temp.length()>membershipIdLength) {
						System.out.println("Error: Already achieved maximum capacity using original id allocation algorithm.");
					}else {
						while(true) {
							if(temp.length()!=membershipIdLength) {
								temp = "0"+temp;
							}else {
								break;
							}
						}
						//Generate the new ID
						ms.setMembershipId(temp);
						msl.add(ms);
						return ms.getMembershipId();
					}
				}
			}else {
				System.out.println("Error: Duplicate input.");
			}
		}else {
			System.out.println("Error: Invalid data input.");
		}
		return "Error: Invalid data input.";
	}

	public boolean deleteMember(String id) {
		fileChanged = true;
		for(Membership ms :msl) {
			if(ms.getMembershipId().equals(id)) {
				msl.remove(ms);
				return true;
			}
		}
		return false;
	}

	public boolean queryMember(String str) {
		return this.getMember(str).getMembershipId() != null;
	}

	public Membership getMember(String str){
		String keywords = null;
		if(str == null) {
			keywords = "empty";
		}else {
			keywords = str;
		}
		for(Membership temp: msl) {
			if(temp.getMembershipId().equals(keywords) || temp.getTelephone().equals(keywords) || temp.geteMail().equals(keywords)) {
				return temp;
			}
		}
		return new Membership();
	}

	public void changeInfo(String id, String fName, String lName, String tel, String eMail){
		fileChanged = true;
		if(!checkValidation(fName, lName, tel, eMail)){
			System.out.println("Error: Invalid input");
			return;
		}else{
			Membership ms = new Membership();
			if(this.queryMember(id)){
				ms = this.getMember(id);
				this.deleteMember(id);
				if(fName != null){
					ms.setFirstName(fName);
				}
				if(lName != null){
					ms.setLastName(lName);
				}
				if(tel != null){
					ms.setTelephone(tel);
				}
				if(eMail != null){
					ms.seteMail(eMail);
				}
				msl.add(ms);
			}
		}
	}

	public void saveMembershipCsv(){
		if(fileChanged){
			System.out.println(this);
			UserData userData = new UserData();
			userData.saveInfo(this);
		}
	}

	@Override
	public String toString() {
		StringBuilder content = new StringBuilder();
		for(Membership m : getMsl()){
			content.append(m).append("\n");
		}
		return content.toString();
	}

	public static void main(String[] s) {
		MemberList list = new MemberList();
		Membership m = new Membership("00000001","Tian", "Huang", "15500043370", null,0);
		list.msl.add(m);
		list.createMember("Tssn", "Huang", "15500043371", null);
		list.createMember("Hu", "Son", "18810009295", null);
		//System.out.println("Create: "+list.createMember("Tssn", "Huang", "15500043371", "447243910@qq.com"));
		Membership x = list.getMember("00000001");
		System.out.println("Allocation:");
		System.out.println(x);
		System.out.println(list.msl.get(list.msl.size()-1));
		System.out.println("Change info:");
		list.changeInfo("00000001","gao","son",null,null);
		x = list.getMember("00000001");

		for(Membership ms:list.msl){
			System.out.println(ms);
		}
	}
}
