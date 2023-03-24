package com.bridgelapbz.snake;

public class SnakeAndLadder {

	public static void main(String args[]) {
		int diceRoll = (int) (Math.floor(Math.random() * 10) % 6) + 1;

		System.out.println("Dice the roll" + " " + diceRoll);
		int option = (int) Math.floor(Math.random() * 10) % 3;
		int playerPosition = 0;
		// System.out.println(option);

		if (option == 0) {
			playerPosition = playerPosition + 0;
			System.out.println("Player Are Stop Our Same place");
		} else if (option == 1) {
			playerPosition = playerPosition + diceRoll;
			System.out.println("Player Are Moves Ahead ");
		} else if (option == 2) {
			playerPosition = playerPosition - diceRoll;
			System.out.println("Playe Are Moves Behind");
			if (playerPosition < 0) {
				playerPosition = 0;
			}
		}
	}
}