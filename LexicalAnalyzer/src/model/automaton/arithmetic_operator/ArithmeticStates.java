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
public enum ArithmeticStates implements State {
	
	ARITHMETIC_INITIAL_STATE {

		@Override
		public State next(char character) {
			if(LexemeChecker.isArithmeticOperator(character)) {
				if(character == '+') {
					return ARITHMETIC2PLUS_STATE;
				} else if(character == '-') {
					return ARITHMETIC2MINUS_STATE;
				}
				
				return CORRECTARITHMETIC_STATE;
			}
			
			return ArithmeticFinalStates.NOTARITHMETIC_FINALSTATE;
		}
		
	},
	ARITHMETIC2PLUS_STATE {

		@Override
		public State next(char character) {
			if(character == '+') {
				return CORRECTARITHMETIC_STATE;
			}
			
			return ArithmeticFinalStates.CORRECTARITHMETIC_FINALSTATE;
		}
		
	},
	ARITHMETIC2MINUS_STATE {

		@Override
		public State next(char character) {
			if(character == '-') {
				return CORRECTARITHMETIC_STATE;
			}
			
			return ArithmeticFinalStates.CORRECTARITHMETIC_FINALSTATE;
		}
		
	},
	CORRECTARITHMETIC_STATE {

		@Override
		public State next(char character) {
			return ArithmeticFinalStates.CORRECTARITHMETIC_FINALSTATE;
		}
		
	}
}
