package model;

import java.time.LocalDate;
import java.time.LocalTime;

enum TipoRotina {
	BANHO,
	ALIMENTACAO,
	OUTROS
}

public class Rotina extends Evento {
	private TipoRotina tipo;

	// Construtor da classe Rotina
	public Rotina(int idEvento, String titulo, LocalDate data, LocalTime horaInicio, LocalTime horaFim,
			StatusEvento status, int idRotina, TipoRotina tipo, int idPaciente) {
		super(titulo, data, horaInicio, horaFim, status, idPaciente);
		this.tipo = tipo;
	}

	// Método get para atributo tipo
	public TipoRotina getTipo() {
		return tipo;
	}

	// Método set para atributo tipo       
	public void setTipo(TipoRotina tipo) {
		this.tipo = tipo;
	}

	// Método toString para impressão de dados (sobrescrito do método toString da classe Object)
	@Override	
	public String toString() {
		return "Rotina [idEvento= " + super.getId() + ", tipo=" + tipo + ", data" +  super.getData() + ", horaInicio=" + super.getHoraInicio() + ", horaFim=" + super.getHoraFim() + ", status=" + super.getStatus() + "]";
	}
}
