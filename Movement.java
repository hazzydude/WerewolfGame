package main;

import java.util.Random;

public class Movement {

	String playerHitWall = "There appears to be an invisable wall blocking your path";

	public void move(GameEntity entity, int direction) {

		boolean entityMoved = false;
		int[] position = entity.getLocation();

		// player hit wall have to re-input

		while (!entityMoved) {

			switch (direction) {

			case 0: // north
				if (position[0] == 5) {
				} else {
					position[0]++;
					entityMoved = true;
				}
			case 1: // east
				if (position[1] == 5) {
				} else {
					position[1]++;
					entityMoved = true;
				}
			case 2: // south
				if (position[0] == -5) {

				} else {
					position[0]--;
					entityMoved = true;
				}
			case 3: // west
				if (position[1] == -5) {

				} else {
					position[1]--;
					entityMoved = true;
				}

			}

		}

	}

	public void move(Person entity, int direction) {

		boolean entityMoved = false;
		int[] position = entity.getPlayerPosition();

		// player hit wall have to re-input

		while (!entityMoved) {

			switch (direction) {

			case 0: // north
				if (position[0] == 5) {
					if (entity instanceof Person) {
						System.out.println(playerHitWall);
					}
				} else {
					position[0]++;
					entityMoved = true;
				}
			case 1: // east
				if (position[1] == 5) {
					if (entity instanceof Person) {
						System.out.println(playerHitWall);
					}
				} else {
					position[1]++;
					entityMoved = true;
				}
			case 2: // south
				if (position[0] == -5) {
					if (entity instanceof Person) {
						System.out.println(playerHitWall);
					}
				} else {
					position[0]--;
					entityMoved = true;
				}
			case 3: // west
				if (position[1] == -5) {
					if (entity instanceof Person) {
						System.out.println(playerHitWall);
					}
				} else {
					position[1]--;
					entityMoved = true;
				}

			}

		}

	}

	public int direction(String direction) {

		switch (direction) {
		case "North":
			return 0;
		case "East":
			return 1;
		case "South":
			return 2;
		case "West":
			return 3;
		}
		return 0;
	}

	public int direction(GameEntity entity) {

		if (entity instanceof Werewolf) {
			Random randy = new Random();
			return randy.nextInt(3);

		}
		return 0;
	}

}
