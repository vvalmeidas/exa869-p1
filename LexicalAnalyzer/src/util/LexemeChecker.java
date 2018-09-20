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
	private static String REGEX_LETTER = "[a-zA-Z]";
	private static String REGEX_UNDERLINE = "_";
	private static String REGEX_LOGIC_OPERATOR = "!|&&|\\|\\|";
	private static String REGEX_ARITHMETIC_OPERATOR = "\\+|-|\\*|/|\\+\\+|--";
	private static String REGEX_RELATIONAL_OPERATOR = "!=|==|<|<=|>|>=|=";
	private static String REGEX_DELIMITER = "\\;|\\,|\\(|\\)|\\[|\\]|\\{|\\}|\\.";
	private static String REGEX_DELIMITERWITHOUTPOINT = "\\;|\\,|\\(|\\)|\\[|\\]|\\{|\\}";
	private static String REGEX_COMMENT_DELIMITER = "//";
	private static String REGEX_BLOCK_COMMENT_DELIMITER = "/*|*/";
	
	
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
		return character == '\r' || character == ' ' || string.matches(REGEX_DELIMITERWITHOUTPOINT) || string.matches(REGEX_ARITHMETIC_OPERATOR) || string.matches(REGEX_RELATIONAL_OPERATOR) || string.matches(REGEX_LOGIC_OPERATOR);
	}

	/**
	 * Determina se o caractere lido � uma letra.
	 * 
	 * @param character entrada a ser verificada
	 * @return true se o caractere for uma letra
	 */
	public static boolean isLetter(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_LETTER);
	}
	
	/**
	 * Determina se o caractere lido � um delimitador para identificadores.
	 * 
	 * @param character entrada a ser verificada
	 * @return true se o caractere for um delimitador para identificadores
	 */
	public static boolean isIdentifierDelimiter(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_DELIMITER);
	}
	
	/**
	 * Determina se o caractere lido � um underline.
	 * 
	 * @param character entrada a ser verificada
	 * @return true se o caractere for um underline
	 */
	public static boolean isUnderline(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_UNDERLINE);
	}
	
	/**
	 * Determina se o caractere lido � um operador artim�tico.
	 * 
	 * @param character entrada a ser verificada
	 * @return true, se o caractere for um operador arim�tico; falso, caso contr�rio
	 */
	public static boolean isArithmeticOperator(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_ARITHMETIC_OPERATOR);
	}
	
	/**
	 * Determina se o caractere lido � um delimitador.
	 * 
	 * @param character entrada a ser verificada
	 * @return true, se o caractere for um delimitador; falso, caso contr�rio
	 */
	public static boolean isDelimiter(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_DELIMITER);
	}
	
	/**
	 * Determina se o caractere lido � um operador l�gico.
	 * 
	 * @param character entrada a ser verificada
	 * @return true, se o caractere for um operador l�gico; falso, caso contr�rio
	 */
	public static boolean isLogicOperator(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_LOGIC_OPERATOR);
	}

	/**
	 * Determina se o caractere lido � um operador relacional
	 * 
	 * @param character entrada a ser verificada
	 * @return true, se o caractere for um operador relacional; falso caso n�o seja.
	 */
	public static boolean isRelationalOperator(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_RELATIONAL_OPERATOR);
	}

	/**
	 * Determina se o caractere lido � um delimitador de coment�rio de linha
	 * 
	 * @param character entrada a ser verificada
	 * @return true se o caractere for um delimitador de coment�rio, caso contr�rio retorna false
	 */
	public static boolean isCommentDelimiter(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_COMMENT_DELIMITER);
	}
	
	/**
	 * Determina se o caractere lido � um delimitador de coment�rio de bloco
	 * 
	 * @param character entrada a ser verificada
	 * @return true se o caractere for um delimitador de coment�rio, caso contr�rio retorna false
	 */
	public static boolean isBlockCommentDelimiter(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_BLOCK_COMMENT_DELIMITER);
	}

}
