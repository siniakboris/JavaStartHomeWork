package com.gmail.siniakboris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Таблица умножения на 5:");

		int n = 5;
		
		for (int i = 1; i <= 9; i = i + 1) {
			int s = i * n;
			System.out.println(i + " * " + n + " = " + s );
		}
		
	}

}
