package arquivos.filerwriter_bufferedwriter.application;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Program {
	public static void main(String[] args) {
		String[] lines = new String[] { "Good morning", "Gode afternoon", "Good night" };
		String path = "d:\\usr\\out.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
