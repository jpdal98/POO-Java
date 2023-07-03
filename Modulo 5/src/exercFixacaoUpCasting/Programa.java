package exercFixacaoUpCasting;

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
		
		//Upcasting
		Conta cc1;
		cc1 = ccj;
		Conta cc2 = new ContaJuridica(322110, "jeová", 1320.0, 3200.0);
		Conta cc3 = new ContaPoupanca(400289, "Pato papão", 2100.0, 45.0);

	}

}
