package reverseShuffleMerge;

import java.util.Scanner;
import java.util.TreeSet;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int[] alphabet = new int[26];
		
		int length = input.length();
		for(int i = 0; i < length; i++){
			alphabet[((int) input.charAt(i)) - 97]++;
		}
		
		for(int i = 0; i < 26; i++){
			alphabet[i] /= 2;
		}
		
		for(int i = length -1; i >= 0; i--){
			
		}
		
	}
	
	public boolean contains(String input, String permutationString) {
	    if (permutationString.isEmpty()) {
	        return true;
	    }
	    int subsequenceIndex = 0;
	    for (int i = 0; i < input.length(); ++i) {
	        if (input.charAt(i) == permutationString.charAt(subsequenceIndex)) {
	            ++subsequenceIndex;
	            if (subsequenceIndex == permutationString.length()) {
	                return true;
	            }
	        }
	    }
	    return false;
	}

	public TreeSet<String> permutation(String str) {
		TreeSet<String> set = new TreeSet<String>();
	    permutation("", str, set);
	    return set;
	}
	
	private static void permutation(String prefix, String str, TreeSet<String> permutationSet) {
	    int n = str.length();
	    if (n == 0) permutationSet.add(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), permutationSet);
	    }
	}

}
