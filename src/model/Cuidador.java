package model;

public class Cuidador extends Pessoa {

	private int idPaciente;

	public Cuidador(String nome, String cpf, String rg, String endereco, String telefone, String email,
			NivelAcesso nivelAcesso, int idPaciente) {

		super(nome, cpf, rg, endereco, telefone, email, nivelAcesso);

		this.idPaciente = idPaciente;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
}
