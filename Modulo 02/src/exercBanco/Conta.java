package exercBanco;

public class Conta {

	private int numeroConta;
	private String nome;
	private double saldo;
	
	public Conta(int numeroConta, String nome, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		realizarDeposito(depositoInicial);
	}
	
	public Conta(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void realizarDeposito(double valor) {
		this.saldo += valor;
	}
	
	public void realizarSaque(double valor) {
		this.saldo -= valor + 5.00; 
	}
	
	public String toString() {
		return "nome: " + nome + ", Conta: " + numeroConta + ", saldo: $ " + String.format("%.2f", saldo);	
	}
	
}
