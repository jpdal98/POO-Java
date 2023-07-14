package exercProduto;

public final class ProdutoImportado extends Produto {

	private double taxa;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, double preco, double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double valorTotal() {
		return preco - taxa;
	}

	@Override
	public final String Etiqueta() {
		return "nome: " + getNome() + " preço: $" + String.format("%.2f", valorTotal() + " taxa: $" + taxa);
	}
}
