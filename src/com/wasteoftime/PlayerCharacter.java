package com.wasteoftime;

public class PlayerCharacter extends AbstractPerson {
	
	private static PlayerCharacter INSTANCE;
	private int hp;
	private int exp;
	private int lvl;

	
	private PlayerCharacter(String name){
		this.name = name;
		this.hp = 10;
		this.exp = 0;
		this.lvl = 1;
	}
	
	public static PlayerCharacter getInstance(String name) {
		INSTANCE = new PlayerCharacter(name);
		return INSTANCE;
	}
	public void levelUp(){
		this.lvl++;
		
	}
}
