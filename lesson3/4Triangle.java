package com.gmail.siniakboris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите длину стороны а");
		double a = sc.nextDouble();
		System.out.println("Введите длину стороны b");
		double b = sc.nextDouble();
		System.out.println("Введите длину стороны c");
		double c = sc.nextDouble();
		
		if ((a + b) > c && (b + c) > a && (a + c) > b) {
			System.out.println("Такой треугольник существует");
		} else {
			System.out.println("Такой треугольник не существует");
		}
	}

}
