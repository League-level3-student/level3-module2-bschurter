package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) return i;
		}
		return -1;
	}
	
	public static int multiply (int x, int y) {
		return x * y;
	}
	
	public static boolean isPrime (long value) {
		if (value <= 1)
		{
			// Eliminate 0 & 1
			return false;
		}
		else if ((value <= 3) || (value == 5))
		{
			// 2, 3 & 5 are prime
			return true;
		}
		else if (value % 2 == 0)
		{
			// Even numbers are not prime
			return false;
		}

		// Check for numbers divisible by 5
		if (value % 5 == 0)
		{
			// Any multiple of 5 (except 5) is not prime
			return false;
		}

		// If n is a positive composite integer, then n has a prime divisor less than or equal to sqrt(n)
		long max = (long)Math.sqrt(value);
		int counter = 3;
		for (long i = 3; i <= max; i += 2)
		{
			if (counter == 4)
			{
				counter = 0;
				continue;
			}
			counter++;
			if (value % i == 0)
			{
				// Found a factor, not prime
				return false;
			}
		}
		// No factors found
		return true;
	}
	
	public static boolean isSquare(long value) {
		return Math.sqrt(value) == (double)(long)Math.sqrt(value);
	}
	
	public static boolean isCube(long value) {
		return Math.cbrt(value) == (double)(long)Math.cbrt(value);
	}
}
