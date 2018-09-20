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
public enum ArithmeticOperatorFinalStates implements FinalState {
	CORRECT_ARITHMETIC_OPERATOR_FINALSTATE {

		@Override
		public State next(char character) {
			return CORRECT_ARITHMETIC_OPERATOR_FINALSTATE;
		}
		
	},
	NOT_ARITHMETIC_OPERATOR_FINALSTATE {

		@Override
		public State next(char character) {
			return NOT_ARITHMETIC_OPERATOR_FINALSTATE;
		}
		
	}

}
