package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Medicacao extends Evento {
	private String dosagem;
	private int intervalo;
	private int duracao;

	// Construtor da classe Medicacao
	public Medicacao(String titulo, LocalDate data, LocalTime horaInicio, LocalTime horaFim,
			StatusEvento status, int idPaciente, String dosagem, int intervalo, int duracao) {
		super(titulo, data, horaInicio, horaFim, status, idPaciente);

		this.dosagem = dosagem;
		this.intervalo = intervalo;
		this.duracao = duracao;
	}

	// Método get para atributo dosagem
	public String getDosagem() {
		return dosagem;
	}

	// Método set para atributo dosagem
	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}

	// Método get para atributo intervalo
	public int getIntervalo() {
		return intervalo;
	}

	// Método set para atributo intervalo
	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}

	// Método get para atributo duracao
	public int getDuracao() {
		return duracao;
	}

	// Método set para atributo duracao
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	// Método toString para impressão de dados (sobrescrito do método toString da classe Object)
	@Override
	public String toString() {
		return "Medicacao [idEvento=" + super.getId() + ", dosagem=" + dosagem + ", intervalo=" + intervalo + ", duracao="
				+ duracao + "]";
	}

}
