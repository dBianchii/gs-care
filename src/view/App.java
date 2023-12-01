package view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import model.CartaoCredito;
import model.Cuidador;
import model.Empresa;
import model.Endereco;
import model.Familiar;
import model.Paciente;
import model.Pedido;
import model.Pessoa;
import model.Produto;
import model.Profissional;
import enums.Genero;
import enums.GrauParentesco;
import enums.NivelAcesso;
import enums.TipoSanguineo;

public class App {
	private final Scanner scanner = new Scanner(System.in);

	Paciente paciente;

	private ArrayList<Produto> produtos = Produto.criarProdutos();
	private ArrayList<CartaoCredito> cartoes = new ArrayList<CartaoCredito>();
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private ArrayList<Cuidador> cuidadores = new ArrayList<Cuidador>();
	private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
	private ArrayList<Empresa> empresas = new ArrayList<Empresa>();

	private int idProdutoEscolhido = -1;

	public void inicializarDados() {
		String cpf = "12345678901";
		String rg = "1234567890";
		String telefone = "123456789";
		String email = "joana@joana.com.br";
		NivelAcesso nivelAcesso = NivelAcesso.LEITOR;
		LocalDate dataNascimento = LocalDate.of(1990, 1, 1);
		Genero genero = Genero.FEMININO;
		TipoSanguineo tipoSanguineo = TipoSanguineo.A_POSITIVO;
		Boolean fumante = false;

		paciente = new Paciente("João", cpf, rg, 1, telefone, email, nivelAcesso, dataNascimento, genero,
				tipoSanguineo, fumante);
	}

	// limpar a tela
	public void limparTela() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public void menu() {
		limparTela();
		System.out.println("-------------------------------------");
		System.out.println("\s* * * * * * * HAPCARE * * * * * * *");
		System.out.println("-------------------------------------\n");
		System.out.println("\nMENU PRINCIPAL");
		System.out.println("-------------------------------------");
		System.out.println("1. Cadastrar Paciente");
		System.out.println("2. Visualizar Paciente");
		System.out.println("3. Visualizar Produtos");
		System.out.println("4. Escolher Produto");
		System.out.println("5. Visualizar Produto Escolhido");
		System.out.println("6. Cadastrar Cartão de Crédito");
		System.out.println("7. Visualizar Cartões de Crédito Cadastrados");
		System.out.println("8. Fazer Pedido");
		System.out.println("9. Ver Pedidos");
		System.out.println("10. Cadastrar Cuidador");
		System.out.println("11. Visualizar Cuidadores Cadastrados");
		System.out.println("12. Sair");
		System.out.println("-------------------------------------\n");
		System.out.print("Escolha uma opção: ");

		int opcao;
		while (true) {
			String input = scanner.nextLine();
			try {
				opcao = Integer.parseInt(input);
				if (opcao >= 1 && opcao <= 12)
					break; // exit the loop if input is within the valid range
				else
					System.out.println("Por favor, escolha um número entre 1 e 12.");
			} catch (NumberFormatException e) {
				System.out.println("Opção inválida! Por favor, insira um número.");
			}
		}

		switch (opcao) {
			case 1:
				cadastrarPaciente();
				break;
			case 2:
				visualizarPaciente();
				break;
			case 3:
				visualizarProdutos();
				break;
			case 4:
				escolherProduto();
				break;
			case 5:
				visualizarProdutoEscolhido();
				break;
			case 6:
				cadastrarCartaoDeCredito();
				break;
			case 7:
				visualizarCartoesCadastrados();
				break;
			case 8:
				fazerPedido();
				break;
			case 9:
				verPedidos();
				break;
			case 10:
				cadastrarCuidador();
				break;
			case 11:
				visualizarCuidadores();
				break;
			case 12:
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
		System.out.println("\n3. Visualizar Produtos: \n");

		for (Produto produto : produtos) {
			System.out.println("\s\s " + produto.getId() + " - " + produto.getNome().toUpperCase());
			System.out.println("\s\s " + produto.getDescricao());
			System.out.println("\s\s R$" + produto.getPreco() + "/mês\n");
		}
		voltarMenu();
	}

	// método para escolher o produto
	public void escolherProduto() {
		System.out.println("\n4. Escolher Produto: \n");

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
		System.out.println("\n5. Visualizar Produto Escolhido: \n");
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

		System.out.println("\n6. Cadastrar Cartão de Crédito: \n");

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
			String cvvInput = scanner.nextLine();
			try {
				cvv = Integer.parseInt(cvvInput);
				if (CartaoCredito.verificaCvv(cvv)) {
					break;
				} else {
					System.out.println("☒ CVV inválido. Tente novamente.\n");
				}
			} catch (NumberFormatException e) {
				System.out.println("☒ Insira um número válido para o CVV.");
			}
		}
		CartaoCredito cartao = new CartaoCredito(numero, nomeTitular, validadeMes, validadeAno, cvv);
		cartoes.add(cartao);

		System.out.println("\n-> Você inseriu o cartão final " + cartao.getNumero().substring(12) + " com sucesso!\n");
		voltarMenu();
	}

	// método para visualizar os cartões de crédito cadastrados
	public void visualizarCartoesCadastrados() {
		System.out.println("\n7. Visualizar Cartões de Crédito Cadastrados: \n");
		if (cartoes.size() == 0) {
			System.out.println("Você ainda não cadastrou nenhum cartão de crédito.");
		} else {
			for (CartaoCredito cartao : cartoes) {
				System.out.println("- " + cartao);
			}
		}
		voltarMenu();
	}

	// método para fazer um pedido
	public void fazerPedido() {
		System.out.println("\n8. Fazer Pedido: \n");
		if (idProdutoEscolhido == -1) {
			System.out.println("Você ainda não escolheu nenhum produto.");
		} else if (cartoes.isEmpty()) {
			System.out.println("Você ainda não cadastrou nenhum cartão de crédito.");
			return;
		} else {
			// int idPaciente = escolherPaciente();
			int idCartao = escolherCartaoDeCredito();

			pedidos.add(new Pedido(idCartao, 1, 1));

			System.out.println("-> Pedido realizado com sucesso!\n");
			pedidos.add(new Pedido(idProdutoEscolhido, cartoes.get(cartoes.size() - 1).getId(), paciente.getId()));
			voltarMenu();
		}
		voltarMenu();
	}

	// método para ver os pedidos
	public void verPedidos() {
		System.out.println("\n9. Ver Pedidos: \n");
		if (pedidos.size() == 0) {
			System.out.println("Você ainda não fez nenhum pedido.");
		} else {
			for (Pedido pedido : pedidos) {
				System.out.println("- " + pedido);
			}
		}
		voltarMenu();
	}

	// método para cadastrar os dados de um cuidador
	public void cadastrarCuidador() {

		if (paciente == null) {
			System.out.println("Você precisa cadastrar um paciente primeiro.");
			voltarMenu();
			return;
		}

		boolean familiar;
		String nome;
		String cpf;
		String rg;
		String telefone;
		String email;
		int nivelAcesso;
		int grauParentesco = -1;
		String cnpj;
		String razaoSocial;
		String nomeFantasia;
		String inscricaoEstadual;
		Empresa empresa = null;
		String cep;
		String logradouro;
		int numero = 0;
		String cidade;
		String complemento;
		Endereco endereco;

		System.out.println("10. Cadastrar Cuidador: \n");

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
						grauParentesco = opcao;
						break; // exit the loop if input is within the valid range
					} else
						System.out.println(
								"Por favor, escolha um número entre 0 e " + (GrauParentesco.values().length - 1) + ".");
				} catch (NumberFormatException e) {
					System.out.println("Opção inválida! Por favor, insira um número.");
				}
			}
		}

		if (!familiar) {
			while (true) {
				System.out.print("• CNPJ da Empresa (14 dígitos): ");
				cnpj = scanner.nextLine();
				if (Empresa.verificaCnpj(cnpj)) {
					break;
				} else {
					System.out.println("☒ CNPJ inválido. Tente novamente.\n");
				}
			}

			System.out.print("• Informe a razão social da Empresa: ");
			razaoSocial = scanner.nextLine();

			System.out.print("• Informe o nome fantasia da Empresa: ");
			nomeFantasia = scanner.nextLine();

			while (true) {
				System.out.print("• Inscrição Estadual da Empresa (12 dígitos): ");
				inscricaoEstadual = scanner.nextLine();
				if (Empresa.verificaInscricaoEstadual(inscricaoEstadual)) {
					break;
				} else {
					System.out.println("☒ Inscrição Estadual inválida. Tente novamente.\n");
				}
			}

			empresa = new Empresa(cnpj, razaoSocial, nomeFantasia, inscricaoEstadual);
			empresas.add(empresa);
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
			System.out.println("• Nível de acesso do cuidador: ");
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
								.println("Por favor, escolha um número entre 0 e " + (NivelAcesso.values().length - 1)
										+ ".");
				} catch (NumberFormatException e) {
					System.out.println("Opção inválida! Por favor, insira um número.");
				}
			}
			nivelAcesso = opcao;
			break;
		}

		System.out.println("Informações do endereço do Cuidador:");
		while (true) {
			System.out.print("• CEP (8 dígitos): ");
			cep = scanner.nextLine();
			if (Endereco.verificaCep(cep)) {
				break;
			} else {
				System.out.println("☒ CEP inválido. Tente novamente.\n");
			}
		}

		while (true) {
			System.out.print("• Logradouro: ");
			logradouro = scanner.nextLine();
			if (!logradouro.equals("")) {
				break;
			} else {
				System.out.println("☒ Logradouro inválido. Tente novamente.\n");
			}
		}

		while (true) {
			System.out.print("• Número: ");
			try {
				numero = Integer.parseInt(scanner.nextLine());
				if (numero >= 0)
					break; // exit the loop if input is within the valid range
				else
					System.out.println("Por favor, escolha um número positivo.");
			} catch (NumberFormatException e) {
				System.out.println("☒ Número inválido! Por favor, insira um número.");
			}
		}

		while (true) {
			System.out.print("• Cidade: ");
			cidade = scanner.nextLine();
			if (!cidade.equals("")) {
				break;
			} else {
				System.out.println("☒ Cidade inválida. Tente novamente.\n");
			}
		}

		while (true) {
			System.out.print("• Complemento: ");
			complemento = scanner.nextLine();
			if (!complemento.equals("")) {
				complemento = "não informado";
				break;
			}
		}

		endereco = new Endereco(cep, logradouro, numero, cidade, complemento);
		enderecos.add(endereco);

		if (familiar) {
			cuidadores.add(
					new Familiar(nome, cpf, rg, endereco.getId(), telefone, email, NivelAcesso.values()[nivelAcesso],
							GrauParentesco.values()[grauParentesco], 1));
			System.out.println("\n- Cuidador Familiar cadastrado com sucesso!");
		} else {
			cuidadores.add(new Profissional(nome, cpf, rg, endereco.getId(), telefone, email,
					NivelAcesso.values()[nivelAcesso], paciente.getId(), empresa.getId()));
			System.out.println("\n- Cuidador Profissional cadastrado com sucesso!");
		}

		voltarMenu();
	}

	// método para visualizar os cuidadores cadastrados
	public void visualizarCuidadores() {

		System.out.println("11. Visualizar Cuidadores Cadastrados: \n");
		if (cuidadores.size() == 0) {
			System.out.println("Você ainda não cadastrou nenhum cuidador.");
		} else {
			System.out.println("Cuidadores: ");
			for (Cuidador cuidador : cuidadores) {
				System.out.println("- " + cuidador);
			}
		}

		voltarMenu();
	}

	// método para cadastrar os dados de um paciente
	public void cadastrarPaciente() {
		String nome;
		String cpf;
		String rg;
		String telefone;
		String email;
		int nivelAcesso;

		String cep;
		String logradouro;
		int numero = 0;
		String cidade;
		String complemento;
		Endereco endereco;

		LocalDate dataNascimento;
		int genero;
		int tipoSanguineo;
		Boolean fumante;

		System.out.println("1. Cadastrar Paciente: \n");

		if (paciente != null) {
			System.out.println("Você já cadastrou um paciente.");
			System.out.println("- " + paciente);

		} else {

			while (true) {
				System.out.print("• Nome do Paciente: ");
				nome = scanner.nextLine();
				if (Pessoa.verificaNome(nome)) {
					break;
				} else {
					System.out.println("☒ Nome inválido. Tente novamente.\n");
				}
			}

			while (true) {
				System.out.print("• CPF do Paciente (11 dígitos): ");
				cpf = scanner.nextLine();
				if (Pessoa.verificaCpf(cpf)) {
					break;
				} else {
					System.out.println("☒ CPF inválido. Tente novamente.\n");
				}
			}

			while (true) {
				System.out.print("• RG do Paciente (máx. 10 dígitos): ");
				rg = scanner.nextLine();
				if (Pessoa.verificaRg(rg)) {
					break;
				} else {
					System.out.println("☒ RG inválido. Tente novamente.\n");
				}
			}

			while (true) {
				System.out.print("• Telefone do Paciente (de 8 a 13 dígitos): ");
				telefone = scanner.nextLine();
				if (Pessoa.verificaTelefone(telefone)) {
					break;
				} else {
					System.out.println("☒ Telefone inválido. Tente novamente.\n");
				}
			}

			while (true) {
				System.out.print("• E-mail do Paciente: ");
				email = scanner.nextLine();
				if (Pessoa.verificaEmail(email)) {
					break;
				} else {
					System.out.println("☒ E-mail inválido. Tente novamente.\n");
				}
			}

			while (true) {
				System.out.println("• Nível de acesso do Paciente: ");
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
									.println("Por favor, escolha um número entre 0 e "
											+ (NivelAcesso.values().length - 1)
											+ ".");
					} catch (NumberFormatException e) {
						System.out.println("Opção inválida! Por favor, insira um número.");
					}
				}
				nivelAcesso = opcao;
				break;
			}

			while (true) {
				System.out.print("• Data de Nascimento do Paciente (dd/mm/aaaa): ");
				String data = scanner.nextLine();
				if (Paciente.verificaDataNascimento(data)) {
					dataNascimento = Paciente.setDataNascimento(data);
					break;
				} else {
					System.out.println("☒ Data de Nascimento inválida. Tente novamente no formato dd/mm/aaaa.\n");
				}
			}

			while (true) {
				System.out.print("• Gênero do Paciente: ");
				for (Genero generoEnum : Genero.values()) {
					System.out.println("\s\s" + generoEnum.ordinal() + " - " + generoEnum);
				}
				int opcao;
				while (true) {
					String input = scanner.nextLine();
					try {
						opcao = Integer.parseInt(input);
						if (opcao >= 0 && opcao <= Genero.values().length)
							break; // exit the loop if input is within the valid range
						else
							System.out.println(
									"Por favor, escolha um número entre 0 e " + (Genero.values().length - 1) + ".");
					} catch (NumberFormatException e) {
						System.out.println("Opção inválida! Por favor, insira um número.");
					}
				}
				genero = opcao;
				break;
			}

			while (true) {
				System.out.print("• Tipo Sanguíneo do Paciente: ");
				for (TipoSanguineo tipoSanguineoEnum : TipoSanguineo.values()) {
					System.out.println("\s\s" + tipoSanguineoEnum.ordinal() + " - " + tipoSanguineoEnum);
				}
				int opcao;
				while (true) {
					String input = scanner.nextLine();
					try {
						opcao = Integer.parseInt(input);
						if (opcao >= 0 && opcao <= TipoSanguineo.values().length)
							break; // exit the loop if input is within the valid range
						else
							System.out.println("Por favor, escolha um número entre 0 e "
									+ (TipoSanguineo.values().length - 1) + ".");
					} catch (NumberFormatException e) {
						System.out.println("Opção inválida! Por favor, insira um número.");
					}
				}
				tipoSanguineo = opcao;
				break;
			}

			while (true) {
				System.out.print("• O Paciente é fumante? (S/N) ");
				String input = scanner.nextLine();
				if (input.equalsIgnoreCase("S")) {
					fumante = true;
					break;
				} else if (input.equalsIgnoreCase("N")) {
					fumante = false;
					break;
				} else {
					System.out.println("☒ Opção inválida. Tente novamente.\n");
				}
			}

			System.out.println("\n* Informações do endereço do Paciente:");
			while (true) {
				System.out.print("• CEP (8 dígitos): ");
				cep = scanner.nextLine();
				if (Endereco.verificaCep(cep)) {
					break;
				} else {
					System.out.println("☒ CEP inválido. Tente novamente.\n");
				}
			}

			while (true) {
				System.out.print("• Logradouro: ");
				logradouro = scanner.nextLine();
				if (!logradouro.equals("")) {
					break;
				} else {
					System.out.println("☒ Logradouro inválido. Tente novamente.\n");
				}
			}

			while (true) {
				System.out.print("• Número: ");
				try {
					numero = Integer.parseInt(scanner.nextLine());
					if (numero >= 0)
						break; // exit the loop if input is within the valid range
					else
						System.out.println("Por favor, escolha um número positivo.");
				} catch (NumberFormatException e) {
					System.out.println("☒ Número inválido! Por favor, insira um número.");
				}
			}

			while (true) {
				System.out.print("• Cidade: ");
				cidade = scanner.nextLine();
				if (!cidade.equals("")) {
					break;
				} else {
					System.out.println("☒ Cidade inválida. Tente novamente.\n");
				}
			}

			System.out.print("• Complemento: ");
			complemento = scanner.nextLine();
			if (complemento.equals("")) {
				complemento = "não informado";
			}

			endereco = new Endereco(cep, logradouro, numero, cidade, complemento);
			enderecos.add(endereco);

			paciente = new Paciente(nome, cpf, rg, endereco.getId(), telefone, email, NivelAcesso.values()[nivelAcesso],
					dataNascimento, Genero.values()[genero], TipoSanguineo.values()[tipoSanguineo], fumante);
			System.out.println("\n-> Paciente cadastrado com sucesso!");
		}

		voltarMenu();
	}

	// método para visualizar os pacientes cadastrados
	public void visualizarPaciente() {

		System.out.println("2. Visualizar Paciente: \n");
		if (paciente == null) {
			System.out.println("Você ainda não cadastrou nenhum paciente.");
		} else {

			System.out.println("- " + paciente.toString());
		}

		voltarMenu();
	}

	public static void main(String[] args) {
		App app = new App();
		// app.inicializarDados();
		app.menu();
	}

	// ------------------------- HELPERS ----------------------------------- //
	// Os métodos abaixo são apenas funções helpers para o resto do programa //
	// --------------------------------------------------------------------- //

	private int escolherCartaoDeCredito() {
		if (cartoes.isEmpty()) {
			System.out.println("Não há cartões de crédito cadastrados.");
			return -1; // Indicate that no selection was made
		}

		System.out.println("Escolha um cartão de crédito:");

		// List all cartões with an index
		for (int i = 0; i < cartoes.size(); i++) {
			CartaoCredito cartao = cartoes.get(i);
			System.out.println((i + 1) + ". Cartão final " + cartao.getNumero().substring(cartao.getNumero().length() - 4));
		}

		int idCartao = -1;
		while (true) {
			System.out.print("Digite o número do cartão desejado: ");
			String input = scanner.nextLine();
			try {
				idCartao = Integer.parseInt(input) - 1;

				if (idCartao >= 0 && idCartao < cartoes.size()) {
					break; // Valid index
				} else {
					System.out.println("Número inválido. Por favor, escolha um número entre 1 e " + cartoes.size() + ".");
				}
			} catch (NumberFormatException e) {
				System.out.println("Opção inválida! Por favor, insira um número.");
			}
		}

		return idCartao;
	}

}