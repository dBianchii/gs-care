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

public class Paciente extends Pessoa {
	private String dataNascimento;
	private String genero;
	private TipoSanguineo tipoSanguineo;
	private Boolean fumante;

	public Paciente(int idPessoa, String nome, String cpf, String rg, String endereco, String telefone, String email,
			NivelAcesso nivelAcesso,
			String dataNascimento, String genero, TipoSanguineo tipoSanguineo, Boolean fumante) {
		super(idPessoa, nome, cpf, rg, endereco, telefone, email, nivelAcesso);

		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.tipoSanguineo = tipoSanguineo;
		this.fumante = fumante;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
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

}
