package exercFixacaoPolimorfismo;

public class Conta {

	private Integer numero;
	private String titular;
	// esse teste (protected)foi utilizado só para entender seu funcionamento
	protected double saldo;
	
	public Conta() {
		
	}

	public Conta(Integer numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void saque(Double valor) {
		this.saldo -= valor + 5.0;
	}
	
	public void deposito(Double valor) {
		this.saldo += valor;
	}
	
}
