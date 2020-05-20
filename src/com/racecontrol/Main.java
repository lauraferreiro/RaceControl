package com.racecontrol;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int option = 1;
		RaceControl racecontrol =  new RaceControl();

		Scanner in = new Scanner(System.in);
		
		while (option != 0) {
			System.out.println("Selecciona una opción: " + "\n" + "0. Salir" + "\n"
					+ "1. Celebrar un torneo" + "\n"
					+ "2. Ver resultados anteriores");

			option = in.nextInt();
			
			if(option==1){
				
					racecontrol.iniciar();
			}
			
			if(option==2) {
				
				//ver resultados viejos
			}
		}
		in.close();
	}
	
}
