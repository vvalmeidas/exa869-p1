/**
 * 
 */
package model.automaton.operator;

import model.automaton.State;
import util.LexemeChecker;

/**
 * Enumera��o com o estado inicial e os estados intermedi�rios do aut�mato de operadores e as respectivas 
 * implementa��es da l�gica de transi��o de estado adequada. 
 * 
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum OperatorStates implements State {
	OPERATOR_INITIAL_STATE {

		@Override
		public State next(char character) {
			if(LexemeChecker.isArithmeticOperator(character)) {
				if(character == '+') {
					return OPERATOR_ARITHMETIC_2PLUS_STATE;
				} else if(character == '-') {
					return OPERATOR_ARITHMETIC_2MINUS_STATE;
				}
				
				return CORRECT_OPERATOR_ARITHMETIC_STATE;
			} else if(character == '!') {
				return OPERATOR_EXCLAMATION_SYMBOL_STATE;
			} else if(character == '=') {
				return OPERATOR_EQUAL_SYMBOL_STATE;
			} else if(character == '<') {
				return OPERATOR_LESS_SYMBOL_STATE;
			} else if(character == '>') {
				return OPERATOR_GREATER_SYMBOL_STATE;
			} else if(character == '&') {
				return OperatorStates.OPERATOR_AND_SYMBOL_STATE;
			} else if(character == '|') {
				return OperatorStates.OPERATOR_OR_SYMBOL_STATE;
			}
			
			return OperatorDeadState.NOT_OPERATOR_FINALSTATE;
		}
		
	},
	OPERATOR_ARITHMETIC_2PLUS_STATE {

		@Override
		public State next(char character) {
			if(character == '+') {
				return CORRECT_OPERATOR_ARITHMETIC_STATE;
			}
			
			return OperatorFinalStates.CORRECT_OPERATOR_ARITHMETIC_FINALSTATE;
		}
		
	},
	OPERATOR_ARITHMETIC_2MINUS_STATE {

		@Override
		public State next(char character) {
			if(character == '-') {
				return CORRECT_OPERATOR_ARITHMETIC_STATE;
			}
			
			return OperatorFinalStates.CORRECT_OPERATOR_ARITHMETIC_FINALSTATE;
		}
		
	},
	OPERATOR_EXCLAMATION_SYMBOL_STATE {

		@Override
		public State next(char character) {
			if(character == '=') {
				return CORRECT_OPERATOR_RELATIONAL_STATE;
			}
			
			return OperatorFinalStates.CORRECT_OPERATOR_LOGIC_FINALSTATE;
		}
		
	},
	OPERATOR_EQUAL_SYMBOL_STATE {

		@Override
		public State next(char character) {
			if(character == '=') {
				return CORRECT_OPERATOR_RELATIONAL_STATE;
			}
			
			return OperatorFinalStates.CORRECT_OPERATOR_RELATIONAL_FINALSTATE;
		}
		
	},
	OPERATOR_LESS_SYMBOL_STATE {

		@Override
		public State next(char character) {
			if(character == '=') {
				return CORRECT_OPERATOR_RELATIONAL_STATE;
			}
			
			return OperatorFinalStates.CORRECT_OPERATOR_RELATIONAL_FINALSTATE;
		}
		
	},
	OPERATOR_GREATER_SYMBOL_STATE {

		@Override
		public State next(char character) {
			if(character == '=') {
				return CORRECT_OPERATOR_RELATIONAL_STATE;
			}
			
			return OperatorFinalStates.CORRECT_OPERATOR_RELATIONAL_FINALSTATE;
		}
		
	},
	OPERATOR_AND_SYMBOL_STATE {
		
		@Override
		public State next(char character) {
			if(character == '&') {
				return CORRECT_OPERATOR_LOGIC_STATE;
			}
			
			return OperatorDeadState.NOT_OPERATOR_FINALSTATE;
		}
	},
	OPERATOR_OR_SYMBOL_STATE {
		
		@Override
		public State next(char character) {
			if(character == '|') {
				return CORRECT_OPERATOR_LOGIC_STATE;
			}
			
			return OperatorDeadState.NOT_OPERATOR_FINALSTATE;
		}
	},
	CORRECT_OPERATOR_ARITHMETIC_STATE {

		@Override
		public State next(char character) {
			return OperatorFinalStates.CORRECT_OPERATOR_ARITHMETIC_FINALSTATE;
		}
		
	}, 
	CORRECT_OPERATOR_LOGIC_STATE {

		@Override
		public State next(char character) {
			return OperatorFinalStates.CORRECT_OPERATOR_LOGIC_FINALSTATE;
		}
		
	},
	CORRECT_OPERATOR_RELATIONAL_STATE {

		@Override
		public State next(char character) {
			return OperatorFinalStates.CORRECT_OPERATOR_RELATIONAL_FINALSTATE;
		}
		
	}
}
