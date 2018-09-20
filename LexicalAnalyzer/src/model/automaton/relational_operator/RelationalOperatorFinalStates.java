/**
 * 
 */
package model.automaton.relational_operator;

import model.automaton.FinalState;
import model.automaton.State;

/**
 * Enumeração com os estados finais possíveis para o autômato de operadores relacionais.
 * 
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum RelationalOperatorFinalStates implements FinalState{
	CORRECT_RELATIONAL_OPERATOR_FINALSTATE {

		@Override
		public State next(char character) {
			return CORRECT_RELATIONAL_OPERATOR_FINALSTATE;
		}
		
	},
	NOT_RELATIONAL_OPERATOR_FINALSTATE {

		@Override
		public State next(char character) {
			return NOT_RELATIONAL_OPERATOR_FINALSTATE;
		}
		
	}
}
