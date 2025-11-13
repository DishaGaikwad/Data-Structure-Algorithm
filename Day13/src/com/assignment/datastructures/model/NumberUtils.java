package com.assignment.datastructures.model;

public class NumberUtils {
	
	public static boolean isPrime(int n) {
		if(n<2) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static int digitSum(int n) {
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	public static int reverseNumber(int n) {
		int rev=0;
		while(n>0) {
			rev=rev*10+n%10;
			n/=10;
		}
		return rev;
	}
	public static int factorial(int n) {
		int fact=1;
		for(int i=2;i<=n;i++) {
				fact*=i;
		}
		return fact;
	}

}
