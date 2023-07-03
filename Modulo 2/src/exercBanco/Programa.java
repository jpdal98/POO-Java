package exercBanco;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Conta conta = null;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o numero da conta");
		int numeroConta = teclado.nextInt();
		System.out.println("Informe o nome do titular da conta");
		String nome = teclado.next();
		System.out.println("Deseja realizar deposito incial?");
		char resp = teclado.next().charAt(0);
		double depositoInicial = 0;

		if (resp == 's') {
			System.out.println("Digite o valor que voce deseja depositar");
			depositoInicial = teclado.nextDouble();
			System.out.println("Transação realizada com sucesso");
			System.out.println("Obrigado, tenha uma boa noite!!");
			conta = new Conta(numeroConta, nome, depositoInicial);
		} else if (resp == 'n') {
			conta = new Conta(numeroConta, nome);
			System.out.println("Obrigado, tenha uma boa noite!!");
		} else {
			while (resp != 'n' && resp != 's') {
				System.out.println("opção invalida!! digite novamente");
				resp = teclado.next().charAt(0);
				if (resp == 's') {
					System.out.println("Digite o valor que voce deseja depositar");
					depositoInicial = teclado.nextDouble();
					conta = new Conta(numeroConta, nome, depositoInicial);
					System.out.println("Transação realizada com sucesso");
					System.out.println("Obrigado, tenha uma boa noite!!");
				} else if (resp == 'n') {
					System.out.println("Obrigado, tenha uma boa noite!!");
					depositoInicial = 0;
					conta = new Conta(numeroConta, nome);
				}
			}
		}
		
		System.out.println("");
		System.out.println("Dados da conta:");
		System.out.println(conta.toString());
		System.out.println("");

		System.out.println("Deseja realizar Deposito?");
		resp = teclado.next().charAt(0);
		if (resp == 's') {
			System.out.println("Digite o valor que voce deseja depositar");
			double valor = teclado.nextDouble();
			conta.realizarDeposito(valor);
			System.out.println("Transação realizada com sucesso");
			System.out.println("Obrigado, tenha uma boa noite!!");
		} else if (resp == 'n') {
			System.out.println("Obrigado, tenha uma boa noite!!");
		} else {
			while (resp != 'n' && resp != 's') {
				System.out.println("opção invalida!! digite novamente");
				resp = teclado.next().charAt(0);
				if (resp == 's') {
					System.out.println("Digite o valor que voce deseja depositar");
					double valor = teclado.nextDouble();
					conta.realizarDeposito(valor);
					System.out.println("Transação realizada com sucesso");
					System.out.println("Obrigado, tenha uma boa noite!!");
				} else if (resp == 'n') {
					System.out.println("Obrigado, tenha uma boa noite!!");
				}
			}
		}
		System.out.println("");
		System.out.println("Dados da conta:");
		System.out.println(conta.toString());
		System.out.println("");

		System.out.println("Deseja realizar o saque?");
		resp = teclado.next().charAt(0);
		if (resp == 's') {
			System.out.println("Digite o valor que voce deseja sacar");
			double valor = teclado.nextDouble();
			conta.realizarSaque(valor);
			System.out.println("Transação realizada com sucesso");
			System.out.println("Obrigado, tenha uma boa noite!!");
		} else if (resp == 'n') {
			System.out.println("Obrigado, tenha uma boa noite!!");
		} else {
			while (resp != 'n' && resp != 's') {
				System.out.println("opção invalida!! digite novamente");
				resp = teclado.next().charAt(0);
				if (resp == 's') {
					System.out.println("Digite o valor que voce deseja sacar");
					double valor = teclado.nextDouble();
					conta.realizarSaque(valor);
					System.out.println("Transação realizada com sucesso");
					System.out.println("Obrigado, tenha uma boa noite!!");
				} else if (resp == 'n') {
					System.out.println("Obrigado, tenha uma boa noite!!");
				}
			}
		}
		System.out.println("");
		System.out.println("Dados da conta:");
		System.out.println(conta.toString());

		teclado.close();

	}

}
