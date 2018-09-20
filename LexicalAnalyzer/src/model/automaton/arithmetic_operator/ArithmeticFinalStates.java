/**
 * 
 */
package model.automaton.arithmetic_operator;

import model.automaton.FinalState;
import model.automaton.State;

/**
 * Enumera��o com os estados finais poss�veis para o aut�mato de operadores aritm�ticos.
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
