
public class PrimeNumber {

	public static void main(String[] args) {
		printPrimePalindrome(112);
	}
	public static void printPrimePalindrome(int primeNumbers) {
		final int numPerLine = 10;
		int count = 0;
		int number = 2;
		
		while (count < primeNumbers) {
			if(isPalindromes(number) && isPrime(number)) {
				count++;
				if (count % numPerLine == 0) {
					System.out.println("\t" + number);
				}
				else
					System.out.println("\t" + number);
			}
			number++;
		}
	}
	public static boolean isPrime(int number) {
		for(int divisor = 2; divisor <= number/2; divisor++) {
			if(number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPalindromes(int number) {
		int palindrome = number;
		int reverse = 0;
		
		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}
		if (number == reverse) {
			return true;
		}
		return false;
	}
	}



