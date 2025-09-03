package test.io;

import java.io.File;
import java.util.UUID;

import org.apache.commons.io.FileUtils;

public class CopyRenameTo {
	public static void main(String[] args) {
		new CopyRenameTo();
	}
	
	public CopyRenameTo() {
		try {
			File original = new File("d:/temp/(2013-07-24) 영통 e-편한어린이집-1.pdf");
			File copied = new File("d:/temp/"+UUID.randomUUID().toString());
			FileUtils.copyFile(original, copied);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
