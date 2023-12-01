package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.CartaoCredito;
import model.Cuidador;
import model.Evento;
import model.Paciente;
import model.Pedido;
import model.Produto;
import model.Registro;

public class App {
	private final Scanner scanner = new Scanner(System.in);

	private ArrayList<Produto> produtos = Produto.criarProdutos();
	private ArrayList<CartaoCredito> cartoes = new ArrayList<CartaoCredito>();
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private ArrayList<Cuidador> cuidadores = new ArrayList<Cuidador>();
	private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	private ArrayList<Evento> eventos = new ArrayList<Evento>();
	private ArrayList<Registro> registros = new ArrayList<Registro>();

	private int idProdutoEscolhido = -1;

	public void menu() {

		System.out.println("\n-------------------------------");
		System.out.println("* * * * * * HAPCARE * * * * * *");
		System.out.println("-------------------------------\n");
		System.out.println("\nMENU PRINCIPAL");
		System.out.println("-------------------------------------");
		System.out.println("1. Visualizar Produtos");
		System.out.println("2. Escolher Produto");
		System.out.println("3. Visualizar Produto Escolhido");
		System.out.println("4. Cadastrar Cartão de Crédito");
		System.out.println("5. Visualizar Cartões de Crédito Cadastrados");
		System.out.println("6. Fazer Pedido");
		System.out.println("7. Ver Pedidos");
		System.out.println("8. Cadastrar Cuidador");
		System.out.println("9. Visualizar Cuidadores Cadastrados");
		System.out.println("10. Visualizar Pacientes Cadastrados");
		System.out.println("11. Cadastrar Eventos");
		System.out.println("12. Visualizar Eventos Cadastrados");
		System.out.println("13. Cadastrar Registros");
		System.out.println("14. Visualizar Registros Cadastrados");
		System.out.println("15. Sair");
		System.out.println("-------------------------------------\n");
		System.out.print("Escolha uma opção: ");

		int opcao;
		while (true) {
			String input = scanner.nextLine();
			try {
				opcao = Integer.parseInt(input);
				if (opcao >= 1 && opcao <= 15)
					break; // exit the loop if input is within the valid range
				else
					System.out.println("Por favor, escolha um número entre 1 e 15.");
			} catch (NumberFormatException e) {
				System.out.println("Opção inválida! Por favor, insira um número.");
			}
		}

		switch (opcao) {
			case 1:
				visualizarProdutos();
				break;
			case 2:
				escolherProduto();
				break;
			case 3:
				visualizarProdutoEscolhido();
				break;
			case 4:
				cadastrarCartaoDeCredito();
				break;
			case 5:
				visualizarCartoesCadastrados();
				break;
			case 6:
				fazerPedido();
				break;
			case 7:
				verPedidos();
				break;
			case 8:
				cadastrarCuidador();
				break;
			case 9:
				visualizarCuidadores();
				break;
			case 10:
				visualizarPacientes();
				break;
			case 11:
				cadastrarEventos();
				break;
			case 12:
				visualizarEventos();
				break;
			case 13:
				cadastrarRegistros();
				break;
			case 14:
				visualizarRegistros();
				break;
			case 15:
				System.out.println("\nObrigado por utilizar o HapCare!");
				System.exit(0);
				break;
		}
	}

	private void voltarMenu() {
		System.out.println("\nPressione ENTER para voltar ao menu principal.");
		scanner.nextLine();
		menu();
	}

	// método para visualizar os produtos da HapCare
	public void visualizarProdutos() {
		System.out.println("1. Visualizar Produtos: \n");

		for (Produto produto : produtos) {
			System.out.println("\s\s " + produto.getId() + " - " + produto.getNome().toUpperCase());
			System.out.println("\s\s " + produto.getDescricao());
			System.out.println("\s\s R$" + produto.getPreco() + "/mês\n");
		}
		voltarMenu();
	}

	// método para escolher o produto
	public void escolherProduto() {
		System.out.println("2. Escolher Produto: \n");

		while (true) {
			System.out.print("Digite o número do produto desejado: ");
			String input = scanner.nextLine();
			if (input.matches("\\d+")) {
				int inputParseado = Integer.parseInt(input);
				if (inputParseado < 0 || inputParseado >= Produto.criarProdutos().size()) {
					System.out.println("O identificador do produto não existe.");
					System.out.println("Escolha 0, 1 ou 2.\n");
				} else {
					idProdutoEscolhido = inputParseado;
					System.out.println("-> Você escolheu o "
							+ produtos.get(idProdutoEscolhido) + ".\n");
					break;
				}
			} else {
				System.out.println("O identificador do produto não é um número.");
				System.out.println("Escolha 0, 1 ou 2.\n");
			}
		}
		voltarMenu();
	}

	// método para visualizar o produto escolhido
	public void visualizarProdutoEscolhido() {
		System.out.println("3. Visualizar Produto Escolhido: \n");
		if (idProdutoEscolhido == -1) {
			System.out.println("Você ainda não escolheu nenhum produto.");
		} else {
			System.out.println("-> Você escolheu o "
					+ produtos.get(idProdutoEscolhido) + ".\n");
		}
		voltarMenu();
	}

	// método para cadastrar os dados de um cartão de crédito
	public void cadastrarCartaoDeCredito() {
		String numero;
		String nomeTitular;
		String validadeMes;
		String validadeAno;
		int cvv;

		System.out.println("4. Cadastrar Cartão de Crédito: \n");

		while (true) {
			System.out.print("• Número do cartão (16 dígitos): ");
			numero = scanner.nextLine();
			if (CartaoCredito.verificaNumero(numero)) {
				break;
			} else {
				System.out.println("☒ Número inválido. Tente novamente.\n");
			}
		}

		while (true) {
			System.out.print("• Nome do Titular do Cartão: ");
			nomeTitular = scanner.nextLine();
			if (CartaoCredito.verificaNome(nomeTitular)) {
				break;
			} else {
				System.out.println("☒ Nome inválido. Tente novamente.\n");
			}
		}

		while (true) {
			System.out.print("• Mês de Validade do Cartão (2 dígitos): ");
			validadeMes = scanner.nextLine();
			if (CartaoCredito.verificaMes(validadeMes)) {
				break;
			} else {
				System.out.println("☒ Mês inválido. Tente novamente.\n");
			}
		}

		while (true) {
			System.out.print("• Ano de Validade do Cartão (4 dígitos): ");
			validadeAno = scanner.nextLine();
			if (CartaoCredito.verificaAno(validadeAno)) {
				break;
			} else {
				System.out.println("☒ Ano inválido. Tente novamente.\n");
			}
		}

		while (true) {
			System.out.print("• CVV (3 dígitos): ");
			cvv = scanner.nextInt();
			if (CartaoCredito.verificaCvv(cvv)) {
				break;
			} else {
				System.out.println("☒ CVV inválido. Tente novamente.\n");
			}
		}
		CartaoCredito cartao = new CartaoCredito(numero, nomeTitular, validadeMes, validadeAno, cvv);
		cartoes.add(cartao);

		System.out.println("\n-> Você inseriu o cartão final " + cartao.getNumero().substring(12) + " com sucesso!\n");
		voltarMenu();
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
		voltarMenu();
	}

	// método para fazer um pedido
	public void fazerPedido() {
		System.out.println("6. Fazer Pedido: \n");
		if (idProdutoEscolhido == -1) {
			System.out.println("Você ainda não escolheu nenhum produto.");
			voltarMenu();
		} else if (cartoes.size() == 0) {
			System.out.println("Você ainda não cadastrou nenhum cartão de crédito.");
			voltarMenu();
		} else {
			System.out.println("-> Você escolheu o "
					+ produtos.get(idProdutoEscolhido) + ".\n");
			System.out.println("-> Você cadastrou o cartão final "
					+ cartoes.get(cartoes.size() - 1).getNumero().substring(12) + ".\n");
			System.out.println("-> Pedido realizado com sucesso!\n");
			pedidos.add(new Pedido(produtos.get(idProdutoEscolhido), cartoes.get(cartoes.size() - 1)));
			voltarMenu();
		}
	}

	// método para ver os pedidos
	public void verPedidos() {

	}

	// método para cadastrar os dados de um cuidador
	public void cadastrarCuidador() {

	}

	// método para visualizar os cuidadores cadastrados
	public void visualizarCuidadores() {

	}

	// método para visualizar os pacientes cadastrados
	public void visualizarPacientes() {

	}

	// método para cadastrar os dados de um evento
	public void cadastrarEventos() {

	}

	// método para visualizar os eventos cadastrados
	public void visualizarEventos() {

	}

	// método para cadastrar os dados de um registro
	public void cadastrarRegistros() {

	}

	// método para visualizar os registros cadastrados
	public void visualizarRegistros() {

	}

	public static void main(String[] args) {
		App app = new App();
		app.menu();
	}
}