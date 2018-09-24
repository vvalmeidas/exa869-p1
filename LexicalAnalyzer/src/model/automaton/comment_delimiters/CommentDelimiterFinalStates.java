/**
 * 
 */
package model.automaton.comment_delimiters;

import model.automaton.FinalState;
import model.automaton.State;

/**
 * Enumeração com os estados finais possíveis para o autômato de delimitadores de comentário.
 * 
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum CommentDelimiterFinalStates implements FinalState{
	
	CORRECT_COMMENT_DELIMITER_FINALSTATE {

		@Override
		public State next(char character) {
			return CORRECT_COMMENT_DELIMITER_FINALSTATE;
		}
		
	},
	BADLYFORMEDCOMMENT_DELIMITER_FINALSTATE {

		@Override
		public State next(char character) {
			return BADLYFORMEDCOMMENT_DELIMITER_FINALSTATE;
		}
		
	}

}
