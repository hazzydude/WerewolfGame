package main;

import java.util.Random;

public class Werewolf {
	private int[] position;

	public Werewolf() {
	
		int[] startPosition = { 4, 3 };
		this.position = startPosition;

	}

	public void move() {
		boolean werewolfMoved = true;
		Random randy = new Random();
		while (werewolfMoved) {

			int direction = randy.nextInt(3);
			// North
			if (direction == 0) {
				if (position[0] == 5) {
				} else {
					position[0]++;
					werewolfMoved = false;
				}
				// south
			} else if (direction == 1) {
				if (position[0] == -5) {
				} else {
					position[0]--;
					werewolfMoved = false;
				}
				// east
			} else if (direction == 2) {
				if (position[1] == 5) {
				} else {
					position[1]++;
					werewolfMoved = false;
				}
				// west
			} else if (direction == 3) {
				if (position[1] == -5) {
				} else {
					position[1]--;
					werewolfMoved = false;
				}
			}
		}
		

	}

	public void displayLocation() {
		System.out.println("Werewolf position is: " + position[0] + " " + position[1]);
	}

	public int[] getPosition() {
		return position;
	}

	public void setPosition(int[] position) {
		this.position = position;
	}
}
