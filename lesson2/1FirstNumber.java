package com.gmail.siniakboris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Пожалуйста, введите пятизначное число");
		int number = sc.nextInt();
		int n1 = number / 10000;
		int n2 = number % 10000 / 1000;
		int n3 = number % 1000 / 100;
		int n4 = number % 100 / 10;
		int n5 = number % 10;
		// Print out number
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
	}

}
