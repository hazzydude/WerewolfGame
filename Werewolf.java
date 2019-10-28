package main;

public class Werewolf extends GameEntity {

	public Werewolf() {
		int[] position = { 4, 3 };
		this.setLocation(position);
	}

	@Override
	public void printLocation() {

		System.out.println("Werewolf position is: " + getLocation()[0] + " " + getLocation()[1]);

		super.printLocation();
	}

}
