package thirthWeekHomework;

public class InstructorManager {
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" G�ncellendi.");
	}
	public void getStudentsNames(Instructor instructor) {
		Student[] ogrenciler = instructor.getStudentList();
		for (Student student : ogrenciler) {
			System.out.println(student.getFullName()+" adl� ��renci "+ instructor.getFirstName()+" adl� e�itmenin ��rencisidir.");
		}
		
	}

}
