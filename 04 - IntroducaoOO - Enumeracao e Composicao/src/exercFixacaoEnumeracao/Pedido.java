package exercFixacaoEnumeracao;

import java.util.Date;

public class Pedido {

	private Integer id;
	private Date moment;
	private StatusPedido status;
	
	public Pedido() {
	}

	public Pedido(Integer id, Date moment, StatusPedido status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
}
