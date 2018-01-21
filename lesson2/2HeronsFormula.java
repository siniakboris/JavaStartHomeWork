package com.gmail.siniakboris;

public class Main {

	public static void main(String[] args) {
		/* Value of the variable  */
		double a = 7.5;
		double b = 5;
		double c = 4;
		double p = (a + b + c) / 2;
		/* Heron's formula  */
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("S = " + s);

}
}
