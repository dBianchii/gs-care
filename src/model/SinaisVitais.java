package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class SinaisVitais extends Registro {
	private double temperatura;
	private int saturacao;
	private String pressaoArterial; // ex.: 120/80
	private int frequenciaCardiaca;
	private int frequenciaRespiratoria;
	private double glicemia;

	// Construtor da classe SinaisVitais
	public SinaisVitais(LocalDate data, LocalTime hora,
			double indice, double temperatura, int saturacao, String pressaoArterial,
			int frequenciaCardiaca, int frequenciaRespiratoria, double glicemia, int idPaciente) {

		super(data, hora, idPaciente);

		this.temperatura = temperatura;
		this.saturacao = saturacao;
		this.pressaoArterial = pressaoArterial;
		this.frequenciaCardiaca = frequenciaCardiaca;
		this.frequenciaRespiratoria = frequenciaRespiratoria;
		this.glicemia = glicemia;
	}

	// Método get para atributo temperatura
	public double getTemperatura() {
		return temperatura;
	}

	// Método set para atributo temperatura
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	// Método get para atributo saturacao
	public int getSaturacao() {
		return saturacao;
	}

	// Método set para atributo saturacao
	public void setSaturacao(int saturacao) {
		this.saturacao = saturacao;
	}

	// Método get para atributo pressaoArterial
	public String getPressaoArterial() {
		return pressaoArterial;
	}

	// Método set para atributo pressaoArterial
	public void setPressaoArterial(String pressaoArterial) {
		this.pressaoArterial = pressaoArterial;
	}

	// Método get para atributo frequenciaCardiaca
	public int getFrequenciaCardiaca() {
		return frequenciaCardiaca;
	}

	// Método set para atributo frequenciaCardiaca
	public void setFrequenciaCardiaca(int frequenciaCardiaca) {
		this.frequenciaCardiaca = frequenciaCardiaca;
	}

	// Método get para atributo frequenciaRespiratoria
	public int getFrequenciaRespiratoria() {
		return frequenciaRespiratoria;
	}

	// Método set para atributo frequenciaRespiratoria
	public void setFrequenciaRespiratoria(int frequenciaRespiratoria) {
		this.frequenciaRespiratoria = frequenciaRespiratoria;
	}

	// Método get para atributo glicemia
	public double getGlicemia() {
		return glicemia;
	}

	// Método set para atributo glicemia
	public void setGlicemia(double glicemia) {
		this.glicemia = glicemia;
	}

	// Método toString para impressão de dados (sobrescrito do método toString da classe Object)
	@Override
	public String toString() {
		return "SinaisVitais [idRegistro= " + super.getId() + ", temperatura=" + temperatura + ", saturacao=" + saturacao + ", pressaoArterial=" + pressaoArterial + ", frequenciaCardiaca=" + frequenciaCardiaca + ", frequenciaRespiratoria=" + frequenciaRespiratoria + ", glicemia=" + glicemia + ", data" + super.getData() + ", hora=" + super.getHora() + "]";
	}

}
