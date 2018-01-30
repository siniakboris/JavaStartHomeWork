package com.gmail.siniakboris;

import java.util.Scanner;
import java.util.Arrays;

public class MethodNumberOfWord {

	public static int numberWord(char[] array) {
		int a = 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == ' ') {
				a = a + 1;
			}

		}

		/**
		 * Next "if" solve problem with last space
		 */

		if (array[array.length - 1] == ' ') {
			a = a - 1;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку текста");
		String text = sc.nextLine();
		char[] t = text.toCharArray();
		System.out.println("Количество слов в строке = " + (numberWord(t)));
	}

}
