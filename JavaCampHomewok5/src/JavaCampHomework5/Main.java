package JavaCampHomework5;

import JavaCampHomework5.adapters.abstracts.ILoginAuthor;
import JavaCampHomework5.adapters.concrates.GoogleLoginAuthor;
import JavaCampHomework5.bussiness.abstracts.IUserManager;
import JavaCampHomework5.bussiness.concrates.UserManager;
import JavaCampHomework5.core.abstracts.IConfirmatory;
import JavaCampHomework5.core.abstracts.ILogger;
import JavaCampHomework5.core.concrates.EmailConfirmatory;
import JavaCampHomework5.core.concrates.EmailLogger;
import JavaCampHomework5.dataAccess.abstracts.IUserDao;
import JavaCampHomework5.dataAccess.concrates.MySqlDAO;

public class Main {

	public static void main(String[] args) {
		IUserDao dataAccess = new MySqlDAO();
		ILogger[] loggers = {new EmailLogger()};
		IConfirmatory confirmatory = new EmailConfirmatory();
		ILoginAuthor googleLoginAuthor = new GoogleLoginAuthor();
				
		IUserManager userManager = new UserManager(dataAccess,loggers,confirmatory);
		
		
		userManager.login(googleLoginAuthor);
		
		userManager.registerNewUser("aa", "bbb", "ulgerguray2@gmail.com", "ccccccc");
		userManager.confirmUser("ulgerguray2@gmail.com");
		userManager.login("ulgerguray2@gmail.com", "ccccccc");

	}

}
