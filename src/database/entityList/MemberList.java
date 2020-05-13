package database.entityList;

import database.interaction.UserData;
import database.entity.DataType;
import database.entity.Member;

import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * MemberList Class, a type of DataType, used to store all the information of Member
 * @author Huang
 * @version 1.5
 */
public class MemberList extends DataType {

	private ArrayList<Member> msl;
	final private static int membershipIdLength = 8;
	private boolean fileChanged = false;
	private static int errorCode = -1;

	public MemberList() {
		msl = new ArrayList<Member>();
	}
	public MemberList(ArrayList<Member> msl) {
		this.msl = msl;
	}

	public ArrayList<Member> getMsl() {
		return msl;
	}


	public void setMembershipList(ArrayList<Member> msl) {
		this.msl = msl;
	}

	public static int getFinalNumber(ArrayList<Member> list){
		int temp;
		int max = 0;
		for (Member m : list){
			temp = Integer.parseInt(m.getMembershipId());
			if(temp >= max){
				max = temp;
			}
		}
		return max;
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
					}else{
						errorCode = 2;
						System.out.println("2: Telephone or e-mail format is invalid.");
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
						}else {
							errorCode = 2;
						}
					}
					//Else: Email is not null(Telephone is null)
					else {
						//Check if e-mail is null
						if(eMail != null){
							//Check if email format is right
							if(checkFormat(2,eMail)){
								//All conditions are met return true
								validation = true;
							}
							else {
								errorCode = 2;
							}
						}
						//Else: The last situation both telephone and email are null
						else{
							errorCode = 3;
							System.out.println("3:Either telephone or email is null");
						}
					}
				}
			}else {
				errorCode = 1;
				System.out.println("1:F or L name format is invalid.");
			}
		}else{
			errorCode = 0;
			System.out.println("0:Either f or l name is null.");
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
				//Create a new object Member
				Member ms = new Member();

				//Set the data
				ms.setFirstName(firstName);
				ms.setLastName(lastName);
				ms.setTelephone(telephone);
				ms.seteMail(eMail);
				ms.setStamps(5);
				ms.setRegistrationDate(new Date());
				ms.setLastName(null);

				//Get the lastest membershipID
				if(msl.size()==0) {
					ms.setMembershipId("00000001");
					msl.add(ms);
					return ms.getMembershipId();
				}else {
					String temp = String.valueOf(getFinalNumber(msl)+1);

					//Check whether the number of members is over the max capacity of present format
					if(temp.length()>membershipIdLength) {
						System.out.println("Error: Already achieved maximum capacity using original id allocation algorithm.");
					}else {
						while(true) {
							if(temp.length()!=membershipIdLength) {
								temp = "0" + temp;
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
		for(Member ms :msl) {
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

	public Member getMember(String str){
		String keywords = null;
		if(str == null) {
			keywords = "empty";
		}else {
			keywords = str;
		}
		for(Member temp: msl) {
			if(temp.getMembershipId().equals(keywords) || temp.getTelephone().equals(keywords) || temp.geteMail().equals(keywords)) {
				return temp;
			}
		}
		return new Member();
	}

	public void changeInfo(String id, String fName, String lName, String tel, String eMail){
		fileChanged = true;
		if(!checkValidation(fName, lName, tel, eMail)){
			System.out.println("Error: Invalid input");
		}else{
			Member ms;
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
		UserData userData = new UserData();
		userData.saveInfo(this);
	}


	@Override
	public String toString() {
		StringBuilder content = new StringBuilder();
		for(Member m : getMsl()){
			content.append(m).append("\n");
		}
		return content.toString();
	}

	public static void main(String[] s) {
		MemberList list = new MemberList();
		Member m = new Member("00000001","Tian", "Huang", "15500043370", null,0, null);
		list.msl.add(m);
		list.createMember("Tssn", "Huang", "15500043371", null);
		list.createMember("Hu", "Son", "18810009295", null);
		//System.out.println("Create: "+list.createMember("Tssn", "Huang", "15500043371", "447243910@qq.com"));
		Member x = list.getMember("00000001");
		System.out.println("Allocation:");
		System.out.println(x);
		System.out.println(list.msl.get(list.msl.size()-1));
		System.out.println("Change info:");
		list.changeInfo("00000001","gao","son",null,null);
		x = list.getMember("00000001");

		for(Member ms:list.msl){
			System.out.println(ms);
		}
	}
}
