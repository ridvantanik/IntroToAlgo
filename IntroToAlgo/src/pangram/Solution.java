package pangram;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		sentence = sentence.toLowerCase();
		Set<Integer> alphabet = new HashSet<Integer>();
		
		for(int i = 97; i <= 122; i++){
			alphabet.add(i);
		}
		
		for(int i = 0; i < sentence.length(); i++){
			char currentLetter = sentence.charAt(i);
			if(alphabet.contains((int) currentLetter)){
				alphabet.remove((int) currentLetter);
			}
		}
		
		if(alphabet.isEmpty()){
			System.out.println("pangram");
		}else {
			System.out.println("not pangram");
		}
	}

}
