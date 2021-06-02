package JavaCampHomework5.bussiness.abstracts;

import JavaCampHomework5.Entities.Abstracts.IUser;
import JavaCampHomework5.adapters.abstracts.ILoginAuthor;

public interface IUserManager {
	void registerNewUser(String firstName,String lastName,String email,String password);
	void deleteUser(IUser user);
	void updateUser(IUser user);
	void confirmUser(String email);
	void login(String email,String password);
	void login(ILoginAuthor LoginAuth);

}
