package model;

public class Empresa {
	private static int contador = 0;
	private int id;
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String inscricaoEstadual;

	// Construtor da classe Empresa
	public Empresa(String cnpj, String razaoSocial, String nomeFantasia, String inscricaoEstadual) {
		this.id = contador++;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.inscricaoEstadual = inscricaoEstadual;
	}

	// Método get para atributo id
	public int getId() {
		return id;
	}

	// Método get para atributo cnpj
	public String getCnpj() {
		return cnpj;
	}

	// Método set para atributo cnpj
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	// Método get para atributo razaoSocial
	public String getRazaoSocial() {
		return razaoSocial;
	}

	// Método set para atributo razaoSocial
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	// Método get para atributo nomeFantasia
	public String getNomeFantasia() {
		return nomeFantasia;
	}

	// Método set para atributo nomeFantasia
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	// Método get para atributo inscricaoEstadual
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	// Método set para atributo inscricaoEstadual
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	// Método toString para impressão de dados (sobrescrito do método toString da classe Object)
	@Override
	public String toString() {
		return "Empresa [id=" + id + ", cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", nomeFantasia="
				+ nomeFantasia + ", inscricaoEstadual=" + inscricaoEstadual + "]";
	}
}
