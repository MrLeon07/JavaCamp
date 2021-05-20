package javaCampHomework2Day4.Entities.Concrates;

import javaCampHomework2Day4.Entities.Abstracts.IGame;

public class Game implements IGame{
	private String name;
	private double price;

	public Game(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

}
