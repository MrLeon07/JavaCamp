package JavaCampHomework5.dataAccess.concrates;

import java.util.HashMap;

import JavaCampHomework5.Entities.Abstracts.IUser;
import JavaCampHomework5.Entities.Concrates.User;
import JavaCampHomework5.dataAccess.abstracts.IUserDao;

public class MySqlDAO implements IUserDao{
	//HashMap g�sterilmedi ancak �rnek data olsun ve hem kay�t hem de giri� i�lemlerinde kullan�lmas� i�in �rnek olarak olu�turdum.
	HashMap<String,IUser> ornekUserList = new HashMap<String,IUser>();
	public MySqlDAO() {
		this.ornekDataOlustur();
	}
	
	@Override
	public boolean isExists(String Email) {
		//Databasedeki bilgiye g�re var ya da yok.
		return this.ornekUserList.containsKey(Email);
	}

	@Override
	public IUser getUser(String Email) {
		return this.ornekUserList.get(Email);
	}
	
	private void ornekDataOlustur() {
		//Bu veriler tamamen �rnektir ger�ke databasede eri�imi farkl� bunlar sadece �rnek.
		this.ornekUserList.put("ulgerguray1@gmail.com", new User("G�ray","�lger","ulgerguray1@gmail.com","111111"));
		this.ornekUserList.put("kkkkkk@gmail.com", new User("kkk","kkk","kkkkkk@gmail.com","222222"));
		this.ornekUserList.put("qqqqqqq@gmail.com", new User("qqq","qqq","qqqqqqq@gmail.com","33333"));
		this.ornekUserList.put("tttttt@gmail.com", new User("werty","ytrew","tttttt@gmail.com","444444"));
		this.ornekUserList.put("pppppp@gmail.com", new User("fghjy","ghkuyt","pppppp@gmail.com","555555"));
		this.ornekUserList.put("qwerty@gmail.com", new User("asdfgh","jjjjjjj","qwerty@gmail.com","6666666"));
	
	
	}

	@Override
	public void registerUser(IUser user) {
		//Orjinalinde Database kay�t kodlar� kullan�lacakt�r.
		this.ornekUserList.put(user.geteMail(),user);
		
	}

	@Override
	public void updateUser(IUser user) {
		
	}

	@Override
	public void deleteUser(IUser user) {
		this.ornekUserList.remove(user.geteMail());
		
	}

	@Override
	public void confirmUser(String Email) {
			System.out.println("Say�n "+this.ornekUserList.get(Email).getFirstName()+" e-posta adresiniz ba�ar�yla do�rulanm��t�r.");
		
		
		
	}

}
