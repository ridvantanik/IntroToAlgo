package algoritmicCrush;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int p = 0;
		int q = 0;
		double sum = 0;
		double[] array = new double[N + 1];
			
		for(int i = 0; i < K; i++){
			p = sc.nextInt();
			q = sc.nextInt();
			sum = sc.nextInt();
			array[p] += sum;
			if((q+1) <= N){
				array[q+1] -= sum;
			}
		}

		int x = 0;
		int max = 0;
	    for(int i = 1; i <= N; i++) {
	       x += array[i];
	       if(max < x) max = x;

	    }
		System.out.println(max);
	}

}
