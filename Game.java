package main;

import java.util.Scanner;

public class Game {
	public void play() {
		
		//TODO deal with player input in separate class

		Scanner scan = new Scanner(System.in);
		Events events = new Events();
		Movement m = new Movement();
		
		// Run setup
		Person player = new Person();
		Werewolf wWolf = new Werewolf();
		Compass goldenCompass = new Compass();
		Treasure coins = new Treasure();
		// System.out.println("Treasure location is:" + treasureLoc[0] + " " +
		// treasureLoc[1]);

		goldenCompass.distUpdate(player, coins);
		goldenCompass.generalDirection(player, wWolf);
		int eventCount = 1;

		boolean gameEnded = false;
		boolean death = false;
		boolean win = false;

		// start
		System.out.println("Grey foggy clouds float oppressively close to you, "
				+ "reflected in the murky grey water which reaches up your shins. "
				+ "Some black plants barely poke out of the shallow water. "
				+ "Try 'North', 'South', 'East', 'West', 'Give Up'"
				+ "You notice a small watch-like device in your left hand. "
				+ "It has hands like a watch, but the hands don't seem to tell time.");

		System.out.println("Valid game inputs: 'North', 'South', 'East', 'West', 'Give Up'");
		System.out.println("");

		// game loop
		while (gameEnded == false) {

			System.out.println(
					"Compass reads '" + (Math.round(coins.distanceFromPlayer * 100.0) / 100.0) + "m'");
			System.out.println(
					"You here footsteps... Maybe " + (Math.round(wWolf.distanceFromPlayer * 100.0) / 100.0)
							+ "m mostly to the " + wWolf.directionFromPlayer);
			System.out.println("");
			
			String playerInput = scan.nextLine();

			if (playerInput.equals("North") || playerInput.equals("East") || playerInput.equals("South")
					|| playerInput.equals("West")) {

				
				m.move(player, m.direction(playerInput));
				
				goldenCompass.distUpdate(player, wWolf);
				if (player.collisionCheck(wWolf)) {
					death = true;
				}
				
				m.move(wWolf, m.direction(wWolf));
				goldenCompass.distUpdate(player, wWolf);
				if (player.collisionCheck(wWolf)) {
					death = true;
				}
				
				goldenCompass.generalDirection(player, wWolf);
				
				goldenCompass.distUpdate(player, coins);
				if (player.collisionCheck(coins)) {
					win = true;
				}
				
				eventCount++;
				if (eventCount == 3) {
					events.InstigateEvent();
					eventCount = 0;
				}

			} else if (playerInput.equals("Give Up")) {
				gameEnded = true;
				System.out.println("You quit the game");
			} else {
				System.out.println("Not a valid input: please enter 'North' ect.");
			}

			if (win) {
				System.out.println("You found the tresure, you win!");
				gameEnded = true;
			}
			
			if (death) {
				System.out.println("The Werewolf has got you. Your vision turns black... ");
				System.out.println("");
				gameEnded = true;
			}

		}

		
		scan.close();
	}
}
