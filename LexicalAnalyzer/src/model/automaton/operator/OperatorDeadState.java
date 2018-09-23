/**
 * 
 */
package model.automaton.operator;

import model.automaton.DeadState;
import model.automaton.State;

/**
 * Enumeração com o estado morto para o autômato de operadores.
 *
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum OperatorDeadState implements DeadState {
	NOT_OPERATOR_FINALSTATE {

		@Override
		public State next(char character) {
			return NOT_OPERATOR_FINALSTATE;
		}
		
	}
}
