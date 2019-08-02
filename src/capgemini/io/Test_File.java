package capgemini.io;

import java.io.File;
import java.util.Date;

public class Test_File {
	public static void main(String[] args) {
		File file;
		file = new File("C:\\capgemini\\File\\ReadMe.txt");
		System.out.println("exists " + file.exists());
		System.out.println("file " + file.isFile());
		System.out.println("Directory " + file.isDirectory());
		System.out.println("Length " + file.length());
		System.out.println("canRead " + file.canRead());
		System.out.println("canWrite " + file.canWrite());
		System.out.println("canExecute " + file.canExecute());
		System.out.println("path " + file.getPath());
		System.out.println("date " + new Date(file.lastModified()));

	}

}
