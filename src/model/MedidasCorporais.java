package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class MedidasCorporais extends Registro {
	private double peso;
	private double altura;

	public MedidasCorporais(LocalDate data, LocalTime hora,
			double peso, double altura, int idPaciente) {
		super(data, hora, idPaciente);
		this.peso = peso;
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "MedidasCorporais [idRegistro= " + super.getId() + ", peso=" + peso + ", altura=" + altura + "]";
	}

}
