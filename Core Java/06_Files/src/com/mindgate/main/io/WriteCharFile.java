package com.mindgate.main.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteCharFile {
	private String filePath;
	private Writer writer;
	private File file;

	public WriteCharFile(String filePath) {
		file = new File(filePath);
	}

	public boolean writeFileData(String data) {
		try {
			writer = new FileWriter(file, true);
			writer.write(data.toCharArray());
			return true;
		} catch (IOException e) {
			System.out.println("Failed to write file");
			System.out.println(e.getMessage());
			return false;
		} finally {
			try {
				if (writer != null) {
					writer.flush();
					writer.close();
					writer = null;
				}
			} catch (IOException e) {
				System.out.println("Failed to flush/close");
				System.out.println(e.getMessage());
			}
		}
	}

}
