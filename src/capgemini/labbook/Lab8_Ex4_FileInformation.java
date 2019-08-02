package capgemini.labbook;

import java.io.File;
import java.util.Scanner;

public class Lab8_Ex4_FileInformation {
	public static void main(String[] args) {
		String fi;
		System.out.println("Enter the file name:");
		Scanner sc=new Scanner(System.in);
		fi=sc.next();
		File file = new File(fi);
		System.out.println("exists " + file.exists());
		System.out.println("File Type:"+file.isDirectory());
		System.out.println("canRead " + file.canRead());
		System.out.println("canWrite " + file.canWrite());
		System.out.println("canExecute " + file.canExecute());
		System.out.println("Length " + file.length());

}
}
