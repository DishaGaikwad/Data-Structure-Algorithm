package com.searchingandsorting.search;

public class SearchingService {

	public static void main(String[] args) {
		int[] arr= {1,56,4,634,53,54,5,46,6,4};
		int target =54;
		int index = search(arr, target);
		System.out.println(index);
	}
	private static int search(int[] arr, int target) {
		int n=arr.length;
		
		for (int i = 0; i < n; i++) 
			if(arr[i]==target) 
				return i;
		return -1;
	}

}
