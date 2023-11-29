package model;
import java.time.LocalDate;
import java.time.LocalTime;

enum StatusEvento {
	AGENDADO,
	REALIZADO,
	CANCELADO
}

public class Evento {
	private int idEvento; // chave primária
	private String titulo;
	private LocalDate data;
	private LocalTime horaInicio;
	private LocalTime horaFim;
	private StatusEvento status; 

	public Evento(int idEvento, String titulo, LocalDate data, LocalTime horaInicio, LocalTime horaFim, StatusEvento status) {
		this.idEvento = idEvento;
		this.titulo = titulo;
		this.data = data;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.status = status;
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
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
