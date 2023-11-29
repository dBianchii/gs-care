package model;
import java.time.LocalDate;
import java.time.LocalTime;

enum TipoRotina {
	BANHO,
	ALIMENTACAO,
	OUTROS
}

public class Rotina extends Evento {
	private int idRotina; // chave primária
	private TipoRotina tipo;

	public Rotina(int idEvento, String titulo, LocalDate data, LocalTime horaInicio, LocalTime horaFim, StatusEvento status, int idRotina, TipoRotina tipo) {
		super(idEvento, titulo, data, horaInicio, horaFim, status);
		this.idRotina = idRotina;
		this.tipo = tipo;
	}

	public int getIdRotina() {
		return idRotina;
	}

	public void setIdRotina(int idRotina) {
		this.idRotina = idRotina;
	}

	public TipoRotina getTipo() {
		return tipo;
	}

	public void setTipo(TipoRotina tipo) {
		this.tipo = tipo;
	}

}
