package exercAluno;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Estudante aluno = new Estudante();
		System.out.println("digite o nome do aluno");
		aluno.nome = teclado.next();
		System.out.println("digite as notas deste aluno");
		aluno.n1 = teclado.nextDouble();
		aluno.n2 = teclado.nextDouble();
		aluno.n3 = teclado.nextDouble();
		
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
