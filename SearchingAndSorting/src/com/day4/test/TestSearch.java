package com.day4.test;

import com.day4.search.SearchingService;

public class TestSearch {
	public static void main(String[] args) {
		int[] arr= {10,5,4,7,8,2,15};
		int pos=SearchingService.sequentialSearch(arr, 7);
		if(pos!=-1) {
			System.out.println("number found at position : " +pos);
		}else {
			System.out.println("not found");
		}
		int[] arr1= {12,13,16,23,37,45,68,35,54,23};
		pos=SearchingService.binarySearchNonRecurssive(arr1, 15);
		if(pos!=-1) {
			System.out.println("nimary search number found position : "+pos);
		}else {
			System.out.println("binary search number not found");
		}
		pos=SearchingService.binarySearchRecurssive(arr1, 15,0,10);
		if(pos!=-1) {
			System.out.println("binary search number found at position : "+pos);
			
		}else {
			System.out.println("binary search number not found");
		}
	}

}
