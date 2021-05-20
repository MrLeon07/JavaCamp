package javaCampHomework1Day4;

public class Main {

	public static void main(String[] args) {
	

		ICustomer customer = new Customer("Güray", "Ülger", "888888888888", 2101);
		CustomerManager Starbucks = new StarbucksCustomerManager(new MernisServiceAdapter());
		Starbucks.SaveToDatabase(customer);
		
		ICustomer customer2 = new Customer("Güray", "ülger","888888888888",2547);
		CustomerManager Nero = new NeroCustomerManager();
		Nero.SaveToDatabase(customer2);
		

	}

}
