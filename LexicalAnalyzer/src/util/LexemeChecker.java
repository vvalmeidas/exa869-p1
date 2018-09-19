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
	private static String REGEX_LOGICAL_OPERATOR = "!|&&|\\|\\|";
	private static String REGEX_ARITHMETIC_OPERATOR = "\\+|-|\\*|/|\\+\\+|--";
	private static String REGEX_RELATIONAL_OPERATOR = "!=|==|<|<=|>|>=|=";
	private static String REGEX_DELIMITER = "\\;|\\,|\\(|\\)|\\[|\\]|\\{|\\}|\\.";
	private static String REGEX_DELIMITERWITHOUTPOINT = "\\;|\\,|\\(|\\)|\\[|\\]|\\{|\\}";
	
	
	/**
	 * Verifica se a entrada � um d�gito v�lido.
	 * 
	 * @param input entrada a ser verificada
	 * @return true, se o a entrada for um d�gito; falso, caso contr�rio
	 */
	public static boolean isDigit(String input) {
		return input.matches(REGEX_DIGIT);
	}
	
	/**
	 * Verifica se a entrada � um d�gito v�lido.
	 * 
	 * @param character entrada a ser verificada
	 * @return true, se o a entrada for um d�gito; falso, caso contr�rio
	 */
	public static boolean isDigit(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_DIGIT);
	}
	
	/**
	 * Determina se o caractere lido � um delimitador para um n�mero.
	 * 
	 * @param character entrada a ser verificada
	 * @return true, se o caractere for um delimitador para um n�mero; falso, caso contr�rio
	 */
	public static boolean isNumberDelimiter(char character) {
		String string = String.valueOf(character);
		return character == '\r' || character == ' ' || string.matches(REGEX_DELIMITERWITHOUTPOINT) || string.matches(REGEX_ARITHMETIC_OPERATOR) || string.matches(REGEX_RELATIONAL_OPERATOR) || string.matches(REGEX_LOGICAL_OPERATOR);
	}

}
