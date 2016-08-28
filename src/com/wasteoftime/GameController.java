package com.wasteoftime;

import java.util.Scanner;

/**
 * Class used for controlling the flow of the game.
 */
public class GameController {

	private static PlayerCharacter pc;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name;

		System.out.println("Welcome! What is your name?");
		name = s.nextLine();
		pc = PlayerCharacter.getInstance(name);

		System.out.println("And so begins the adventure of " + name + "!");

		pause(3000);
		clearConsole();

        // Loops forever until we explicitly exit (which we don't do yet).
		while (true) {
			String command;
			System.out.println("Type 'help' for a list of commands.");
			command = s.nextLine();
			interpretCommand(command);
		}
	}

	/**
	 * Helper function used for pausing execution for a set amount of time.
	 * @param time The number of milliseconds to pause execution for.
	 */
	private static void pause(int time) {
		try {
			Thread.sleep(time); // Wait 3 seconds.
		}
		catch (InterruptedException ex) {
			ex.printStackTrace(); // Necessary try/catch block for Thread.sleep.
		}
	}

	/**
	 * Clears a console window by filling it with backspaces. Very ghetto way of doing
	 * it, but that's Java for you ¯\_(ツ)_/¯
	 */
	private static void clearConsole() {
		for (int i = 0; i < 1000; ++i) {
			System.out.println("\b"); // Print backspaces to clear console.
		}
	}

	private static void interpretCommand(String command) {
		switch(command) {
			case "help":
				System.out.println("N - Move North, E - Move East, S - Move South, W - Move West");
				System.out.println("stats - Show stats, inv - Show inventory");
				break;
			case "stats":
				System.out.println(pc.getStats().toString());
				break;
			default:
				System.out.println("I don't know how to do that.");
				break;
		}
	}
}
