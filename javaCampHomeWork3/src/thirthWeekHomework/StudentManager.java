package thirthWeekHomework;

public class StudentManager {
	public void getRegisteredCourses(Student student) {
		String[] registeredCourses = student.getRegisteredCourses();
		for (String courseName : registeredCourses) {
			System.out.println(student.getFullName()+" "+courseName+" kursunun öğrencisidir.");
		}}
	
	
	

}
