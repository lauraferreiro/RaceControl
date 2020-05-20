package com.racecontrol;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int option = 1;
		RaceControl racecontrol =  new RaceControl();

		Scanner in = new Scanner(System.in);
		
		while (option != 0) {
			System.out.println("Selecciona una opción: " + "\n" + "0. Salir" + "\n"
					+ "1. Celebrar una carrera" + "\n"
					+ "2. Celebrar torneo");

			option = in.nextInt();
			
			if(option==1){
				
				racecontrol.iniciar();
			}
			
			if(option==2) {
				
				racecontrol.celebrar();
				
			}
		}
		in.close();
	}
	
}
