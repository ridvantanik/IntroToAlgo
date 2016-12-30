package factorial;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(factorial(N));
	}

	private static double factorial(int n) {
		double result = 1;
		
		while(n > 1){
			result *= n--;
		}
		
		return result;
	}

}
