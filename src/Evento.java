import java.time.LocalDate;
import java.time.LocalTime;

public class Evento {
	private int idEvento;
	private String titulo;
	private LocalDate data;
	private LocalTime horaInicio;
	private LocalTime horaFim;
	private String status; // TODO: pode ser enum?

	public Evento(int idEvento, String titulo, LocalDate data, LocalTime horaInicio, LocalTime horaFim, String status) {
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
