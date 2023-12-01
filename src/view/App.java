package view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import model.CartaoCredito;
import model.Cuidador;
import model.Familiar;
import model.Paciente;
import model.Pedido;
import model.Pessoa;
import model.Produto;
import model.Registro;
import enums.Genero;
import enums.GrauParentesco;
import enums.NivelAcesso;
import enums.TipoSanguineo;

public class App {
	private final Scanner scanner = new Scanner(System.in);

	Paciente paciente;
	int idPaciente = 1; // somente 1 paciente na aplicação

	private ArrayList<Produto> produtos = Produto.criarProdutos();
	private ArrayList<CartaoCredito> cartoes = new ArrayList<CartaoCredito>();
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private ArrayList<Cuidador> cuidadores = new ArrayList<Cuidador>();
	private ArrayList<Familiar> familiares = new ArrayList<Familiar>();
	private ArrayList<Registro> registros = new ArrayList<Registro>();

	private int idProdutoEscolhido = -1;

	public void inicializarDados() {
		String cpf = "12345678901";
		String rg = "1234567890";
		int idEndereco = 1; // TODO: uuuh.... ?
		String telefone = "123456789";
		String email = "joana@joana.com.br";
		NivelAcesso nivelAcesso = NivelAcesso.LEITOR;
		LocalDate dataNascimento = LocalDate.of(1990, 1, 1);
		Genero genero = Genero.FEMININO;
		TipoSanguineo tipoSanguineo = TipoSanguineo.A_POSITIVO;
		Boolean fumante = false;

		paciente = new Paciente("João", cpf, rg, idEndereco, telefone, email, nivelAcesso, dataNascimento, genero,
				tipoSanguineo, fumante);
	}

	public void menu() {
		System.out.println("-------------------------------------");
		System.out.println("\s* * * * * * * HAPCARE * * * * * * *");
		System.out.println("-------------------------------------\n");
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
		System.out.println("10. Visualizar Paciente");
		System.out.println("11. Cadastrar Registro");
		System.out.println("12. Visualizar Registros Cadastrados");
		System.out.println("13. Sair");
		System.out.println("-------------------------------------\n");
		System.out.print("Escolha uma opção: ");

		int opcao;
		while (true) {
			String input = scanner.nextLine();
			try {
				opcao = Integer.parseInt(input);
				if (opcao >= 1 && opcao <= 13)
					break; // exit the loop if input is within the valid range
				else
					System.out.println("Por favor, escolha um número entre 1 e 13.");
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
				visualizarPaciente();
				break;
			case 11:
				cadastrarRegistros();
				break;
			case 12:
				visualizarRegistros();
				break;
			case 13:
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
			if (Pessoa.verificaNome(nomeTitular)) {
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
			pedidos.add(new Pedido(idProdutoEscolhido, cartoes.get(cartoes.size() - 1).getId(), idPaciente));
			voltarMenu();
		}
	}

	// método para ver os pedidos
	public void verPedidos() {
		System.out.println("7. Ver Pedidos: \n");
		if (pedidos.size() == 0) {
			System.out.println("Você ainda não fez nenhum pedido.");
		} else {
			for (Pedido pedido : pedidos) {
				System.out.println("\s\s " + pedido);
			}
		}
		voltarMenu();
	}

	// método para cadastrar os dados de um cuidador
	public void cadastrarCuidador() {
		boolean familiar;
		String nome;
		String cpf;
		String rg;
		int idEndereco = 1;
		String telefone;
		String email;
		NivelAcesso nivelAcesso;
		GrauParentesco grauParentesco = null;

		System.out.println("8. Cadastrar Cuidador: \n");

		while (true) {
			System.out.print("• Você é familiar do paciente? (S/N) ");
			String input = scanner.nextLine();
			if (input.equalsIgnoreCase("S")) {
				familiar = true;
				break;
			} else if (input.equalsIgnoreCase("N")) {
				familiar = false;
				break;
			} else {
				System.out.println("☒ Opção inválida. Tente novamente.\n");
			}
		}

		if (familiar) {
			System.out.println("• Informe o grau de parentesco do cuidador: ");
			for (GrauParentesco grau : GrauParentesco.values()) {
				System.out.println("\s\s" + grau.ordinal() + " - " + grau);
			}
			int opcao;
			while (true) {
				String input = scanner.nextLine();
				try {
					opcao = Integer.parseInt(input);
					if (opcao >= 0 && opcao <= GrauParentesco.values().length) {
						grauParentesco = GrauParentesco.values()[opcao];
						break; // exit the loop if input is within the valid range
					} else
						System.out.println(
								"Por favor, escolha um número entre 0 e " + GrauParentesco.values().length + ".");
				} catch (NumberFormatException e) {
					System.out.println("Opção inválida! Por favor, insira um número.");
				}
			}

		}

		while (true) {
			System.out.print("• Nome do Cuidador: ");
			nome = scanner.nextLine();
			if (Pessoa.verificaNome(nome)) {
				break;
			} else {
				System.out.println("☒ Nome inválido. Tente novamente.\n");
			}
		}

		while (true) {
			System.out.print("• CPF do Cuidador (11 dígitos): ");
			cpf = scanner.nextLine();
			if (Pessoa.verificaCpf(cpf)) {
				break;
			} else {
				System.out.println("☒ CPF inválido. Tente novamente.\n");
			}
		}

		while (true) {
			System.out.print("• RG do Cuidador (máx. 10 dígitos): ");
			rg = scanner.nextLine();
			if (Pessoa.verificaRg(rg)) {
				break;
			} else {
				System.out.println("☒ RG inválido. Tente novamente.\n");
			}
		}

		// while (true) {
		// System.out.print("• ID do Endereço do Cuidador: ");
		// idEndereco = scanner.nextInt();
		// if (Pessoa.verificaIdEndereco(idEndereco)) {
		// break;
		// } else {
		// System.out.println("☒ ID inválido. Tente novamente.\n");
		// }
		// }

		while (true) {
			System.out.print("• Telefone do Cuidador (de 8 a 13 dígitos): ");
			telefone = scanner.nextLine();
			if (Pessoa.verificaTelefone(telefone)) {
				break;
			} else {
				System.out.println("☒ Telefone inválido. Tente novamente.\n");
			}
		}

		while (true) {
			System.out.print("• E-mail do Cuidador: ");
			email = scanner.nextLine();
			if (Pessoa.verificaEmail(email)) {
				break;
			} else {
				System.out.println("☒ E-mail inválido. Tente novamente.\n");
			}
		}

		while (true) {
			System.out.println("• Informe o nível de acesso do cuidador: ");
			for (NivelAcesso nivel : NivelAcesso.values()) {
				System.out.println("\s\s" + nivel.ordinal() + " - " + nivel);
			}
			int opcao;
			while (true) {
				String input = scanner.nextLine();
				try {
					opcao = Integer.parseInt(input);
					if (opcao >= 0 && opcao <= NivelAcesso.values().length)
						break; // exit the loop if input is within the valid range
					else
						System.out
								.println("Por favor, escolha um número entre 0 e " + NivelAcesso.values().length + ".");
				} catch (NumberFormatException e) {
					System.out.println("Opção inválida! Por favor, insira um número.");
				}
			}
			nivelAcesso = NivelAcesso.values()[opcao];
			break;
		}

		// new Familiar(nome, cpf, rg, idEndereco, telefone, email, null,
		// GrauParentesco.valueOf(grauParentesco.toString()), idPaciente);

		System.out.println(nivelAcesso);
		System.out.println(grauParentesco);
		voltarMenu();
	}

	// método para visualizar os cuidadores cadastrados
	public void visualizarCuidadores() {

		System.out.println("9. Visualizar Cuidadores Cadastrados: \n");
		if (familiares.size() == 0 && cuidadores.size() == 0) {
			System.out.println("Você ainda não cadastrou nenhum cuidador.");
		} else {
			System.out.println("Cuidadores: ");
			for (Cuidador cuidador : cuidadores) {
				System.out.println("\s\s " + cuidador);
			}
			System.out.println("\n");
			System.out.println("Familiares: ");
			for (Familiar familiar : familiares) {
				System.out.println("\s\s " + familiar);
			}
		}

		voltarMenu();
	}

	// método para visualizar os pacientes cadastrados
	public void visualizarPaciente() {

		System.out.println("10. Visualizar Paciente: \n");
		System.out.println("Paciente: " + paciente);

		voltarMenu();
	}

	// método para cadastrar os dados de um registro
	public void cadastrarRegistros() {

		voltarMenu();
	}

	// método para visualizar os registros cadastrados
	public void visualizarRegistros() {

		System.out.println("14. Visualizar Registros Cadastrados: \n");
		if (registros.size() == 0) {
			System.out.println("Você ainda não cadastrou nenhum registro.");
		} else {
			for (Registro registro : registros) {
				System.out.println("\s\s " + registro);
			}
		}

		voltarMenu();
	}

	public static void main(String[] args) {
		App app = new App();
		app.inicializarDados();
		app.menu();
	}
}