package JavaCampHomework5.adapters.concrates;

import JavaCampHomework5.adapters.abstracts.ILoginAuthor;
import googleAuth.GoogleLogin;

public class GoogleLoginAuthor implements ILoginAuthor{
	
	public String getEmail() {
		GoogleLogin google = new GoogleLogin();
		
		return "ulgerguray1@gmail.com";
	}

}
