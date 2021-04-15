package exercProdutoEstoque;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite os dados do produto");
		System.out.println("Nome:");
		String nome = teclado.next();
		System.out.println("Preço:");
		double preco = teclado.nextDouble();
		System.out.println("Quantidade em estoque:");
		int quantidade = teclado.nextInt();
		Produto produto = new Produto(nome, preco, quantidade);
		
		//testando encapsulamento
		produto.setNome("computador");
		System.out.println("Nome atualizado para: " + produto.getNome());
		produto.setPreco(3000);
		System.out.println("Preço atualizado para: " + produto.getPreco());
		
		System.out.println(produto.toString());
		System.out.print("Digite um numero de produtos a serem adicionado ao estoque: ");
		int qtd = teclado.nextInt();
		produto.addProduto(qtd);
		System.out.println(produto.toString());
		System.out.print("Digite um numero de produtos a serem removidos do estoque: ");
		qtd = teclado.nextInt();
		produto.removeProduto(qtd);
		System.out.println(produto.toString());
		teclado.close();
	}

}
