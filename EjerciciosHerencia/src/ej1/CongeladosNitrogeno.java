package ej1;

public class CongeladosNitrogeno extends Congelados{

	public CongeladosNitrogeno(int fechaCaducidad, int numLote, int temperaturaCongelacion) {
		super(fechaCaducidad, numLote, temperaturaCongelacion);
	}

	@Override
	public String toString() {
		return "CongeladosNitrogeno [getTemperaturaCongelacion()=" + getTemperaturaCongelacion() + ", toString()="
				+ super.toString() + ", getFechaCaducidad()=" + getFechaCaducidad() + ", getNumLote()=" + getNumLote()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	

}
