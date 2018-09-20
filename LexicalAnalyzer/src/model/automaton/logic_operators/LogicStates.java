/**
 * 
 */
package model.automaton.logic_operators;

import model.automaton.State;
import util.LexemeChecker;

/**
 * Enumeração com o estado inicial e os estados intermediários do autômato de operadores lógicos e as respectivas 
 * implementações da lógica de transição de estado adequada. 
 * 
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum LogicStates implements State {
	
	LOGIC_INICIAL_STATE {

		@Override
		public State next(char character) {
			if(character == '|') {
				return LOGICORSYMBOL_STATE;
			} else if(character == '&') {
				return LOGICANDSYMBOL_STATE;
			} else if(character == '!') {
				return CORRECTLOGIC_STATE;
			}
			
			return LogicFinalStates.NOTLOGIC_FINALSTATE;
		}
		
	},
	LOGICORSYMBOL_STATE {

		@Override
		public State next(char character) {
			if(character == '|') {
				return CORRECTLOGIC_STATE;
			}
			
			return LogicFinalStates.NOTLOGIC_FINALSTATE;
		}
		
	},
	LOGICANDSYMBOL_STATE {

		@Override
		public State next(char character) {
			if(character == '&') {
				return CORRECTLOGIC_STATE;
			}
			
			return LogicFinalStates.NOTLOGIC_FINALSTATE;
		}
		
	},
	CORRECTLOGIC_STATE {

		@Override
		public State next(char character) {
			return LogicFinalStates.CORRECTLOGIC_FINALSTATE;
		}
		
	}

}
