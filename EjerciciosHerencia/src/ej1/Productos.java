package ej1;

public abstract class Productos {
	private int fechaCaducidad;
	private int numLote;
	
	public Productos(int fechaCaducidad, int numLote) {
		this.fechaCaducidad = fechaCaducidad;
		this.numLote = numLote;
	}

	public int getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(int fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}

	@Override
	public String toString() {
		return "Productos [fechaCaducidad=" + fechaCaducidad + ", numLote=" + numLote + "]";
	}
	
	

}
