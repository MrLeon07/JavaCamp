package javaCampHomework2Day4.Database.Abstracts;

import javaCampHomework2Day4.Entities.Abstracts.IPlayer;

public interface IDatabaseConnector {
	void registerNewPlayer(IPlayer player);
	void updatePlayer(IPlayer player);
	void removePlayer(IPlayer player);

}
