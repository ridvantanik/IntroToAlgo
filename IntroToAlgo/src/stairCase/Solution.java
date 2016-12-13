package stairCase;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Solution s = new Solution();
        s.printStairCase(n);
    }
    
    public void printStairCase(int size){
    	String s;
    	for(int i = 1; i <= size; i++){
    		s = String.format("%" + size + "s", new String(new char[i]).replace('\0', '#'));
			if (i != size) {
				System.out.println(s);
			} else {
				System.out.print(s);
			}
    	}
    }
}