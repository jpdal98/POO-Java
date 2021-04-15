package exercFixacaoTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FixacaoTryCatch {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			String[] vect = teclado.nextLine().split(" ");
			int position = teclado.nextInt();
			System.out.println(vect[position]);
			
			}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição invalida!");
			
			}catch (InputMismatchException e) {
			System.out.println("erro ao digitar a entrada");
			
			}
		
			System.out.println("fim do programa");
	
		teclado.close();

	}

}
