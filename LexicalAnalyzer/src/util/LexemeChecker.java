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
	 * Verifica se a entrada é um dígito válido.
	 * 
	 * @param input entrada a ser verificada
	 * @return true, se o a entrada for um dígito; falso, caso contrário
	 */
	public static boolean isDigit(String input) {
		return input.matches(REGEX_DIGIT);
	}
	
	/**
	 * Verifica se a entrada é um dígito válido.
	 * 
	 * @param character entrada a ser verificada
	 * @return true, se o a entrada for um dígito; falso, caso contrário
	 */
	public static boolean isDigit(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_DIGIT);
	}
	
	/**
	 * Determina se o caractere lido é um delimitador para um número.
	 * 
	 * @param character entrada a ser verificada
	 * @return true, se o caractere for um delimitador para um número; falso, caso contrário
	 */
	public static boolean isNumberDelimiter(char character) {
		String string = String.valueOf(character);
		return character == '\r' || character == ' ' || string.matches(REGEX_DELIMITERWITHOUTPOINT) || string.matches(REGEX_ARITHMETIC_OPERATOR) || string.matches(REGEX_RELATIONAL_OPERATOR) || string.matches(REGEX_LOGIC_OPERATOR);
	}

	/**
	 * Determina se o caractere lido é uma letra.
	 * 
	 * @param character entrada a ser verificada
	 * @return true se o caractere for uma letra
	 */
	public static boolean isLetter(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_LETTER);
	}
	
	/**
	 * Determina se o caractere lido é um delimitador para identificadores.
	 * 
	 * @param character entrada a ser verificada
	 * @return true se o caractere for um delimitador para identificadores
	 */
	public static boolean isIdentifierDelimiter(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_DELIMITER);
	}
	
	/**
	 * Determina se o caractere lido é um underline.
	 * 
	 * @param character entrada a ser verificada
	 * @return true se o caractere for um underline
	 */
	public static boolean isUnderline(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_UNDERLINE);
	}
	
	/**
	 * Determina se o caractere lido é um operador artimético.
	 * 
	 * @param character entrada a ser verificada
	 * @return true, se o caractere for um operador arimético; falso, caso contrário
	 */
	public static boolean isArithmeticOperator(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_ARITHMETIC_OPERATOR);
	}
	
	/**
	 * Determina se o caractere lido é um delimitador.
	 * 
	 * @param character entrada a ser verificada
	 * @return true, se o caractere for um delimitador; falso, caso contrário
	 */
	public static boolean isDelimiter(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_DELIMITER);
	}
	
	/**
	 * Determina se o caractere lido é um operador lógico.
	 * 
	 * @param character entrada a ser verificada
	 * @return true, se o caractere for um operador lógico; falso, caso contrário
	 */
	public static boolean isLogicOperator(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_LOGIC_OPERATOR);
	}

	/**
	 * Determina se o caractere lido é um operador relacional
	 * 
	 * @param character entrada a ser verificada
	 * @return true, se o caractere for um operador relacional; falso caso não seja.
	 */
	public static boolean isRelationalOperator(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_RELATIONAL_OPERATOR);
	}

	/**
	 * Determina se o caractere lido é um delimitador de comentário de linha
	 * 
	 * @param character entrada a ser verificada
	 * @return true se o caractere for um delimitador de comentário, caso contrário retorna false
	 */
	public static boolean isCommentDelimiter(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_COMMENT_DELIMITER);
	}
	
	/**
	 * Determina se o caractere lido é um delimitador de comentário de bloco
	 * 
	 * @param character entrada a ser verificada
	 * @return true se o caractere for um delimitador de comentário, caso contrário retorna false
	 */
	public static boolean isBlockCommentDelimiter(char character) {
		String string = String.valueOf(character);
		return string.matches(REGEX_BLOCK_COMMENT_DELIMITER);
	}

}
