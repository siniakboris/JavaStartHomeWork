package com.gmail.siniakboris;

import java.util.Scanner;

public class DrawRectangle {

	public static void drawRectangle(int a, int b) {
		for (int i = 1; i <= a; i = i + 1) {
			for (int j = 1; j <= b; j = j + 1) {
				if ((j == 1) || (j == a) || (i == 1) || (i == b)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}

	public static void main(String[] args) {

		/**
		 * Create and use scanner for hight and width our rectangle
		 * 
		 * @author Boris
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите ширину фигуры");
		int w = sc.nextInt();
		System.out.println("Введите высоту фигуры");
		int h = sc.nextInt();

		/**
		 * 
		 */

		drawRectangle(h, w);
	}

}
