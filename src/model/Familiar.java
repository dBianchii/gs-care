package model;

import enums.GrauParentesco;

public class Familiar extends Cuidador {
	private GrauParentesco grauParentesco;

	// Construtor da classe Familiar
	public Familiar(String nome, String cpf, String rg, int idEndereco, String telefone, String email, NivelAcesso nivelAcesso, GrauParentesco grauParentesco, int idPaciente) {
		super(nome, cpf, rg, idEndereco, telefone, email, nivelAcesso, idPaciente);

		this.grauParentesco = grauParentesco;
	}

	// Método get para atributo grauParentesco
	public GrauParentesco getGrauParentesco() {
		return grauParentesco;
	}

	// Método set para atributo grauParentesco
	public void setGrauParentesco(GrauParentesco grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

	// Método toString para impressão de dados (sobrescrito do método toString da classe Object)
	@Override
	public String toString() {
		return "Familiar [grauParentesco=" + grauParentesco + ", nome=" + super.getNome() + ", cpf=" + super.getCpf() + ", rg=" + super.getRg() + ", idEndereco=" + super.getIdEndereco() + ", telefone=" + super.getTelefone() + ", email=" + super.getEmail() + ", nivelAcesso=" + super.getNivelAcesso() + ", idPaciente=" + super.getIdPaciente() + "]";
	}	

}
