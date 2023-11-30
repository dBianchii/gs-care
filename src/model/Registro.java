package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {
	private static int contador = 0;
	private int id;
	private int idPaciente;
	private LocalDate data;
	private LocalTime hora;

	// Método construtor da classe Registro
	public Registro(LocalDate data, LocalTime hora, int idPaciente) {
		this.id = contador++;
		this.data = data;
		this.hora = hora;
		this.idPaciente = idPaciente;
	}

	// Método get para atributo id
	public int getId() {
		return id;
	}

	// Método get para atributo data
	public LocalDate getData() {
		return data;
	}

	// Método set para atributo data
	public void setData(LocalDate data) {
		this.data = data;
	}

	// Método get para atributo hora
	public LocalTime getHora() {
		return hora;
	}

	// Método set para atributo hora
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	// Método get para atributo idPaciente
	public int getIdPaciente() {
		return idPaciente;
	}

	// Método set para atributo idPaciente
	public void setIdPaciente(int idPaciente) {
		this.id = idPaciente;
	}

}
