package exercEmpresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();
		System.out.print("Digite o numero de funcionarios: ");
		int n = teclado.nextInt();

		for (int i = 1; i <= 3; i++) {
			System.out.println("o funcionario " + i + " é terceirizado(s/n)?");
			char resp = teclado.next().charAt(0);
			System.out.println("Nome: ");
			String nome = teclado.next();
			System.out.println("Horas: ");
			int horas = teclado.nextInt();
			System.out.println("Valor por hora: ");
			double valorPorHora = teclado.nextDouble();

			if (resp == 's') {
				System.out.println("Valor adicional: ");
				double valorAdicional = teclado.nextDouble();
				Funcionario func = new FuncionarioTerceirizado(nome, horas, valorPorHora, valorAdicional);
				funcionarios.add(func);
			} else {
				Funcionario func = new Funcionario(nome, horas, valorPorHora);
				funcionarios.add(func);
			}
		}

		System.out.println("Pagamentos:");
		for (Funcionario func : funcionarios) {
			System.out.println(func.getNome() + " - $ " + func.pagamento());
		}
		teclado.close();
	}

}
