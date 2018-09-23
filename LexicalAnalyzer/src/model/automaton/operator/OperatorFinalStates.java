/**
 * 
 */
package model.automaton.operator;

import model.automaton.FinalState;
import model.automaton.State;

/**
 * Enumera��o com os estados finais poss�veis para o aut�mato de operadores.
 * 
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum OperatorFinalStates implements FinalState {
	
	CORRECT_OPERATOR_ARITHMETIC_FINALSTATE {

		@Override
		public State next(char character) {
			return CORRECT_OPERATOR_ARITHMETIC_FINALSTATE;
		}
		
	},
	CORRECT_OPERATOR_LOGIC_FINALSTATE {

		@Override
		public State next(char character) {
			return CORRECT_OPERATOR_LOGIC_FINALSTATE;
		}
		
	},
	CORRECT_OPERATOR_RELATIONAL_FINALSTATE {

		@Override
		public State next(char character) {
			return CORRECT_OPERATOR_RELATIONAL_FINALSTATE;
		}
		
	}
	
	

}
