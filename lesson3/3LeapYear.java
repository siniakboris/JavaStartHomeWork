package com.gmail.siniakboris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите год: ");
		int year = sc.nextInt();
		int a = year % 4;
		int b = year % 100;
		int c = year % 400;
		
		if ((a == 0) & !(b == 0) || (c == 0)) {
			System.out.println("Год высокосный - 366 дней.");
		} else {
			System.out.println("Год не высокосный - 365 дней.");
		}
	}

}
