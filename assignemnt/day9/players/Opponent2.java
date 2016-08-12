package com.ssa.assignemnt.day9.players;

import java.util.Random;

public class Opponent2 extends Users {

	String name = "Bob";
	
	String[]rPs = new String[]{"Rock", "Paper", "Scissors"};
	
	
	public Opponent2() {
		
	}

	public Opponent2(String name, String gender) {
		super(name, gender);
		
	}
	
	@Override
	public void numberIsValid() {

	}

	@Override
	public String choice() {
		String name = "Bob";
		String random = (rPs[new Random().nextInt((rPs.length)- 1)]);
		System.out.println(name + " has choosen " + random);
		return random;

	}



}
