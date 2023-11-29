import java.time.LocalDate;
import java.time.LocalTime;

public class MedidasCorporais extends Registro {
	// Atributos específicos para a classe MedidasCorporais
	private double peso;
	private double altura;

	// Construtor da classe MedidasCorporais
	public MedidasCorporais(int idRegistro, LocalDate data, LocalTime hora,
			double peso, double altura) {
		super(idRegistro, data, hora);
		this.peso = peso;
		this.altura = altura;
	}

	// Métodos getters e setters para os novos atributos
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

}
