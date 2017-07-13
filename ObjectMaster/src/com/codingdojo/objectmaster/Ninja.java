package com.codingdojo.objectmaster;

public class Ninja extends Human{
	protected int stealth = 10;
	public void steal(Human h) {
		h.health = h.health - stealth; // health - stealth
		h.health = h.health + stealth;
		System.out.println("Adding health to ninja:" + h.stealth);
	}
	public void runAway(Human h) {
		h.health = h.health - 10;
		System.out.println("running.." + "Ninja's Health:" + h.health);
	}
}
