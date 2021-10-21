package sports;

import interfaces.Sport;

public class Leichtathletik implements Sport{
	protected double zeit = 25;
	@Override
	public double kalkuliereZeit() {
		
		return zeit;
	}
	
	public double getZeit() {
		return this.zeit;
	}
	
	public void setZeit(double newZeit) {
		this.zeit = newZeit;
	}
}
