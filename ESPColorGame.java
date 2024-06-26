/** Class: CMSC203 
 * Instructor: Prof. Faranz
 * Description: Project 1: read and display on the screen the names of colors from a file colors.txt
 * Due: 06/17/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Wondale Amare
 */

import java.util.Scanner;

public class ESPColorGame {
	final static String color1 ="Black";
	final static String color2 = "white";
	final static String color3 = "gray";
	final static String color4 = "silver";
	final static String color5 = "maroon";
	final static String color6 = "red";
	final static String color7 = "purple";
	final static String color8 = "fuchsia";
	final static String color9 = "green";
	final static String color10 = "lime";
	final static String color11 = "olive";
	final static String color12 = "yellow";
	final static String color13 = "navy";
	final static String color14 = "blue";
	final static String color15 = "teal";
	final static String color16 = "aqua" ;

	public static void main(String[] args) {

		System.out.println("CMSC203 Assignment 1: Test your ESP skills!");
		System.out.println("the filename colors.txt");
		System.out.println();
		System.out.println("There are sixteen colors defined in the program:");
		System.out.println("1.black");
		System.out.println("2.white");
		System.out.println("3.gray");
		System.out.println("4.silver");
		System.out.println("5.maroon");
		System.out.println("6.red");
		System.out.println("7.purple");
		System.out.println("8.fuchsia");
		System.out.println("9.green");
		System.out.println("10.lime");
		System.out.println("11.olive");
		System.out.println("12.yellow");
		System.out.println("13.navy");
		System.out.println("14.blue");
		System.out.println("15.teal");
		System.out.println("16.aqua");

		Scanner keyboard = new Scanner(System.in);
		int correctGuesses = 0;

		// Loop to play three games
		for (int i = 0; i < 3; i++) 
		{
			// Generate a random number from 1 to 16
			int randomNumber = (int) (Math.random() * 16) + 1;
			String selectedColor = getColorByNumber(randomNumber);

			// Display random selected color 
			System.out.print("\nRound " + (i+1) + ": ");
			System.out.println();
			System.out.println("\nI am thinking of a color.");
			System.out.println("Is it one of list of colors above?");
			System.out.print("Enter your guess: ");
			String userGuess = keyboard.nextLine();
			System.out.println();
			System.out.println("I am thinking of a color  " + selectedColor);


			// Check the user guess the correct color
			if (userGuess.equalsIgnoreCase(selectedColor)) 
			{
				correctGuesses++;
			}
		}

		// Display the number of correct guesses
		System.out.println("Gave Over");
		System.out.println("\nYou guessed " + correctGuesses + " out of 3 colors correctly.");

		// Student information
		System.out.println();
		System.out.println("Name: Wondale Amare");
		System.out.println("I am a CMSC 203 student with a major in Computer Science department at Montgomery College.");
		System.out.println("Due date: 06/17/2024");
		// Close scanner
		keyboard.close();
	}

	// Method to get color name based on random number
	private static String getColorByNumber(int number) {
		switch (number) {
		case 1: return color1;
		case 2: return color2;
		case 3: return color3;
		case 4: return color4;
		case 5: return color5;
		case 6: return color6;
		case 7: return color7;
		case 8: return color8;
		case 9: return color9;
		case 10:return color10;
		case 11:return color11;
		case 12:return color12;
		case 13:return color13;
		case 14:return color14;
		case 15:return color15;
		case 16:return color16;
		default:return "Unknown"; 
		}
	}
}



