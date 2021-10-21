package user;

import java.util.ArrayList;
import interfaces.Sport;

public class Benutzer {
	
	private String vorName;
	private String nachName;
	private ArrayList<Sport> sport;
	
	public Benutzer(){
		vorName = "Radu";
		nachName = "Tarean";
		this.sport = new ArrayList<Sport>();
	}
	
	public double kalkuliereZeit() {
		double total = 0;
		for(Sport currentSport : sport) {
			total+=currentSport.kalkuliereZeit();
		}
		return total;
	}
	
	public double kalkuliereZeit(Sport currentSport) {
		return currentSport.kalkuliereZeit();
	}
	
	public double kalkuliereDurschnitszeit() {
		double sum = 0;
		for(Sport currentSport : sport) {
			sum+=currentSport.kalkuliereZeit();
		}
		return sum/sport.size();
	}
	
	public String getVorname() {
		return this.vorName;
	}
	
	public String getNachName() {
		return this.nachName;
	}
	
	public void setVorName(String newVorName) {
		this.vorName = newVorName;
	}
	
	public void setNachName(String newNachName) {
		this.nachName = newNachName;
	}
	
	public void addSport(Sport newSport) {
		this.sport.add(newSport);
	}
	
}
