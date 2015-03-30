package de.regnator.pp;

/**
 * @author Sebastian
 * @version 1.0
 */
public interface Calculator {

	/**
	 * @param zahl1 variable for the first number you want to add
	 * @param zahl2 second variable to add
	 * @return returns the result
	 */
	 int add(int zahl1, int zahl2);
	/**
	 * @param zahl1 variable for the first number you want to substract
	 * @param zahl2 second variable to substract
	 * @return returns the result
	 */
	int subtract(int zahl1, int zahl2);
	/**
	 * @param zahl1 variable for the first number you want to multiply
	 * @param zahl2 second variable to multiply
	 * @return returns the result
	 */
	int multiply(int zahl1, int zahl2);

	/**
	 * @param zahl1 variable for the first number you want to divide
	 * @param zahl2 second variable to divide
	 * @return returns the result
	 */
	float divide(int zahl1, int zahl2);

}
