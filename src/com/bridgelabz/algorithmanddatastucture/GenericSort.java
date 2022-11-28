package com.bridgelabz.algorithmanddatastucture;

public class GenericSort {

	public static void main(String args[]) {

		BubbleSort bubbleSort = new BubbleSort();
		InsertionSort insertionSort = new InsertionSort();

		Integer[] integerArray = { 9, 7, 0, 44, -73, 8 };
		String[] stringArray = { "Tango", "Alpha", "Golf", "Bravo", "Charlie", "Foxtrot" };

		System.out.println("Array before bubble sort:");
		for (int i = 0; i < stringArray.length; i++)
			System.out.print(stringArray[i] + " ");

		bubbleSort.bubbleSort(stringArray);
		System.out.println("\n");

		System.out.println("Before Insertion Sort:");

		for (Integer ele : integerArray) {
			System.out.print(ele + " ");
		}
		System.out.println();
		insertionSort.insertionSort(integerArray);

	}

}