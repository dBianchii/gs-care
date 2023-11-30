package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class MedidasCorporais extends Registro {
	private double peso;
	private double altura;

	// Construtor da classe MedidasCorporais
	public MedidasCorporais(LocalDate data, LocalTime hora,
			double peso, double altura, int idPaciente) {
		super(data, hora, idPaciente);
		this.peso = peso;
		this.altura = altura;
	}

	// Método get para atributo peso
	public double getPeso() {
		return peso;
	}

	// Método set para atributo peso
	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Método get para atributo altura
	public double getAltura() {
		return altura;
	}

	// Método set para atributo altura
	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Método toString para impressão de dados (sobrescrito do método toString da classe Object)
	@Override
	public String toString() {
		return "MedidasCorporais [idRegistro= " + super.getId() + ", peso=" + peso + ", altura=" + altura + "]";
	}

}
