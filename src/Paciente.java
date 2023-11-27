public class Paciente extends Pessoa {
	// Atributos adicionais específicos para a classe Paciente
	private String dataNascimento;
	private String genero; // Pode ser representado como 'M', 'F', etc.
	private String tipoSanguineo;
	private String fumante; // Pode ser representado como 'S' para sim ou 'N' para não

	// Construtor da classe Paciente
	public Paciente(int idPessoa, String nome, String cpf, String rg, String endereco, String telefone, String email,
			String nivelAcesso,
			String dataNascimento, String genero, String tipoSanguineo, String fumante) {
		super(idPessoa, nome, cpf, rg, endereco, telefone, email, nivelAcesso);

		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.tipoSanguineo = tipoSanguineo;
		this.fumante = fumante;
	}

	// Métodos getters e setters para os novos atributos
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

	public String getFumante() {
		return fumante;
	}

	public void setFumante(String fumante) {
		this.fumante = fumante;
	}

}
