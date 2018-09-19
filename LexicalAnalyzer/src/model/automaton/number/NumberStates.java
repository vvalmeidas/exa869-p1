/**
 * 
 */
package model.automaton.number;

import model.automaton.State;
import util.LexemeChecker;

/**
 * Enumera��o com o estado inicial e os estados intermedi�rios do aut�mato e as respectivas 
 * implementa��es da l�gica de transi��o de estado adequada. 
 * 
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum NumberStates implements State {
	
	INITIAL_STATE {

		@Override
		public State next(char character) {
			if(LexemeChecker.isDigit(character)) {
				return NumberFinalStates.NUMBER_FINALSTATE;
			} else if(character == '-'){
				return NEGATIVESPACES_STATE;
			}
			
			return NumberFinalStates.NOTNUMBER_FINALSTATE;
		}
		
	},
	NEGATIVESPACES_STATE {

		@Override
		public State next(char character) {
			if(character == ' ') {
				return NEGATIVESPACES_STATE;
			} else if(LexemeChecker.isDigit(character)) {
				
			}
			
			return null;
		}
		
	}
	

}
