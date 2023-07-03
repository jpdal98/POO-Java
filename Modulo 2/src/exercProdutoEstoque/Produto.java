package exercProdutoEstoque;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	// a sobrecarga de metodo ocorre quando temos metodos com o mesmo nome porem paramentros diferentes.
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	// criei outro construtor para o caso do usuario criar um produto de quantidade 0 no estoque 
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	/* a palavra reservada "this" serve para referenciar diretamente ao atributo da classe. ele é utilizada 
	quando o nome do parametro é igual ao nome de um dos atributos.*/
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
