package com.day5.test;

import com.day5.sorting.MergeSortAlgorithm;

public class TestMergeSort {
	public static void main(String[] args) {
		int[] arr= {23,67,54,90,54,32,87,90,54,23,67,98};
		MergeSortAlgorithm.mergeSortAscending(arr, 0, arr.length-1);
	}

}
