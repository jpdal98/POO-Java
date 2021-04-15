package exercFixacaoArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExercFileScanner {
	public static void main(String[] args) {
		
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			/*
			enquanto existir uma linha de texto no arquivo para ser lida,
			imprima o que estiver na linha 
			*/
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}