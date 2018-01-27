package com.gmail.siniakboris;

import java.util.Arrays;

public class ArraysMirror {

	public static void main(String[] args) {

		int[] arraysOne = { 1, 2, 3, 4, 5, 6 };
    
		System.out.println("Выводим оригинальный массив:");
		System.out.println(Arrays.toString(arraysOne));

		for (int i = 0; i < arraysOne.length / 2; i++) {
			int a = arraysOne[i];
			arraysOne[i] = arraysOne[arraysOne.length - (i + 1)];
			arraysOne[arraysOne.length - (i + 1)] = a;
		}
    
		System.out.println("Выводим отзеркаленный массив:");
		System.out.println(Arrays.toString(arraysOne));

	}

}
