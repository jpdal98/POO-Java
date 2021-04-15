package exercFixacaoEnumeracao;

import java.util.Date;

public class Programa {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(1080, new Date(), StatusPedido.PENDING_PAYMENT);
		
		System.out.println(pedido);
		
		StatusPedido os1 = StatusPedido.DELIVERED;
		
		StatusPedido os2 = StatusPedido.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}
}
