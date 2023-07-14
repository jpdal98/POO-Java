package exercParcelas;

public interface ServicoPagamentoOnline {

	double taxaPagamento(double valor);

	double Juros(double valor, int meses);
}
