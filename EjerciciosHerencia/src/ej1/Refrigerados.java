package ej1;

public class Refrigerados extends Productos{

	public Refrigerados(int fechaCaducidad, int numLote) {
		super(fechaCaducidad, numLote);
	}

	@Override
	public String toString() {
		return "Refrigerados [getFechaCaducidad()=" + getFechaCaducidad() + ", getNumLote()=" + getNumLote()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

}
