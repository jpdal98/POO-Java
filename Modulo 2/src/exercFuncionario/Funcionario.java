package exercFuncionario;

public class Funcionario {

	private String nome;
	private double salarioBruto;
	private double imposto;
	
	
	public Funcionario(String nome, double salarioBruto, double imposto) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
	}
	
	public Funcionario(String nome, double salarioBruto) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public double aumento(double porcentagem) {
		return (salarioBruto - imposto) + (salarioBruto/porcentagem);
	}

	public String toString() {
	
		return "funcionario: " + nome + ", $ " + String.format("%2.f", salarioLiquido());
	}
}
