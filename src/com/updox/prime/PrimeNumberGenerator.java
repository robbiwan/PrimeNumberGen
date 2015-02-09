package com.updox.prime;

import java.util.List;

public interface PrimeNumberGenerator {
	
	/**
	 * Generates a List of PrimeNumber based on the startingValue
	 * and Ending Value.
	 * <p>
	 *
	 * @param  startingValue  value to start counting from
	 * @param  endingValue    value to end counting from
	 * @return the list of prime numbers
	 */
	List<Integer>generate(int startingValue, int endingValue);
	
	/**
	 * Checks if the value passed in is a PrimeNumber. 
	 * <p>
	 *
	 * @param  value the number used to determine if prime number.
	 * @return true if the value is prime number.
	 */
	boolean isPrime(int value);
}
