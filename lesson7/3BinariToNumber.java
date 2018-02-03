package com.gmail.siniakboris;

import java.util.Scanner;

public class BinariToNumber {

	public static int ResultBinar(char[] textArrays) {
		int a = 0;

		for (int i = 0; i < textArrays.length; i++) {
			if (textArrays[i] == '0') {
				a = a * 2 + 0;
			} else if (textArrays[i] == '1') {
				a = a * 2 + 1;
			} else {
				return a = 0;
			}
		}
		return a;

	}

	public static void main(String[] args) {

		System.out.println("Введите двоичное число");
		Scanner sct = new Scanner(System.in);
		String text = sct.nextLine();
		char[] t = text.toCharArray();

		if (ResultBinar(t) != 0) {
			System.out.println(ResultBinar(t));
		} else {
			System.out.println("Простите, вы ввели не двоичное число");
		}

	}
}
