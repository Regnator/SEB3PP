package de.regnator.pp;





/**
 * @author Sebastian
 * @version 1.0
 */
public class Rechner implements Calculator {

	
	public int add(int zahl1, int zahl2) {
		int ergebniss;
		ergebniss = zahl1 + zahl2;
		return ergebniss;
	}

	
	public int subtract(int zahl1, int zahl2) {
		int ergebniss;
		ergebniss = zahl1 - zahl2;
		return ergebniss;
	}

	
	public int multiply(int zahl1, int zahl2) {
		int ergebniss;
		ergebniss = zahl1 * zahl2;
		return ergebniss;
	}

	
	public float divide(int zahl1, int zahl2) {
		float ergebniss;
		ergebniss = zahl1 / zahl2;
		return ergebniss;
	}

}
