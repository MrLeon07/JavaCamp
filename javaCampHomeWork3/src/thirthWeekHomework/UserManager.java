package thirthWeekHomework;

public class UserManager {
	
	public void registerStudent(User user) {
		System.out.println(user.getFullName()+" veri taban�na eklendi!");
		
	}
	public void deleteStudent(User user) {
		System.out.println(user.getFullName()+ " veri taban�ndan silindi!");
		
	}

}
