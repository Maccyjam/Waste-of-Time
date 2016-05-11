package com.wasteoftime;

import java.util.*;

public class PlayerCharacter extends AbstractPerson {
	
	private static PlayerCharacter INSTANCE;
	private int hp;
	private int exp;
	private int lvl;
	private Map<Stats, Integer> playerStats;
	
	private PlayerCharacter(String name){
		this.name = name;
		this.hp = 10;
		this.exp = 0;
		this.lvl = 1;
		this.playerStats = new HashMap<Stats,Integer>();
	}
	
	public static PlayerCharacter getInstance(String name) {
		INSTANCE = new PlayerCharacter(name);
		return INSTANCE;
	}
	public Map<Stats, Integer> getStats(){
		return playerStats;
	}
	public void levelUp(){
		this.lvl++;
	}

}
