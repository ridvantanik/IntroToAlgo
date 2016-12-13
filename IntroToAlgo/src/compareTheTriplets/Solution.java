package compareTheTriplets;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        int aliceScore = 0;
        int bobScore = 0;
        
        if(a0 > b0) {
        	aliceScore++;
        } else if (b0 > a0) {
        	bobScore++;
        }
        
        if(a1 > b1) {
        	aliceScore++;
        } else if (b1 > a1) {
        	bobScore++;
        }
        
        if(a2 > b2) {
        	aliceScore++;
        } else if (b2 > a2) {
        	bobScore++;
        }
        
        System.out.println(aliceScore + " " + bobScore);
    }
}
