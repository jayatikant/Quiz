package rachit;

import java.util.Arrays;
import java.util.Scanner;


// naming 4
	// names are according to algorithm not according to functionality
// object oriented design 3
	// some variables could be made instance variables 
	// all methods shouldn't be static 
// modularity 5
	// buildSieveArray method could be more modular
// error handling / validations 3
	//no upper limit defined
	//no try-finally for scanner
	//no check for garbage values 
// algorithm fulfillment 5	

public class SieveOfEratosthenes {

	private static void buildSieve(int number) {
		boolean primes[] = new boolean[number + 1];
		buildSieveArray(number, primes);
		displayResult(number, primes);
	}

	private static void buildSieveArray(int number, boolean[] primes) {
		Arrays.fill(primes, true);
		for (int i = 2; i * i <= number; i++) {
			if (primes[i]) {
				for (int j = 2 * i; j <= number; j += i) {
					primes[j] = false;
				}
			}
		}
	}

	private static void displayResult(int number, boolean[] primes) {
		for (int k = number; k >= 0; k--) {
			if (primes[k]) {
				System.out
						.println("Largest prime number greater than or equal to "
								+ number + " is " + k);
				break;
			}
		}
	}

	public static void main(String[] args) {
		int number;
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		
		if (number <= 1)
			System.out.println("Enter number greater than 1");
		else
			buildSieve(number);
		scan.close();
	}
}