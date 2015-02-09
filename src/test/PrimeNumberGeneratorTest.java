package test;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.updox.prime.PrimeNumberGenerator;
import com.updox.prime.PrimeNumberGeneratorImpl;


/**
 * Unit Tests for PrimeNumberGenerator 
 */
public class PrimeNumberGeneratorTest {

	private final Logger logger = LoggerFactory
			.getLogger(PrimeNumberGeneratorTest.class);

	@Test
	public void testInverseRange() {
		logger.info("testInverseRange() begin");

		PrimeNumberGenerator pmg = new PrimeNumberGeneratorImpl();
		List<Integer> primes = pmg.generate(10, 1);
		List<Integer> primesExpected = new ArrayList<Integer>();

		primesExpected.add(2);
		primesExpected.add(3);
		primesExpected.add(5);
		primesExpected.add(7);

		logger.info("Derived Primes{}. Expected Primes {}.", primes,
				primesExpected);

		assertEquals(primes, primesExpected);

		logger.info("testInverseRange() end");
	}

	@Test
	public void testIsPrime() {

		logger.info("testIsPrime) begin");

		PrimeNumberGenerator pmg = new PrimeNumberGeneratorImpl();

		assertEquals(true, pmg.isPrime(7901));
		assertEquals(true, pmg.isPrime(7907));
		assertEquals(true, pmg.isPrime(7919));

		logger.info("testIsPrime end");

	}

	@Test
	public void testRangeScenario1() {

		logger.info("testRangeScenario1() begin");

		PrimeNumberGenerator pmg = new PrimeNumberGeneratorImpl();
		List<Integer> primes = pmg.generate(7900, 7920);
		List<Integer> primesExpected = new ArrayList<Integer>();

		primesExpected.add(7901);
		primesExpected.add(7907);
		primesExpected.add(7919);

		logger.info("Derived Primes{}. Expected Primes {}.", primes,
				primesExpected);

		assertEquals(primes, primesExpected);

		logger.info("testRangeScenario1() end");

	}

	@Test
	public void testRangeScenario2() {

		logger.info("testRangeScenario2() begin");

		Integer[] primesArray = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
				41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 };

		PrimeNumberGenerator pmg = new PrimeNumberGeneratorImpl();
		List<Integer> primes = pmg.generate(1, 101);
		List<Integer> primesExpected = new ArrayList<Integer>();
		primesExpected.addAll(Arrays.asList(primesArray));

		logger.info("Derived Primes{}. Expected Primes {}.", primes,
				primesExpected);

		assertEquals(primes, primesExpected);

		logger.info("testRangeScenario2() end");
	}

}
