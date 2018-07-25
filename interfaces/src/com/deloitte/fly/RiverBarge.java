package com.deloitte.fly;

public class RiverBarge extends Vehicle implements Sailer {

	@Override
	public void dock() {
		System.out.println("Docking");
	}

	@Override
	public void cruise() {
		System.out.println("Cruising");

	}

}
