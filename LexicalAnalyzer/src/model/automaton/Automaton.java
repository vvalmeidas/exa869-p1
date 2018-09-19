/**
 * 
 */
package model.automaton;

import model.automaton.number.NumberStates;

/**
 * Classe que representa o autômato a ser utilizado durante a análise léxica dos caracteres
 * de entrada.
 *
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public class Automaton {
	
	/** Estado atual do autômato **/
	private State currentState;
	
	/** Estado inicial do autômato **/
	private State initialState;
	
	/**
	 * Obtém uma instância do autômato.
	 */
	public Automaton(State initialState) {
		currentState = initialState;
	}
	
	
	/**
	 * @return estado atual do autômato
	 */
	public State getCurrentState() {
		return currentState;
	}
	
	/**
	 * Configura o próximo estado do autômato de acordo com o caractere.
	 * @param character próximo caractere
	 */
	public void next(char character) {
		currentState = currentState.next(character);
	}
	
	/**
	 * Verifica se o autômato se encontra no estado final.
	 * @return true, se o estado atual for final; false, caso contrário
	 */
	public boolean isFinalState() {
		return currentState instanceof FinalState;
	}
	
	/**
	 * Reinicia o autômato.
	 */
	public void reset() {
		currentState = initialState;
	}


}
