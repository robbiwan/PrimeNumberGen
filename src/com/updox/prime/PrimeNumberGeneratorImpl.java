package com.updox.prime;

import java.util.LinkedList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of PrimeNumberGenerator. This Class generates PrimeNumbers
 */
public class PrimeNumberGeneratorImpl implements PrimeNumberGenerator {

	private final Logger logger = LoggerFactory
			.getLogger(PrimeNumberGeneratorImpl.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Integer> generate(int startingValue, int endingValue) {
		
		if (logger.isDebugEnabled()) {
	            logger.debug("generate() begin");
	    }
		
		if (startingValue > endingValue) {
			int temp = startingValue;
			startingValue = endingValue;
			endingValue = temp;

		}

		List<Integer> primes = new LinkedList<Integer>();

		int counter = startingValue;

		while (counter <= endingValue) {

			if (isPrime(counter)) {
				primes.add(counter);
			}

			counter = counter + 1;

		}
		if (logger.isDebugEnabled()) {
            logger.debug("generate() end");
		}
		return primes;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isPrime(int value) {
		
		if (logger.isDebugEnabled()) {
            logger.debug("isPrime() begin");
		}
		
		if (value < 2)
			return false;

		for (int i = 2; i <= Math.ceil(value / 2); i++) {
			if (value % i == 0) {
				return false;
			}

		}
		
		if (logger.isDebugEnabled()) {
            logger.debug("isPrime() begin");
		}
		return true;

	}

}
