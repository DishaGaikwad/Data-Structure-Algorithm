package com.day5.test;

import com.day5.search.SearchingService;

public class TestSearch {
	public static void main(String[] args) {
		int[] arr= {23,54,87,90,67,43,23,65,89,78,54,23,657,98,65,43};
		int pos=SearchingService.sequentialSearch(arr,7);
		if(pos!=-1) {
			System.out.println("number found at position : "+pos);
		}else {
			System.out.println("not found");
		}
		int[] arr1= {12,354,46,57,6,45,234,23,423,53,45,45,4};
		pos=SearchingService.binarySearchNonRecurssive(arr1,15);
		if(pos!=-1) {
			System.out.println("binary search number found at position :" +pos);
		}else {
			System.out.println("binary search number not found");
		}
		
		pos=SearchingService.binarySearchRecurssive (arr1, 15,0,10);
		if(pos!=-1) {
			System.out.println("binary search number found at position:"+pos);
		}else {
			System.out.println("binary search number not found");
		}
	}

}
