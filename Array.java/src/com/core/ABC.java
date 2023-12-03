package com.core;

import java.util.Arrays;
import java.util.Scanner;

public class ABC {

	private static void reverseArray(int arr[],int start,int end) {
		
		int temp;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			}
		}
	private static  void printArray(int arr[],int size) {
		//Arrays.sort(arr);
		for(int array:arr) {
			System.out.println(array);
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("-----------Size of Array------------");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		printArray(arr,size);
		reverseArray(arr,0,size-1);
		printArray(arr,size);
		
	}

}
