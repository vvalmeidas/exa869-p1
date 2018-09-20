/**
 * 
 */
package model.automaton.logic_operators;

import model.automaton.FinalState;
import model.automaton.State;

/**
 * Enumera��o com os estados finais poss�veis para o aut�mato de operadores l�gicos.
 * 
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum LogicFinalStates implements FinalState {
	
	CORRECTLOGIC_FINALSTATE {

		@Override
		public State next(char character) {
			return CORRECTLOGIC_FINALSTATE;
		}


		
	}, 
	NOTLOGIC_FINALSTATE {

		@Override
		public State next(char character) {
			return NOTLOGIC_FINALSTATE;
		}
		
	}

}
