package model;
import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {
	private int idRegistro; // chave primária
	private LocalDate data;
	private LocalTime hora;

	public Registro(int idRegistro, LocalDate data, LocalTime hora) {
		this.idRegistro = idRegistro;
		this.data = data;
		this.hora = hora;
	}

	public int getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(int idRegistro) {
		this.idRegistro = idRegistro;
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

}
