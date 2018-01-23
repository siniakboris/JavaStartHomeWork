package com.gmail.siniakboris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Введите количество полос");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 5;

		if (a > 0) {
			for (int i = 1; i <= b; i = i + 1) {
				for (int j = 1; j <= a; j = j + 1) {
					if (j % 2 != 0) {
						System.out.print("***");
					} else {
						System.out.print("+++");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("Ошибка, введите число больше 0");
		}
	}

}
