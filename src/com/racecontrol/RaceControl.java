package com.racecontrol;

import java.util.*;

import com.racecontrol.Race.RaceType;

public class RaceControl {

	private List<Car> cars;
	private List<Race> races;
	// private List<Parking> parkings;

	public RaceControl() {

		cars = new ArrayList<Car>();
		cars.add(new Car("Ferrari", "F8 Spider"));
		cars.add(new Car("Ferrari", "812 GTS"));
		cars.add(new Car("Ferrari", "Roma"));
		cars.add(new Car("Seat", "Panda"));
		cars.add(new Car("Seat", "Ibiza"));
		cars.add(new Car("Seat", "Toledo"));
		cars.add(new Car("Ford", "Fiesta"));
		cars.add(new Car("Ford", "Mondeo"));
		cars.add(new Car("Ford", "Focus"));
		cars.add(new Car("Volkswagen", "Polo"));
		cars.add(new Car("Volkswagen", "Golf"));
		cars.add(new Car("Volkswagen", "Passat"));
		cars.add(new Car("Maserati", "Levante"));
		cars.add(new Car("Maserati", "Quattroporte"));
		cars.add(new Car("Maserati", "Cabrio"));
		cars.add(new Car("Nissan", "Moco"));
		cars.add(new Car("Apolo", "ApolloN"));
		cars.add(new Car("Nissan", "Kona"));
		cars.add(new Car("Mazda", "Laputa"));
		cars.add(new Car("Mitsubishi", "Pajero"));
		cars.add(new Car("Kia", "Borrego"));

		races = new ArrayList<Race>();
		races.add(new Race("Indianápolis", RaceType.STANDARD, 10));
		races.add(new Race("Mónaco", RaceType.STANDARD, 20));
		races.add(new Race("Le Manz", RaceType.STANDARD, 30));
		races.add(new Race("Montmeló", RaceType.STANDARD, 10));
		races.add(new Race("Estoril", RaceType.STANDARD, 20));
		races.add(new Race("Indiana", RaceType.STANDARD, 30));
		races.add(new Race("Jarama", RaceType.STANDARD, 10));
		races.add(new Race("Monza", RaceType.STANDARD, 20));
		races.add(new Race("Reims", RaceType.STANDARD, 30));
		races.add(new Race("Silverstone", RaceType.STANDARD, 10));

		for (int i = 0; i < races.size(); i++) {
			races.get(i).setCars(cars);
		}

		/* Tournament marioKart = new Tournament("Mario Kart", parkings, races); */

		/*
		 * parkings = new ArrayList<Parking>(); parkings.add(new Parking("Red Bull"));
		 * parkings.add(new Parking("Pirelli")); parkings.add(new Parking("Michelin"));
		 * parkings.add(new Parking("Desatranques Jaén")); parkings.add(new
		 * Parking("Benetton")); parkings.add(new Parking("Toro Rosso"));
		 */
		

		/* PARA TORNEOS
		 for (Race e : races) {
			e.realizarVueltas();

		}*/

	}

	public void iniciar() {
		
		races.get(2).realizarVueltas();

		for (int i = 0; i < cars.size(); i++) {
			System.out.println((cars.get(i).getBrand()) + " " + (cars.get(i).getModel()) + " ha recorrido "
					+ (cars.get(i).getDistance()) + " km");

		}

	}

}
