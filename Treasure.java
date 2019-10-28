package main;

import java.util.Random;

public class Treasure extends GameEntity {

	public Treasure() {
		Random randy = new Random();
		int[] loc = { randy.nextInt(11) - 5, randy.nextInt(11) - 5 };

		this.setLocation(loc);
	}

	@Override
	public void printLocation() {

		System.out.println("Treasure position is: " + getLocation()[0] + " " + getLocation()[1]);

		super.printLocation();
	}

}
