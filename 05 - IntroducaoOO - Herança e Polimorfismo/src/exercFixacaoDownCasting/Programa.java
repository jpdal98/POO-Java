package exercFixacaoDownCasting;

public class Programa {

	public static void main(String[] args) {

		Conta cc = new Conta(100011, "Nilton", 3000.0);
		ContaPoupanca ccp = new ContaPoupanca(300321, "Suelen", 1570.0, 3.50);
		ContaJuridica ccj = new ContaJuridica(403703, "pedro", 1000.0, 400.0);

		cc.deposito(100.0);
		cc.saque(76.0);
		cc.deposito(500.0);

		ccp.deposito(32.0);
		ccp.saque(348.0);
		ccp.deposito(5398.0);

		ccj.deposito(303.0);
		ccj.saque(103.0);
		ccj.deposito(25.0);

		// Upcasting
		Conta cc1;
		cc1 = ccj;
		Conta cc2 = new ContaJuridica(322110, "jeová", 1320.0, 3200.0);
		Conta cc3 = new ContaPoupanca(400289, "Pato papão", 2100.0, 45.0);

		/*
		 * Upcasting mesmo que o objeto cc2 tenha sido estanciado como conta juridica
		 * seu tipo é Conta, ou seja, não podemos receber cc2 em cc4, pois ContaJuridica
		 * é uma subclasse de Conta. para fazer isso é necessario realizar um casting.
		 */
		ContaJuridica cc4 = (ContaJuridica) cc2;
		cc4.emprestimo(100.0);

		if (cc3 instanceof ContaJuridica) {
			ContaJuridica cc5 = (ContaJuridica) cc3;
			cc5.emprestimo(200.0);
		}
		
		if (cc3 instanceof ContaPoupanca) {
			ContaPoupanca cc5 = (ContaPoupanca) cc3;
			cc5.atualizarSaldo();
			System.out.println("Update!!");
		} 
	}

}
