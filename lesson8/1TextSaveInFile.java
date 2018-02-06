package com.gmail.siniakboris;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextSaveInFile {

	public static void main(String[] args) {
		System.out.println("Введите текст");
		Scanner scOne = new Scanner(System.in);
		Scanner scTwo = new Scanner(System.in);
		String text = scOne.nextLine();
		System.out.println("Введите имя файла");
		String fileName = scTwo.nextLine();
		File file = new File(fileName);

		createFile(file);
		saveText(text, file);

	}

	public static void saveText(String text, File file) {

		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void createFile(File file) {

		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
