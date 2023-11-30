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

	@Override
	public String toString() {
		return "Consulta [idEvento= " + super.getId() + "idEndereco=" + idEndereco + ", titulo=" + super.getTitulo() + ", data=" + super.getData()
				+ ", horaInicio=" + super.getHoraInicio() + ", horaFim=" + super.getHoraFim() + ", status=" + super.getStatus() + ", idPaciente="
				+ super.getIdPaciente() + "]";
	}

}
