package fibonacci;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		long t1 = System.currentTimeMillis();
		System.out.println(s.nthFibonacciNumberEquation(10000));
		long t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);
		t1 = System.currentTimeMillis();
		System.out.println(s.nthFibonacciNumberBottomUp(10000));
		t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);
		t1 = System.currentTimeMillis();
		System.out.println(s.nthFibonacciNumberTopDownDyn(10000));
		t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);
//		t1 = System.currentTimeMillis();
//		System.out.println(s.nthFibonacciNumberTopDownRecursive(40));
//		t2 = System.currentTimeMillis();
//		System.out.println(t2 - t1);
	}
	
	private double nthFibonacciNumberEquation(int number) {
		final double Phi = (1 + Math.sqrt(5))/2;
		final double phi = (1 - Math.sqrt(5))/2;
		
		return (Math.pow(Phi, number) - Math.pow(phi, number)) / Math.sqrt(5);
	}
	
	public double nthFibonacciNumberBottomUp(int number){
		List<Double> memory = new LinkedList<>();
		memory.add(1.0);
		memory.add(1.0);
		for(int i = 2; i < number; i++){
			memory.add(memory.get(i-1) + memory.get(i-2));
		}
		
		return memory.get(number-1);
	}

	public double nthFibonacciNumberTopDownDyn(int number){
		Map<Integer, Double> memory = new HashMap<>();
		memory.put(1, 1.0);
		memory.put(2, 1.0);
		return nthFibonacciNumberTopDownDynAux(number, memory);
	}
	
	private double nthFibonacciNumberTopDownDynAux(int number, Map<Integer, Double> memory) {
		double result = 0;
		if(memory.get(number) != null && memory.get(number) > 0) {
			return memory.get(number);
		} else {
			for(int i = number; i > 0; i--){
				memory.put(number - 1, nthFibonacciNumberTopDownDynAux(number - 1, memory));
				memory.put(number - 2, nthFibonacciNumberTopDownDynAux(number - 2, memory));
				result = memory.get(number - 1) + memory.get(number - 2);
			}
		}
		return result;
	}

	public int nthFibonacciNumberTopDownRecursive(int number){
		int result = 0;
		if(number == 2 || number == 1) return 1;
		
		result = nthFibonacciNumberTopDownRecursive(number - 1) + nthFibonacciNumberTopDownRecursive(number - 2);
		return result;
	}
}
