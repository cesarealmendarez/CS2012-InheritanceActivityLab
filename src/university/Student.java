package university;

public class Student extends Person{
	protected String classStatus;
	
	public Student(){
		
	}
	
	public Student(String classStatus) {
		this.classStatus = classStatus;
	}
	
	public Student(String classStatus, String name, String address, String phoneNumber, String emailAddress) {
		this.classStatus = classStatus;
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setEmailAddress(emailAddress);
	}

	public String getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(String classStatus) {
		this.classStatus = classStatus;
	}

	@Override
	public String toString() {
		return "Student [classStatus=" + classStatus + ", name=" + name + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", emailAddress=" + emailAddress + "]";
	}
	
}
