package anotaciones;

@AnimalMetadata(fecha = "25/10/2020", pais = "Nueva Zelanda")
@Risk(nivelDeRiesgo = 2, nombre = "Riesgo bajo")
public class Parrot extends Animales{
	private String colorPlumas;
	private boolean habla;
	
	public Parrot(String nombre, int peso, String sexo, int edad, String colorPlumas, boolean habla) {
		super(nombre, peso, sexo, edad);
		this.colorPlumas = colorPlumas;
		this.habla = habla;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	public boolean isHabla() {
		return habla;
	}

	public void setHabla(boolean habla) {
		this.habla = habla;
	}

	@Override
	public String toString() {
		return "Parrot [colorPlumas=" + colorPlumas + ", habla=" + habla + ", nombre=" + nombre + ", peso=" + peso
				+ ", sexo=" + sexo + ", edad=" + edad + "]";
	}

	
	
	
	
}
