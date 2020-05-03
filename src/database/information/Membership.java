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

	private String registrationDate;
	private String lConsumptionTime;
	private double lConsumptionCost;
	private boolean lConsumptionUseCoupon;

	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat format_1 = new SimpleDateFormat("yyyy-MM-dd");


	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = format_1.format(registrationDate);
	}

	public String getlConsumptionTime() {
		return lConsumptionTime;
	}

	public void setlConsumptionTime(String lConsumptionTime) {
		this.lConsumptionTime = lConsumptionTime;
	}

	public void setlConsumptionTime(Date lConsumptionTime) {
		this.lConsumptionTime = format.format(lConsumptionTime);
	}

	public double getlConsumptionCost() {
		return lConsumptionCost;
	}

	public void setlConsumptionCost(double lConsumptionCost) {
		this.lConsumptionCost = lConsumptionCost;
	}

	public boolean islConsumptionUseCoupon() {
		return lConsumptionUseCoupon;
	}

	public void setlConsumptionUseCoupon(boolean lConsumptionUseCoupon) {
		this.lConsumptionUseCoupon = lConsumptionUseCoupon;
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
	public Membership(String membershipID, String firstName, String lastName, String telephone, String eMail, int stamps) {
		this.membershipId = membershipID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.eMail = eMail;
		this.stamps = stamps;
	}

	public Membership(String membershipID, String firstName, String lastName, String telephone,
					  String eMail, int stamps, Date registrationDate, Date lConsumptionTime,
					  double lConsumptionCost, boolean lConsumptionUseCoupon) {
		this.membershipId = membershipID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.eMail = eMail;
		this.stamps = stamps;
		this.registrationDate = format_1.format(registrationDate);
		setLastConsumption(lConsumptionTime,lConsumptionCost,lConsumptionUseCoupon);
	}

	public Membership(String membershipID, String firstName, String lastName, String telephone,
					  String eMail, int stamps, String registrationDate, String lConsumptionTime,
					  double lConsumptionCost, boolean lConsumptionUseCoupon) {
		this.membershipId = membershipID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.eMail = eMail;
		this.stamps = stamps;
		this.registrationDate = registrationDate;
		setLastConsumption(lConsumptionTime,lConsumptionCost,lConsumptionUseCoupon);
	}

	public void additionRegistrationDate(Date registrationDate){
		if(this.registrationDate == null){
			this.registrationDate = format_1.format(registrationDate);
		}else{
			System.out.println("<Method:additionRegistrationDate>Have already set the reg date.");
		}
	}

	public void additionRegistrationDate(String registrationDate){
		try{
			Date d = format_1.parse(registrationDate);
			this.registrationDate = registrationDate;
		}catch(Exception e){
			//todo An alert window, window's content:
			System.out.println("<Method:additionRegistrationDate>Invalid date format.");
		}
	}

	public void setLastConsumption(Date lConsumptionTime, double lConsumptionCost, boolean lConsumptionUseCoupon){

		setlConsumptionTime(format.format(lConsumptionTime));
		setlConsumptionCost(lConsumptionCost);
		setlConsumptionUseCoupon(lConsumptionUseCoupon);
	}

	public void setLastConsumption(String lConsumptionTime, double lConsumptionCost, boolean lConsumptionUseCoupon){
		setlConsumptionTime(lConsumptionTime);
		setlConsumptionCost(lConsumptionCost);
		setlConsumptionUseCoupon(lConsumptionUseCoupon);
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
				eMail + "," + stamps;
	}
}
