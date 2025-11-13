package com.assignment.datastructures.service;

import java.util.Arrays;

import com.assignment.datastructures.model.NumberUtils;

public class ArrayProcessor {
	
	public void processArray(int[] arr) {
		System.out.println("Digital sums :");
		for(int num : arr) {
			System.out.println(num +"-> "+NumberUtils.digitSum(num));
		}
		System.out.println("\n Factorials of prime numbers :");
		for(int num : arr) {
			if(NumberUtils.isPrime(num)) {
				System.out.println(num + "! ="+NumberUtils.factorial(num));
			}
		}
		int maxPrime=Arrays.stream(arr).filter(NumberUtils::isPrime)
									   .max()
									   .orElse(-1);
		System.out.println("\n TransFormed copy of array :");
		int[] copied=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(NumberUtils.isPrime(arr[i]) && arr[i] < 5) {
				copied[i]=NumberUtils.reverseNumber(arr[i]);
			}else {
				copied[i]=arr[i];
			}
			System.out.println(copied[i]+" ");
		}
		System.out.println();
	}

}
