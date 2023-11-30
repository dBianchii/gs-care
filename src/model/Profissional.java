package model;

public class Profissional extends Cuidador {

	public Profissional(String nome, String cpf, String rg, String endereco, String telefone, String email,
			NivelAcesso nivelAcesso, int idPaciente) {

		super(nome, cpf, rg, endereco, telefone, email, nivelAcesso, idPaciente);
	}

}
