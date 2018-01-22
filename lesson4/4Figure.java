package com.gmail.siniakboris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите высоту фигуры");
		int h = sc.nextInt();
		System.out.println("Введите ширину фигуры");
		int w = sc.nextInt();

		for (int i = 1; i <= w; i = i + 1) {
			for (int j = 1; j <= h; j = j + 1) {
				if ((j == 1) || (j == h) || (i == 1) || (i == h)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
