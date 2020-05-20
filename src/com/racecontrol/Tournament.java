package com.racecontrol;

import java.util.List;

public class Tournament {

	private String tournamentName;
	private List<Parking> parkings;
	private List<Race> races;
	
	public Tournament(String tournamentName, List<Parking> parkings, List<Race> races) {
		this.tournamentName = tournamentName;
		this.parkings = parkings;
		this.races = races;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public List<Parking> getParkings() {
		return parkings;
	}

	public void setParkings(List<Parking> parkings) {
		this.parkings = parkings;
	}

	public List<Race> getRaces() {
		return races;
	}

	public void setRaces(List<Race> races) {
		this.races = races;
	}
	
	public void celebrar() {
		
		for(int i=0;i<races.size();i++) {
			races.get(i).celebrarCarrera();
		}
	}
	
}
