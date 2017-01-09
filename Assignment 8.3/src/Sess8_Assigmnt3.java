import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sess8_Assigmnt3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int len;
		byte[] data = new byte[100];
		File srcFile = new File("E:\\Eclipse\\Eclipse Projects\\Assignment 8.3\\src\\SourceFile.txt");
		File destFile = new File("E:\\Eclipse\\Eclipse Projects\\Assignment 8.3\\src\\DestinationFile.txt");
		FileInputStream input = null;
		FileOutputStream output = null;

		try {
			input = new FileInputStream(srcFile);
			output = new FileOutputStream(destFile);
	
			while ((len=input.read(data)) > 0) {
				output.write(data, 0, len);
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			input.close();
			output.close();
		}
	}
}
