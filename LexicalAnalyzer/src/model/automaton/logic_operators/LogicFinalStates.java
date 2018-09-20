/**
 * 
 */
package model.automaton.logic_operators;

import model.automaton.FinalState;
import model.automaton.State;

/**
 * Enumeração com os estados finais possíveis para o autômato de operadores lógicos.
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
