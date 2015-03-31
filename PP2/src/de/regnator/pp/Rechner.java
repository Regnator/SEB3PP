package de.regnator.pp;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;




/**
 * @author Sebastian
 * @version 1.0
 */
public class Rechner implements Calculator {

	private static Logger log = Logger.getLogger(Rechner.class.getName());
	
	public int add(int zahl1, int zahl2) {
		int ergebniss;
		ergebniss = zahl1 + zahl2;
		log.finest("Das Ergebnis ist " + ergebniss);
		return ergebniss;
	}
	
	public int subtract(int zahl1, int zahl2) {
		int ergebniss;
		ergebniss = zahl1 - zahl2;
		log.finest("Das Ergebnis ist " + ergebniss);
		return ergebniss;
	}
	
	public int multiply(int zahl1, int zahl2) {
		int ergebniss;
		ergebniss = zahl1 * zahl2;
		log.finest("Das Ergebnis ist " + ergebniss);
		return ergebniss;
	}
	
	public float divide(int zahl1, int zahl2) {
		if(zahl2==0){
			log.severe("Teilen durch 0 ist nicht erlaubt ");
			return 0;
		}
		float ergebniss = (float)zahl1 / (float)zahl2;
		log.finest("Das Ergebnis ist " + ergebniss);
		return ergebniss;
	}
	
	public static void main(String[] args){
		setuplogger();
		Rechner t1 = new Rechner();
		t1.add(1, 2);
		t1.subtract(1, 2);
		t1.multiply(1, 2);
		t1.divide(10, 3);
	}
	
	private static void setuplogger(){
		final InputStream is = Rechner.class
				.getResourceAsStream("log.properties");
				try{
					LogManager.getLogManager().readConfiguration(is);
					
					Handler fileHandler = new FileHandler("PPlogs.log",100,5);
					fileHandler.setFormatter(new SimpleFormatter());
					log.addHandler(fileHandler);
				}
				catch(final IOException e){
					Logger.getAnonymousLogger().severe("Could not load deafult logging.properties file");
					Logger.getAnonymousLogger().severe(e.getMessage());
				}
	}
}
