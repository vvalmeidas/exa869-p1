/**
 * 
 */
package model.automaton;

/**
 * Classe que representa o aut�mato a ser utilizado durante a an�lise l�xica dos caracteres
 * de entrada.
 *
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public class Automaton {
	
	/** Estado atual do aut�mato **/
	private State currentState;
	
	/**
	 * Obt�m uma inst�ncia do aut�mato.
	 */
	public Automaton() {
		currentState = States.STATE_BEGIN;
	}
	
	
	/**
	 * @return estado atual do aut�mato
	 */
	public State getCurrentState() {
		return currentState;
	}
	
	/**
	 * Configura o pr�ximo estado do aut�mato de acordo com o caractere.
	 * @param character
	 */
	public void next(char character) {
		currentState = currentState.next(character);
	}
	
	/**
	 * Verifica se o aut�mato se encontra no estado final.
	 * @return true, se o estado atual for final; false, caso contr�rio
	 */
	public boolean isFinalState() {
		return currentState instanceof FinalState;
	}
	
	/**
	 * Reinicia o aut�mato
	 */
	public void reset() {
		currentState = States.STATE_BEGIN;
	}


}