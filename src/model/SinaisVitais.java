package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class SinaisVitais extends Registro {
	private double indice; // ? O que é indice?
	private double temperatura;
	private int saturacao;
	private String pressaoArterial; // ex.: 120/80
	private int frequenciaCardiaca;
	private int frequenciaRespiratoria;
	private double glicemia;

	public SinaisVitais(LocalDate data, LocalTime hora,
			double indice, double temperatura, int saturacao, String pressaoArterial,
			int frequenciaCardiaca, int frequenciaRespiratoria, double glicemia, int idPaciente) {

		super(data, hora, idPaciente);

		this.indice = indice;
		this.temperatura = temperatura;
		this.saturacao = saturacao;
		this.pressaoArterial = pressaoArterial;
		this.frequenciaCardiaca = frequenciaCardiaca;
		this.frequenciaRespiratoria = frequenciaRespiratoria;
		this.glicemia = glicemia;
	}

	public double getIndice() {
		return indice;
	}

	public void setIndice(double indice) {
		this.indice = indice;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public int getSaturacao() {
		return saturacao;
	}

	public void setSaturacao(int saturacao) {
		this.saturacao = saturacao;
	}

	public String getPressaoArterial() {
		return pressaoArterial;
	}

	public void setPressaoArterial(String pressaoArterial) {
		this.pressaoArterial = pressaoArterial;
	}

	public int getFrequenciaCardiaca() {
		return frequenciaCardiaca;
	}

	public void setFrequenciaCardiaca(int frequenciaCardiaca) {
		this.frequenciaCardiaca = frequenciaCardiaca;
	}

	public int getFrequenciaRespiratoria() {
		return frequenciaRespiratoria;
	}

	public void setFrequenciaRespiratoria(int frequenciaRespiratoria) {
		this.frequenciaRespiratoria = frequenciaRespiratoria;
	}

	public double getGlicemia() {
		return glicemia;
	}

	public void setGlicemia(double glicemia) {
		this.glicemia = glicemia;
	}

}
