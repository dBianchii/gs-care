public class Cuidador extends Pessoa {
	// chave primária?
	
	public Cuidador(int idPessoa, String nome, String cpf, String rg, String endereco, String telefone, String email,
			NivelAcesso nivelAcesso) {

		super(idPessoa, nome, cpf, rg, endereco, telefone, email, nivelAcesso);
	}
}
