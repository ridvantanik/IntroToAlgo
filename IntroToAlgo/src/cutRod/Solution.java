package cutRod;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lengthOfRod = in.nextInt();
		int pricesLength = in.nextInt();
		int[] prices = new int[pricesLength + 1];
		int i = 1;

		prices[0] = 0;
		while (i < pricesLength) {
			prices[i] = in.nextInt();
			i++;
		}
		in.close();

		Solution s = new Solution();
		System.out.println(s.cutRoadBottoUpDynamicly(prices, lengthOfRod));
	}

	public int cutRod(int[] prices, int lengthOfRod) {
		if (lengthOfRod == 0)
			return 0;
		int maxPrice = 0;

		for (int i = 1; i <= lengthOfRod; i++) {
			maxPrice = Math.max(maxPrice, prices[i - 1] + cutRod(prices, lengthOfRod - i));
		}

		return maxPrice;
	}

//	public int cutRodDynamicly(int[] prices, int lengthOfRod) {
//		int[] memory = new int[prices.length];
//		return cutRodDynamiclyAux(prices, lengthOfRod, memory);
//	}
//
//	private int cutRodDynamiclyAux(int[] prices, int lengthOfRod, int[] memory) {
//		int maxPrice = 0;
//		if (memory[lengthOfRod] > 0)
//			return memory[lengthOfRod];
//		
//		if (lengthOfRod == 0)
//			maxPrice = 0;
//		else {
//			for (int i = 1; i <= lengthOfRod; i++) {
//				maxPrice = Math.max(maxPrice, prices[i - 1] + cutRodDynamiclyAux(prices, lengthOfRod - i, memory));
//			}
//		}
//
//		return maxPrice;
//	}
	
	public int cutRoadBottoUpDynamicly(int[] prices, int lengthOfRoad){
		int maxPrice = 0;
		int[] memory = new int[prices.length + 1];
		memory[0] = 0;
		for(int i = 1; i <= lengthOfRoad; i++){
			for(int j = 1; j <= i; j++){
				maxPrice = Math.max(maxPrice, prices[j] + memory[i - j]);
				memory[i] = maxPrice;
			}
		}
		return memory[lengthOfRoad];
	}
}
