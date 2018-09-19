/**
 * 
 */
package model;

/**
 * Representa um token no contexto do analisador léxico.
 * 
 * @author Nadine Cerqueira
 * @author Valmir Vinicius
 *
 */
public class Token {
	
	/** Nome do léxico */
	private String name;
	
	/** Valor (lexema) do token */
	private String value;
	
	/** Linha em que encontra-se o token */
	private int row;
	
	/** Coluna na qual encontra-se o token */
	private int column;
	
	/**
	 * Obtém uma instância do token
	 * 
	 * @param name nome do token
	 * @param value valor (lexema) do token
	 * @param row linha em que encontra-se o token
	 * @param column coluna em que encontra-se o token
	 */
	public Token(String name, String value, int row, int column) {
		this.name = name;
		this.value = value;
		this.row = row;
		this.column = column;
	}
	
	
	/**
	 * @return nome do token
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return valor do token
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @return linha em que encontra-se o token
	 */
	public int getRow() {
		return row;
	}

	/**
	 * @return coluna em que encontra-se o token
	 */
	public int getColumn() {
		return column;
	}
}
