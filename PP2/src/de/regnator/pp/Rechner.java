package de.regnator.pp;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.*;




/**
 * @author Sebastian
 * @version 1.0
 */
public class Rechner implements Calculator {

	private static Logger log = Logger.getLogger(Rechner.class.getName());
	
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
	public static void main(String[] args){
		setuplogger();
		log.info("Info");
		
	}
	@SuppressWarnings("static-access")
	private static void setuplogger(){
		InputStream InputStream = Rechner.class.getResourceAsStream("loggingg.properties");
				try{
					LogManager.getLogManager().readConfiguration(InputStream);
				}
				catch(final IOException e){
					log.getAnonymousLogger().severe("Could not load deafult logging.properties file");
					log.getAnonymousLogger().severe(e.getMessage());
				}
	}
}
