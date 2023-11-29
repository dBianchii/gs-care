public class Paciente extends Pessoa {
	private String dataNascimento;
	private String genero;
	private String tipoSanguineo;
	private Boolean fumante;

	public Paciente(int idPessoa, String nome, String cpf, String rg, String endereco, String telefone, String email,
			NivelAcesso nivelAcesso,
			String dataNascimento, String genero, String tipoSanguineo, Boolean fumante) {
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

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public Boolean getFumante() {
		return fumante;
	}

	public void setFumante(Boolean fumante) {
		this.fumante = fumante;
	}

}
