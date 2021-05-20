package javaCampHomework2Day4.Entities.Concrates;

import javaCampHomework2Day4.Entities.Abstracts.IPlayer;

public class Player implements IPlayer{
	private int id;
	private String firstName;
	private String lastName;
	private String idNumber;
	private int YearOfBirth;
	public Player(int id, String firstName, String lastName, String idNumber, int yearOfBirth) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		YearOfBirth = yearOfBirth;
	}
	@Override
	public int getId() {
		return this.id;
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
	public long getIdNumber() {
		return Long.valueOf(this.idNumber);
	}
	@Override
	public int getYearOfBirth() {
		return this.YearOfBirth;
	}
	
	

}
