package exercEmpresa;


public class Funcionario {

	private String nome;
	protected Integer horas;
	protected double valorPorHoras;
	
	public Funcionario() {

	}

	public Funcionario(String nome, Integer horas, double valorPorHoras) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHoras = valorPorHoras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public double getValorPorHoras() {
		return valorPorHoras;
	}
	
	public double pagamento() {
		return this.valorPorHoras * this.horas;
	}
	
}
