package com.gmail.siniakboris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Введите число:");
		
		int n = sc.nextInt();
		int a = 1;

		for (int i = 1; i < n * 2;) {
			if (a <= i && i <= n * 2 - a) {
				System.out.print("#");
				a = a + 1;
			} else {
				System.out.println(" ");
				i = i + 1;
				a = 1;
			}
		}
	}
}
