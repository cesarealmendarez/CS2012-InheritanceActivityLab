package university;

public class Faculty extends Employee{
	protected String officeHours;
	protected String rank;
	
	public Faculty() {
		
	}
	
	public Faculty(String officeHours, String rank) {
		this.officeHours = office;
		this.rank = rank;
	}
	
	public Faculty(String officeHours, String rank, String office, int salary, String dateHired, String name, String address, String phoneNumber, String emailAddress) {
		this.officeHours = officeHours;
		this.rank = rank;
		setOffice(office);
		setSalary(salary);
		setDateHired(dateHired);
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setEmailAddress(emailAddress);
		
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Faculty [officeHours=" + officeHours + ", rank=" + rank + ", office=" + office + ", salary=" + salary
				+ ", dateHired=" + dateHired + ", name=" + name + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", emailAddress=" + emailAddress + "]";
	}		
}
