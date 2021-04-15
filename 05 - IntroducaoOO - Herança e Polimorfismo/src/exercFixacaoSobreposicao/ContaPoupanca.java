package exercFixacaoSobreposicao;

public class ContaPoupanca extends Conta{

	private double taxaImposto;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, double saldo, double taxaImposto) {
		super(numero, titular, saldo);
		this.taxaImposto = taxaImposto;
	}

	public double getTaxaImposto() {
		return taxaImposto;
	}

	public void setTaxaImposto(double taxaImposto) {
		this.taxaImposto = taxaImposto;
	}
	
	//Sobreposi��o
	@Override
	public void saque(Double valor) {
		super.saque(valor);
		saldo -= 2.0;
	}
	
	public void atualizarSaldo() {
		saldo += saldo - taxaImposto;
	}
}
