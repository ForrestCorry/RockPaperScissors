package com.ssa.assignemnt.day9.players;

public class Users extends Player {

	protected String gender;

	
	public Users(){
		
	}
	
	public Users(String name, String gender) {
		super(name);
		this.gender = gender;
	}
	
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public void numberIsValid() {

	}

	@Override
	public String choice() {
		String string = null;
		return string;

	}

}
