package model;

enum GrauParentesco {
	PAI,
	MAE,
	IRMAO,
	IRMA,
	TIO,
	TIA,
	PRIMO,
	PRIMA,
	AVÔ,
	AVÓ,
	SOBRINHO,
	SOBRINHA,
	OUTRO
}

public class Familiar extends Cuidador {
	private GrauParentesco grauParentesco;

	public Familiar(String nome, String cpf, String rg, String endereco, String telefone, String email,
			NivelAcesso nivelAcesso,
			GrauParentesco grauParentesco, int idPaciente) {
		super(nome, cpf, rg, endereco, telefone, email, nivelAcesso, idPaciente);

		this.grauParentesco = grauParentesco;
	}

	public GrauParentesco getGrauParentesco() {
		return grauParentesco;
	}

	public void setGrauParentesco(GrauParentesco grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

}
