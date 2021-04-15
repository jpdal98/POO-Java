package exercFuncionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		
		System.out.println("Digite o nome do departamento");
		String nomeDepartamento = teclado.nextLine();
		System.out.println("Digite os dados do funcionario");
		System.out.print("nome: ");
		String nomeFuncionario = teclado.nextLine();
		System.out.print("Status: ");
		String status = teclado.nextLine();
		System.out.print("Base salarial:");
		double salarioFuncionario = teclado.nextDouble();
		Funcionario funcionario = new Funcionario(nomeFuncionario, FuncionarioStatus.valueOf(status), salarioFuncionario, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos esse funcionario vai ter?");
		int n = teclado.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do contrato #" + i);
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(teclado.next());
			System.out.print("Valor por Hora: ");
			double valorPorHora = teclado.nextDouble();
			System.out.print("Quantidade de horas trabalhadas: ");
			int qtdHoras = teclado.nextInt();
			Contrato contrato = new Contrato(dataContrato, valorPorHora, qtdHoras);
			funcionario.addContrato(contrato);
		}
		System.out.println();
		System.out.print("Digite o mes e o ano para realizar o calculo da renda(MM/YYYY): ");
		String mesEAno = teclado.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.print("Nome do funcionario: " + funcionario.getNome());
		System.out.print("Departamento que esta funcionario trabalha: " + funcionario.getDepartamento());
		System.out.print("Departamento que esta funcionario trabalha: " + funcionario.getDepartamento().getNome());
		System.out.println("A renda de " + mesEAno + ": " + String.format("%.2f", funcionario.renda(ano, mes)));
		
		teclado.close();
	}

}
