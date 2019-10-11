package main;

import java.util.Random;

public class Events {

	public Events() {

	}

	public void InstigateEvent() {
		Random randy = new Random();
		int event = randy.nextInt(7);

		if (event == 0) {
			System.out.println("you meet a friendly troll.");
		} else if (event == 1) {
			System.out.println("...rummmmble... you feel hungry.");
		} else if (event == 2) {
			System.out.println("You walk into a tree, ouch");
		} else if (event == 3) {
			System.out.println("Mushrooms");
		} else if (event == 4) {
			System.out.println("...Thud... Was that a footstep?");
		} else if (event == 5) {
			System.out.println("...squelch... swamps are hard to walk in");
		} else if (event == 6) {
			System.out.println("...crack!... What was that!");
		}

	}

}
