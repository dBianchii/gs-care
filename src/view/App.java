package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.CartaoCredito;
import model.Produto;

public class App {
	private ArrayList<Produto> produtos = Produto.getProdutos();
	private ArrayList<CartaoCredito> cartoes = new ArrayList<CartaoCredito>();
	private int idProdutoEscolhido = -1;

	public void apresentaNome() {
		System.out.println("\n-------------------------------");
		System.out.println("* * * * * * HapCare * * * * * *");
		System.out.println("-------------------------------\n");
	}

	// método para visualizar os produtos da HapCare
	public void visualizarProdutos() {
		System.out.println("1. Visualizar Produtos: \n");

		for (Produto produto : produtos) {
			System.out.println("\s\s " + produto.getId() + " - " + produto.getNome().toUpperCase());
			System.out.println("\s\s " + produto.getDescricao());
			System.out.println("\s\s R$" + produto.getPreco() + "/mês\n");
		}
	}

	// método para escolher o produto
	public void escolherProduto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("2. Escolher Produto: \n");

		while (true) {
			System.out.print("Digite o número do produto desejado: ");
			String input = sc.next();
			if (input.matches("\\d+")) {
				int inputParseado = Integer.parseInt(input);
				if (inputParseado < 0 || inputParseado >= Produto.getProdutos().size()) {
					System.out.println("O identificador do produto não existe.");
					System.out.println("Escolha 0, 1 ou 2.\n");
				} else {
					idProdutoEscolhido = inputParseado;
					System.out.println("\n-> Você escolheu o produto "
							+ produtos.get(idProdutoEscolhido).getNome().toUpperCase() + ".\n");
					break;
				}
			} else {
				System.out.println("O identificador do produto não é um número.");
				System.out.println("Escolha 0, 1 ou 2.\n");
			}
		}
		sc.close();

	}

	// método para visualizar o produto escolhido
	public void visualizarProdutoEscolhido() {
		System.out.println("3. Visualizar Produto Escolhido: \n");
		if (idProdutoEscolhido == -1) {
			System.out.println("Você ainda não escolheu nenhum produto.");
		} else {
			System.out.println("\n-> Você escolheu o produto "
					+ produtos.get(idProdutoEscolhido).getNome().toUpperCase() + ".\n");
		}
	}

	// método para cadastrar os dados de um cartão de crédito
	public void inserirCartaoCredito() {
		Scanner sc = new Scanner(System.in);

		String numero;
		String nomeTitular;
		String validadeMes;
		String validadeAno;
		int cvv;

		System.out.println("4. Cadastrar Cartão de Crédito: \n");

		while (true) {
			System.out.print("• Número do cartão (16 dígitos): ");
			numero = sc.nextLine();
			if (CartaoCredito.verificaNumero(numero)) {
				break;
			} else {
				System.out.println("☒ Número inválido. Tente novamente.\n");
			}
		}

		while (true) {
			System.out.print("• Nome do Titular do Cartão: ");
			nomeTitular = sc.nextLine();
			if (CartaoCredito.verificaNome(nomeTitular)) {
				break;
			} else {
				System.out.println("☒ Nome inválido. Tente novamente.\n");
			}
		}

		while (true) {
			System.out.print("• Mês de Validade do Cartão (2 dígitos): ");
			validadeMes = sc.nextLine();
			if (CartaoCredito.verificaMes(validadeMes)) {
				break;
			} else {
				System.out.println("☒ Mês inválido. Tente novamente.\n");
			}
		}

		while (true) {
			System.out.print("• Ano de Validade do Cartão (4 dígitos): ");
			validadeAno = sc.nextLine();
			if (CartaoCredito.verificaAno(validadeAno)) {
				break;
			} else {
				System.out.println("☒ Ano inválido. Tente novamente.\n");
			}
		}

		while (true) {
			System.out.print("• CVV (3 dígitos): ");
			cvv = sc.nextInt();
			if (CartaoCredito.verificaCvv(cvv)) {
				break;
			} else {
				System.out.println("☒ CVV inválido. Tente novamente.\n");
			}
		}
		CartaoCredito cartao = new CartaoCredito(numero, nomeTitular, validadeMes, validadeAno, cvv);
		cartoes.add(cartao);

		System.out.println("\n-> Você inseriu o cartão final " + cartao.getNumero().substring(12) + " com sucesso!\n");

	}

	// método para visualizar os cartões de crédito cadastrados
	public void visualizarCartoesCadastrados() {
		System.out.println("5. Visualizar Cartões de Crédito Cadastrados: \n");
		if (cartoes.size() == 0) {
			System.out.println("Você ainda não cadastrou nenhum cartão de crédito.");
		} else {
			for (CartaoCredito cartao : cartoes) {
				System.out.println("\s\s " + cartao);
			}
		}
	}

	public static void main(String[] args) {
		App app = new App();
		app.inserirCartaoCredito();
		app.inserirCartaoCredito();
		app.visualizarCartoesCadastrados();
	}
}
