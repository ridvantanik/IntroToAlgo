package tutorialIntro;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt();
		int length = sc.nextInt();
		
		for(int i = 0; i < length; i++){
			if(V == sc.nextInt()){
				System.out.println(i);
				break;
			}
		}
	}

}
