package model;

import enums.NivelAcesso;

public class Profissional extends Cuidador {
	private int idEmpresa;

	// Método construtor da classe Profissional
	public Profissional(String nome, String cpf, String rg, int idEndereco, String telefone, String email, NivelAcesso nivelAcesso, int idPaciente, int idEmpresa) {

		super(nome, cpf, rg, idEndereco, telefone, email, nivelAcesso, idPaciente);

		this.idEmpresa = idEmpresa;
	}

	// Método get para atributo idEmpresa
	public int getIdEmpresa() {
		return idEmpresa;
	}

	// Método set para atributo idEmpresa
	public void setIdEmpresa(int id) {
		this.idEmpresa = id;
	}

	// Método toString para impressão de dados (sobrescrito do método toString da classe Object)
	@Override
	public String toString() {
		return "Profissional [idEmpresa=" + idEmpresa + ", nome=" + super.getNome() + ", cpf=" + super.getCpf() + ", rg=" + super.getRg() + ", idEndereco=" + super.getIdEndereco() + ", telefone=" + super.getTelefone() + ", email=" + super.getEmail() + ", nivelAcesso=" + super.getNivelAcesso() + ", idPaciente=" + super.getIdPaciente() + "]";
	}

}
