package com.bridgelabz.snakeandladderprogram;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		// Here we are checking the position of the player

		int playerPosition = 0;

		Random rand = new Random();
		int dice = rand.nextInt(6) + 1;

		int option = rand.nextInt(3);
		switch (option) {
		case 0:
			break;
		case 1:
			playerPosition += dice;
			break;
		case 2:
			playerPosition -= dice;
			break;
		}

		System.out.println("Current position: " + playerPosition);
	}
}
