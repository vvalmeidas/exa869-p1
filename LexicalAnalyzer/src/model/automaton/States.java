/**
 * 
 */
package model.automaton;

/**
 * Enumera��o com o estado inicial e os estados intermedi�rios do aut�mato e as respectivas 
 * implementa��es da l�gica de transi��o de estado adequada. 
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
