/**
 * 
 */
package model.automaton;

/**
 * Enumera��o com os estados finais poss�veis para o aut�mato.
 * 
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum FinalStates implements FinalState {
	
	TESTE {

		@Override
		public State next(char character) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
