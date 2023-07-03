package exercFixacaoTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FixacaoPilhaChamadaMetodos {

	public static void main(String[] args) {
		metodo1();
		System.out.println("fim do programa");
	}

	public static void metodo1() {
		System.out.println("***METHOD1 START***");
		metodo2();
		System.out.println("***METHOD1 END***");
	}

	public static void metodo2() {
		System.out.println("***METHOD2 START***");
		Scanner teclado = new Scanner(System.in);
		
		try {
			String[] vect = teclado.nextLine().split(" ");
			int position = teclado.nextInt();
			System.out.println(vect[position]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			teclado.next();
			
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		teclado.close();
		System.out.println("***METHOD2 END***");
	}
}
