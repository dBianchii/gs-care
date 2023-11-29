import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta extends Evento {
	private int idConsulta;
	private String endereco;

	public Consulta(int idEvento, String titulo, LocalDate data, LocalTime horaInicio, LocalTime horaFim, String status,
			int idConsulta, String endereco) {
		super(idEvento, titulo, data, horaInicio, horaFim, status);
		this.idConsulta = idConsulta;
	}

	public int getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
