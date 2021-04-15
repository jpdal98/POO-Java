package exercPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
	
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Insira os dados do cliente::");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date dataNasc = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, dataNasc);
		
		System.out.println("Insira os dados do pedido:");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.print("Quantos itens há este pedido? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Digite # "  + i +  " dados do item::");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto: ");
			double precoProduto = sc.nextDouble();

			Produto produto = new Produto(nomeProduto, precoProduto);

			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();

			ItemPedido item = new ItemPedido(quantidade, precoProduto, produto); 

			pedido.addItem(item);
		}
		
		System.out.println();
		System.out.println("Resumo do pedido:");
		System.out.println(pedido);
		
		sc.close();
	}

}
