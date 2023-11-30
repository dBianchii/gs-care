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

	public CartaoCredito(String numero, String nomeTitular, String validadeMes, String validadeAno, int cvv) {
		this.id = contador++;

		this.numero = numero;
		this.nomeTitular = nomeTitular;
		this.validadeMes = validadeMes;
		this.validadeAno = validadeAno;
		this.cvv = cvv;
	}

	public int getId() {
		return id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean verificaNumero(String numero) {
		return numero.length() == 16 && numero.matches("[0-9]+");
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public boolean verificaNome(String nomeTitular) {
		return nomeTitular.matches("[a-zA-Z ]+");
	}

	public String getValidadeMes() {
		return validadeMes;
	}

	public void setValidadeMes(String validadeMes) {
		this.validadeMes = validadeMes;
	}

	public boolean verificaMes(String validadeMes) {
		return validadeMes.length() == 2
				&& validadeMes.matches("[0-9]+")
				&& Integer.parseInt(validadeMes) >= 1
				&& Integer.parseInt(validadeMes) <= 12;
	}

	public String getValidadeAno() {
		return validadeAno;
	}

	public void setValidadeAno(String validadeAno) {
		this.validadeAno = validadeAno;
	}

	public boolean verificaAno(String validadeAno) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		return validadeAno.length() == 4
				&& validadeAno.matches("[0-9]+")
				&& Integer.parseInt(validadeAno) >= currentYear
				&& Integer.parseInt(validadeAno) <= currentYear + 100;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public boolean verificaCvv(int cvv) {
		return cvv >= 100 && cvv <= 999;
	}

	@Override
	public String toString() {
		return "CartaoCredito [idCartaoCredito=" + id + ", numero=" + numero + ", nomeTitular="
				+ nomeTitular + ", validadeMes=" + validadeMes + ", validadeAno=" + validadeAno + ", cvv=" + cvv + "]";
	}

}