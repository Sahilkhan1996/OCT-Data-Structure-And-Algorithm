package com.bridgelabz.algorithmanddatastucture;

public class InsertionSort {

	public String[] insertionSort(String[] array) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			String key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i].compareTo(key) > 0)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
		return array;
	}

	public static void main(String a[]) {

		InsertionSort insSort = new InsertionSort();

		String[] strArray = { "Tango", "Alpha", "Golf", "Bravo", "Charlie", "Foxtrot" };
		System.out.println("Before Insertion Sort:");

		for (String ele : strArray) {
			System.out.print(ele + " ");
		}
		System.out.println();

		String[] sortedArray = insSort.insertionSort(strArray);

		System.out.println("After Insertion Sort:");
		for (String ele : sortedArray) {
			System.out.print(ele + " ");
		}
	}

}