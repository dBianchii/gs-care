package model;

enum NivelAcesso {
	ADMINISTRADOR,
	EDITOR,
	LEITOR
}

public class Pessoa {
	private static int contador = 0;
	private int id;
	private int idEndereco;
	private String nome;
	private String cpf;
	private String rg;
	private String telefone;
	private String email;
	private NivelAcesso nivelAcesso;

	public Pessoa(String nome, String cpf, String rg, int idEndereco, String telefone, String email, NivelAcesso nivelAcesso) {
		this.id = contador++;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.idEndereco = idEndereco;
		this.telefone = telefone;
		this.email = email;
		this.nivelAcesso = nivelAcesso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int endereco) {
		this.idEndereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public NivelAcesso getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(NivelAcesso nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
}
