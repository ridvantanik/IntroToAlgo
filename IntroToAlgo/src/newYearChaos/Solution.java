package newYearChaos;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfTestCases = sc.nextInt();
		
		for(int i = 0; i < numberOfTestCases; i++){
			int testCaseLength = sc.nextInt();
			int[] array = new int[testCaseLength];
			for(int j = 0; j < testCaseLength; j++){
				array[j] = sc.nextInt();
			}
			hesapla(testCaseLength, array);
		}
	}

	private static void hesapla(int testCaseLength, int[] array) {
		int[] numberOfBribe = new int[testCaseLength + 1];
		boolean tooChaotic = false;
		boolean finished = false;
		int result = 0;
		
		while(!finished){
			finished = true;
			for(int i = 0; i < testCaseLength - 1; i++){
				if(array[i] > array[i + 1]){
					numberOfBribe[array[i]]++;
					if(numberOfBribe[array[i]] > 2){
						tooChaotic = true;
						finished = true;
						break;
					}
					result++;
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					finished = false;
				}
			}
		}
		if(tooChaotic){
			System.out.println("Too chaotic");
		} else {
			System.out.println(result);
		}
	}
}
