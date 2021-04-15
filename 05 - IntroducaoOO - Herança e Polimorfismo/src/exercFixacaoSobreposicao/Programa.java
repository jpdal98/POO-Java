package exercFixacaoSobreposicao;

public class Programa {

	public static void main(String[] args) {

		Conta cc1 = new ContaJuridica(322110, "jeová", 1320.0, 3200.0);
		Conta cc2 = new ContaPoupanca(400289, "Pato papão", 2100.0, 45.0);
		
			cc1.saque(300.0);
			System.out.println(cc1.getSaldo());

			cc2.saque(200.0);
			System.out.println(cc2.getSaldo());

	}

}
