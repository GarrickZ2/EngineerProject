package database.information;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Huang
 * @version 1.0
 */
public class Membership {
	private String membershipId;
	private String firstName;
	private String lastName;
	private String telephone;
	private String eMail;
	private int stamps;
	private String lastOrder;

	private String registrationDate;


	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");

	public String getLastOrder() {
		return lastOrder;
	}

	public void setLastOrder(String lastOrder) {
		this.lastOrder = lastOrder;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = format1.format(registrationDate);
	}


	public String getMembershipId() {
		return membershipId;
	}
	public void setMembershipId(String membershipId) {
		this.membershipId = membershipId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public int getStamps() {
		return stamps;
	}
	public void setStamps(int stamps) {
		this.stamps = stamps;
	}
	public Membership() {
	}
	public Membership(String membershipId, String firstName, String lastName, String telephone, String eMail,
					  int stamps, String lastOrder) {
		this.membershipId = membershipId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.eMail = eMail;
		this.stamps = stamps;
		this.lastOrder = lastOrder;
	}


	public void additionRegistrationDate(Date registrationDate){
		if(this.registrationDate == null){
			this.registrationDate = format1.format(registrationDate);
		}else{
			System.out.println("<Method:additionRegistrationDate>Have already set the reg date.");
		}
	}

	public void additionRegistrationDate(String registrationDate){
		try{
			Date d = format1.parse(registrationDate);
			this.registrationDate = registrationDate;
		}catch(Exception e){
			//todo An alert window, window's content:
			System.out.println("<Method:additionRegistrationDate>Invalid date format.");
		}
	}


	public void addStamps(){
		this.stamps += 1;
	}

	public void useStamps(){
		if(stamps < 10){
			System.out.println("These isn't enough stamps");
			return;
		}
		stamps -= 10;
	}


	@Override
	public String toString() {
		return membershipId + "," + firstName + "," +lastName + "," +telephone + "," +
				eMail + "," + stamps + "," + lastOrder;
	}
}
