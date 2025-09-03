package test.io;

import java.io.File;
import java.util.UUID;

public class FileRename {
	public static void main(String[] args) {
		new FileRename();
	}
	
	public FileRename() {
		File file = new File("d:/temp/(2013-07-24) 영통 e-편한어린이집-1.pdf");
		file.renameTo(new File("d:/temp/"+UUID.randomUUID().toString()));
	}
}
