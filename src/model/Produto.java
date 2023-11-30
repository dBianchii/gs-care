package model;

public class Produto {
	private static int contador = 0;
	private int id;
	private String nome;
	private String descricao;
	private double preco;

	public Produto(String nome, String descricao, double preco) {
		this.id = contador++;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getId() {
		return id;
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
		new Produto("Cuidado Essencial", "Plano mensal para 1 paciente com até 2 cuidadores", 29.90);
		new Produto("Cuidado Premium", "Plano mensal para 1 paciente com até 5 cuidadores", 49.90);
		new Produto("Cuidado Total", "Plano mensal para 1 paciente com 6 ou mais cuidadores", 89.90);
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + id + ", nome=" + nome + ", descrição=" + descricao + ", preço=R$" + getPreco()
				+ "]";
	}
}
