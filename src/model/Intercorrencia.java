package model;

import java.time.LocalDate;
import java.time.LocalTime;

enum TipoIntercorrencia {
	QUEDA,
	VOMITO,
	DESMAIO,
	DORABDOMINAL,
	OBSERVACAO
}

public class Intercorrencia extends Registro {
	private TipoIntercorrencia tipo;
	private String observacao;

	public Intercorrencia(LocalDate data, LocalTime hora, TipoIntercorrencia tipo,
			String observacao, int idPaciente) {

		super(data, hora, idPaciente);
		this.tipo = tipo;
		this.observacao = observacao;
	}

	public TipoIntercorrencia getTipoIntercorencia() {
		return tipo;
	}

	public void setTipoIntercorencia(TipoIntercorrencia tipo) {
		this.tipo = tipo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public String toString() {
		return "Intercorrencia [idRegistro= " + super.getId() + ", tipo=" + tipo + ", observacao=" + observacao + "]";
	}

}
