package intro;

import thirthWeekHomework.Instructor;
import thirthWeekHomework.InstructorManager;
import thirthWeekHomework.Student;
import thirthWeekHomework.StudentManager;
import thirthWeekHomework.UserManager;

public class Main {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setFirstName("Güray");
		student1.setLastName("Ulger");
		student1.setEmail("alsdknvlamsşdv@gmail.com");
		student1.setIdNumber("12345678912");
		student1.setId(1);
		student1.setRegisteredCourses(new String[]{"Java","React"});
		
		Student student2 = new Student(2,"98765432198","Ulger","Guray","qwerjnqwerl@hotmail.com");
		student2.setRegisteredCourses(new String[]{"Java","React","C#"});
		
		Instructor egitmen = new Instructor(6,"74125896314","Engin","Demirog","Java","ornekEposta");
		
		egitmen.setStudentList(new Student[]{student1,student2});
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		userManager.registerStudent(student1);
		userManager.registerStudent(student2);
		userManager.registerStudent(egitmen);
		studentManager.getRegisteredCourses(student1);
		instructorManager.getStudentsNames(egitmen);
	}

}
