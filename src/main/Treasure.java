package main;

import java.util.Arrays;
import java.util.Random;

public class Treasure {

	private int[] location;

	public Treasure() {
		Random randy = new Random();
		int[] loc = { randy.nextInt(11)-5, randy.nextInt(11)-5};

		this.location = loc;
	}

	public int[] getLocation() {
		return location;
	}

	public void setLocation(int[] location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Treasure [location=" + Arrays.toString(location) + "]";
	}

	
	
	
	
}
