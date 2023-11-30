package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta extends Evento {
	private int idEndereco;

	public Consulta(String titulo, LocalDate data, LocalTime horaInicio, LocalTime horaFim,
			StatusEvento status, int idPaciente, int idEndereco) {
		super(titulo, data, horaInicio, horaFim, status, idPaciente);
		this.idEndereco = idEndereco;
	}

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

}
