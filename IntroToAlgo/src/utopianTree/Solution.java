package utopianTree;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int length = 1;
            int numberOfYear = n/2;
            for(int i = 0; i < n/2; i++){
            	length = 2*length + 1;
            }
            if(n % 2 != 0){
            	length = 2*length;
            }
            System.out.println(length);
        }
    }
}
