/**
 * 
 */
package model.automaton;

/**
 * Enumeração com os estados finais possíveis para o autômato.
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
