package exercFixacaoClassesAbstratas;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {

		List<Conta> contas = new ArrayList<>();
		
		contas.add(new ContaPoupanca(1011, "Alex", 1000, 100));
		contas.add(new ContaPoupanca(103, "Anna", 1000, 100));
		contas.add(new ContaPoupanca(1221,"Claudio", 1000, 100));
		contas.add(new ContaJuridica(1200,"Pedro" , 350, 20));
		contas.add(new ContaJuridica(9001, "Pato Papão", 510, 100));
		
		double soma = 0;
		for(Conta c : contas) {
			soma += c.getSaldo();
		}

		System.out.printf("Valor total: %.2f%n", soma);
		
		
		for(Conta c : contas) {
			c.deposito(10.0);
			System.out.println(c.getSaldo());
		}
	}

}
