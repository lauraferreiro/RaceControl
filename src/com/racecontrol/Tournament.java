package com.racecontrol;

import java.util.List;

public class Tournament {

	private String tournamentName;
	private List<Race> races;
	//private List<Parking> parkings;

	
	public Tournament(String tournamentName, List<Race> races) {
		this.tournamentName = tournamentName;
		this.races = races;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public List<Race> getRaces() {
		return races;
	}

	public void setRaces(List<Race> races) {
		this.races = races;
	}

	
}
