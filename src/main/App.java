package main;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// set up for whole game

		
		Scanner scan = new Scanner(System.in);
		boolean playAgain = true;
		Events events = new Events();

		while (playAgain) {

			// Run setup
			Person player = new Person();
			Werewolf wWolf= new Werewolf();
			Compass goldenCompass = new Compass();
			Treasure coins = new Treasure();
			int[] treasureLoc = coins.getLocation();
			// System.out.println("Treasure location is:" + treasureLoc[0] + " " +
			// treasureLoc[1]);

			goldenCompass.treasureDistUpdate(player.getPosition(), treasureLoc);
			goldenCompass.werewolfDistUpdate(player.getPosition(), wWolf.getPosition());
			goldenCompass.footStepDirection(player.getPosition(), wWolf.getPosition());
			int eventCount = 1;

			boolean gameEnded = false;

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
			while (goldenCompass.getTreasureDistance() > 0.1 & gameEnded == false) {

				System.out.println("Compass reads '" + (Math.round(goldenCompass.getTreasureDistance()* 100.0) / 100.0) + "m'");
				System.out.println("You here footsteps... Maybe " + (Math.round(goldenCompass.getWerewolfDistance()* 100.0) / 100.0) + "m mostly to the " + goldenCompass.getWolfDirection());
				System.out.println("");
				String playerInput = scan.nextLine();

				if (playerInput.equals("North") || playerInput.equals("East") || playerInput.equals("South")
						|| playerInput.equals("West")) {

					player.move(playerInput);
					wWolf.move();
					wWolf.move();
					
					eventCount++;
					if (eventCount==3) { 
					events.InstigateEvent();
					eventCount=0;
					}


				} else if (playerInput.equals("Give Up")) {
					gameEnded = true;
					System.out.println("You quit the game");
				} else {
					System.out.println("Not a valid input: please enter 'North' ect.");
				}

				goldenCompass.treasureDistUpdate(player.getPosition(), treasureLoc);
				goldenCompass.werewolfDistUpdate(player.getPosition(), wWolf.getPosition());
				if (goldenCompass.getWerewolfDistance()<0.1) {
					System.out.println("The Werewolf has got you. Your vision turns black... ");
					System.out.println("");
					gameEnded = true;
				}
						
						
						
				goldenCompass.footStepDirection(player.getPosition(), wWolf.getPosition());

			}

			if (gameEnded) {
				// do nothing
			} else if (goldenCompass.getTreasureDistance() < 0.1) {
				System.out.println("You found the tresure, you win!");

			}

			System.out.println("Do you want to carry on playing? Enter 'Yes' to play again");
			String playerInput = scan.nextLine();

			if (playerInput.equals("Yes")) {
				// do nothing
			} else {
				playAgain = false;
				System.out.println("Thankyou for playing. Ending Game");
			}

		}
		scan.close();

	}
}
