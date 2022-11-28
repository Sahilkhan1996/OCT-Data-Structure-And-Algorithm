package com.bridgelabz.algorithmanddatastucture;

public class BubbleSort {

	public <T> void bubbleSort(T[] array) {
		int size = array.length;

		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (array[j].toString().compareTo(array[j + 1].toString()) > 0) {
					T temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Array after bubble sort:");

		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
}