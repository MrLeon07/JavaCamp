package thirthWeekHomework;

public class Student extends User{
	private String[] registeredCourses;
	private String currentCourse;
	
	public Student() {
		
	}
	public Student(int id,String idNumber,String firstName,String lastName,String email) {
		this.setId(id);
		this.setIdNumber(idNumber);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);

		
	}
	public String[] getRegisteredCourses() {
		return registeredCourses;
	}
	public void setRegisteredCourses(String[] registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	public String getCurrentCourse() {
		return currentCourse;
	}
	public void setCurrentCourse(String currentCourse) {
		this.currentCourse = currentCourse;
	}
}
