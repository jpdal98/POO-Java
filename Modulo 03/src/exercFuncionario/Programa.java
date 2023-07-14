package exercFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);

		List<Funcionario> funcionarios = new ArrayList<>();
		
		//LEITURA DE DADOS:
		System.out.print("Quantos funcionários serão cadastrados?");
		int n = teclado.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Funcionário # "  + i +  " : ");

			System.out.print("Id: ");
			int id = teclado.nextInt();
			while (hasId(funcionarios, id)) {
				System.out.print("Id já obtido. Tente novamente: ");
				id = teclado.nextInt();
			}
			
			System.out.print("Nome: ");
			teclado.nextLine();
			String nome = teclado.nextLine();
			System.out.print("Salario: ");
			double salario = teclado.nextDouble();
			funcionarios.add(new Funcionario(id, nome, salario));
		}

		
		//ATUALIZAÇÃO DO SALÁRIO DO FUNCIONÁRIO DOADO:
		System.out.println();
		System.out.print("Digite o id do funcionário que terá aumento de salário: ");
		int id = teclado.nextInt();
		Funcionario emp = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Este id não existe! ");
		}
		else {
			System.out.print("Digite a porcentagem:  ");
			double porcentagem = teclado.nextDouble();
			emp.aumentaSalario(porcentagem);
		}
		
		
		//LISTAGEM DE FUNCIONÁRIOS:
		System.out.println();
		System.out.println("Lista de funcionários:");
		for (Funcionario func : funcionarios) {
			System.out.println(func);
		}
				
		teclado.close(); 
	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}


