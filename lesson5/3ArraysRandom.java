package com.gmail.siniakboris;

import java.util.Arrays;

public class ArraysRandom3 {

	public static void main(String[] args) {

		int[] arraysOne = new int[15];
		int[] arraysTwo = new int[arraysOne.length * 2];
		int a = 0;

		for (int i = 0; i < 15; i++) {
			arraysOne[i] = ((int) (Math.random() * 100));
		}

		System.out.println(Arrays.toString(arraysOne));
		arraysTwo = Arrays.copyOf(arraysOne, arraysTwo.length);

		for (int j = arraysTwo.length / 2; j < arraysTwo.length; j++) {
			arraysTwo[j] = arraysOne[a] * 2;
			a = a + 1;
		}

		System.out.println(Arrays.toString(arraysTwo));

	}

}
