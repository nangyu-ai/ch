package test.io;

import java.io.File;

public class FileNameList {
	public static void main(String[] args) {
		new FileNameList();
	}
	
	public FileNameList() {
		File dir = new File("/D:/dhjang/ch/playground/eco-playground.kr/safe/upload_document_safety");
		String[] filenames = dir.list();
		for (int i = 0; i < filenames.length; i++) {
		    System.out.println("file: " + filenames[i]);
		}
	}
}
