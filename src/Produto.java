import java.util.ArrayList;

public class Produto {
	private static int contador = 0;
	private static ArrayList<Produto> produtos = new ArrayList<Produto>();
	private int idProduto; // chave primária
	private String nome;
	private String descricao;
	private double preco;

	public Produto(String nome, String descricao, double preco) {
		this.idProduto = contador;
		contador++;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		produtos.add(this);
	}

	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPreco() {
		return String.format("%.2f", preco);
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public static void criaProdutos() {
		new Produto("Cuidado Essencial", "plano mensal para 1 paciente com até 2 cuidadores", 29.90);
		new Produto("Mais Cuidado", "plano mensal para 1 paciente com até 5 cuidadores", 49.90);
		new Produto("Cuidado Total", "plano mensal para 1 paciente com 6 ou mais cuidadores", 89.90);
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", descrição=" + descricao + ", preço=R$" + getPreco() + "]";
	}

	public static void main(String[] args) {
		Produto.criaProdutos();

		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}
}
