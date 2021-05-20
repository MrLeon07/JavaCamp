package javaCampHomework1Day4;

public class Customer implements ICustomer{
	private int id;
	private String firstName;
	private String lastName;
	private String idNumber;
	private int yearOfBirth;
	
	public Customer(String firstName, String lastName, String idNumber, int YearOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.yearOfBirth = YearOfBirth;
	}
	@Override
	public String getFirstName() {
		return this.firstName;
	}
	@Override
	public long getIdNumber() {
		
		return Long.valueOf(this.idNumber);
	}
	@Override
	public int getId() {
		return this.id;
	}
	
	@Override
	public String getLastName() {
		return this.lastName;
	}
	@Override
	public int getYearOfBirth() {
		// TODO Auto-generated method stub
		return this.yearOfBirth;
	}
}
