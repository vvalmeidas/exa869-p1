/**
 * 
 */
package model.automaton.comment_delimiters;

import model.automaton.DeadState;
import model.automaton.State;

/**
 * Enumeração com o estado morto para o autômato de comentários.
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
