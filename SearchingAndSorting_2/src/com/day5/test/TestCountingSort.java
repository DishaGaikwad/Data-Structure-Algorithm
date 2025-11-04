package com.day5.test;

import java.util.Arrays;

import com.day5.sorting.CountingSortAlgorithm;

public class TestCountingSort {
	
	public static void main(String[] args) {
		int[] arr= {21,7,4,6,8,4,76,54,78,34,67,34,87,34,76};
		int[] output=CountingSortAlgorithm.CountingSortAlgorithm(arr);
		System.out.println("sorted data :");
		System.out.println(Arrays.toString(output));
	}

}
