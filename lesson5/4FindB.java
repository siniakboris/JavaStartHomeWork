package com.gmail.siniakboris;

import java.util.Scanner;
import java.util.Arrays;

public class NumberB {

	public static void main(String[] args) {
		System.out.println("Введите строку");
		Scanner sct = new Scanner(System.in);
		String text = sct.nextLine();
		char[] t = text.toCharArray();
		int n = 0;
		
		for (int i = 0; i < t.length; i++) {
			if (t[i] == 'b') { 
				n = n + 1;
			}
		}

		System.out.println("Количество символов b в строке равно = " + n);
		
	}

}
