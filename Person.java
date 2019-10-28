package main;

public class Person{
	private int[] playerPosition= { 0, 0 };

	public Person() {

	}

	

	public void displayLocation() {
		System.out.println("Player position is: " + playerPosition[0] + " " + playerPosition[1]);
	}

	public int[] getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(int[] position) {
		this.playerPosition = position;
	}
	
	public boolean collisionCheck(GameEntity entity) {
		if (entity.getDistanceFromPlayer()<0.1) {
			return true;
		} else
			return false;
	}
	
	
}
