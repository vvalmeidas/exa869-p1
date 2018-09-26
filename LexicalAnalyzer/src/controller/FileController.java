package controller;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class FileController {
	
	public static final String INPUT_PATH = "entrada";
	public static final String OUTPUT_PATH = "saida";
	
	/**
	 * Construtor privado
	 */
	private FileController() {};
	
	/**
	 * Realiza a leitura de todos os arquivos .txt presentes na pasta entrada.
	 * @return Map no qual a chave é o nome do arquivo lido e o conteúdo é uma string do arquivo lido.
	 */
	public static Map<String, String> readFiles() {
		Map<String, String> result = new HashMap<>();
		File dir = new File(INPUT_PATH);
		
		for(File file : dir.listFiles()) {
			if(file.getName().endsWith(".txt")) {
				try {
					String fileString = new String(Files.readAllBytes(Paths.get(file.getPath())), StandardCharsets.ISO_8859_1);
					fileString = fileString + '\n';
					result.put(file.getName(), fileString);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Salva o resultado da análise léxica na pasta saida.
	 * @param name nome do arquivo com o resultado da análise léxica
	 * @param results resultados da análise léxica
	 */
	public static void saveFile(String name, String results) {
		try {
			Files.write(Paths.get(OUTPUT_PATH + "/resultado-" + name), results.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
