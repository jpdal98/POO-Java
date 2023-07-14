package exercImposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o numero de contas: ");
		int n = teclado.nextInt();
		List<Pessoa> pessoas = new ArrayList<>();		
		for(int i = 1; i <= n; i++) {
			System.out.println("Conta " + i);
			System.out.print("Pesso Juridica ou Pessoa Fisica(j/f)? ");
			char r = teclado.next().charAt(0);
			System.out.print("Nome: ");
			teclado.nextLine();
			String nome = teclado.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = teclado.nextDouble();
			if(r == 'j') {
				System.out.println("Numero de funcionarios: ");
				int numFuncuionarios = teclado.nextInt();
				pessoas.add(new PessoaJuridica(nome, rendaAnual, numFuncuionarios));
			}else if(r == 'f') {
				System.out.print("Digite o total e gastos com saude ");
				double gastosSaude = teclado.nextDouble();
				pessoas.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
		}
		double soma = 0;
		System.out.println();
		System.out.println("Contas:");
		for(Pessoa p : pessoas) {
			
			System.out.println(p.getNome() + ": $ " + String.format("%.2f", p.renda()));
			soma += p.renda();
		}
		
		System.out.println("Valor total da renda das contas");
		System.out.println(soma);
		
		teclado.close();
	}

}
