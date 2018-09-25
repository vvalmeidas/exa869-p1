import java.util.LinkedList;
import java.util.Map;

import controller.FileController;

public class Main {

	public static void main(String[] args) {
		Map<String, String> r = FileController.readFiles();
		String s = r.get("arq1.txt");
		FileController.saveFile("arq1.txt", "a" + System.lineSeparator() + "b");
		
		Lexer l = new Lexer();
		l.initialize(s);
	}

}
