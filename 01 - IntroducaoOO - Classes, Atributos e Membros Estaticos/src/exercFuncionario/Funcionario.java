package exercFuncionario;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
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
