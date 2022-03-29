package university;

public class Employee extends Person{
	protected String office;
	protected int salary;
	protected String dateHired;
	
	public Employee() {
		
	}
	
	public Employee(String office, int salary, String dateHired) {
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	public Employee(String office, int salary, String dateHired, String name, String address, String phoneNumber, String emailAddress) {
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setEmailAddress(emailAddress);
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "Employee [office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + ", name=" + name
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + "]";
	}	
}
