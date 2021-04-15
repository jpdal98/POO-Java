package exercFixacaoSobreposicao;

public class ContaJuridica extends Conta{

	private double limiteEmprestimo;
	
	public ContaJuridica() {
		super();
	}

	public ContaJuridica(Integer numero, String titular, double saldo, double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(double valor) {
		if(valor <= limiteEmprestimo) {
		saldo += valor - 10.0;
		}
		
	}
}
