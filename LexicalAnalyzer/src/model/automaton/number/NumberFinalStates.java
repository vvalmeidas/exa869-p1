/**
 * 
 */
package model.automaton.number;

import model.automaton.FinalState;
import model.automaton.State;
import util.LexemeChecker;

/**
 * Enumera��o com os estados finais poss�veis para o aut�mato.
 * 
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum NumberFinalStates implements FinalState {
	
	CORRECTNUMBER_FINALSTATE {

		@Override
		public State next(char character) {
			
			return CORRECTNUMBER_FINALSTATE;
		}
		
	},
	NOTNUMBER_FINALSTATE {

		@Override
		public State next(char character) {
			return NOTNUMBER_FINALSTATE;
		}
		
	},
	BADLYFORMEDNUMBER_FINALSTATE {

		@Override
		public State next(char character) {
			return BADLYFORMEDNUMBER_FINALSTATE;
		}
		
	}

}
