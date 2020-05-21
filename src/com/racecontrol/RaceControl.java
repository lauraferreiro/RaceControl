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

		/* parkings = new ArrayList<Parking>(); parkings.add(new Parking("Red Bull"));
		 * parkings.add(new Parking("Pirelli")); parkings.add(new Parking("Michelin"));
		 * parkings.add(new Parking("Desatranques Jaén")); parkings.add(new
		 * Parking("Benetton")); parkings.add(new Parking("Toro Rosso"));*/

	}

	public void iniciar() {
		
		for (Car w : cars) {
			w.resetAll();
		}
		
		Scanner in = new Scanner(System.in);
		System.out.println("Selecciona una carrera:");

		for (int l = 0; l < races.size(); l++) {
			System.out.println(l + " " + races.get(l).getName());
		}

		int scan = in.nextInt();

		races.get(scan).realizarVueltas();
		
		Collections.sort(cars, new Compare());
		int point = 10;

		for (int x = 0; x < 3; x++) {
			cars.get(x).setPoints(point);
			point -= 3;
		}

		for (Car a : cars) {
			System.out.println((a.getBrand()) + " " + (a.getModel()) + " ha recorrido " + (a.getDistance())
					+ " km y ha obtenido " + (a.getPoints()) + " puntos.");
		}
		


	}

	public class Compare implements Comparator<Car> {

		@Override
		public int compare(Car e1, Car e2) {
			if (e1.getDistance() > e2.getDistance()) {
				return -1;
			} else if (e1.getDistance() > e2.getDistance()) {
				return 0;
			} else {
				return 1;
			}

		}

	}
	
	public class Podium implements Comparator<Car> {

		@Override
		public int compare(Car e1, Car e2) {
			if (e1.getPoints() > e2.getPoints()) {
				return -1;
			} else if (e1.getPoints() > e2.getPoints()) {
				return 0;
			} else {
				return 1;
			}

		}

	}

	public void celebrar() {

		Tournament marioKart = new Tournament("Mario Kart", races);
		System.out.println("Torneo " + marioKart.getTournamentName());
		
		for (Race e : races) {
			
			for (Car w : cars) {
				w.reset();
			}
			
			e.realizarVueltas();
			
			System.out.println("Carrera " + (e.getName()));
			
			Collections.sort(cars, new Compare());
			int point = 10;

			for (int x = 0; x < 3; x++) {
				cars.get(x).setPoints((cars.get(x).getPoints()) + point);
				point -= 3;
			}

			for (Car a : cars) {
				System.out.println((a.getBrand()) + " " + (a.getModel()) + " ha recorrido " + (a.getDistance())
						+ " km y ha obtenido " + (a.getPoints()) + " puntos.");
			}
		}
		
		System.out.println("\n" + "Podio del torneo " + (marioKart.getTournamentName()));
		Collections.sort(cars, new Podium());
		for (int k=0; k < 3; k++) {
			System.out.println("Posición " + (k+1) + " " + (cars.get(k).getBrand()) + " " + (cars.get(k).getModel()) +
					" ha obtenido " + (cars.get(k).getPoints()) + " puntos.");
		}
	}		
}
