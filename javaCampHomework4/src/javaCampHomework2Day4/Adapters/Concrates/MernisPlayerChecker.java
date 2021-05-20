package javaCampHomework2Day4.Adapters.Concrates;

import java.rmi.RemoteException;

import javaCampHomework2Day4.Adapters.Abstracts.IPlayerChecker;
import javaCampHomework2Day4.Entities.Abstracts.IPlayer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisPlayerChecker implements IPlayerChecker{

	@Override
	public boolean checkPlayer(IPlayer player) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(player.getIdNumber(), player.getFirstName(), player.getLastName().toUpperCase(), player.getYearOfBirth());
		} catch (RemoteException e) {
			
			e.printStackTrace();
			return false;
		}
		
	}

}
