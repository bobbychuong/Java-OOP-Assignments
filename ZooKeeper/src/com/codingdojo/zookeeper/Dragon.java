package com.codingdojo.zookeeper;

public class Dragon extends Mammal{
	protected int energyLevel = 300;
	public void displayEnergy() {
		System.out.println("Dragon's health:" + energyLevel);
	}
	public void fly() {
		System.out.println("Flying madafackkaa!" );
		energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("Eating Humans");
		energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("Attacking Town, RUN!");
		energyLevel -= 100;
	}
	
}
