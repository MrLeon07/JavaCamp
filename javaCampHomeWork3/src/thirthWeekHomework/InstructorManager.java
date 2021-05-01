package thirthWeekHomework;

public class InstructorManager {
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" Güncellendi.");
	}
	public void getStudentsNames(Instructor instructor) {
		Student[] ogrenciler = instructor.getStudentList();
		for (Student student : ogrenciler) {
			System.out.println(student.getFullName()+" adlý öðrenci "+ instructor.getFirstName()+" adlý eðitmenin öðrencisidir.");
		}
		
	}

}
