package exercFixacaoExcessoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		try {
			
			System.out.println("Digite os dados da conta bancaria:");
			System.out.println("Titular:");
			String nome = teclado.next();
			System.out.println("Numero da conta:");
			int num = teclado.nextInt();
			System.out.println("Saldo:");
			double saldo = teclado.nextDouble();
			System.out.println("Limite que o usuario pode sacar da conta:");
			double limite = teclado.nextDouble();
			Conta c = new Conta(num, nome, saldo, limite);
			
			System.out.println("");
			System.out.println("Digite o valor do deposito");
			double deposito = teclado.nextDouble();
			c.deposito(deposito);
			System.out.println("");
			System.out.println("Digite o que deseja sacar");
			double saque = teclado.nextDouble();
			c.saque(saque);
			System.out.println("o saldo atual é igual a: " + c.getSaldo());
		}
		
		catch(InputMismatchException e) {
			System.out.println("Erro na entrada dos dados");
		}
		catch(DomainException e){
			System.out.println("Erro na operação: " + e.getMessage());
		}
		finally {
			if(teclado != null) {
				teclado.close();
			}
		}
		
		
		

	}

}
