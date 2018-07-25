package com.deloitte.main;

import com.deloitte.fly.Flyer;
import com.deloitte.fly.Helicopter;
import com.deloitte.fly.SeaPlane;

public class Airport {
	
	public static void main(String[] args) {
		Airport metropolisAirpot = new Airport();
		Helicopter copter = new Helicopter();
		SeaPlane sPlane = new SeaPlane();
		
		metropolisAirpot.givePermissionToLand(copter);
		metropolisAirpot.givePermissionToLand(sPlane);
		}

	private void givePermissionToLand(Flyer f) {
		f.land();
	}

}
