package com.bridgelabz.snakeandladderprogram;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {

		int playerOnePosition = 0;
		int topPosition = 100;
		int diceroll = 0;

		int playerTwoPosition = 0;

		Random rand = new Random();
		while (playerOnePosition < topPosition && playerTwoPosition < topPosition) {

			int dice = rand.nextInt(6) + 1;

			int option = rand.nextInt(3);
			switch (option) {
			case 0:
				System.out.println("You got no Option");
				break;
			case 1:
				System.out.println("You got Ladder");
				playerOnePosition += dice;
				playerTwoPosition += dice;
				int newPositionOfFirstPlayer = playerOnePosition + dice;
				int newPositionOfSecondPlayer = playerTwoPosition + dice;
				if (newPositionOfFirstPlayer <= topPosition && newPositionOfSecondPlayer <= topPosition) {
					playerOnePosition = newPositionOfFirstPlayer;

					playerTwoPosition = newPositionOfSecondPlayer;
				}
				break;
			case 2:
				System.out.println("you got snake");
				playerOnePosition -= dice;
				playerTwoPosition -= dice;
				newPositionOfFirstPlayer = playerOnePosition - dice;
				newPositionOfSecondPlayer = playerTwoPosition - dice;
				if (newPositionOfFirstPlayer >= 0 && newPositionOfSecondPlayer >= 0) {
					playerOnePosition = newPositionOfFirstPlayer;
					playerTwoPosition = newPositionOfSecondPlayer;
				} else {
					playerOnePosition = newPositionOfFirstPlayer;
					playerTwoPosition = newPositionOfSecondPlayer;
				}

				break;

			}
			diceroll++;
			System.out.println("the no.of times the dice rolled is " + diceroll);

			System.out.println("Player One position: " + playerOnePosition);
			System.out.println("Player Two position: " + playerTwoPosition);
		}
		if (playerOnePosition > playerTwoPosition) {
			System.out.println("player One won the game");
		} else {
			System.out.println("Player two won the game ");
		}

	}
}
