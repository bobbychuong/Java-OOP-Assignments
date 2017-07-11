package com.codingdojo.zookeeper;

public class Gorilla extends Mammal{
	public void throwing() {
		System.out.println("Throwing shit at you");
		this.energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("Eating bananas");
		this.energyLevel += 10;
	}
	public void climb() {
		System.out.println("Climbing Tree");
		this.energyLevel -= 10;
	}
}
