package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Medicacao extends Evento {
	private String dosagem;
	private int intervalo;
	private int duracao;

	public Medicacao(String titulo, LocalDate data, LocalTime horaInicio, LocalTime horaFim,
			StatusEvento status, int idPaciente, String dosagem, int intervalo, int duracao) {
		super(titulo, data, horaInicio, horaFim, status, idPaciente);

		this.dosagem = dosagem;
		this.intervalo = intervalo;
		this.duracao = duracao;
	}

	public String getDosagem() {
		return dosagem;
	}

	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}

	public int getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(int intervalo) {
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
		return "Medicacao [id=" + this.getId() + ", dosagem=" + dosagem + ", intervalo=" + intervalo + ", duracao="
				+ duracao + "]";
	}

}
