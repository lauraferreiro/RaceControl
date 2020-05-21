package com.racecontrol;

public class Car{

	private String brand;
	private String model;
	private int distance;
	private int points=0;
	private int speed;
	private final int MAXSPEED = 300;
	
	
	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}


	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMAXSPEED() {
		return MAXSPEED;
	}


	public void cambiarVelocidad() {
		speed += ((int) (Math.random() * 30));
		if (speed > MAXSPEED) {
			speed = MAXSPEED;
		}
	}
	
	public void resetAll () {
		speed=0;
		distance=0;
		points=0;
	}
	
	public void reset () {
		speed=0;
		distance=0;
	}

	
	public void avanzar() {
		distance += speed;
	}
	
	public void totalPoints(int points) {
		this.points += points;
	}

}
