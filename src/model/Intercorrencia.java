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

	// Construtor da classe Intercorrencia
	public Intercorrencia(LocalDate data, LocalTime hora, TipoIntercorrencia tipo,
			String observacao, int idPaciente) {

		super(data, hora, idPaciente);
		this.tipo = tipo;
		this.observacao = observacao;
	}

	// Método get para atributo tipo
	public TipoIntercorrencia getTipoIntercorencia() {
		return tipo;
	}

	// Método set para atributo tipo
	public void setTipoIntercorencia(TipoIntercorrencia tipo) {
		this.tipo = tipo;
	}

	// Método get para atributo observacao
	public String getObservacao() {
		return observacao;
	}

	// Método set para atributo observacao
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	// Método toString para impressão de dados (sobrescrito do método toString da classe Object)
	@Override
	public String toString() {
		return "Intercorrencia [idRegistro= " + super.getId() + ", tipo=" + tipo + ", observacao=" + observacao + "]";
	}

}
