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

	// Construtor da classe Evento
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

	// Método get para atributo id
	public int getId() {
		return id;
	}

	// Método get para atributo idPaciente
	public int getIdPaciente() {
		return idPaciente;
	}

	// Método set para atributo idPaciente
	public void setIdPaciente(int id) {
		this.idPaciente = id;
	}

	// Método get para atributo titulo
	public String getTitulo() {
		return titulo;
	}

	// Método set para atributo titulo
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	// Método get para atributo data
	public LocalDate getData() {
		return data;
	}

	// Método set para atributo data
	public void setData(LocalDate data) {
		this.data = data;
	}

	// Método get para atributo horaInicio
	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	// Método set para atributo horaInicio
	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	// Método get para atributo horaFim
	public LocalTime getHoraFim() {
		return horaFim;
	}

	// Método set para atributo horaFim
	public void setHoraFim(LocalTime horaFim) {
		this.horaFim = horaFim;
	}

	// Método get para atributo status
	public StatusEvento getStatus() {
		return status;
	}

	// Método set para atributo status
	public void setStatus(StatusEvento status) {
		this.status = status;
	}

}
