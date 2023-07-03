package exercFuncionario;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("digite os dados do funcionario:");
		System.out.println("Nome:");
		String nome = teclado.next();
		System.out.println("Salario Bruto:");
		double salarioBruto = teclado.nextDouble();
		System.out.println("Imposto:");
		double imposto = teclado.nextDouble();
		Funcionario func = new Funcionario(nome, salarioBruto, imposto);
		
		System.out.println(func.toString());
		
		System.out.println("Quantos porcento irá aumentar o salario do funcionario?");
		double aumento = teclado.nextDouble();
		func.aumento(aumento);
		System.out.println(func.toString());
		teclado.close();

	}

}
