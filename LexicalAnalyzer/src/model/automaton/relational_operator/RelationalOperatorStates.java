/**
 * 
 */
package model.automaton.relational_operator;

import model.automaton.State;
import model.automaton.arithmetic_operator.ArithmeticOperatorFinalStates;
import util.LexemeChecker;

/**
 * Enumera��o com o estado inicial e os estados intermedi�rios do aut�mato de operadores relacionais 
 * e as respectivas implementa��es da l�gica de transi��o de estado adequada.
 *
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum RelationalOperatorStates implements State{
	
	RELATIONAL_INITIAL_STATE {

		@Override
		public State next(char character) {
			if(LexemeChecker.isRelationalOperator(character)) {
				return RELATIONAL_AFTER_FIRST_SYMBOL_STATE;
			}
			
			return RelationalOperatorFinalStates.NOT_RELATIONAL_OPERATOR_FINALSTATE;
		}
		
	},
	RELATIONAL_AFTER_FIRST_SYMBOL_STATE {

		@Override
		public State next(char character) {
			if(character == '=') {
				return RELATIONAL_AFTER_SECOND_SYMBOL_STATE;
			}
			
			return RelationalOperatorFinalStates.CORRECT_RELATIONAL_OPERATOR_FINALSTATE;
		}
		
	},
	RELATIONAL_AFTER_SECOND_SYMBOL_STATE {

		@Override
		public State next(char character) {
			return RelationalOperatorFinalStates.CORRECT_RELATIONAL_OPERATOR_FINALSTATE;
		}
		
	}
}
