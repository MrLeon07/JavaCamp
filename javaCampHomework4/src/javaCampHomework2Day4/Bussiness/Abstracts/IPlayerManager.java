package javaCampHomework2Day4.Bussiness.Abstracts;

import javaCampHomework2Day4.Entities.Abstracts.IPlayer;

public interface IPlayerManager {
	void registerPlayer(IPlayer player);
	void updatePlayer(IPlayer player);
	void removePlayer(IPlayer player);

}
