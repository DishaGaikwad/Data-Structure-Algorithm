package com.day6.test;

import java.util.Arrays;

import com.day6.sort.HeapSortAlgorithm;

public class TestHeapSortAlgorithm {
	
	public static void main(String[] args) {
		int[] arr= {3,7,5,10,9,4};
		HeapSortAlgorithm.heapSortAscending(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------");
	}

}
