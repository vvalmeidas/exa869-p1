package util;
/**
 * 
 */

/**
 * Classe respons�vel por implementar m�todos que realizam a checagem de um lexema.
 *
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public class LexemeChecker {
	
	private static String REGEX_DIGIT = "[\\d]";
	
	/**
	 * Verifica se a entrada � um d�gito v�lido.
	 * @param input entrada a ser verificada
	 * @return true, se o a entrada for um d�gito; falso, caso contr�rio
	 */
	public static boolean isDigit(String input) {
		return input.matches(REGEX_DIGIT);
	}
	
	/**
	 * Verifica se a entrada � um d�gito v�lido.
	 * @param character entrada a ser verificada
	 * @return true, se o a entrada for um d�gito; falso, caso contr�rio
	 */
	public static boolean isDigit(char character) {
		String inputString = String.valueOf(character);
		return inputString.matches(REGEX_DIGIT);
	}
	
	public static boolean isNumberDelimiter(char character) {
		return false;
		
	}

}
