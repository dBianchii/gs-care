package model;

import java.time.LocalDate;

enum TipoSanguineo {
	A_POSITIVO,
	A_NEGATIVO,
	B_POSITIVO,
	B_NEGATIVO,
	AB_POSITIVO,
	AB_NEGATIVO,
	O_POSITIVO,
	O_NEGATIVO
}

enum Genero {
	MASCULINO,
	FEMININO,
	OUTRO
}

public class Paciente extends Pessoa {
	private LocalDate dataNascimento;
	private Genero genero;
	private TipoSanguineo tipoSanguineo;
	private Boolean fumante;

	// Construtor da classe Paciente
	public Paciente(String nome, String cpf, String rg, int idEndereco, String telefone, String email,
			NivelAcesso nivelAcesso,
			LocalDate dataNascimento, Genero genero, TipoSanguineo tipoSanguineo, Boolean fumante) {
		super(nome, cpf, rg, idEndereco, telefone, email, nivelAcesso);

		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.tipoSanguineo = tipoSanguineo;
		this.fumante = fumante;
	}

	// Método get para atributo dataNascimento
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	// Método set para atributo dataNascimento
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	// Método get para atributo genero
	public Genero getGenero() {
		return genero;
	}

	// Método set para atributo genero
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	// Método get para atributo tipoSanguineo
	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	// Método set para atributo tipoSanguineo
	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	// Método get para atributo fumante
	public Boolean getFumante() {
		return fumante;
	}

	// Método set para atributo fumante
	public void setFumante(Boolean fumante) {
		this.fumante = fumante;
	}

	// Método toString para impressão de dados (sobrescrito do método toString da classe Object)
	@Override
	public String toString() {
		return "Paciente [dataNascimento=" + dataNascimento + ", genero=" + genero + ", tipoSanguineo=" + tipoSanguineo
				+ ", fumante=" + fumante + ", nome=" + super.getNome() + ", cpf=" + super.getCpf() + ", rg="
				+ super.getRg() + ", idEndereco=" + super.getIdEndereco() + ", telefone=" + super.getTelefone()
				+ ", email=" + super.getEmail() + ", nivelAcesso=" + super.getNivelAcesso() + "]";
	}

}
