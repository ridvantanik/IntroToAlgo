package almostSorted;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
	  public static void main(String[] args) throws IOException {
	    Scanner sc = new Scanner(System.in);
	    int length = sc.nextInt();
	    int[] almostSortedArray = new int[length];
	    for(int i = 0; i < length; ++i){
	      almostSortedArray[i] = sc.nextInt();
	    }
	    
	    System.out.print(isSortable(almostSortedArray, length));
	  }
	  
	  private static String isSortable(int[] almostSortedArray, int length){
	    int soldanBozan = 0;
	    int sagdanBozan = length - 1;
	    
		while (soldanBozan < sagdanBozan && almostSortedArray[soldanBozan] <= almostSortedArray[soldanBozan + 1]) {
			++soldanBozan;
		}
	    
	    //zaten sirali mi?
	    if(soldanBozan == sagdanBozan){
	      return "yes";
	    }
	    
		while (sagdanBozan > soldanBozan && almostSortedArray[sagdanBozan] >= almostSortedArray[sagdanBozan - 1]) {
			--sagdanBozan;
		}
	    
	    //yapilabilir mi?
	    if((soldanBozan > 0 && almostSortedArray[sagdanBozan] < almostSortedArray[soldanBozan-1]) || (sagdanBozan < length-1 && almostSortedArray[soldanBozan] > almostSortedArray[sagdanBozan+1])){
	      return "no";
	    }
	        
	    //Reverse etmek olayi cozuyor mu?
	    int m;
	    for(m = soldanBozan+1; m < sagdanBozan && almostSortedArray[m] >= almostSortedArray[m+1]; ++m){}
	    if(m == sagdanBozan){
	      return "yes\n" + ((sagdanBozan-soldanBozan < 2) ? "swap " : "reverse ") + (soldanBozan+1) + " " + (sagdanBozan+1);
	    }
	    
	    //Swap isimize yaramiyor
	    if(m-soldanBozan > 1 || almostSortedArray[soldanBozan] < almostSortedArray[sagdanBozan-1] || almostSortedArray[sagdanBozan] > almostSortedArray[soldanBozan+1]){
	      return "no";
	    }
	    
	    //swap isimize yariyor
	    for(int k = sagdanBozan-1; m < k && almostSortedArray[m] <= almostSortedArray[m+1]; ++m){}
	    return (sagdanBozan-m > 1) ? "no" : "yes\nswap " + (soldanBozan+1) + " " + (sagdanBozan+1);
	  }
	}
