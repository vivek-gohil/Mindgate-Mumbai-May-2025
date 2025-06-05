package com.mindgate.main.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadCharFile {
	private long size;
	private char[] fileData;
	private Reader reader;
	private File file;

	public ReadCharFile(String filePath) {
		file = new File(filePath);
		size = file.length();
		fileData = new char[(int) size];
	}

	public String getFileData() {
		try {
			reader = new FileReader(file);
			reader.read(fileData);
			String data = new String(fileData);
			return data;
		} catch (FileNotFoundException e) {
			System.out.println("Invalid File Path");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("IO Exception");
			System.out.println(e.getMessage());
		} finally {
			try {
				reader.close();
				reader = null;
			} catch (IOException e) {
				System.out.println("Failed to close reader");
				System.out.println(e.getMessage());
			}
		}
		return null;
	}
}
