package com.gmail.siniakboris;

public class MaxNumber {

	public static int getMaxNumber(int[] array) {
		int maxnumber = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxnumber) {
				maxnumber = array[i];
			}
		}
		return maxnumber;

	}

	public static void main(String[] args) {
		int[] arrayOne = { -2, -3, -12, -166, -55, -107, -4 };
		System.out.println(getMaxNumber(arrayOne));
	}

}
