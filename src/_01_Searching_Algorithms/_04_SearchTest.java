package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] words = {"apple", "banana", "cherry", "dragonfruit", "elderberry"};
		assertEquals(2, _00_LinearSearch.linearSearch(words, "cherry"));
		assertEquals(0, _00_LinearSearch.linearSearch(words, "apple"));
		assertEquals(4, _00_LinearSearch.linearSearch(words, "elderberry"));
		assertEquals(-1, _00_LinearSearch.linearSearch(words, "pineapple"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11 };
		assertEquals(2, _01_BinarySearch.binarySearch(array, 0, array.length - 1, 3));
		assertEquals(0, _01_BinarySearch.binarySearch(array, 0, array.length - 1, 1));
		assertEquals(9, _01_BinarySearch.binarySearch(array, 0, array.length - 1, 11));
		assertEquals(-1, _01_BinarySearch.binarySearch(array, 0, array.length - 1, 12));
		assertEquals(-1, _01_BinarySearch.binarySearch(array, 0, array.length - 1, 10));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] array = {100, 200, 300, 400, 500, 600 };
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(array, 300));
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(array, 100));
		assertEquals(5, _02_InterpolationSearch.interpolationSearch(array, 600));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(array, 700));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(array, 350));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] array = new int[1000];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		assertEquals(999, _03_ExponentialSearch.exponentialSearch(array, 999));
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(array, 0));
		assertEquals(417, _03_ExponentialSearch.exponentialSearch(array, 417));	
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(array, 1000));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(array, -6));
	}
}
