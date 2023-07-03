package exercEmpresa;

public final class FuncionarioTerceirizado extends Funcionario{

	private double valorAdicional;

	public FuncionarioTerceirizado() {
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer horas, double valorPorHoras, double valorAdicional) {
		super(nome, horas, valorPorHoras);
		this.valorAdicional = valorAdicional;
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public final double pagamento() {
		return super.pagamento() + valorAdicional * 1.1;
	}
	
}
