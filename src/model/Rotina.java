package model;

import java.time.LocalDate;
import java.time.LocalTime;

enum TipoRotina {
	BANHO,
	ALIMENTACAO,
	OUTROS
}

public class Rotina extends Evento {
	private TipoRotina tipo;

	public Rotina(int idEvento, String titulo, LocalDate data, LocalTime horaInicio, LocalTime horaFim,
			StatusEvento status, int idRotina, TipoRotina tipo, int idPaciente) {
		super(titulo, data, horaInicio, horaFim, status, idPaciente);
		this.tipo = tipo;
	}

	public TipoRotina getTipo() {
		return tipo;
	}

	public void setTipo(TipoRotina tipo) {
		this.tipo = tipo;
	}

}
