package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.main.io.ReadCharFile;

public class ReadCharFileMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter file path");
		String path = scanner.next();

		ReadCharFile readCharFile = new ReadCharFile(path);

		String data = readCharFile.getFileData();
		System.out.println(data);
	}
}
