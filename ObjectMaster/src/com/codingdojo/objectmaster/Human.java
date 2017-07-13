package com.codingdojo.objectmaster;

public class Human {
	protected int health = 100;
	protected int strength = 3;
	protected int stealth = 3;
	protected int intelligence = 3;
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public void attack(Human h) {
		h.health = h.health - 100;
		System.out.println("Attacking:" + h.health );
	}
}
