package JavaCampHomework5.dataAccess.abstracts;

import JavaCampHomework5.Entities.Abstracts.IUser;

public interface IUserDao {
	public boolean isExists(String Email);
	public IUser getUser(String Email);
	public void registerUser(IUser user);
	public void updateUser(IUser user);
	public void deleteUser(IUser user);
	public void confirmUser(String Email);
}
