package main;

public abstract class GameEntity {

	private int[] location;
	double distanceFromPlayer;

	String directionFromPlayer;

	public int[] getLocation() {
		return location;
	}

	public void setLocation(int[] location) {
		this.location = location;
	}

	public void displayLocation() {
		System.out.println("Entity position is: " + location[0] + " " + location[1]);
	}

	public double getDistanceFromPlayer() {
		return distanceFromPlayer;
	}

	public void setDistanceFromPlayer(double distanceFromPlayer) {
		this.distanceFromPlayer = distanceFromPlayer;
	}

	public void printLocation() {
		System.out.println("entity position is: " + location[0] + " " + location[1]);
	}

	public String getDirectionFromPlayer() {
		return directionFromPlayer;
	}

	public void setDirectionFromPlayer(String directionFromPlayer) {
		this.directionFromPlayer = directionFromPlayer;
	}
	
}
