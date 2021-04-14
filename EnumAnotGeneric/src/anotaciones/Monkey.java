package anotaciones;

@AnimalMetadata(fecha = "12/03/2009", pais = "Tailandia")
@Risk(nivelDeRiesgo= 5, nombre = "Riesgo medio")
public class Monkey extends Animales{
	private boolean tieneHijos;
	private double altura;
	
	public Monkey(String nombre, int peso, String sexo, int edad, boolean tieneHijos, double altura) {
		super(nombre, peso, sexo, edad);
		this.tieneHijos = tieneHijos;
		this.altura = altura;
	}

	public boolean isTieneHijos() {
		return tieneHijos;
	}

	public void setTieneHijos(boolean tieneHijos) {
		this.tieneHijos = tieneHijos;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Monkey [tieneHijos=" + tieneHijos + ", altura=" + altura + ", nombre=" + nombre + ", peso=" + peso
				+ ", sexo=" + sexo + ", edad=" + edad + "]";
	}

	
	
	
	
	
	

}
