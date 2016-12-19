package cuttingBoards;

import java.math.BigInteger;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
    	Solution s = new Solution();
    	
        Scanner sc = new Scanner(System.in);
        int numberOfQueries = sc.nextInt();
        
        int numberOfRows = 0;
        int numberOfColumns = 0;
        
        for(int i = 0; i < numberOfQueries; i++){
        	numberOfRows = sc.nextInt();
        	numberOfColumns = sc.nextInt();
        	PriorityQueue<BigInteger> pqRows = new PriorityQueue<BigInteger>(numberOfRows - 1, Collections.reverseOrder());
        	PriorityQueue<BigInteger> pqColumns = new PriorityQueue<BigInteger>(numberOfColumns - 1, Collections.reverseOrder());
        	
        	for(int m = 0; m < numberOfRows - 1; m++){
        		pqRows.add(new BigInteger(new Integer(sc.nextInt()).toString()));
        	}
        	for(int n = 0; n < numberOfColumns - 1; n++){
        		pqColumns.add(new BigInteger(new Integer(sc.nextInt()).toString()));
        	}
        	
        	s.calculateMinCost(pqRows, pqColumns);
        }
    }

	private void calculateMinCost(PriorityQueue<BigInteger> pqRows, PriorityQueue<BigInteger> pqColumns) {
		BigInteger numberOfRowCuts = new BigInteger("1");
		BigInteger numberOfColumnCuts = new BigInteger("1");
		
		BigInteger cost = new BigInteger("0");
		BigInteger headOfRows = new BigInteger("-1");
		BigInteger headOfColumns = new BigInteger("-1");
		while(!(pqRows.isEmpty() && pqColumns.isEmpty())){
			headOfRows = pqRows.peek() != null ? pqRows.peek() : new BigInteger("-1") ;
			headOfColumns = pqColumns.peek()!= null ? pqColumns.peek() : new BigInteger("-1") ;
			if(headOfRows.compareTo(headOfColumns) > 0){
				headOfRows = pqRows.poll();
				cost = cost.add(headOfRows.multiply(numberOfColumnCuts));
				numberOfRowCuts = numberOfRowCuts.add(new BigInteger("1"));
			}else{
				headOfColumns = pqColumns.poll();
				cost = cost.add(headOfColumns.multiply(numberOfRowCuts));
				numberOfColumnCuts = numberOfColumnCuts.add(new BigInteger("1"));
			}
		}
		
		System.out.println(cost.mod(new BigInteger("1000000007")));
	}
	
}