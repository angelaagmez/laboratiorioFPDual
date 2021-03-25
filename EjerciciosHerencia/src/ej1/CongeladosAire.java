package ej1;

public class CongeladosAire extends Congelados{

	public CongeladosAire(int fechaCaducidad, int numLote, int temperaturaCongelacion) {
		super(fechaCaducidad, numLote, temperaturaCongelacion);
	}

	@Override
	public String toString() {
		return "CongeladosAire [getTemperaturaCongelacion()=" + getTemperaturaCongelacion() + ", toString()="
				+ super.toString() + ", getFechaCaducidad()=" + getFechaCaducidad() + ", getNumLote()=" + getNumLote()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}
