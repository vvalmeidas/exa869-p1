/**
 * 
 */
package model.automaton.string;

import model.automaton.State;
import util.LexemeChecker;

/**
 * Enumera��o com o estado inicial e os estados intermedi�rios do aut�mato de cadeia de
 * caracteres e as respectivas implementa��es da l�gica de transi��o de estado adequada. 
 * 
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum StringStates implements State {
	
	STRING_INITIAL_STATE {

		@Override
		public State next(char character) {
				
			if(character == '"') {
				return STRING_READING_STATE;
			}
			
			return StringDeadState.NOT_STRING_FINALSTATE;
		}
		
	},
	STRING_READING_STATE {

		@Override
		public State next(char character) {

			if(character == 92) { //se o caractere for \
				return STRING_SPECIAL_SYMBOL_STATE;
			} else if(LexemeChecker.isValidSymbol(character)) {
				return STRING_READING_STATE;
			} else if(character == '"') {
				return STRING_CLOSE_STATE;
			}
			
			return StringFinalStates.BADLYFORMED_STRING_FINALSTATE;
	
		}
		
	},
	STRING_SPECIAL_SYMBOL_STATE {

		@Override
		public State next(char character) {
			if(LexemeChecker.isValidSymbol(character)) {
				return STRING_READING_STATE;
			} else if(character == '"') {
				return STRING_AFTER_SPECIAL_SYMBOL_STATE;
			}
			
			return StringFinalStates.BADLYFORMED_STRING_FINALSTATE;
		}
		
	},
	STRING_AFTER_SPECIAL_SYMBOL_STATE {

		@Override
		public State next(char character) {
			if(LexemeChecker.isValidSymbol(character)) {
				return STRING_READING_STATE;
			} else if(character == '"' || character == ' ' || character == 92 || character == '\r' || character == '\n') {
				return STRING_CLOSE_STATE;
			}
			
			return StringFinalStates.BADLYFORMED_STRING_FINALSTATE;
		}
		
	},
	STRING_CLOSE_STATE {

		@Override
		public State next(char character) {
			return StringFinalStates.CORRECT_STRING_FINALSTATE;
		}
		
	}

}