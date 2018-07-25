package com.deloitte.fly;

public class Superman extends Kryptonian implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Taking Off");

	}

	@Override
	public void land() {
		System.out.println("Landing");

	}

	@Override
	public void fly() {
		System.out.println("Flying");

	}
	
	public void leapBuilding() {
		System.out.println("=========");
	}
	public void stopBullet() {
		System.out.println("==>");
	}

}
