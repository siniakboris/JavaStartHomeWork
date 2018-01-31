package com.gmail.siniakboris;

public class NumberPi {

	public static void main(String[] args) {

		for (int i = 2; i <= 10; i++) {
			String numberPi = String.format("%." + i + "f", Math.PI);
			System.out.println(numberPi);
		}
	}
}
