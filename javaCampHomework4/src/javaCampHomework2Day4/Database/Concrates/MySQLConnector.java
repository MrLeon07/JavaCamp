package javaCampHomework2Day4.Database.Concrates;

import javaCampHomework2Day4.Database.Abstracts.IDatabaseConnector;
import javaCampHomework2Day4.Entities.Abstracts.IPlayer;

public class MySQLConnector implements IDatabaseConnector{
	@Override
	public void registerNewPlayer(IPlayer player) {
		System.out.println(player.getFirstName() +" veri tabanýna kayýt edildi.");
		
	}
	@Override
	public void updatePlayer(IPlayer player) {
		System.out.println(player.getFirstName()+"'in bilgileri güncellendi.");
		
	}
	@Override
	public void removePlayer(IPlayer player) {
		System.out.println(player.getFirstName()+" veri tabanýndan kaldýrýldý.");
		
	}

}
