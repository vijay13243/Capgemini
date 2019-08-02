package capgemini.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_FileOutputStream {
	public static void main(String[] args) {
		String message = "We are learning JAVA language......";
		File file = new File("C:\\capgemini\\File\\ReadMe2.txt");
		try (FileOutputStream fileOutput = new FileOutputStream(file)) {
			fileOutput.write(message.getBytes());
			fileOutput.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File is Written");
	}

}
