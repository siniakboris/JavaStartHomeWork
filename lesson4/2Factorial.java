package com.gmail.siniakboris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Введите число от 4 до 16");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 1;

		if ((n >= 4) | (n <= 16)) {
			for (int i = 2; n >= i; i = i + 1) {
				r = r * i;
			} 
			System.out.println("Факториал числа " + n +" равен " + r);

		} else {
			System.out.println("Ошибка, вы ввели неверное число.");
		}
	}
}
