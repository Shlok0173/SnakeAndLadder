package com.bridgelapbz.snake;

public class SnakeAndLadder {

	public static void main(String args[]) {

		System.out.println("The Player rolls the die to get a number");
		int value = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println(value);
	}
}