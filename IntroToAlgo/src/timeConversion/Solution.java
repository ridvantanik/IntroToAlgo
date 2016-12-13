package timeConversion;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String[] timeArray = time.split(":");
        
        String s ;
        if(timeArray[2].contains("P")){
        	if(new Integer(timeArray[0]) != 12){
        		s = String.format("%02d:" + "%02d:" + "%02d", new Integer(timeArray[0]) + 12, new Integer(timeArray[1]), new Integer(timeArray[2].substring(0, 2)));
        	} else {
        		s = String.format("%02d:" + "%02d:" + "%02d", new Integer(timeArray[0]), new Integer(timeArray[1]), new Integer(timeArray[2].substring(0, 2)));
        	}
        }else{
        	if(new Integer(timeArray[0]) != 12){
        		s = String.format("%02d:" + "%02d:" + "%02d", new Integer(timeArray[0]), new Integer(timeArray[1]), new Integer(timeArray[2].substring(0, 2)));
        	} else {
        		s = String.format("%02d:" + "%02d:" + "%02d", 0, new Integer(timeArray[1]), new Integer(timeArray[2].substring(0, 2)));
        	}
        }
        System.out.println(s);
    }

}
