package com.gmail.siniakboris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите координату X");
		double x = sc.nextDouble();
		System.out.println("Введите координату Y");
		double y = sc.nextDouble();
		double r = 4;
		
		// Use Pythagorean theorem
		
		if (Math.sqrt(x*x + y*y) <= r ) {
			System.out.println("Ваша точка лежит в круге");
		} else {
			System.out.println("Ваша точка лежит ВНЕ круга");
		}
	}
}
