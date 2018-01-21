package com.gmail.siniakboris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		int a = sc.nextInt();

		int n1 = a / 1000;
		int n2 = a % 1000 / 100;
		int n3 = a % 100 / 10;
		int n4 = a % 10;

		int summa1 = n1 + n2;
		int summa2 = n3 + n4;

		if (summa1 == summa2) {
			System.out.println("Повезло");
		}

		else if (summa1 > 9) {
			if ((summa1 / 10) + (summa1 % 10) == summa2) {
				System.out.println("Повезло");

			}
		}

		else if (summa2 > 9) {
			if ((summa2 / 10) + (summa2 % 10) == summa1) {
				System.out.println("Повезло");
			}
		} else {
			System.out.println("НЕ повезло");
		}

	}
}
