package model;

import java.util.ArrayList;
import java.util.Calendar;

public class CartaoCredito {
	private static int contador = 0;
	private static ArrayList<CartaoCredito> cartoes = new ArrayList<CartaoCredito>();
	private int idCartaoCredito; // chave primária
	private String numero;
	private String nomeTitular;
	private String validadeMes;
	private String validadeAno;
	private int cvv;

	public CartaoCredito() {
		this.idCartaoCredito = contador;
		contador++;
	}

	public CartaoCredito(String numero, String nomeTitular, String validadeMes, String validadeAno, int cvv) {
		this.idCartaoCredito = contador;
		contador++;
		this.numero = numero;
		this.nomeTitular = nomeTitular;
		this.validadeMes = validadeMes;
		this.validadeAno = validadeAno;
		this.cvv = cvv;
		cartoes.add(this);
	}

	public static ArrayList<CartaoCredito> getCartoes() {
		return cartoes;
	}

	public static void apagaCartao(int idCartaoCredito) {
		if (cartoes.size() == 0) {
			System.out.println("Não há cartões cadastrados.");
		} else if (idCartaoCredito < 0 || idCartaoCredito >= cartoes.size()) {
			System.out.println("O identificador do cartão não existe.");
		} else {
			for (int i = 0; i < cartoes.size(); i++) {
				if (cartoes.get(i).getIdCartaoCredito() == idCartaoCredito) {
					cartoes.remove(i);
				}
			}
		}
	}

	public int getIdCartaoCredito() {
		return idCartaoCredito;
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

	public static void criaCartoes() {
		new CartaoCredito("0000999911118468", "Mariana Macêdo", "8", "2030", 787);
		new CartaoCredito("0076499911110398", "Rafael Braga", "6", "2027", 500);
		new CartaoCredito("0110997451168668", "Rodrigo Diego", "5", "2032", 172);
	}

	@Override
	public String toString() {
		return "CartaoCredito [idCartaoCredito=" + idCartaoCredito + ", numero=" + numero + ", nomeTitular="
				+ nomeTitular + ", validadeMes=" + validadeMes + ", validadeAno=" + validadeAno + ", cvv=" + cvv + "]";
	}

	public static void main(String[] args) {
		CartaoCredito.criaCartoes();

		for (CartaoCredito cartao : CartaoCredito.getCartoes()) {
			System.out.println(cartao);
		}
	}

}