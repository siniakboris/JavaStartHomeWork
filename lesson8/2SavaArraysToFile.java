package com.gmail.siniakboris;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveArraysNumber {

	public static void main(String[] args) {
		File fileOne = new File("array.txt");
		int[][] array = new int[10][10];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (100 + Math.random() * 100);
			}
		}
		saveArraysToFile(array, fileOne);
	}
	
	public static void saveArraysToFile(int[][] array, File file) {
		try (PrintWriter pw = new PrintWriter(file)) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					if (j < array[i].length - 1) {
						pw.print(array[i][j]);
						pw.print(", ");
					} else {
						pw.print(array[i][j]);
					}
				}
				pw.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
