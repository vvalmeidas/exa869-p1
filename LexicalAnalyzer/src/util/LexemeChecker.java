package util;
/**
 * 
 */

/**
 * Classe responsável por implementar métodos que realizam a checagem de um lexema.
 *
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public class LexemeChecker {
	
	private static String REGEX_DIGIT = "[\\d]";
	
	/**
	 * Verifica se a entrada é um dígito válido.
	 * @param input entrada a ser verificada
	 * @return true, se o a entrada for um dígito; falso, caso contrário
	 */
	public static boolean isDigit(String input) {
		return input.matches(REGEX_DIGIT);
	}
	
	/**
	 * Verifica se a entrada é um dígito válido.
	 * @param character entrada a ser verificada
	 * @return true, se o a entrada for um dígito; falso, caso contrário
	 */
	public static boolean isDigit(char character) {
		String inputString = String.valueOf(character);
		return inputString.matches(REGEX_DIGIT);
	}
	
	public static boolean isNumberDelimiter(char character) {
		return false;
		
	}

}
