package anotaciones;


@AnimalMetadata(fecha = "15/07/2010", pais = "Perú")
@Risk(nivelDeRiesgo= 3, nombre = "Riesgo bajo pinguino normal")
@Risk(nivelDeRiesgo= 6, nombre = "Riesgo medio pinguino emperador")
public class Penguin extends Animales{
	private boolean emperador;
	private int longitudPico;
	
	public Penguin(String nombre, int peso, String sexo, int edad, boolean emperador, int longitudPico) {
		super(nombre, peso, sexo, edad);
		this.emperador = emperador;
		this.longitudPico = longitudPico;
	}

	public boolean isEmperador() {
		return emperador;
	}

	public void setEmperador(boolean emperador) {
		this.emperador = emperador;
	}

	public int getLongitudPico() {
		return longitudPico;
	}

	public void setLongitudPico(int longitudPico) {
		this.longitudPico = longitudPico;
	}

	@Override
	public String toString() {
		return "Penguin [emperador=" + emperador + ", longitudPico=" + longitudPico + ", nombre=" + nombre + ", peso="
				+ peso + ", sexo=" + sexo + ", edad=" + edad + "]";
	}

	
	
	
}
