package com.day4.test;

import java.util.stream.IntStream;
import com.day4.sorting.BubbleSortAlgorithm;

public class TestBubbleSort {
    public static void main(String[] args) {
        int[] arr = {21, 2, 5, 1, 7, 8, 10, 3};
        BubbleSortAlgorithm.bubbleSortImprovedDescending(arr);
        System.out.println("Sorted Array (Descending):");
        IntStream.of(arr).forEach(e -> System.out.print(e + "\t"));
    }
}
