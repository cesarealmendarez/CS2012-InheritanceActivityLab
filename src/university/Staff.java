package university;

public class Staff extends Employee{
	protected String title;
	
	public Staff() {
		
	}
	
	public Staff(String title) {
		this.title = title;
	}
	
	public Staff(String title, String office, int salary, String dateHired, String name, String address, String phoneNumber, String emailAddress) {
		this.title = title;
		setOffice(office);
		setSalary(salary);
		setDateHired(dateHired);
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setEmailAddress(emailAddress);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Staff [title=" + title + ", office=" + office + ", salary=" + salary + ", dateHired=" + dateHired
				+ ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", emailAddress="
				+ emailAddress + "]";
	}
}
