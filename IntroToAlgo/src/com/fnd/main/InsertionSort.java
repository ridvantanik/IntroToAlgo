package com.fnd.main;

public class InsertionSort {
	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		int[] A = { 5, 2, 4, 6, 1, 7 };
		is.insertionSort(A);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}

	public int[] insertionSort(int[] A) {

		for (int i = 1; i < A.length; i++) {
			int key = A[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (A[j] > key) {
					A[j + 1] = A[j];
				} else {
					break;
				}
			}
			A[j + 1] = key;
		}

		return A;
	}

	public int[] insertionSortWithWhile(int[] A) {

		for (int i = 1; i < A.length; i++) {
			int key = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > key) {
				A[j + 1] = A[j];
				j--;
			}
			A[j+1] = key;
		}

		return A;
	}
}
