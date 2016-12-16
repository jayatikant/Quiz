package mayankg;

import java.util.Arrays;
import java.util.Scanner;

//naming  4
	//	updateNonPrimeNumbers has a side-effect
//object oriented design	4
	// the number entered could also be an instance variable
//modularity 	5
	//	updateNonPrimeNumbers has a side-effect
//error handling / validations	2
	//no error message
	// no upper limit 
	// no try-finally for resources
	//no check for garbage values 
//algorithm fulfillment 5
	
	
public class MaximumPrimeNumber {

	private boolean prime[];
	int maxPrime = 0;

	public static void main(String[] args) {
		System.out.print("Enter the last number of the range ::: ");
		Scanner reader = new Scanner(System.in);
		int nextInt = reader.nextInt();
		System.out.println("x = "
				+ new MaximumPrimeNumber().getMaxPrime(nextInt));
	}

	private int getMaxPrime(int n) {
		if (n < 2)
			return 0;
		prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		updateNonPrimeNumbers(n);
		return maxPrime;
	}

	private void updateNonPrimeNumbers(int n) {
		for (int i = 2; i <= n; i++)
			if (prime[i]) {
				maxPrime = i;
				for (int j = i * 2; j <= n; j += i)
					prime[j] = false;
			}
	}
}