package sports;

import interfaces.Sport;

public class Mannschaftssport implements Sport{

	protected double zeit = 60;
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
