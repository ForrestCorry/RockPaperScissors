package com.ssa.assignemnt.day9.players;

import java.util.Random;

public class Opponent1 extends Users {
	
	String name = "Gary";
	
	String[]rPs = new String[]{"Rock", "Paper", "Scissors"};

	public Opponent1(String name, String gender) {
		super(name, gender);
		
	}

	public Opponent1(){
		
	}
	
	@Override
	public void numberIsValid() {

	}
	@Override
	public String choice() {
		String name = "Gary";
		
		String random = (rPs[new Random().nextInt(rPs.length)]);
		System.out.println(name + " has choosen " + random);
		return random;
		
		

	}


}
