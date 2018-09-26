import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import controller.FileController;

public class Main {

	public static void main(String[] args) {
		Map<String, String> sourceFiles = FileController.readFiles();
		Iterator<String> iSource = sourceFiles.keySet().iterator();
		
		while(iSource.hasNext()) {
			String fileName = iSource.next();
			String sourceCode = sourceFiles.get(fileName);
			
			Lexer lexer = new Lexer();
			lexer.initialize(sourceCode);
			
			FileController.saveFile(fileName, lexer.getResults());
		}
	}

}
