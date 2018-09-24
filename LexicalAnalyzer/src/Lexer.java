import java.util.LinkedList;

import model.automaton.Automaton;
import model.automaton.AutomatonConfiguration;
import model.automaton.State;
import model.automaton.identifier.IdentifierFinalStates;
import model.automaton.string.StringFinalStates;
import model.automaton.string.StringStates;
import util.LexemeChecker;

/**
 * 
 */

/**
 *
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public class Lexer {
	
	private Automaton string;
	private Automaton number;
	private Automaton delimiter;
	private Automaton identifier;
	private Automaton operator;
	
	public Lexer() {
		startAutomatons();
	}

	
	public void initialize(String source) {
		char[] sourceChar = source.toCharArray();
		int row = 1;
		StringBuilder lexeme = new StringBuilder();
		boolean isString = true, isNumber = true, isDelimiter = true, isIdentifier = true, isOperator = true;
		System.out.println(sourceChar.length);

		for(int i = 0; i < sourceChar.length; i++) {
			
			if(sourceChar[i] == '\n') {
				row++;
			}
			
			lexeme.append(sourceChar[i]);
			
			if(!string.isDeadState()) {
				string.next(sourceChar[i]);
			}
			
			if(!number.isDeadState()) {
				number.next(sourceChar[i]);
			}
			
			if(!delimiter.isDeadState()) {
				delimiter.next(sourceChar[i]);
			}
			
			if(!identifier.isDeadState()) {
				identifier.next(sourceChar[i]);
			}
			
			if(!operator.isDeadState()) {
				operator.next(sourceChar[i]);
			}
			
			if(theresAnyFinalState()) {
				if(lexeme.deleteCharAt(lexeme.length() - 1).toString() == "\n") {
					row--;
				}
				
				i--;
				
				if(identifier.isFinalState() && LexemeChecker.isKeyWord(lexeme.toString())) {
					identifier.setCurrentState(IdentifierFinalStates.CORRECTIDENTIFIER_KEYWORD_FINALSTATE);
				}
				
				System.out.println(getTheFinalState() + "  LINHA" + String.valueOf(row) + lexeme.toString());
				startAutomatons();
				lexeme = new StringBuilder();
			} else if(isEveryAutomatonDead()) {
				startAutomatons();

				lexeme = new StringBuilder();
			
			}
			
		}
		
	}
	
	/**
	 * Inicia todos os aut�matos
	 */
	private void startAutomatons() {
		string = Automaton.start(AutomatonConfiguration.STRING);
		number = Automaton.start(AutomatonConfiguration.NUMBER);
		delimiter = Automaton.start(AutomatonConfiguration.DELIMITERS);
		identifier = Automaton.start(AutomatonConfiguration.IDENTIFIER);
		operator = Automaton.start(AutomatonConfiguration.OPERATOR);

	}
	
	/**
	 * Verifica se todos os aut�matos est�o em estado morto.
	 * 
	 * @return true, caso todos os aut�matos estejam em estado morto; false, caso contr�rio
	 */
	private boolean isEveryAutomatonDead() {
		return string.isDeadState() && number.isDeadState() && delimiter.isDeadState() && identifier.isDeadState() && operator.isDeadState();
	}
	
	/**
	 * Verifica se existe algum aut�mato est� em estado final.
	 * 
	 * @return true, caso exista algum aut�mato em estado final; false, caso contr�rio
	 */
	private boolean theresAnyFinalState() {
		return string.isFinalState() || number.isFinalState() || delimiter.isFinalState() || identifier.isFinalState() || operator.isFinalState();
	}
	
	/**
	 * Obt�m o estado final de um dos aut�matos.
	 * 
	 * @return estado final do aut�mato
	 */
	private State getTheFinalState() {
		if(string.isFinalState()) {
			return string.getCurrentState();
		} else if(number.isFinalState()) {
			return number.getCurrentState();
		} else if(delimiter.isFinalState()) {
			return delimiter.getCurrentState();
		} else if(identifier.isFinalState()) {
			return identifier.getCurrentState();
		} else {
			return operator.getCurrentState();
		}
	}
	
	
	
	

}
