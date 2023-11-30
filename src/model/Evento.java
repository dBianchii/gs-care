package model;

import java.time.LocalDate;
import java.time.LocalTime;

enum StatusEvento {
	AGENDADO,
	REALIZADO,
	CANCELADO
}

public class Evento {
	private static int contador = 0;
	private int id;
	private int idPaciente;
	private String titulo;
	private LocalDate data;
	private LocalTime horaInicio;
	private LocalTime horaFim;
	private StatusEvento status;

	public Evento(String titulo, LocalDate data, LocalTime horaInicio, LocalTime horaFim,
			StatusEvento status, int idPaciente) {
		this.idPaciente = idPaciente;
		this.id = contador++;
		this.titulo = titulo;
		this.data = data;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int id) {
		this.idPaciente = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(LocalTime horaFim) {
		this.horaFim = horaFim;
	}

	public StatusEvento getStatus() {
		return status;
	}

	public void setStatus(StatusEvento status) {
		this.status = status;
	}

}
