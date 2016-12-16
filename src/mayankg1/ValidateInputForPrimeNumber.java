package mayankg1;

public class ValidateInputForPrimeNumber {
	public static boolean validateInputForRange(int n) {
		if (lowerRangeValidation(n))
			return upperRangeValidation(n);
		return false;
	}

	private static boolean lowerRangeValidation(int n) {
		if (n < 2) {
			System.out.println("Your range is too low, prime numbers start 2");
			return false;
		}
		return true;
	}

	private static boolean upperRangeValidation(int n) {
		if (n > 61500000) {
			System.out
					.println("Your range is too high for me, try keeping it within 61500000");
			return false;
		}
		return true;
	}
}
