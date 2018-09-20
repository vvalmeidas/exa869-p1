import java.util.LinkedList;
import java.util.Map;

import controller.FileController;
import model.automaton.Automaton;
import model.automaton.arithmetic_operator.ArithmeticFinalStates;
import model.automaton.arithmetic_operator.ArithmeticStates;
import model.automaton.delimiters.DelimitersFinalStates;
import model.automaton.delimiters.DelimitersStates;
import model.automaton.logic_operators.LogicFinalStates;
import model.automaton.logic_operators.LogicStates;
import model.automaton.number.NumberFinalStates;
import model.automaton.number.NumberStates;

public class Main {

	public static void main(String[] args) {
		Map<String, String> r = FileController.readFiles();
		String s = r.get("arq1.txt");
		FileController.saveFile("arq1.txt", "a" + System.lineSeparator() + "b");
		
		char[] chars = s.toCharArray();
		Automaton a = new Automaton(LogicStates.LOGIC_INICIAL_STATE);
		LinkedList<Character> list = new LinkedList<Character>();


		for(int i = 0; i < s.length(); i++) {
			a.next(chars[i]);
			list.add(chars[i]);
			
			if(a.isFinalState()) {
				if(a.getCurrentState() != LogicFinalStates.NOTLOGIC_FINALSTATE) {
					list.remove(list.size() - 1);
					i--;
				}
				System.out.println(a.getCurrentState() + list.toString());
				a = new Automaton(LogicStates.LOGIC_INICIAL_STATE);
				list.clear();
			}
		}

	}

}
