package model;
public class Profissional extends Pessoa {
	private int idProfissional;
	// private int idCuidador;
	// private int idEmpresa;
	// TODO: Adicionar atributos de Profissional e idCuidador

	public Profissional(int idPessoa, String nome, String cpf, String rg, String endereco, String telefone, String email,
			NivelAcesso nivelAcesso,
			int idProfissional, int idCuidador, int idEmpresa) {
		super(idPessoa, nome, cpf, rg, endereco, telefone, email, nivelAcesso);
		this.idProfissional = idProfissional;
	}

	public int getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(int idProfissional) {
		this.idProfissional = idProfissional;
	}

	// public int getIdCuidador() {
	// return idCuidador;
	// }

	// public void setIdCuidador(int idCuidador) {
	// this.idCuidador = idCuidador;
	// }

	// public int getIdEmpresa() {
	// return idEmpresa;
	// }

	// public void setIdEmpresa(int idEmpresa) {
	// this.idEmpresa = idEmpresa;
	// }

}
