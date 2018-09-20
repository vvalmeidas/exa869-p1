/**
 * 
 */
package model.automaton.arithmetic_operator;

import model.automaton.State;
import util.LexemeChecker;

/**
 * Enumeração com o estado inicial e os estados intermediários do autômato de operadores aritméticos e as respectivas 
 * implementações da lógica de transição de estado adequada. 
 * 
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum ArithmeticOperatorStates implements State {
	
	ARITHMETIC_INITIAL_STATE {

		@Override
		public State next(char character) {
			if(LexemeChecker.isArithmeticOperator(character)) {
				return ARITHMETIC_AFTER_FIRST_SYMBOL_STATE;
			}
			
			return ArithmeticOperatorFinalStates.NOT_ARITHMETIC_OPERATOR_FINALSTATE;
		}
		
	},
	ARITHMETIC_AFTER_FIRST_SYMBOL_STATE {

		@Override
		public State next(char character) {
			if(character == '+' || character == '-') {
				return ARITHMETIC_AFTER_SECOND_SYMBOL_STATE;
			}
			
			return ArithmeticOperatorFinalStates.CORRECT_ARITHMETIC_OPERATOR_FINALSTATE;
		}
		
	},
	ARITHMETIC_AFTER_SECOND_SYMBOL_STATE {

		@Override
		public State next(char character) {
			return ArithmeticOperatorFinalStates.CORRECT_ARITHMETIC_OPERATOR_FINALSTATE;
		}
		
	}
}
