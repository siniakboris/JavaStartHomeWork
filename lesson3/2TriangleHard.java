package com.gmail.siniakboris;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x1 = 0;
		double y1 = 0;
		double x2 = 4;
		double y2 = 4;
		double x3 = 6;
		double y3 = 1;
		
		System.out.println("Введите координату Х");
		double x = sc.nextDouble();
		System.out.println("Введите координату Y");
		double y = sc.nextDouble();
		
		double a = (x1 - x) * (y2 - y1) - (x2 - x1) * (y1 - y);
		double b = (x2 - x) * (y3 - y2) - (x3 - x2) * (y2 - y);
		double c = (x3 - x) * (y1 - y3) - (x1 - x3) * (y3 - y);

		if ((a >= 0 & b >= 0 & c >= 0) || (a <= 0 & b <= 0 & c <= 0)) {
			System.out.println("Точка лежит внутри треугольника");	
		} else {
			System.out.println("Точка лежит вне треугольника");
		}
			
		
	}
}
