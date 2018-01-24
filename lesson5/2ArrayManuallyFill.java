package com.gmail.siniakboris;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите размер массива");

		int n = sc.nextInt();

		int[] arrayOne = new int[n];

		for (int i = 0; i < arrayOne.length; i++) {
			System.out.println("Введите " + (i + 1) + " число массива");
			int a = sc.nextInt();
			arrayOne[i] = a;
		}
		System.out.println(Arrays.toString(arrayOne));
	}

}
