package javaCampHomework2Day4;

import javaCampHomework2Day4.Adapters.Abstracts.IPlayerChecker;
import javaCampHomework2Day4.Adapters.Concrates.MernisPlayerChecker;
import javaCampHomework2Day4.Bussiness.Abstracts.IPlayerManager;
import javaCampHomework2Day4.Bussiness.Abstracts.ISaleManager;
import javaCampHomework2Day4.Bussiness.Concrates.PlayerManager;
import javaCampHomework2Day4.Bussiness.Concrates.SaleManager;
import javaCampHomework2Day4.Database.Abstracts.IDatabaseConnector;
import javaCampHomework2Day4.Database.Concrates.MySQLConnector;
import javaCampHomework2Day4.Entities.Abstracts.ICampain;
import javaCampHomework2Day4.Entities.Abstracts.IGame;
import javaCampHomework2Day4.Entities.Abstracts.IPlayer;
import javaCampHomework2Day4.Entities.Concrates.Campain;
import javaCampHomework2Day4.Entities.Concrates.Game;
import javaCampHomework2Day4.Entities.Concrates.Player;

public class Main {

	public static void main(String[] args) {
		//Oyuncu kayýt, güncelleme ve silme iþlemleri.
		IPlayer player = new Player(1, "Güray","Ülger" , "77777777777", 2258);
		IDatabaseConnector connector = new MySQLConnector();
		IPlayerChecker playerChecker = new MernisPlayerChecker();
		IPlayerManager playerManager = new PlayerManager(connector,playerChecker);
		playerManager.registerPlayer(player);
		playerManager.updatePlayer(player);
		playerManager.removePlayer(player);
		IPlayer player2 = new Player(2, "Güray","Ülger" , "77777777777", 2365);
		playerManager.registerPlayer(player2);
		//Oyun satýþ iþlemleri
		ISaleManager saleManager = new SaleManager();
		ICampain campain = new Campain("Büyük yaz indirimi", player2, 10);
		IGame game = new Game("RandomBirOyunAdý", 200);
		IGame game2 = new Game("BasitBirOyun", 25);
		saleManager.saleGame(game, player2, campain);
		saleManager.saleGame(game2, player2);
		

	}

}
