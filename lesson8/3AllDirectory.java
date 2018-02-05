package com.gmail.siniakboris;

import java.io.File;
import java.text.SimpleDateFormat;

public class AllDirectoryHW {

	public static String allDirectory(File file) {

		String fileName = file.getName();
		String fileType = "Directory";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date = sdf.format(file.lastModified());
		String result = String.format("%-30.30s\t%-10.10s\t%-10.10s", fileName, fileType, date);
		return result;
	}

	public static void main(String[] args) {

		File mainFolder = new File(".");
		File[] allFiles = mainFolder.listFiles();

		for (int i = 0; i < allFiles.length; i++) {
			if (allFiles[i].isDirectory()) {
				System.out.println(allDirectory(allFiles[i]));
			}
		}
	}
}
