package com.day5.test;

import com.day5.sorting.QuickSortAlgorithm;

public class TestQuickSort {
	public static void main(String[] args) {
		int[] arr= {23,65,89,56,34,67,90,54,32,56};
		QuickSortAlgorithm.quicksort(arr, 0, arr.length-1);
	}

}
