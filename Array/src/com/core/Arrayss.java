package com.core;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayss{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------");
		int size = sc.nextInt();

		int num[] = new int[size];

		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
			// System.out.println(num[i]);5

		}
		// for (int i = 0; i < size; i++) {
		// System.out.println(num[i]);

		// }
		Arrays.sort(num);
		for (int num1 : num) {
			System.out.println(num1 + " ");

		}
		System.out.println("min no="+num[0]);
		System.out.println("max no="+num[num.length-1]);
		
		
	}
	
	

}
