package com.gmail.siniakboris;

import java.util.Scanner;

public class FindNumber {

	public static int methodFindNumber(int[] array, int a) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == a) {
				a = i;
				return a;
			}

		}
		return a = -1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число:");
		int n = sc.nextInt();
		int[] arrayOne = { 0, 1, 2, 2, 4, 5, 6, 7, 8, 9, 9, 1 };
		System.out.println(methodFindNumber(arrayOne, n));

	}

}
