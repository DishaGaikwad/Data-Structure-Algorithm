package com.day5.test;

import java.util.stream.IntStream;

import com.day5.sorting.BubbleSortAlgorithm;

public class TestBubbleSort {
	public static void main(String[] args) {
		int[] arr= {21,2,5,1,7,8,3,6,35,567,32,477,3,5,56,3,46,5,432};
		BubbleSortAlgorithm.bubbleSortImprovedDescending(arr);
		IntStream.of(arr).forEach(e->System.out.println(e+"\t"));
	}

}
