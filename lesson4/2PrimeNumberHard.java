package com.gmail.siniakboris;

public class Main {

	public static void main(String[] args) {

		for (int i = 2; i <= 100; i = i + 1) {
			for (int j = 2; j <= 100; j = j + 1) {
				if (i % j == 0) {
					if (i == j) {
						System.out.println(i);
					}
					else {
						break;
					}
				}
			}
		}
	}
}
