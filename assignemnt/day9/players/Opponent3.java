package com.ssa.assignemnt.day9.players;

import java.util.Random;

public class Opponent3 extends Users{

	String name = "George";
	
	String[]rPs = new String[]{"Rock", "Paper", "Scissors"};
	
	
	
	public Opponent3() {

	}

	public Opponent3(String name, String gender) {
		super(name, gender);
	
	}
	
	@Override
	public void numberIsValid() {

	}

	@Override
	public String choice() {
		
		
		String random = (rPs[new Random().nextInt((rPs.length) - 2)]);
		System.out.println(name + " has choosen " + random);
		return random;
}



}
