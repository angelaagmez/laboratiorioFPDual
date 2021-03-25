package ej1;

public class Frescos extends Productos{

	public Frescos(int fechaCaducidad, int numLote) {
		super(fechaCaducidad, numLote);
	}

	@Override
	public String toString() {
		return "Frescos [getFechaCaducidad()=" + getFechaCaducidad() + ", getNumLote()=" + getNumLote()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
}
