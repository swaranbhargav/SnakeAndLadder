package com.bridgelabz.snakeandladderprogram;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {

		int playerPosition = 0;
		int topPosition = 100;
		int diceroll = 0;

		Random rand = new Random();
		while (playerPosition < topPosition) {

			int dice = rand.nextInt(6) + 1;

			int option = rand.nextInt(3);
			switch (option) {
			case 0:
				System.out.println("You got no Option");
				break;
			case 1:
				System.out.println("You got Ladder");
				playerPosition += dice;
				int newPosition = playerPosition + dice;
				if (newPosition <= topPosition) {
					playerPosition = newPosition;
				}
				break;
			case 2:
				System.out.println("you got snake");
				playerPosition -= dice;
				newPosition = playerPosition - dice;
				if (newPosition >= 0) {
					playerPosition = newPosition;
				} else {
					playerPosition = newPosition;
				}

				break;
				
			}
			diceroll++;
			System.out.println("the no.of times the dice rolled is " + diceroll);

			System.out.println("Player position: " + playerPosition);
		}
		System.out.println("Congratulations! You reached the final position of " + topPosition);
	}
}
