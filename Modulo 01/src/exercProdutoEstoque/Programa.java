package exercProdutoEstoque;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Produto produto = new Produto();
		System.out.println("Digite os dados do produto");
		System.out.println("Nome:");
		produto.nome = teclado.next();
		System.out.println("Preço:");
		produto.preco = teclado.nextDouble();
		System.out.println("Quantidade em estoque:");
		produto.quantidade = teclado.nextInt();
		
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
