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
			System.out.println("Sayýn "+firstName+" sistemimize kaydýnýzý tamamlamak "
					+ "için lütfen "+email+" adresine gönderiðimiz linke týklayýnýz.");
			confirmatory.sendConfirmationMessage(email, "https://dogrulama-baglantýsý");
			for (ILogger Logger : loggers) {
				Logger.log(email,"E-posta gönderildi!");
			}
			
		}
		else {
			System.out.println("Kayýt baþarýsýz. Lütfen bilgilerinizin kurallara uygun olduðundan emin olun."
					+ " Kurallar:"
					+ "\n	* Ad ve soyad en az 2 karakterden oluþmalý,"
					+ "\n	* þifreniz en az 6 karakterden oluþmalý,"
					+ "\n	* gerçek bir e-posta adresine sahip olmalýsýnýz,"
					+ "\n	* e-posta adresiniz ile daha önceden sistemimizde kaydýnýz bulunmamalý.");
		}
		
		
	}

	@Override
	public void deleteUser(IUser user) {
		this.dataAccess.deleteUser(user);
		System.out.println("Kullanýcý silindi. Kullanýcý adý: "+user.getFirstName());
		
	}

	@Override
	public void updateUser(IUser user) {
		System.out.println("Kullanýcý güncellendi. Kullanýcý adý: "+user.getFirstName());
		
	}

	@Override
	public void confirmUser(String email) {
		if(dataAccess.isExists(email)) {
			dataAccess.confirmUser(email);
			System.out.println("Üyeliðiniz baþarýyla doðrulanmýþtýr.");
		}else {
			System.out.println("Sistemimizde kaydýnýz bulunmamaktadýr!");
		}
		
	}

	@Override
	public void login(String email, String password) {
		if(dataAccess.isExists(email)) {
			IUser user = dataAccess.getUser(email);
			if(user.getPassword().equals(password)) {
				System.out.println("Baþarýyla giriþ yaptýnýz sayýn: "+user.getFirstName());
			}
			else {
				System.out.println("Hatalý þifre girdiniz!");
			}
		}
		else {
			System.out.println("Kaydýnýz bulunamadý. Kayýt olmak ister misiniz?");
		}
		
	}

	@Override
	public void login(ILoginAuthor LoginAuth) {
		if(dataAccess.isExists(LoginAuth.getEmail())) {
			IUser user= dataAccess.getUser(LoginAuth.getEmail());
			System.out.println("Baþarýyla giriþ yaptýnýz sayýn: "+user.getFirstName());
		}
		else {
			System.out.println("Sistemde kaydýnýz bulunmamakta. Kayýt olmak ister misiniz ?");
		}
		
	}

}
