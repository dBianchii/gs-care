package view;

import java.util.Scanner;

import model.CartaoCredito;
import model.Produto;

public class App {

	public static void apresentaNome() {
		System.out.println("\n-------------------------------");
		System.out.println("* * * * * * HAPCARE * * * * * *");
		System.out.println("-------------------------------\n");
	}

	public static int escolherProduto() {
		int idProduto;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("A. ESCOLHA O PRODUTO \n");

			for (Produto produto : Produto.getProdutos()) {
				System.out.println("\s\s " + produto.getIdProduto() + " - " + produto.getNome().toUpperCase());
				System.out.println("\s\s " + produto.getDescricao());
				System.out.println("\s\s R$" + produto.getPreco() + "/mês\n");
			}

			while (true) {
				System.out.print("Digite o número do produto desejado: ");
				String input = sc.next();
				if (input.matches("\\d+")) {
					int inputParseado = Integer.parseInt(input);
					if (inputParseado < 0 || inputParseado >= Produto.getProdutos().size()) {
						System.out.println("O identificador do produto não existe.");
						System.out.println("Escolha 0, 1 ou 2.\n");
					} else {
						idProduto = inputParseado;
						System.out.println(
								"\n -> Você escolheu o produto "
										+ Produto.getProdutos().get(idProduto).getNome().toUpperCase() + ".\n");
						System.out.println("-------------------------------\n");
						return idProduto;
					}
				} else {
					System.out.println("O identificador do produto não é um número.");
					System.out.println("Escolha 0, 1 ou 2.\n");
				}
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
			return -1;
		}
	}

	public static CartaoCredito inserirCartaoCredito() {
		try (Scanner sc = new Scanner(System.in)) {
			CartaoCredito cartao = new CartaoCredito();
	// 		System.out.println("B. INSIRA OS DADOS DO CARTÃO DE CRÉDITO \n");

	// 		while (true) {
	// 			System.out.println("• Número do cartão (16 dígitos): ");
	// 			String numero = sc.nextLine();
	// 			if (cartao.verificaNumero(numero)) {
	// 				cartao.setNumero(numero);
	// 				break;
	// 			} else {
	// 				System.out.println("☒ Número inválido. Tente novamente.\n");
	// 			}
	// 		}

	// 		while (true) {
	// 			System.out.println("• Nome do Titular do Cartão: ");
	// 			String nomeTitular = sc.nextLine();
	// 			if (cartao.verificaNome(nomeTitular)) {
	// 				cartao.setNomeTitular(nomeTitular);
	// 				break;
	// 			} else {
	// 				System.out.println("☒ Nome inválido. Tente novamente.\n");
	// 			}
	// 		}

	// 		while (true) {
	// 			System.out.println("• Mês de Validade do Cartão (2 dígitos): ");
	// 			String validadeMes = sc.nextLine();
	// 			if (cartao.verificaMes(validadeMes)) {
	// 				cartao.setValidadeMes(validadeMes);
	// 				break;
	// 			} else {
	// 				System.out.println("☒ Mês inválido. Tente novamente.\n");
	// 			}
	// 		}

	// 		while (true) {
	// 			System.out.println("• Ano de Validade do Cartão (4 dígitos): ");
	// 			String validadeAno = sc.nextLine();
	// 			if (cartao.verificaAno(validadeAno)) {
	// 				cartao.setValidadeAno(validadeAno);
	// 				break;
	// 			} else {
	// 				System.out.println("☒ Ano inválido. Tente novamente.\n");
	// 			}
	// 		}

	// 		while (true) {
	// 			System.out.println("• CVV (3 dígitos): ");
	// 			int cvv = sc.nextInt();
	// 			if (cartao.verificaCvv(cvv)) {
	// 				cartao.setCvv(cvv);
	// 				break;
	// 			} else {
	// 				System.out.println("☒ CVV inválido. Tente novamente.\n");
	// 			}
	// 		}

	// 		System.out.println("\n-------------------------------\n");
	// 		System.out.println(
	// 				"-> Você inseriu o cartão final " + cartao.getNumero().substring(12) + " com sucesso!\n");
	// 		System.out.println("\n-------------------------------\n");

			return cartao;

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
			return null;
		}

	}

	public static void main(String[] args) throws Exception {
		Produto.criaProdutos();

		App.apresentaNome();

		int idProduto = App.escolherProduto();

		// App.inserirCartaoCredito();

	}
}
