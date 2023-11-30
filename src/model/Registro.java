package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {
	private static int contador = 0;
	private int id;
	private int idPaciente;
	private LocalDate data;
	private LocalTime hora;

	public Registro(LocalDate data, LocalTime hora, int idPaciente) {
		this.id = contador++;
		this.data = data;
		this.hora = hora;
		this.idPaciente = idPaciente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.id = idPaciente;
	}

}
