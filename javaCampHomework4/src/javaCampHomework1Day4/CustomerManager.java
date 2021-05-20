package javaCampHomework1Day4;

public class CustomerManager implements ICustomerService{

	@Override
	public void SaveToDatabase(ICustomer customer) {
		System.out.println(customer.getFirstName()+" Veri tabanýna kayýt edildi.");
		
	}

}
