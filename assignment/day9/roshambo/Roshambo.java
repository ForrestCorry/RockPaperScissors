package com.ssa.assignment.day9.roshambo;

import java.util.Scanner;

import com.ssa.assignemnt.day9.players.Human;
import com.ssa.assignemnt.day9.players.Opponent1;
import com.ssa.assignemnt.day9.players.Opponent2;
import com.ssa.assignemnt.day9.players.Opponent3;

public class Roshambo {
	private static boolean stillPlaying = true;
	static Scanner sc = new Scanner(System.in);
	static String userInput = null;
	static Human player1 = new Human();
	static Opponent1 gary = new Opponent1();
	static Opponent2 bob = new Opponent2();
	static Opponent3 george = new Opponent3();
	static String player = null;
	static String opponent = null;
	static String wouldLikeToPlayAgain = null;

	public static void main(String[] args) {
		
				
		
		System.out.println("Welcome to the Rock, Paper, Scissors Game");
		System.out.println("What is your name?");
		userInput = sc.nextLine();
		player1.setName(userInput); 
		while(stillPlaying){
		do{
		System.out.println("What opponent would you like to face?\n"
				+ "- Gary (1)\n"
				+ "- Bob (2)\n"
				+ "- George (3)\n");
		userInput = sc.nextLine();
		
		Human.numberIsValid(userInput);
		
		}while (Human.numberIsValid(userInput));
		
		switch (userInput) {
		case "1":
			System.out.println("You have choosen to face Gary");
			
			
			player = player1.choice();
			opponent = gary.choice();
			
			 Roshambo.throwDown(player, opponent);
			 
			 break;
			 
		case "2":
			System.out.println("You have choosen to face Bob");
			
			
			player = player1.choice();
			opponent = bob.choice();
			
			Roshambo.throwDown(player, opponent);
			
			break;
		
		case "3":
			System.out.println("You have choosen to face George");
			
			
			player = player1.choice();
			opponent = george.choice();
			
			Roshambo.throwDown(player, opponent);
			
			
			
			break;
			
		default:
			System.out.println("Not a valid entry Please play again");
			stillPlaying = true;
			
			break;
		}
		 System.out.println("Would you like to play again?\n"
			 		+ " -(Y) Yes\n"
			 		+ "-(N) No");
			  wouldLikeToPlayAgain = sc.nextLine();
			  switch (wouldLikeToPlayAgain.toLowerCase()) {
			case "y":
				yes();
				break;

			case "n":
				no();
				break;
			}
		}
		

	}//method
	
	public static void throwDown(String player, String opponent){
		if (player.equals(opponent)) {
			System.out.println("It's a Tie!!!");
		}
		else if ((player.equals("Rock"))&&(opponent.equals("Paper"))) {
			System.out.println("Paper covers Rock\n"
					+ "\tYou LOSE!!!");
	
		}
		else if ((player.equals("Rock"))&&(opponent.equals("Scissors"))) {
			System.out.println("Rock crushes Scissors\n"
					+ "\tYou WIN!!!");
		}
		else if ((player.equals("Paper"))&&(opponent.equals("Rock"))) {
			System.out.println("Paper covers Rock\n"
					+ "\tYou WIN!!!");
		}
		else if ((player.equals("Paper"))&&(opponent.equals("Scissors"))) {
			System.out.println("Scissors cut Paper\n"
					+ "\tYou LOSE!!!");
		}
		else if ((player.equals("Scissors"))&&(opponent.equals("Rock"))) {
			System.out.println("Rock crushes Scissors\n"
					+ "\tYou LOSE!!!");
		}
		else if ((player.equals("Scissors"))&&(opponent.equals("Paper"))) {
			System.out.println("Scissors cut Paper\n"
					+ "\tYou WIN!!!");
		}
	}//throwDown

	public static boolean no(){
		stillPlaying = false;
		return stillPlaying;
	}
	public static boolean yes(){
		return stillPlaying;
	}
}//class
