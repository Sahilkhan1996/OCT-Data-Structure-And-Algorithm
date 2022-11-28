
package com.bridgelabz.algorithmanddatastucture;

public class InsertionSort {

	public <T> void insertionSort(T[] array) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			T key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i].toString().compareTo(key.toString()) > 0)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}

		System.out.println("Array after insertion sort:");

		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

}