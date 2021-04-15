package exercParcelas;

import java.util.Calendar;
import java.util.Date;

public class ServicoPagamento {

	private ServicoPagamentoOnline servicoPagamento;

	public ServicoPagamento(ServicoPagamentoOnline servicoPagamento) {
		this.servicoPagamento = servicoPagamento;
	}
	
	public void processamentoContrato(Contrato contrato, int meses) {
		double valorParcela = contrato.getValorTotal() / meses;
		for(int i = 1; i <= meses; i++) {
			double parcelaAtualizada1 = valorParcela + servicoPagamento.Juros(valorParcela, meses);
			double parcelaAtualizada2 = parcelaAtualizada1 + servicoPagamento.taxaPagamento(parcelaAtualizada1);
			Date dataVencimento = addMeses(contrato.getData(), i);
			contrato.getParcelasContrato().add(new ParcelasContrato(parcelaAtualizada2, dataVencimento));
		}
	}
	
	private Date addMeses(Date data, int meses) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, meses);
		return cal.getTime();
	}
}
