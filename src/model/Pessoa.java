package model;

import enums.NivelAcesso;

public abstract class Pessoa {
	private static int contador = 0;
	private int id;
	private int idEndereco;
	private String nome;
	private String cpf;
	private String rg;
	private String telefone;
	private String email;
	private NivelAcesso nivelAcesso;

	// Método construtor da classe Pessoa
	public Pessoa(String nome, String cpf, String rg, int idEndereco, String telefone, String email,
			NivelAcesso nivelAcesso) {
		this.id = contador++;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.idEndereco = idEndereco;
		this.telefone = telefone;
		this.email = email;
		this.nivelAcesso = nivelAcesso;
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

	// Método que verifica se o nome é válido
	public static boolean verificaNome(String nomeTitular) {
		return nomeTitular.matches("[a-zA-Z ]+");
	}

	// Método get para atributo cpf
	public String getCpf() {
		return cpf;
	}

	// Método set para atributo cpf
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	// Método que verifica se o cpf é válido
	public static boolean verificaCpf(String cpf) {
		String cpfNumeros = cpf.replaceAll("\\D", "");
		return cpfNumeros.matches("\\d{11}");
	}

	// Método get para atributo rg
	public String getRg() {
		return rg;
	}

	// Método set para atributo rg
	public void setRg(String rg) {
		this.rg = rg;
	}

	// Método que verifica se o rg é válido
	public static boolean verificaRg(String rg) {
		return rg.matches("[a-zA-Z0-9]{6,10}");
	}

	// Método get para atributo endereco
	public int getIdEndereco() {
		return idEndereco;
	}

	// Método set para atributo endereco
	public void setIdEndereco(int endereco) {
		this.idEndereco = endereco;
	}

	// Método get para atributo telefone
	public String getTelefone() {
		return telefone;
	}

	// Método set para atributo telefone
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// Método que verifica se o telefone é válido
	public static boolean verificaTelefone(String telefone) {
		String telefoneNumeros = telefone.replaceAll("\\D", "");
		return telefoneNumeros.matches("\\d{8,13}");
	}

	// Método get para atributo email
	public String getEmail() {
		return email;
	}

	// Método set para atributo email
	public void setEmail(String email) {
		this.email = email;
	}

	// Método que verifica se o email é válido
	public static boolean verificaEmail(String email) {
		return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
	}

	// Método get para atributo nivelAcesso
	public NivelAcesso getNivelAcesso() {
		return nivelAcesso;
	}

	// Método set para atributo nivelAcesso
	public void setNivelAcesso(NivelAcesso nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	// Método set sobrecarregado para atributo nivelAcesso
	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = NivelAcesso.valueOf(nivelAcesso.toUpperCase());
	}

}
