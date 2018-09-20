/**
 * 
 */
package model.automaton.arithmetic_operator;

import model.automaton.FinalState;
import model.automaton.State;

/**
 * Enumeração com os estados finais possíveis para o autômato de operadores aritméticos.
 * 
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum ArithmeticFinalStates implements FinalState {
	CORRECTARITHMETIC_FINALSTATE {

		@Override
		public State next(char character) {
			return CORRECTARITHMETIC_FINALSTATE;
		}
		
	},
	NOTARITHMETIC_FINALSTATE {

		@Override
		public State next(char character) {
			return NOTARITHMETIC_FINALSTATE;
		}
		
	}

}
