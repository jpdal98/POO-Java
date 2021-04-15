package exercImposto;

public final class PessoaFisica extends Pessoa{

	private double gastosSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public final double renda() {
		if (getRendaAnual() < 20000 ) {
			return getRendaAnual() * 0.15 - gastosSaude * 0.5;
		}else{
			return getRendaAnual() * 0.25 - gastosSaude * 0.5;
		}
	}
	
}
