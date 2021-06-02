package JavaCampHomework5.bussiness.concrates;

import JavaCampHomework5.Entities.Abstracts.IUser;
import JavaCampHomework5.Entities.Concrates.User;
import JavaCampHomework5.adapters.abstracts.ILoginAuthor;
import JavaCampHomework5.bussiness.abstracts.IUserManager;
import JavaCampHomework5.core.Utils;
import JavaCampHomework5.core.abstracts.IConfirmatory;
import JavaCampHomework5.core.abstracts.ILogger;
import JavaCampHomework5.dataAccess.abstracts.IUserDao;

public class UserManager implements IUserManager{
	private IUserDao dataAccess;
	private ILogger[] loggers;
	private IConfirmatory confirmatory;
	public UserManager(IUserDao dataAccess,ILogger[] loggers,IConfirmatory confirmatory) {
		super();
		this.confirmatory = confirmatory;
		this.dataAccess = dataAccess;
		this.loggers = loggers;
	}

	@Override
	public void registerNewUser(String firstName,String lastName,String email,String password) {
		if(firstName.length()>= 2 && lastName.length()>= 2 && Utils.matchEmail(email) && 
			 password.length()>= 6 &&	!dataAccess.isExists(email)) {
			dataAccess.registerUser(new User(firstName, lastName, email, password));
			System.out.println("Say�n "+firstName+" sistemimize kayd�n�z� tamamlamak "
					+ "i�in l�tfen "+email+" adresine g�nderi�imiz linke t�klay�n�z.");
			confirmatory.sendConfirmationMessage(email, "https://dogrulama-baglant�s�");
			for (ILogger Logger : loggers) {
				Logger.log(email,"E-posta g�nderildi!");
			}
			
		}
		else {
			System.out.println("Kay�t ba�ar�s�z. L�tfen bilgilerinizin kurallara uygun oldu�undan emin olun."
					+ " Kurallar:"
					+ "\n	* Ad ve soyad en az 2 karakterden olu�mal�,"
					+ "\n	* �ifreniz en az 6 karakterden olu�mal�,"
					+ "\n	* ger�ek bir e-posta adresine sahip olmal�s�n�z,"
					+ "\n	* e-posta adresiniz ile daha �nceden sistemimizde kayd�n�z bulunmamal�.");
		}
		
		
	}

	@Override
	public void deleteUser(IUser user) {
		this.dataAccess.deleteUser(user);
		System.out.println("Kullan�c� silindi. Kullan�c� ad�: "+user.getFirstName());
		
	}

	@Override
	public void updateUser(IUser user) {
		System.out.println("Kullan�c� g�ncellendi. Kullan�c� ad�: "+user.getFirstName());
		
	}

	@Override
	public void confirmUser(String email) {
		if(dataAccess.isExists(email)) {
			dataAccess.confirmUser(email);
			System.out.println("�yeli�iniz ba�ar�yla do�rulanm��t�r.");
		}else {
			System.out.println("Sistemimizde kayd�n�z bulunmamaktad�r!");
		}
		
	}

	@Override
	public void login(String email, String password) {
		if(dataAccess.isExists(email)) {
			IUser user = dataAccess.getUser(email);
			if(user.getPassword().equals(password)) {
				System.out.println("Ba�ar�yla giri� yapt�n�z say�n: "+user.getFirstName());
			}
			else {
				System.out.println("Hatal� �ifre girdiniz!");
			}
		}
		else {
			System.out.println("Kayd�n�z bulunamad�. Kay�t olmak ister misiniz?");
		}
		
	}

	@Override
	public void login(ILoginAuthor LoginAuth) {
		if(dataAccess.isExists(LoginAuth.getEmail())) {
			IUser user= dataAccess.getUser(LoginAuth.getEmail());
			System.out.println("Ba�ar�yla giri� yapt�n�z say�n: "+user.getFirstName());
		}
		else {
			System.out.println("Sistemde kayd�n�z bulunmamakta. Kay�t olmak ister misiniz ?");
		}
		
	}

}
