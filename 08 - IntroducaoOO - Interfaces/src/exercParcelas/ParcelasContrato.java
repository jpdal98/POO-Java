package exercParcelas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParcelasContrato {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Double valor;
	private Date dataVencimento;
	
	public ParcelasContrato() {
	}

	public ParcelasContrato(Double valor, Date dataVencimento) {
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}


	public ParcelasContrato(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	@Override
	public String toString() {
		return "valor: " + String.format("%.2f", valor) + " data de vencimento: " + sdf.format(dataVencimento);
	}
	
	
}
