package main;

public class Person {
	private int[] position;

	public Person() {

		int[] startPosition = { 0, 0 };
		this.position = startPosition;

	}

	public void move(String direction) {

		if (direction.equals("North")) {
			if (position[0] == 5) {
				System.out.println("There appears to be an invisable wall blocking your path");
			} else {
				position[0]++;
			}

		} else if (direction.equals("South")) {
			if (position[0] == -5) {
				System.out.println("There appears to be an invisable wall blocking your path");
			} else {
				position[0]--;
			}
		} else if (direction.equals("East")) {
			if (position[1] == 5) {
				System.out.println("There appears to be an invisable wall blocking your path");
			} else {
				position[1]++;
			}
		} else if (direction.equals("West")) {
			if (position[1] == -5) {
				System.out.println("There appears to be an invisable wall blocking your path");
			} else {
				position[1]--;
			}
		}

	}

	public void displayLocation() {
		System.out.println("Player position is: " + position[0] + " " + position[1]);
	}

	public int[] getPosition() {
		return position;
	}

	public void setPosition(int[] position) {
		this.position = position;
	}
}
