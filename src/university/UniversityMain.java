package university;

public class UniversityMain {

	public static void main(String[] args) {
		Person newPerson = new Person("John Kansas", "106 Cherry Camp Road", "+1(671) 402-3200", "john4real@yahoo.com");
		Student newStudent = new Student("Senior", "Mark Taylor", "3019 Very Real Road", "+1(191) 412-8757", "mark4real@yahoo.com");
		Employee newEmployee = new Employee("KH-364", 190000, "September 10 2009", "Gary Steamroll", "1029 Wealthy Road", "+1(101) 919-1830", "gary4real@yahoo.com");
		Faculty newFaculty = new Faculty("10am-12pm", "Dean", "BS-109", 105010, "December 8 2000", "Harold Parold", "6719 Rainbow Road", "+1(909) 131-7378", "harold4real@yahoo.com");
		Staff newStaff = new Staff("Instructor", "BS-110", 90010, "March 10 2022", "Stewart Newart", "6720 Rainbow Road", "+1(919) 231-7379", "stewart4real@yahoo.com");
		
		System.out.println(newEmployee.toString());
		System.out.println(newStaff.toString());
		System.out.println(newFaculty.toString());
		System.out.println(newPerson.toString());
		System.out.println(newStudent.toString());
		
	}

}
