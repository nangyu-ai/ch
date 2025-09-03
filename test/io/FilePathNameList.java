package test.io;

import java.io.File;

public class FilePathNameList {
	public static void main(String[] args) {
		new FilePathNameList();
	}
	
	public FilePathNameList() {
		File dir = new File("D:/dhjang/ch/playground/eco-playground.kr/safe/upload_document_safety");
		File files[] = dir.listFiles();

		for (int i = 0; i < files.length; i++) {
		    System.out.println("file: " + files[i]);
		}
	}
}
