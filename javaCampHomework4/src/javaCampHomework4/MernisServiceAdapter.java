package javaCampHomework4;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CustomerCheck(ICustomer customer) {
		try {
			KPSPublicSoapProxy client = new KPSPublicSoapProxy();
			
			return client.TCKimlikNoDogrula(customer.getIdNumber(), customer.getFirstName(), customer.getLastName().toUpperCase(),
					customer.getYearOfBirth());
		} catch (NumberFormatException | RemoteException e) {
	
			e.printStackTrace();
			return false;	
		}		
		
	}

}
