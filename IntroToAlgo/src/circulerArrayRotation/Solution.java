package circulerArrayRotation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            int originalIndex = 0;
            k%=n;
            if(m-k < 0){
            	originalIndex = m-k+n;
            } else {
            	originalIndex = m-k;
            }
            System.out.println(a[originalIndex]);
        }
        in.close();
    }
}
