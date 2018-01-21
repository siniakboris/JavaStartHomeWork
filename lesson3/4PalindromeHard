package com.gmail.siniakboris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		int a = sc.nextInt();
		
		int n1 = a / 100000;
		int n2 = a % 100000 / 10000;
		int n3 = a % 10000 / 1000;
		int n4 = a % 1000 / 100;
		int n5 = a % 100 / 10;
		int n6 = a % 10;
		
		if ((n1 == n6) && (n2 == n5) && (n3 == n4)) {
			System.out.println("Число является паллидромом");
		} else {
			System.out.println("Число НЕ является паллидромом");
		}
	}

}
