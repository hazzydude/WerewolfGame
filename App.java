package main;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// set up for whole game
		boolean playAgain = true;
		Game treasureHunt =  new Game();
				Scanner sc = new Scanner(System.in);
		
		while (playAgain) {

			treasureHunt.play();
			
	
			System.out.println("Do you want to carry on playing? Enter 'Yes' to play again");
			String playerInput = sc.nextLine();

			if (playerInput.equals("Yes")) {
				// do nothing
			} else {
				playAgain = false;
				System.out.println("Thankyou for playing. Ending Game");
			}
			sc.close();
		}
		

	}
}
