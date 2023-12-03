package com.core;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		Arrays.sort(arr);
		for(int arry:arr) {
			System.out.println(arry);
			
		}
//		for(int i=0; i<size; i++) {
//			System.out.println(arr[i]);
//			
//		}
//Arrays.sort(arr);
//for(int arr1:arr) {
//	System.out.println(arr1);
//}
//System.out.println(arr[0]);
//System.out.println(arr[arr.length-1]);
	}

}
