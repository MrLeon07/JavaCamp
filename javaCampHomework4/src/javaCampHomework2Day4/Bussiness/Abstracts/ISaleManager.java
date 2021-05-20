package javaCampHomework2Day4.Bussiness.Abstracts;

import javaCampHomework2Day4.Entities.Abstracts.ICampain;
import javaCampHomework2Day4.Entities.Abstracts.IGame;
import javaCampHomework2Day4.Entities.Abstracts.IPlayer;

public interface ISaleManager {
	void saleGame(IGame game,IPlayer player);
	void saleGame(IGame game, IPlayer player,ICampain campain);

}
