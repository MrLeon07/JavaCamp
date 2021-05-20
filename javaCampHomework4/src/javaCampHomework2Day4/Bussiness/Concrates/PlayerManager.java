package javaCampHomework2Day4.Bussiness.Concrates;

import javaCampHomework2Day4.Adapters.Abstracts.IPlayerChecker;
import javaCampHomework2Day4.Bussiness.Abstracts.IPlayerManager;
import javaCampHomework2Day4.Database.Abstracts.IDatabaseConnector;
import javaCampHomework2Day4.Entities.Abstracts.IPlayer;

public class PlayerManager implements IPlayerManager{
	private IDatabaseConnector databaseConnector;
	private IPlayerChecker playerChecker;
	public PlayerManager(IDatabaseConnector databaseConnector,IPlayerChecker playerChecker) {
		this.databaseConnector = databaseConnector;
		this.playerChecker = playerChecker;
	}

	@Override
	public void registerPlayer(IPlayer player) {
		if(this.playerChecker.checkPlayer(player)) {
		this.databaseConnector.registerNewPlayer(player);}
		else {
			System.out.println("Sadece gerçek kiþiler kayýt olabilir!!");
		}
		
	}

	@Override
	public void updatePlayer(IPlayer player) {
		this.databaseConnector.updatePlayer(player);
	}

	@Override
	public void removePlayer(IPlayer player) {
		this.databaseConnector.removePlayer(player);
		
	}

}
