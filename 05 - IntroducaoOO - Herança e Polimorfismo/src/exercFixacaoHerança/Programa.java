package exercFixacaoHerança;

public class Programa {

	public static void main(String[] args) {
		
		ContaJuridica conta = new ContaJuridica(403703, "pedro", 1000.0, 400.0);
		
		conta.deposito(30.0);
		conta.saque(30.0);
		conta.deposito(500.0);

	}

}
