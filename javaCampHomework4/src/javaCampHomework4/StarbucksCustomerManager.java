package javaCampHomework4;

public class StarbucksCustomerManager extends CustomerManager{
	private ICustomerCheckService CheckService;

	public StarbucksCustomerManager(ICustomerCheckService checkService) {
		CheckService = checkService;
	}

	@Override
	public void SaveToDatabase(ICustomer customer) {
		if(CheckService.CustomerCheck(customer)) {
			super.SaveToDatabase(customer);
		}
		else {
			System.out.println("Geçersiz kullanýcý");
		}
		
		
	}

}
