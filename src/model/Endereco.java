package model;

public class Endereco {
	static private int contador = 0;
	private int id;
	private String cep;
	private String logradouro;
	private Integer numero;
	private String cidade;
	private String complemento;

	// Construtor da classe Endereco
	public Endereco(String cep, String logradouro, Integer numero, String cidade, String complemento) {
		this.id = contador++;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.complemento = complemento;
	}

	// Método get para atributo id
	public int getId() {
		return id;
	}

	// Método get para atributo logradouro
	public String getLogradouro() {
		return logradouro;
	}

	// Método set para atributo logradouro
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	// Método get para atributo numero
	public Integer getNumero() {
		return numero;
	}

	// Método set para atributo numero
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	// Método get para atributo complemento
	public String getComplemento() {
		if (complemento == null || complemento == "") {
			return "não informado";
		}
		return complemento;
	}

	// Método set para atributo complemento
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	// Método get para atributo cep
	public String getCep() {
		if (cep != null && cep.length() == 8) {
			return cep.substring(0, 5) + "-" + cep.substring(5);
		}
		return cep;
	}

	// Método set para atributo cep
	public void setCep(String cep) {
		this.cep = cep;
	}

	// Método get para atributo cidade
	public String getCidade() {
		return cidade;
	}

	// Método set para atributo cidade
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	// Método toString para impressão de dados (sobrescrito do método toString da classe Object)
	@Override
	public String toString() {
		return "Endereco [idEndereco=" + id + ", cep=" + getCep() + ", logradouro=" + logradouro + ", numero="
				+ numero + ", cidade=" + cidade + ", complemento=" + getComplemento() + "]";
	}

}
