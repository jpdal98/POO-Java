package exercFixacaoUpCasting;

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
	
	public void atualizarSaldo() {
		saldo += saldo * taxaImposto;
	}
}
