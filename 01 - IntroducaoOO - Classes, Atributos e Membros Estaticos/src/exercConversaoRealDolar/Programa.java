package exercConversaoRealDolar;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Qual a cotação do dolar?");
		double precoDolar = teclado.nextDouble();
		System.out.print("Qunato dolares voce deseja comprar? ");
		double valor = teclado.nextDouble();
		double result = Conversao.dolarParaReal(valor, precoDolar);
		System.out.printf("Valor a ser pago em reais = %.2f%n", result);
		
		
		
		teclado.close();

	}

}
