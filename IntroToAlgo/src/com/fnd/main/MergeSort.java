package com.fnd.main;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = {3, 5, 2, 4, 7, 1, 0};
		MergeSort mergeSort = new MergeSort();
		int result[] = mergeSort.mergeSortFunction(array);
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

	public int[] mergeSortFunction(int[] array){
		if (array.length > 1) {
			int leftArrayLength = array.length / 2;
			int rightArrayLength = array.length - leftArrayLength;
			int leftArray[] = new int[leftArrayLength];
			int rightArray[] = new int[rightArrayLength];
			System.arraycopy(array, 0, leftArray, 0, leftArrayLength);
			System.arraycopy(array, leftArrayLength, rightArray, 0, rightArrayLength);
			mergeSortFunction(leftArray);
			mergeSortFunction(rightArray);
			
			int il = 0;
			int ir = 0;
			int ia = 0;
			while(il != leftArray.length && ir != rightArray.length){
				if(leftArray[il] < rightArray[ir]){
					array[ia] = leftArray[il];
					il++;
				}else{
					array[ia] = rightArray[ir];
					ir++;
				}
				ia++;
			}
			while(leftArray.length != il) {
				array[ia] = leftArray[il];
				il++;
				ia++;
			}
			while(rightArray.length != ir)
			{
				array[ia] = rightArray[ir];
				ir++;
				ia++;
			}
			return array;
			
		}else{
			return array;
		}
		
	}

}
