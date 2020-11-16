package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration that specifies the place a sport in practiced.
 * 
 * @author pippo
 *
 */
public enum Place {
	
	INDOOR, OUTDOOR;

	
	public String toString() {
		if (this.equals(Place.INDOOR)) {
			return "Indoor";
		} else {
			return "Outdoor";
		}
	}
}
