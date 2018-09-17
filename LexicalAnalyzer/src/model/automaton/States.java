/**
 * 
 */
package model.automaton;

/**
 * Enumeração com o estado inicial e os estados intermediários do autômato e as respectivas 
 * implementações da lógica de transição de estado adequada. 
 * 
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public enum States implements State {
	
	STATE_BEGIN {

		@Override
		public State next(char character) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
