package model;

import java.time.LocalDate;
import java.time.LocalTime;

enum StatusPedido {
	AGUARDANDO_CONFIRMACAO_PAGAMENTO,
	PAGAMENTO_APROVADO,
	PAGAMENTO_RECUSADO,
	PEDIDO_CANCELADO;
}

public class Pedido {
	private static int contador = 0;
	private int id;
	private int idPaciente;
	private int idCartao;
	private int idProduto;
	private LocalDate data = LocalDate.now();
	private LocalTime hora = LocalTime.now();;
	private StatusPedido status = StatusPedido.AGUARDANDO_CONFIRMACAO_PAGAMENTO;

	// Construtor da classe Pedido
	public Pedido(int idCartao, int idProduto, int idPaciente) {
		this.id = contador++;
		this.idPaciente = idPaciente;
		this.idCartao = idCartao;
		this.idProduto = idProduto;
	}

	// Método get para atributo id
	public int getId() {
		return id;
	}

	// Método get para atributo idPaciente
	public int getIdPaciente() {
		return idPaciente;
	}

	// Método set para atributo idPaciente
	public void setIdPaciente(int id) {
		this.idPaciente = id;
	}

	// Método get para atributo idCartao
	public int getIdCartao() {
		return idCartao;
	}

	// Método set para atributo idCartao
	public void setIdCartao(int id) {
		this.idCartao = id;
	}

	// Método get para atributo idProduto
	public int getIdProduto() {
		return idProduto;
	}

	// Método set para atributo idProduto
	public void setIdProduto(int id) {
		this.idProduto = id;
	}

	// Método get para atributo data
	public LocalDate getData() {
		return data;
	}

	// Método set para atributo data
	public void setData(LocalDate data) {
		this.data = data;
	}

	// Método get para atributo hora
	public LocalTime getHora() {
		return hora;
	}

	// Método set para atributo hora
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	// Método get para atributo status
	public StatusPedido getStatus() {
		return status;
	}

	// Método set para atributo status
	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	// Método toString para impressão de dados (sobrescrito do método toString da classe Object)
	@Override
	public String toString() {
		return "Pedido [idPedido=" + id + ", idPaciente=" + idPaciente + ", idCartao=" + idCartao + ", idProduto="
				+ idProduto + ", data=" + data + ", hora=" + hora + ", status=" + status + "]";
	}
}
