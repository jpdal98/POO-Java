package exercFuncionario;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Funcionario func = new Funcionario();
		System.out.println("digite os dados do funcionario:");
		System.out.println("Nome:");
		func.nome = teclado.next();
		System.out.println("Salario Bruto:");
		func.salarioBruto = teclado.nextDouble();
		System.out.println("Imposto:");
		func.imposto = teclado.nextDouble();
		
		System.out.println(func.toString());
		
		System.out.println("Quantos porcento irá aumentar o salario do funcionario?");
		double aumento = teclado.nextDouble();
		func.aumento(aumento);
		System.out.println(func.toString());
		teclado.close();

	}

}
