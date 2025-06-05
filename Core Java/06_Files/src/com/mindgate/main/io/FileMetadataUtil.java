package com.mindgate.main.io;

import java.io.File;
import java.util.Date;

public class FileMetadataUtil {

	public static void printFileMetadata(File file) {
		if (file.exists()) {
			System.out.println("File Name :: " + file.getName());
			System.out.println("File Path :: " + file.getAbsolutePath());
			System.out.println("File Size :: " + file.length() + " bytes");
			System.out.println("Is Folder :: " + file.isDirectory());
			System.out.println("Is File = " + file.isFile());
			System.out.println("Is Hidden :: " + file.isHidden());
			System.out.println("Execute Permission :: " + file.canExecute());
			System.out.println("Read Permission :: " + file.canRead());
			System.out.println("Write Permission :: " + file.canWrite());
			System.out.println("Last Modified :: " + new Date(file.lastModified()));

		} else {
			System.out.println("File Not Found !!");
			System.out.println("Invalid path");
		}
	}
}
