import java.util.LinkedList;
import java.util.Map;

import controller.FileController;
import model.automaton.Automaton;
import model.automaton.delimiters.DelimitersFinalStates;
import model.automaton.delimiters.DelimitersStates;
import model.automaton.number.NumberFinalStates;
import model.automaton.number.NumberStates;
import model.automaton.operator.OperatorFinalStates;
import model.automaton.operator.OperatorStates;
import model.automaton.string.StringFinalStates;
import model.automaton.string.StringStates;

public class Main {

	public static void main(String[] args) {
		Map<String, String> r = FileController.readFiles();
		String s = r.get("arq1.txt");
		FileController.saveFile("arq1.txt", "a" + System.lineSeparator() + "b");
		
		Lexer l = new Lexer();
		l.initialize(s);


	}

}
