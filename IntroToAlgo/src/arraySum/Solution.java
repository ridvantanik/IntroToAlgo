package arraySum;

import java.util.Scanner;

/**
 * Given an array of integers, can you find the sum of its elements?
 * 
 * Input Format
 * 
 * The first line contains an integer, , denoting the size of the array. The
 * second line contains space-separated integers representing the array's
 * elements.
 * 
 * Output Format
 * 
 * Print the sum of the array's elements as a single integer.
 * 
 * Sample Input
 * 
 * 6 1 2 3 4 10 11
 * 
 * Sample Output
 * 
 * 31
 * 
 * Explanation
 * 
 * We print the sum of the array's elements, which is: .
 *
 */

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		try {

			int length = in.nextInt();
			Long[] longArray = new Long[length];

			int i = 0;
			while (i < length && in.hasNextLong()) {
				longArray[i] = in.nextLong();
				i++;
			}

			Solution s = new Solution();
			long result = s.arraySum(longArray);
			System.out.println(result);
		} catch (Exception e) {

		} finally {
			in.close();
		}

	}

	public long arraySum(Long[] longArray) {
		int length = longArray.length;
		long sum = 0;
		for (int i = 0; i < length; i++) {
			sum += longArray[i];
		}
		return sum;
	}
}