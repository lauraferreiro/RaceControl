package com.racecontrol;

import java.util.List;

public class Parking {

	private String parkingName;
	private List<Car> cars;
	
	
	public Parking(String parkingName) {
		this.parkingName = parkingName;
	}


	public String getParkingName() {
		return parkingName;
	}


	public void setParkingName(String parkingName) {
		this.parkingName = parkingName;
	}


	public List<Car> getCars() {
		return cars;
	}


	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	
	
	
	
}
