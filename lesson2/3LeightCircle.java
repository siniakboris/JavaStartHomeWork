package com.gmail.siniakboris;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	/* Create scanner  */
	Scanner sc = new Scanner(System.in);
	System.out.println("Введите радиус окружности в сантиметрах");
	double r = sc.nextDouble();
	/* Formula for the length of a circle  */
	double p = 2 * Math.PI * r;
	System.out.println("Длина окружности = " + p + " cм.");
	}
}
