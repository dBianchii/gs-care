import java.time.LocalDate;

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

enum Genero {
	MASCULINO,
	FEMININO,
	OUTRO
}

public class Paciente extends Pessoa {
	// chave primária?
	private LocalDate dataNascimento;
	private Genero genero;
	private TipoSanguineo tipoSanguineo;
	private Boolean fumante;

	public Paciente(int idPessoa, String nome, String cpf, String rg, String endereco, String telefone, String email,
			NivelAcesso nivelAcesso,
			LocalDate dataNascimento, Genero genero, TipoSanguineo tipoSanguineo, Boolean fumante) {
		super(idPessoa, nome, cpf, rg, endereco, telefone, email, nivelAcesso);

		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.tipoSanguineo = tipoSanguineo;
		this.fumante = fumante;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
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
