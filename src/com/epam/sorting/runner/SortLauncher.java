package com.epam.sorting.runner;

import com.epam.sorting.util.SortArray;

public class SortLauncher {

	public static void main(String[] args) {
		int[] arr = {6, 5,9,12,45,0,21,4,7,8,1,6,87};
		int[] arr2 = arr.clone();
		SortArray.bubbleSortMin(arr);
		System.out.println(SortArray.arrayToString(arr));
		SortArray.bubbleSortMax(arr); 
		System.out.println(SortArray.arrayToString(arr));
	
		System.out.println(SortArray.arrayToString(arr2));
		//SortArray.insertionSort(arr2);
		SortArray.selectionSort(arr2);
		System.out.println(SortArray.arrayToString(arr2));

	}

}
