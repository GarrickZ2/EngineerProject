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

	/**
	 * Create a new class with the memberlist ArrayList
	 * @param msl the ArrayList version for memberlist
	 */
	public MemberList(ArrayList<Member> msl) {
		this.msl = msl;
	}

	public ArrayList<Member> getMsl() {
		return msl;
	}
	public void setMembershipList(ArrayList<Member> msl) {
		this.msl = msl;
	}

	/**
	 * This method is used to get the last number of this memberlist
	 * @param list the member list
	 * @return the last number for number list
	 */
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

	/**
	 * Check the format for user's input.
	 * @param mode 0 represent check name, 1 represent check telephone, 2 represent check the email/
	 * @param information the input of user
	 * @return the boolean value whether this format is right or not.
	 */
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

	/**
	 * Check the register is whether validation
	 * @param firstName the firstName of user
	 * @param lastName the last Name of user
	 * @param telephone the telephone of user
	 * @param eMail the email of user
	 * @return whether this information is valid
	 */
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

	/**
	 * This method take the input and generate a new member
	 * @param firstName the firstName of user
	 * @param lastName the last Name of user
	 * @param telephone the telephone of user
	 * @param eMail the email of user
	 * @return the condition for this register
	 */
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

	/**
	 * Delete the number from this member list
	 * @param id the id of member you want to delete
	 * @return the boolean value whether delete successfully.
	 */
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

	/**
	 * Input the user's id and query whether we have such a user
	 * @param str the id of the user you want to search
	 * @return the boolean value whether exists such a user
	 */
	public boolean queryMember(String str) {
		return this.getMember(str).getMembershipId() != null;
	}

	/**
	 * get the user class according the input id
	 * @param str the id of the user
	 * @return Member class for the specific id
	 */
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

	/**
	 * Change the information of one user
	 * @param id the id of the user you want to change
	 * @param fName the firstName you want to change
	 * @param lName the lastName you want to change
	 * @param tel the telephone number you want to change
	 * @param eMail the email you want to change
	 */
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

	/**
	 * Save the information into the user database.
	 */
	public void saveMembershipCsv(){
		UserData userData = new UserData();
		userData.saveInfo(this);
	}

	/**
	 * Print all the users' information
	 * @return all the users' information String
	 */
	@Override
	public String toString() {
		StringBuilder content = new StringBuilder();
		for(Member m : getMsl()){
			content.append(m).append("\n");
		}
		return content.toString();
	}

}
