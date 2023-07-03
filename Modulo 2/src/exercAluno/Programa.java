package exercAluno;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite o nome do aluno");
		String nome = teclado.next();
		System.out.println("digite as notas deste aluno");
		double n1 = teclado.nextDouble();
		double n2 = teclado.nextDouble();
		double n3 = teclado.nextDouble();
		Estudante aluno = new Estudante(nome, n1, n2, n3);
		
		if(aluno.media() < 6.0) {
			System.out.println("Failed");
			double diferenca = 6.0 - aluno.media();
			System.out.println("faltou: " + diferenca + " pontos para voce ser aprovado");
		}else {
			System.out.println("Aprovado");
		}
		
		teclado.close();

	}

}
