package com.gmail.siniakboris;

public class MyArraysToString {

	public static String MyArrToString(int[] arrays) {

		StringBuilder sb = new StringBuilder();
		
		sb.append("{ ");
		
		for (int i = 0; i < arrays.length; i++) {
			int b = arrays[i];
			
			if (i < arrays.length - 1) {
				sb.append(b);
				sb.append(", ");

			} else {
				sb.append(b);
			}
		}
		
		sb.append(" }");
		return sb.toString();
	}

	public static void main(String[] args) {
		int[] a = { 0, 2, 2, 3, 3, 4, 4, 5, 5 };
		System.out.println(MyArrToString(a));
	}
}
