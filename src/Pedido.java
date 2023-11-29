import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

enum StatusPedido {
	AGUARDANDO_PAGAMENTO, 
	PAGAMENTO_APROVADO, 
	AGAMENTO_RECUSADO, 
	CANCELADO;
}

public class Pedido {
	private static int contador = 0;
	private static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private int idPedido;
	private int idPaciente = 1; // a aplicação só possui 1 Paciente por Produto
	private int idCartao;
	private int idProduto; // escolhido ao contratar o serviço; pode ser 0, 1 ou 2
	private LocalDate data;
	private LocalTime hora;
	private StatusPedido status;

	public Pedido(int idCartao, int idProduto) {
		this.idPedido = contador;
		contador++;
		this.idCartao = idCartao;
		this.idProduto = idProduto;
		this.data = LocalDate.now();
		this.hora = LocalTime.now();
		this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
		pedidos.add(this);
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Pedido.contador = contador;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public int getIdCartao() {
		return idCartao;
	}

	public void setIdCartao(int idCartao) {
		this.idCartao = idCartao;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
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
		return "Pedido [idPedido=" + idPedido + ", idPaciente=" + idPaciente + ", idCartao=" + idCartao + ", idProduto=" + idProduto + ", data=" + data + ", hora=" + hora + ", status=" + status + "]";
	}

	public static void main(String[] args) {
		CartaoCredito.criaCartoes();
		Produto.criaProdutos();

		new Pedido(1, 2);
		new Pedido(3, 2);

		for (Pedido pedido : pedidos) {
			System.out.println(pedido);
		}
	}
}
