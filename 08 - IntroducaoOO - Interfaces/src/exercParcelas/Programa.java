package exercParcelas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite os dados do contrato");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		double valorTotal = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valorTotal);
		
		System.out.print("Digite o numero de prestações: ");
		int prestacoes = sc.nextInt();
		
		ServicoPagamento servico = new ServicoPagamento(new ServicoPagamentoPaypal());
		servico.processamentoContrato(contrato, prestacoes);
		
		System.out.println("Prestações:");
		for (ParcelasContrato pc : contrato.getParcelasContrato()) {
			System.out.println(pc);
		}
		
		sc.close();

	}

}
