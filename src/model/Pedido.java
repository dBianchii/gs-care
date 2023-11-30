package model;

import java.time.LocalDate;
import java.time.LocalTime;

enum StatusPedido {
	AGUARDANDO_PAGAMENTO,
	PAGAMENTO_APROVADO,
	AGAMENTO_RECUSADO,
	CANCELADO;
}

public class Pedido {
	private static int contador = 0;
	private int id;
	private int idPaciente;
	private int idCartao;
	private int idProduto;
	private LocalDate data = LocalDate.now();
	private LocalTime hora = LocalTime.now();;
	private StatusPedido status = StatusPedido.AGUARDANDO_PAGAMENTO;

	public Pedido(int idCartao, int idProduto, int idPaciente) {
		this.id = contador++;
		this.idPaciente = idPaciente;
		this.idCartao = idCartao;
		this.idProduto = idProduto;
	}

	public int getId() {
		return id;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int id) {
		this.idPaciente = id;
	}

	public int getIdCartao() {
		return idCartao;
	}

	public void setIdCartao(int id) {
		this.idCartao = id;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int id) {
		this.idProduto = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + id + ", idPaciente=" + idPaciente + ", idCartao=" + idCartao + ", idProduto="
				+ idProduto + ", data=" + data + ", hora=" + hora + ", status=" + status + "]";
	}
}
