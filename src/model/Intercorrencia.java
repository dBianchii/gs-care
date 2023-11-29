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
	private TipoIntercorrencia tipoIntercorrencia;
	private String observacao;

	public Intercorrencia(int idRegistro, LocalDate data, LocalTime hora, TipoIntercorrencia tipoIntercorencia,
			String observacao) {

		super(idRegistro, data, hora);
		this.tipoIntercorrencia = tipoIntercorencia;
		this.observacao = observacao;
	}

	public TipoIntercorrencia getTipoIntercorencia() {
		return tipoIntercorrencia;
	}

	public void setTipoIntercorencia(TipoIntercorrencia tipoIntercorencia) {
		this.tipoIntercorrencia = tipoIntercorencia;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}