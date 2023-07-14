package exercProdutoEstoque;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	
	// a palavra reservada "this" serve para referenciar diretamente ao atributo da classe. ele é utilizada quando o nome do parametro é igual ao nome de um dos atributos.
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public double valorTotalEstoque() {
		return preco * quantidade;
	}
	
	public String toString() {
		return "Dados do produto: " + nome + ", "  + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $ " + String.format("%.2f",valorTotalEstoque());
	}
}
