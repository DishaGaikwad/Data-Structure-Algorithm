package com.day4.test;

import com.day4.sorting.QuickSortAlgorithm;

public class TestQuickSort {
	public static void main(String[] args) {
		int[] arr= {5,3,8,1,4,6,2,7};
		QuickSortAlgorithm.quicksort(arr, 0, arr.length-1);
	}

}
