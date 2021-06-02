package JavaCampHomework5.Entities.Concrates;

import JavaCampHomework5.Entities.Abstracts.IUser;

public class User implements IUser{
	private String firstName;
	private String lastName;
	private String eMail;
	private String password;
	
	public User(String firstName, String lastName, String eMail, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
	}
	@Override
	public String getFirstName() {
		return this.firstName;
	}
	@Override
	public String getLastName() {
		
		return this.lastName;
	}
	@Override
	public String geteMail() {
		return this.eMail;
	}
	@Override
	public String getPassword() {
		return this.password;
	}
	
	

}
