package exercParcelas;

public class ServicoPagamentoPaypal implements ServicoPagamentoOnline{

	@Override
	public double taxaPagamento(double valor) {
		
		return valor * 0.02;
	}

	@Override
	public double Juros(double valor, int meses) {
		
		return valor * 0.01 * meses ;
	}
}
