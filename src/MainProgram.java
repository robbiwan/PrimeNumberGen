import java.util.List;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.updox.prime.*;

/**
 * Main class for running PrimeNumberGenerator
 */
public class MainProgram {

	private final static Logger logger = LoggerFactory
			.getLogger(MainProgram.class);

	public static void main(String[] args) {
		
		if (logger.isDebugEnabled()) {
            logger.debug("main() begin");
		}
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the Start Number:  ");
		int startNumber = input.nextInt();

		System.out.print("Enter the End Number: ");
		int endNumber = input.nextInt();

		PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGeneratorImpl();

		List<Integer> primes = primeNumberGenerator.generate(startNumber,
				endNumber);

		System.out.println("The prime Numbers are as follows: ");

		for (Integer i : primes) {

			System.out.println(i);
		}

		input.close();
		
		if (logger.isDebugEnabled()) {
            logger.debug("main() end");
		}

	}
}
