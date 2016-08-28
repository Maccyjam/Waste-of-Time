package com.wasteoftime;

import java.util.*;

public class PlayerCharacter extends AbstractPerson {
	
	private static PlayerCharacter INSTANCE;
	private int hp;
	private int exp;
	private int lvl;
	private Map<Stats, Integer> playerStats;
	
	private PlayerCharacter(String name) {
		this.name = name;
		this.hp = 10;
		this.exp = 0;
		this.lvl = 1;
		this.playerStats = new HashMap<Stats,Integer>();

		for (Stats s : Stats.values()) {
			this.playerStats.put(s, 1); // Initialise each stat as 1.
		}
	}
	
	public static PlayerCharacter getInstance(String name) {
		if (INSTANCE == null) {
			INSTANCE = new PlayerCharacter(name);
		}
		return INSTANCE;
	}

	public int getHp() { return hp; }
	public int getExp() { return exp; }
	public int getLvl() {return lvl; }
	public Map<Stats, Integer> getStats(){
		return playerStats;
	}

	public void levelUp(){
		this.lvl++;
	}

}
