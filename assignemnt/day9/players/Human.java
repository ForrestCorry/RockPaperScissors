package com.ssa.assignemnt.day9.players;

import java.util.Scanner;

import com.ssa.assignment.day9.roshambo.Roshambo;

public class Human extends Users {
	
	protected boolean stillPlaying = true;
	protected boolean userFailed = false;
	Scanner sc = new Scanner(System.in);
	protected int numberInput = 0;
	protected String userInput = null;
	String[] rPs = new String[]{"Rock", "Paper", "Scissors"};

	public Human() {
		
	}

	public Human(String name, String gender) {
		super(name, gender);
		
	}
	
	
	public static boolean numberIsValid(String numberInput) {
		
		if (numberInput.equals("1") || numberInput.equals("2") || numberInput.equals ("3")) {
			
		
		try {
			int number = Integer.parseInt(numberInput);
			
			return false;
		} catch (NumberFormatException e) {
			return true;
			
		}
	}
		return false;

	}
	@Override
	public String choice() {
		while (stillPlaying){
		userFailed = false;
		do{
		System.out.println("What would you like to throw,\n"
				+ "-Rock (1)\n"
				+ "-Paper (2)\n"
				+ "-Scissors (3)");
		userInput = sc.nextLine();
		
		userFailed = numberIsValid(userInput);
		
		
		
		}while (userFailed);
		try {
			int number = Integer.parseInt(userInput);	
			
			String choice = rPs[number - 1];
			System.out.println("You have thrown " + choice);
			return choice;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please try again");
			
		}
		
	}
		return userInput;
	
	}

}
