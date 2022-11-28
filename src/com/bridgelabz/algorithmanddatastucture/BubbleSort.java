

package com.bridgelabz.algorithmanddatastucture;
import java.util.Arrays;
public class BubbleSort {

    public int[] bubbleSort(int[] array) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        return array;
    }

    public static void main(String args[]) {

        BubbleSort bs = new BubbleSort();

        int[] arr = { 9,7,0,44,-73,8 };

        System.out.println("Array :");
        System.out.println(Arrays.toString(arr));

        int[] sortedArray=bs.bubbleSort(arr);

        System.out.println("Array after bubble sort:");
        System.out.println(Arrays.toString(sortedArray));
    }
}