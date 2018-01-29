package com.gmail.siniakboris;

public class MethodStringSumma {
	
public static String sumStringMethod (int a, double b, String c) {
	double s = a + b;
	String sum = c + s;
	return sum;

}

	public static void main(String[] args) {
		int a = 5;
		double b = 15.5;
		String c = "Hello, World ";
		
		System.out.println(sumStringMethod(a, b, c));
	}

}
