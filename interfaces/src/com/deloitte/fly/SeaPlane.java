package com.deloitte.fly;

public class SeaPlane extends Airplane implements Sailer{

	@Override
	public void dock() {
		System.out.println("Docking");
	}

	@Override
	public void cruise() {
		System.out.println("Cruising");
		
	}

}
