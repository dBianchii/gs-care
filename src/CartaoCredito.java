import java.util.ArrayList;

public class CartaoCredito {
	private static int contador = 0;
	private static ArrayList<CartaoCredito> cartoes = new ArrayList<CartaoCredito>();
	private int idCartaoCredito; // chave primária
	private String numero;
	private String nomeTitular;
	private int validadeMes;
	private int validadeAno;
	private int cvv;

	public CartaoCredito(String numero, String nomeTitular, int validadeMes, int validadeAno, int cvv) {
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

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getValidadeMes() {
		return validadeMes;
	}

	public void setValidadeMes(int validadeMes) {
		this.validadeMes = validadeMes;
	}

	public int getValidadeAno() {
		return validadeAno;
	}

	public void setValidadeAno(int validadeAno) {
		this.validadeAno = validadeAno;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public static void criaCartoes() {
		new CartaoCredito("0000999911118468", "Mariana Macêdo", 8, 2030, 787);
		new CartaoCredito("0076499911110398", "Rafael Braga", 6, 2027, 500);
		new CartaoCredito("0110997451168668", "Rodrigo Diego", 5, 2032, 172);
	}

	@Override
	public String toString() {
		return "CartaoCredito [idCartaoCredito=" + idCartaoCredito + ", numero=" + numero + ", nomeTitular=" + nomeTitular + ", validadeMes=" + validadeMes + ", validadeAno=" + validadeAno + ", cvv=" + cvv + "]";
	}

	public static void main(String[] args) {
		CartaoCredito.criaCartoes();

		for (CartaoCredito cartao : CartaoCredito.getCartoes()) {
			System.out.println(cartao);
		}
	}

}