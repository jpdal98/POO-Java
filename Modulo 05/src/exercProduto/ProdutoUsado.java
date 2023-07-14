package exercProduto;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class ProdutoUsado extends Produto{

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataFabricacao;

	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	
	@Override
	public String Etiqueta() {
		return "nome: " + getNome() + "(Usado) preço: $" + String.format("%.2f", preco) + " Data: " + sdf.format(dataFabricacao);
	}
	
}
