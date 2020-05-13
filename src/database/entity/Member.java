package database.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Member Class, a type of DataType, used to store the elementary data of entity.
 *
 * @author Huang
 * @version 1.0
 */
public class Member extends DataType{
	private String membershipId;
	private String firstName;
	private String lastName;
	private String telephone;
	private String eMail;
	private int stamps;
	private String lastOrder;

	private String registrationDate;


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

	/**
	 * An empty constructor
	 */
	public Member() {
	}

	/**
	 * Constructor for this Class, usually used to create and initialize a new Member
	 * @param membershipId the id of membership
	 * @param firstName the firstName of user
	 * @param lastName the lastName of user
	 * @param telephone the telephone of user
	 * @param eMail the eMail of user
	 * @param stamps the stamps of user
	 * @param lastOrder the last order time of user
	 */
	public Member(String membershipId, String firstName, String lastName, String telephone, String eMail,
				  int stamps, String lastOrder) {
		this.membershipId = membershipId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.eMail = eMail;
		this.stamps = stamps;
		this.lastOrder = lastOrder;
	}

	/**
	 * add the users's register date of user's registration
	 * @param registrationDate new Date()
	 */
	public void additionRegistrationDate(Date registrationDate){
		if(this.registrationDate == null){
			this.registrationDate = format1.format(registrationDate);
		}else{
			System.out.println("<Method:additionRegistrationDate>Have already set the reg date.");
		}
	}

	/**
	 * add one stamp for users, usually happened when user purchase a product
	 */
	public void addStamps(){
		this.stamps += 1;
	}

	/**
	 * Let the member use stamps
	 */
	public void useStamps(){
		if(stamps < 10){
			System.out.println("These isn't enough stamps");
			return;
		}
		stamps -= 10;
	}

	/**
	 * Override method for toString method. Arrange them into a csv format
	 * @return csv format String
	 */
	@Override
	public String toString() {
		return membershipId + "," + firstName + "," +lastName + "," +telephone + "," +
				eMail + "," + stamps + "," + lastOrder + "," + registrationDate;
	}
}
