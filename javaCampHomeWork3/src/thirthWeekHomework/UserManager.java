package thirthWeekHomework;

public class UserManager {
	
	public void registerStudent(User user) {
		System.out.println(user.getFullName()+" veri tabanýna eklendi!");
		
	}
	public void deleteStudent(User user) {
		System.out.println(user.getFullName()+ " veri tabanýndan silindi!");
		
	}

}
