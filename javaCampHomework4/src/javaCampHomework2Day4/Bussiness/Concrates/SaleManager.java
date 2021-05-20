package javaCampHomework2Day4.Bussiness.Concrates;

import javaCampHomework2Day4.Bussiness.Abstracts.ISaleManager;
import javaCampHomework2Day4.Entities.Abstracts.ICampain;
import javaCampHomework2Day4.Entities.Abstracts.IGame;
import javaCampHomework2Day4.Entities.Abstracts.IPlayer;

public class SaleManager implements ISaleManager{

	@Override
	public void saleGame(IGame game, IPlayer player) {
		System.out.println(player.getFirstName()+" adlý oyuncu "+game.getName()+" adlý oyunu satýn aldý!");
		System.out.println("Satýn alýnan fiyat: "+game.getPrice());
		
	}

	@Override
	public void saleGame(IGame game, IPlayer player, ICampain campain) {
		double priceAfterDiscount = game.getPrice()-((game.getPrice()*campain.getCampainDiscount())/100);
		System.out.println(player.getFirstName()+" adlý oyuncu "+game.getName()+" adlý oyunu "+campain.getCampainName()+" kampanyasýndan"
				+ " yararlanarak %"+campain.getCampainDiscount()+" indirimle satýn aldý!");
		System.out.println("Satýn alýnan indirimli fiyat: "+priceAfterDiscount);
		
	}

}
