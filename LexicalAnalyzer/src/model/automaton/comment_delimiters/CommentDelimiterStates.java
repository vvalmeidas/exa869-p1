/**
 * 
 */
package model.automaton.comment_delimiters;

import model.automaton.State;
import util.LexemeChecker;

/**
 *
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum CommentDelimiterStates implements State{
	
	COMMENT_DELIMITER_INITIAL_STATE {

		@Override
		public State next(char character) {
			if(LexemeChecker.isCommentDelimiter(character)) {
				return CORRECT_COMMENT_DELIMITER_STATE;
			} else if(LexemeChecker.isBlockCommentDelimiter(character)) {
				return SECOND_COMMENT_DELIMITER_STATE;
			}
			
			return CommentDelimiterFinalStates.NOT_COMMENT_DELIMITER_FINALSTATE;
			
		}
		
	},
	SECOND_COMMENT_DELIMITER_STATE {
		@Override
		public State next(char character) {
//			while(character != '*/' || character != 'eof' || character != 'EOF') {
//				return SECOND_COMMENT_DELIMITER_STATE;
//			}
//			if(character == 'eof' || character == 'EOF') {
//				return CommentDelimiterFinalStates.BADLYFORMEDCOMMENT_DELIMITER_FINALSTATE;
//			}
//				
			return CORRECT_COMMENT_DELIMITER_STATE;
		}
		
	},
	CORRECT_COMMENT_DELIMITER_STATE {

		@Override
		public State next(char character) {
			return CommentDelimiterFinalStates.CORRECT_COMMENT_DELIMITER_FINALSTATE;
		}
		
	}

}
