package model;
import java.util.Scanner;

public class Endereco {
	static private int contador = 1;
	private int idEndereco; 
	private String cep;
	private String logradouro;
	private Integer numero;
	private String cidade;
	private String complemento;

	public Endereco(String cep, String logradouro, Integer numero, String cidade, String complemento) {
		this.idEndereco = contador;
		contador++;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.complemento = complemento;
	}

	public int getIdEndereco() {
		return idEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		if (complemento == null || complemento == "") {
			return "não informado";
		}
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		if (cep != null && cep.length() == 8) {
			return cep.substring(0, 5) + "-" + cep.substring(5);
		}
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	static public Endereco constroiEndereco() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("** Dados do Endereço **");
			System.out.println("-----------------------");
			System.out.println("Informe o CEP (apenas números): ");
			String cep = sc.nextLine();
			System.out.println("Informe o logradouro: ");
			String logradouro = sc.nextLine();
			System.out.println("Informe o número: ");
			Integer numero = sc.nextInt();
			sc.nextLine();
			System.out.println("Informe o complemento: ");
			String complemento = sc.nextLine();
			System.out.println("Informe a cidade: ");
			String cidade = sc.nextLine();
			System.out.println("-----------------------");
			return new Endereco(cep, logradouro, numero, cidade, complemento);
		} catch (Exception e) {
			System.out.println("Erro ao ler dados do endereço.");
			return null;
		}
	}

	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", cep=" + getCep() + ", logradouro=" + logradouro + ", numero="
				+ numero + ", cidade=" + cidade + ", complemento=" + getComplemento() + "]";
	}

}
