package com.gmail.siniakboris;

public class Main {

	public static void main(String[] args) {

		int[] a = { 0, 5, 2, 4, 7, 1, 3, 19 };
		int n = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				n = n + 1;
			}

		}
		System.out.println("Количество нечетных чисел в массиве = " + n);
	}

}
