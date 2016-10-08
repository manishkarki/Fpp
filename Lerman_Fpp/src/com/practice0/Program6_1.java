package com.practice0;

import java.util.Arrays;

public class Program6_1 {
	public static double power(double x, int n) {
		if (n < 0) {
			n *= -1;
			return 1 / (x * power(x, n - 1));
		}
		if (n == 0) {
			System.out.println("n equals 0");
			return 1;
		} else if (n == 1)
			return x;
		System.out.println("In n has:" + n);
		return x * power(x, n - 1);
	}

	public static int recursiveBinarySearch(int n, int[] array) {
		if (array.length == 1) {
			if (array[0] == n) {
				return 0;
			} else {
				return -1;
			}
		} else {
			int mid = (array.length - 1) / 2;
			if (array[mid] == n) {
				return mid;
			} else if (array[mid] > n) {
				return recursiveBinarySearch(n, Arrays.copyOfRange(array, 0, mid));
			} else {
				int returnIndex = recursiveBinarySearch(n, Arrays.copyOfRange(array, mid + 1, array.length));
				if (returnIndex >= 0) {
					return returnIndex + mid + 1;
				} else {
					return returnIndex;
				}
			}
		}

	}

	public static void main(String[] a) {
		 System.out.println("2 power 10 is:"+power(2,5));
		 System.out.println("search 2 in array 1,3,4,2,5,7,8,9::"+recursiveBinarySearch(2, new int[]{1,3,4,2,5,7,8,9}));
	}
}