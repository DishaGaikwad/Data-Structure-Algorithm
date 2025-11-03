package test;

import java.util.stream.IntStream;

import com.demo.sorting.BubbleSortAlgorithm;

public class TestBubbleSort {
	public static void main(String[] args) {
		int[] arr= {21,2,5,7,8,10,3};
		BubbleSortAlgorithm.bubbleSortImprovedDescending(arr);
		IntStream.of(arr).forEach(e->System.out.println(e+"\t"));
	}

}
