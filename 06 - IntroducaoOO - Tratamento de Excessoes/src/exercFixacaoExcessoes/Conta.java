package exercFixacaoExcessoes;

public class Conta {

	Integer numero;
	String titular;
	double saldo;
	double saqueLimite;
	
	public Conta() {
	}

	public Conta(Integer numero, String titular, double saldo, double limite) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.saqueLimite = limite;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return saqueLimite;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) throws DomainException {
		if(saldo == 0){
			throw new DomainException("o valor da conta é nulo");
		}
		if(saldo < valor) {
			throw new DomainException("o valor que voce deseja sacar é maior que o valor do saldo na sua conta");
		}
		
		if(saqueLimite < valor) {
			throw new DomainException("o valor que voce deseja sacar ultrpassa o limite permitido para a sua conta");
		}
		this.saldo -= valor;
	}
}
