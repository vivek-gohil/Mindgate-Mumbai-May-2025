package com.mindgate.main;

import java.io.File;
import java.util.Scanner;

import com.mindgate.main.io.FileMetadataUtil;

public class FileMetadataUtileMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter file path");
		String path = scanner.next();

		File file = new File(path);

		FileMetadataUtil.printFileMetadata(file);

	}
}
