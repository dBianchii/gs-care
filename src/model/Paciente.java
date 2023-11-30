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

	public Paciente(String nome, String cpf, String rg, int idEndereco, String telefone, String email,
			NivelAcesso nivelAcesso,
			LocalDate dataNascimento, Genero genero, TipoSanguineo tipoSanguineo, Boolean fumante) {
		super(nome, cpf, rg, idEndereco, telefone, email, nivelAcesso);

		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.tipoSanguineo = tipoSanguineo;
		this.fumante = fumante;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public Boolean getFumante() {
		return fumante;
	}

	public void setFumante(Boolean fumante) {
		this.fumante = fumante;
	}

	@Override
	public String toString() {
		return "Paciente [dataNascimento=" + dataNascimento + ", genero=" + genero + ", tipoSanguineo=" + tipoSanguineo
				+ ", fumante=" + fumante + ", nome=" + super.getNome() + ", cpf=" + super.getCpf() + ", rg="
				+ super.getRg() + ", idEndereco=" + super.getIdEndereco() + ", telefone=" + super.getTelefone()
				+ ", email=" + super.getEmail() + ", nivelAcesso=" + super.getNivelAcesso() + "]";
	}

}
