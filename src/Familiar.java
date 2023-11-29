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
	// chave primária?
	private GrauParentesco grauParentesco;

	public Familiar(int idPessoa, String nome, String cpf, String rg, String endereco, String telefone, String email,
			NivelAcesso nivelAcesso,
			GrauParentesco grauParentesco) {
		super(idPessoa, nome, cpf, rg, endereco, telefone, email, nivelAcesso);

		this.grauParentesco = grauParentesco;
	}

	public GrauParentesco getGrauParentesco() {
		return grauParentesco;
	}

	public void setGrauParentesco(GrauParentesco grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

}
