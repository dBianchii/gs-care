package model;

public class Produto {
	private static int contador = 0;
	private int id;
	private String nome;
	private String descricao;
	private double preco;

	// Construtor da classe Produto
	public Produto(String nome, String descricao, double preco) {
		this.id = contador++;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	// Método get para atributo id
	public int getId() {
		return id;
	}

	// Método get para atributo nome
	public String getNome() {
		return nome;
	}

	// Método set para atributo nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Método get para atributo descricao
	public String getDescricao() {
		return descricao;
	}

	// Método set para atributo descricao
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// Método get para atributo preco
	public String getPreco() {
		return String.format("%.2f", preco);
	}

	// Método set para atributo preco
	public void setPreco(double preco) {
		this.preco = preco;
	}

	// Método para criar produtos
	public static void criaProdutos() {
		new Produto("Cuidado Essencial", "Plano mensal para 1 paciente com até 2 cuidadores", 29.90);
		new Produto("Cuidado Premium", "Plano mensal para 1 paciente com até 5 cuidadores", 49.90);
		new Produto("Cuidado Total", "Plano mensal para 1 paciente com 6 ou mais cuidadores", 89.90);
	}

	// Método toString para impressão de dados (sobrescrito do método toString da classe Object)
	@Override
	public String toString() {
		return "Produto [idProduto=" + id + ", nome=" + nome + ", descrição=" + descricao + ", preço=R$" + getPreco()
				+ "]";
	}
}
