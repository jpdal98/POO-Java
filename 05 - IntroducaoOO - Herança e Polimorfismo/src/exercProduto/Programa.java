package exercProduto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		Scanner teclado = new Scanner(System.in);
		List<Produto> produtos = new ArrayList<>();
		System.out.print("Digite a quantidade de produtos a serem cadastrados: ");
		int n = teclado.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("o produto " + i + " é(c/u/i)?");
			char resp = teclado.next().charAt(0);
			System.out.println("Nome: ");
			String nome = teclado.next();
			System.out.println("Preço: ");
			int preco = teclado.nextInt();
			
			if(resp=='c') {
				Produto produto = new Produto(nome, preco);
				produtos.add(produto);
			}else if(resp=='u') {
				System.out.println("Digite a data de fabricação do produto(DD/MM/YYYY):");
				Date dataFabricacao = sdf.parse(teclado.next());
				Produto produto = new ProdutoUsado(nome, preco, dataFabricacao);
				produtos.add(produto);
			}else if(resp=='i'){
				System.out.println("Digite o valor equivalente a taxa da alfandega");
				double taxa = teclado.nextDouble();
				Produto produto = new ProdutoImportado(nome, preco, taxa);
				produtos.add(produto);
			}
			
			
		}
		
		System.out.println("Preço nas etiquetas dos produtos");
		for(Produto produto : produtos) {
			System.out.println(produto.Etiqueta());
		}
		
		teclado.close();
	}

}
