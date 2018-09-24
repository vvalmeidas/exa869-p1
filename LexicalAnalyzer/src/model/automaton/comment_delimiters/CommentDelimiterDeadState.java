/**
 * 
 */
package model.automaton.comment_delimiters;

import model.automaton.DeadState;
import model.automaton.State;

/**
 * Enumera��o com o estado morto para o aut�mato de coment�rios.
 *
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum CommentDelimiterDeadState implements DeadState {
	
	NOT_COMMENT_DELIMITER_FINALSTATE {

		@Override
		public State next(char character) {
			return NOT_COMMENT_DELIMITER_FINALSTATE;
		}
		
	}

}
