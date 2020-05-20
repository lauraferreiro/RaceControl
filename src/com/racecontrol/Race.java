package com.racecontrol;

import java.util.List;

public class Race {

	public enum RaceType {
		STANDARD, ELIMINATORY
	}

	private String name;
	private RaceType type;
	private int laps;
	private List<Car> cars;

	public Race(String name, RaceType type, int laps) {
		this.name = name;
		this.type = type;
		this.setLaps(laps);
	}
	
	public Race() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RaceType getType() {
		return type;
	}

	public void setType(RaceType type) {
		this.type = type;
	}

	public int getLaps() {
		return laps;
	}

	public void setLaps(int laps) {
		this.laps = laps;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	public void realizarVueltas() {

		for (int i = 0; i < laps; i++) {

			for (Car c : getCars()) {
				c.cambiarVelocidad();
				c.avanzar();
				
			}
					
		}
		
	}


}