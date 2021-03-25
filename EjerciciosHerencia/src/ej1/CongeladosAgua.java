package ej1;

public class CongeladosAgua extends Congelados{

	public CongeladosAgua(int fechaCaducidad, int numLote, int temperaturaCongelacion) {
		super(fechaCaducidad, numLote, temperaturaCongelacion);
	}

	@Override
	public String toString() {
		return "CongeladosAgua [getTemperaturaCongelacion()=" + getTemperaturaCongelacion() + ", toString()="
				+ super.toString() + ", getFechaCaducidad()=" + getFechaCaducidad() + ", getNumLote()=" + getNumLote()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
