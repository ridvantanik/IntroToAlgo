package plusMinus;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        Solution s = new Solution();
        s.fractionOfSigns(arr);
    }
    
    public void fractionOfSigns(int[] arr){
    	float positives = 0;
    	float negatives = 0;
    	float zeros = 0;
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 0){
				positives++;
			} else if(arr[i] < 0){
				negatives++;
			} else {
				zeros++;
			}
		}
    	System.out.println(new BigDecimal(positives/arr.length));
    	System.out.println(new BigDecimal(negatives/arr.length));
    	System.out.println(new BigDecimal(zeros/arr.length));
    }
}