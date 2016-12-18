package caeserCipher;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String input = sc.next();
		int k = sc.nextInt()%26;
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < length; i++){
			char currentLetter = input.charAt(i);
			if(65 <= currentLetter && currentLetter <= 90){ //capitalLetter
				if(((int)currentLetter) + k > 90){
					currentLetter = (char) (((int)currentLetter) + k - 26);
				} else {
					currentLetter = (char) (((int)currentLetter) + k);
				}
			}else if(97 <= currentLetter && currentLetter <= 122){ //lowerCaseLetter
				if(((int)currentLetter) + k > 122){
					currentLetter = (char) (((int)currentLetter) + k - 26);
				} else {
					currentLetter = (char) (((int)currentLetter) + k);
				}
			}
			sb.append(currentLetter);
		}
		System.out.println(sb);
	}

}
