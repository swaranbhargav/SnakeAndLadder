package com.bridgelabz.snakeandladderprogram;

public class SnakeAndLadder {

	public static void main(String[] args) {
       //UC1- Here we are checking the position of the player
        
		int playerPosition = 0;

		System.out.println("Player Position:" + playerPosition);
		//UC2- Here we are rolling the dice to get an output between 1 to 6.
		int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("Roll Dice: " + dice);

	}

}
