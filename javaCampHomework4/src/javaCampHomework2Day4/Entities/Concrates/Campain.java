package javaCampHomework2Day4.Entities.Concrates;

import javaCampHomework2Day4.Entities.Abstracts.ICampain;
import javaCampHomework2Day4.Entities.Abstracts.IPlayer;

public class Campain implements ICampain{
	private String campainName;
	private IPlayer author;
	private double discount;

	public Campain(String campainName, IPlayer author, double discount) {
		
		this.campainName = campainName;
		this.author = author;
		this.discount = discount;
	}

	@Override
	public String getCampainName() {
		// TODO Auto-generated method stub
		return this.campainName;
	}

	@Override
	public IPlayer getCampainAuthor() {
		// TODO Auto-generated method stub
		return this.author;
	}

	@Override
	public double getCampainDiscount() {
		// TODO Auto-generated method stub
		return this.discount;
	}

}
