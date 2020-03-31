package database.information;

public class Membership {
	private String membershipId;
	private String firstName;
	private String lastName;
	private String telephone;
	private String eMail;
	private int stamps;




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

	public void addStamps(){
		this.stamps += 1;
	}

	public void useStamps(){
		if(stamps < 10){
			System.out.println("These isn't enough stamps");
			return;
		}
		this.stamps -= 10;
	}

	@Override
	public String toString() {
		return membershipId + "," + firstName + "," +lastName + "," +telephone + "," +
				eMail + "," + stamps;
	}
}
