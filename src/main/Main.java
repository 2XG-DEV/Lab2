package main;

import user.Benutzer;
import sports.*;

public class Main {

	public static void main(String[] args) {
		Benutzer radu = new Benutzer();
		Fussball steauaDinamo = new Fussball();
		Basketball lakersBulls = new Basketball();
		Fussball FcCojascaIdeciu = new Fussball();
		Hindernislauf usainBolt = new Hindernislauf();
		Hochsprung javier = new Hochsprung();
		radu.addSport(javier);
		radu.addSport(steauaDinamo);
		radu.addSport(FcCojascaIdeciu);
		radu.addSport(lakersBulls);
		radu.addSport(usainBolt);
		
		System.out.println(radu.kalkuliereDurschnitszeit());
		System.out.println(radu.kalkuliereZeit());
		System.out.println(radu.kalkuliereZeit(lakersBulls));
	}

}
