package model;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

enum Intervalo {
	UMA_ÚNICA_VEZ,
	A_CADA_2_HORAS,
	A_CADA_4_HORAS,
	A_CADA_6_HORAS,
	A_CADA_8_HORAS,
	A_CADA_12_HORAS,
	A_CADA_24_HORAS;
}

public class Medicacao extends Evento {
	private static int contador = 0;
	private static ArrayList<Medicacao> medicacoes = new ArrayList<Medicacao>();
	private int idMedicacao; // chave primária
	private String dosagem;
	private Intervalo intervalo;
	private int duracao; // em dias

	//TODO: o idEvento deve ser gerenciado pela classe Evento

	public Medicacao(int idEvento, String titulo, LocalDate data, LocalTime horaInicio, LocalTime horaFim, StatusEvento status, int idMedicacao, String dosagem, Intervalo intervalo, int duracao) {
		super(idEvento, titulo, data, horaInicio, horaFim, status);
		this.idMedicacao = contador;
		contador++;
		this.dosagem = dosagem;
		this.intervalo = intervalo;
		this.duracao = duracao;
		medicacoes.add(this);
	}


	public static ArrayList<Medicacao> getMedicacoes() {
		return medicacoes;
	}

	public int getIdMedicacao() {
		return idMedicacao;
	}

	public String getDosagem() {
		return dosagem;
	}


	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}


	public Intervalo getIntervalo() {
		return intervalo;
	}


	public void setIntervalo(Intervalo intervalo) {
		this.intervalo = intervalo;
	}


	public int getDuracao() {
		return duracao;
	}


	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Medicacao [idMedicacao=" + idMedicacao + ", dosagem=" + dosagem + ", intervalo=" + intervalo + ", duracao=" + duracao + "]";
	}
	
}
