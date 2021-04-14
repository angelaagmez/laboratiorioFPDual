package anotaciones;

@AnimalMetadata(fecha = "01/06/2017", pais = "Tanzania")
@Risk(nivelDeRiesgo= 10, nombre = "Riesgo alto")
public class Lion extends Animales{
	private int longitudMelena;
	private boolean ruge;
	
	public Lion(String nombre, int peso, String sexo, int edad, int longitudMelena, boolean ruge) {
		super(nombre, peso, sexo, edad);
		this.longitudMelena = longitudMelena;
		this.ruge = ruge;
	}

	public int getLongitudMelena() {
		return longitudMelena;
	}

	public void setLongitudMelena(int longitudMelena) {
		this.longitudMelena = longitudMelena;
	}

	public boolean isRuge() {
		return ruge;
	}

	public void setRuge(boolean ruge) {
		this.ruge = ruge;
	}

	@Override
	public String toString() {
		return "Lion [longitudMelena=" + longitudMelena + ", ruge=" + ruge + ", nombre=" + nombre + ", peso=" + peso
				+ ", sexo=" + sexo + ", edad=" + edad + "]";
	}

	

	
	
		
	
}
