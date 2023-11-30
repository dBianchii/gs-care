package model;

import java.util.Calendar;

public class CartaoCredito {
	private static int contador = 0;
	private int id;
	private String numero;
	private String nomeTitular;
	private String validadeMes;
	private String validadeAno;
	private int cvv;

	// Construtor da classe CartaoCredito
	public CartaoCredito(String numero, String nomeTitular, String validadeMes, String validadeAno, int cvv) {
		this.id = contador++;

		this.numero = numero;
		this.nomeTitular = nomeTitular;
		this.validadeMes = validadeMes;
		this.validadeAno = validadeAno;
		this.cvv = cvv;
	}

	// Método get para atributo id
	public int getId() {
		return id;
	}

	// Método get para atributo numero
	public String getNumero() {
		return numero;
	}

	// Método set para atributo numero
	public void setNumero(String numero) {
		this.numero = numero;
	}

	// Método que verifica se o número do cartão de crédito é válido
	public static boolean verificaNumero(String numero) {
		return numero.length() == 16 && numero.matches("[0-9]+");
	}

	// Método get para atributo nomeTitular
	public String getNomeTitular() {
		return nomeTitular;
	}

	// Método set para atributo nomeTitular
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	// Método que verifica se o nome do titular do cartão de crédito é válido
	public static boolean verificaNome(String nomeTitular) {
		return nomeTitular.matches("[a-zA-Z ]+");
	}

	// Método get para atributo validadeMes
	public String getValidadeMes() {
		return validadeMes;
	}

	// Método set para atributo validadeMes
	public void setValidadeMes(String validadeMes) {
		this.validadeMes = validadeMes;
	}

	// Método que verifica se o mês de validade do cartão de crédito é válido
	public static boolean verificaMes(String validadeMes) {
		return validadeMes.length() == 2
				&& validadeMes.matches("[0-9]+")
				&& Integer.parseInt(validadeMes) >= 1
				&& Integer.parseInt(validadeMes) <= 12;
	}

	// Método get para atributo validadeAno
	public String getValidadeAno() {
		return validadeAno;
	}

	// Método set para atributo validadeAno
	public void setValidadeAno(String validadeAno) {
		this.validadeAno = validadeAno;
	}

	// Método que verifica se o ano de validade do cartão de crédito é válido
	public static boolean verificaAno(String validadeAno) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		return validadeAno.length() == 4
				&& validadeAno.matches("[0-9]+")
				&& Integer.parseInt(validadeAno) >= currentYear
				&& Integer.parseInt(validadeAno) <= currentYear + 100;
	}

	// Método get para atributo cvv
	public int getCvv() {
		return cvv;
	}

	// Método set para atributo cvv
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	// Método que verifica se o cvv do cartão de crédito é válido
	public static boolean verificaCvv(int cvv) {
		return cvv >= 100 && cvv <= 999;
	}

	// Método toString para impressão de dados (sobrescrito do método toString da classe Object)
	@Override
	public String toString() {
		return "CartaoCredito [idCartaoCredito=" + id + ", numero=" + numero + ", nomeTitular="
				+ nomeTitular + ", validadeMes=" + validadeMes + ", validadeAno=" + validadeAno + ", cvv=" + cvv + "]";
	}

}