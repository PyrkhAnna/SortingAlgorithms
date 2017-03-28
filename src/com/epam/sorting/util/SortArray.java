package com.epam.sorting.util;

public class SortArray {
	// private int x=0;
	public static int[] bubbleSortMax(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int ii = 0; ii < array.length; ii++) {
				if (array[i] > array[ii]) {
					changeItemPlace(array, i, ii);
				}
			}
		}
		return array;
	}

	public static int[] bubbleSortMin(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int ii = 0; ii < array.length; ii++) {
				if (array[i] < array[ii])
					changeItemPlace(array, i, ii);
			}
		}
		return array;
	}

	public static int[] quickSort(int[] array) {

		return array;
	}

	public static int[] selectionSort(int[] array) {
		int maxIndex = 0;
		for (int i = 0; i < array.length-1; i++) {
			maxIndex = findMax(array, i+1);
			if (array[i] < array[maxIndex])
				changeItemPlace(array, i, maxIndex);

		}
		return array;
	}

	public static int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length - 1; i++) {
			int j = 0;
			do {
				if (array[j] > array[i])
					moveSubarray(array, j, i);
				j++;
			} while (j < i);
		}
		return array;
	}

	private static void moveSubarray(int[] arr, int startIndex, int endIndex) {
		int temp = 0;
		temp = arr[endIndex];
		for (int i = endIndex; i > startIndex; i--)
			arr[i] = arr[i - 1];
		arr[startIndex] = temp;
	}

	private static void changeItemPlace(int[] arr, int from, int to) {
		int temp = arr[from];
		arr[from] = arr[to];
		arr[to] = temp;
	}

	public static int findMax(int[] arr, int startIndex) {
		int max = arr[startIndex];
		int maxIndex = startIndex;
		for (int i = startIndex+1; i < arr.length; i++)
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		return maxIndex;
	}

	public int findMin(int[] arr, int startIndex) {
		int min = arr[startIndex];
		int minIndex = startIndex;
		for (int i = startIndex+1; i < arr.length; i++)
			if (min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}
		return minIndex;
	}

	public static String arrayToString(int[] array) {
		String str = "";
		for (int i = 0; i < (array.length - 1); i++)
			str = str + array[i] + ", ";
		str = str + array[array.length - 1];
		return str;
	}
}
