package wearingWhiteHat;

import java.util.Scanner;

/**
 * 
 * There are N persons in a room, each of them wearing a hat which is either
 * black or white. Every person counts the number of other persons wearing the
 * white hat. Given the number of counts of each person, the task is to find the
 * number of persons wearing white hats, or print -1 if the given counts don’t
 * correspond to a valid situation
 * Input : arr[] = {2, 1, 1}.
 *	Output : 2
 *	First person sees two white hats. Second
 *	and third persons see one white hat. The 
 *	first person must be wearing a black hat
 *	and other two must be wearing a white hat.
 * 
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] whites = new int[N];
		
		for(int i = 0; i < N; i++){
			whites[i] = sc.nextInt();
		}
		
		int X = -1, Y = -1;
		int numberOfX = 0, numberOfY = 0;
		boolean ilkFarklilikMi = true;
		if(N == 1){
			System.out.println(-1);
		}else {
			X = whites[0];
			numberOfX++;
			for(int i = 1; i < N; i++){
				if(whites[i] == X){
					numberOfX ++;
				} else {
					if(ilkFarklilikMi){
						Y = whites[i];
						numberOfY++;
						ilkFarklilikMi = false;
					} else {
						if(whites[i] == Y){
							numberOfY++;
						} else {
							System.out.println(-1);
							break;
						}
					}
				}
			}
			if(X == 0 && numberOfX == N){
				System.out.println(0);
			}else{
				if(numberOfX == (X + 1) && numberOfY == (N - Y)){
					System.out.println(Y);
				}else{
					System.out.println(-1);
				}
			}
			
		}
		
	}

}
