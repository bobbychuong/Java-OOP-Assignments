//Samurai: Add a method deathBlow(Human) that kills the other human, but reduces the samurai's health by half
package com.codingdojo.objectmaster;

public class Samurai extends Human{
	private int counter;
	public void Samurai {
		
	}
	protected int health = 200;
	public void deathBlow(Human h) {
		h.health = h.health/2;
		h.health = h.health - h.health;
		System.out.println("Killing other human:" + h.health);
	}
	
}
