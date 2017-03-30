package com.epam.sorting.util;

public class SortArray {
	
	public static int[] bubbleSortMin(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int ii = 0; ii < array.length; ii++) {
				changeIfElementIsLarger(array, i, ii);
			}
		}
		return array;
	}

	public static int[] quickSort(int[] array) {
		if (array.length!=0) algQuickSort(array, 0, array.length - 1);
		return array;
	}

	private static int[] algQuickSort(int[] array, int first, int last) {
		if (first == last)
			return array;
		int i = first;
		int j = last;
		int middle = Math.round((first + last) / 2);
				while (i < j) {
			while (i < middle && array[i] <= array[middle])
				i++;
			while (middle < j && array[middle] <= array[j])
				j--;
			if (i < j) {
				swap(array, i, j);
				if (i == middle)
					middle = j;
				else if (j == middle)
					middle = i;
			}
		}
		algQuickSort(array, first, middle);
		algQuickSort(array, middle + 1, last);
		return array;
	}

	public static int[] selectionSort(int[] array) {
		int maxIndex = 0;
		for (int i = 0; i < array.length - 1; i++) {
			maxIndex = findIndexMaxElement(array, i + 1);
			changeIfElementIsLarger(array, i, maxIndex);
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
	private static void changeIfElementIsLarger (int[] array, int fist, int second) {
		if (array[fist] < array[second])
			swap(array, fist, second);
	}
	private static void swap(int[] arr, int from, int to) {
		int temp = arr[from];
		arr[from] = arr[to];
		arr[to] = temp;
	}

	private static int findIndexMaxElement(int[] arr, int startIndex) {
		int max = arr[startIndex];
		int maxIndex = startIndex;
		for (int i = startIndex + 1; i < arr.length; i++)
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		return maxIndex;
	}

	public static String arrayToString(int[] array) {
		String str = "";
		for (int i = 0; i < (array.length - 1); i++)
			str = str + array[i] + ", ";
		str = str + array[array.length - 1];
		return str;
	}
}
