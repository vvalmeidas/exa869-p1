/**
 * 
 */
package model.automaton.comment_delimiters;

import model.automaton.State;
import util.LexemeChecker;

/**
 * Enumeração com o estado inicial e os estados intermediários do autômato de delimitadores
 * de comentário e as respectivas implementações da lógica de transição de estado adequada. 
 * 
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum CommentDelimiterStates implements State{
	
	COMMENT_DELIMITER_INITIAL_STATE {

		@Override
		public State next(char character) {
			if(character == '/') {
				return ASTERISC_COMMENT_DELIMITER_STATE;
			}
			return CommentDelimiterDeadState.NOT_COMMENT_DELIMITER_FINALSTATE;
			
		}
		
	},
	ASTERISC_COMMENT_DELIMITER_STATE {
		@Override
		public State next(char character) {
			if(character == '*') {
				return SECOND_ASTERISC_COMMENT_DELIMITER_STATE;
			} else if(character == '/') {
				return CORRECT_COMMENT_DELIMITER_STATE;
			}
				
			return CommentDelimiterDeadState.NOT_COMMENT_DELIMITER_FINALSTATE;
		}
		
	},
	
	SECOND_ASTERISC_COMMENT_DELIMITER_STATE {
		@Override
		public State next(char character) {
			if(character == '*') {
				return SECOND_BAR_COMMENT_DELIMITER_STATE;
			}
				
			return SECOND_ASTERISC_COMMENT_DELIMITER_STATE;
		}
		
	},
	
	SECOND_BAR_COMMENT_DELIMITER_STATE {
		@Override
		public State next(char character) {
			if(character == '/') {
				return CORRECT_COMMENT_DELIMITER_STATE;
			}
				
			return CommentDelimiterFinalStates.BADLYFORMEDCOMMENT_DELIMITER_FINALSTATE;
		}
		
	},
	
	CORRECT_COMMENT_DELIMITER_STATE {

		@Override
		public State next(char character) {
			return CommentDelimiterFinalStates.CORRECT_COMMENT_DELIMITER_FINALSTATE;
		}
		
	}

}
