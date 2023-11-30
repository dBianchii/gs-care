package model;

public class Cuidador extends Pessoa {

	private int idPaciente;

	// Construtor da classe Cuidador
	public Cuidador(String nome, String cpf, String rg, int idEndereco, String telefone, String email, NivelAcesso nivelAcesso, int idPaciente) {

		super(nome, cpf, rg, idEndereco, telefone, email, nivelAcesso);

		this.idPaciente = idPaciente;
	}

	// Método get para atributo idPaciente
	public int getIdPaciente() {
		return idPaciente;
	}

	// Método set para atributo idPaciente
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
}
