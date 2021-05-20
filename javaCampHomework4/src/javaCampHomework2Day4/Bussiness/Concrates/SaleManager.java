package javaCampHomework2Day4.Bussiness.Concrates;

import javaCampHomework2Day4.Bussiness.Abstracts.ISaleManager;
import javaCampHomework2Day4.Entities.Abstracts.ICampain;
import javaCampHomework2Day4.Entities.Abstracts.IGame;
import javaCampHomework2Day4.Entities.Abstracts.IPlayer;

public class SaleManager implements ISaleManager{

	@Override
	public void saleGame(IGame game, IPlayer player) {
		System.out.println(player.getFirstName()+" adl� oyuncu "+game.getName()+" adl� oyunu sat�n ald�!");
		System.out.println("Sat�n al�nan fiyat: "+game.getPrice());
		
	}

	@Override
	public void saleGame(IGame game, IPlayer player, ICampain campain) {
		double priceAfterDiscount = game.getPrice()-((game.getPrice()*campain.getCampainDiscount())/100);
		System.out.println(player.getFirstName()+" adl� oyuncu "+game.getName()+" adl� oyunu "+campain.getCampainName()+" kampanyas�ndan"
				+ " yararlanarak %"+campain.getCampainDiscount()+" indirimle sat�n ald�!");
		System.out.println("Sat�n al�nan indirimli fiyat: "+priceAfterDiscount);
		
	}

}
