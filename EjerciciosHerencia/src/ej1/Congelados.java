package ej1;

public abstract class Congelados extends Productos{
	private int temperaturaCongelacion;

	public Congelados(int fechaCaducidad, int numLote, int temperaturaCongelacion) {
		super(fechaCaducidad, numLote);
		this.temperaturaCongelacion = temperaturaCongelacion;
	}

	public int getTemperaturaCongelacion() {
		return temperaturaCongelacion;
	}

	public void setTemperaturaCongelacion(int temperaturaCongelacion) {
		this.temperaturaCongelacion = temperaturaCongelacion;
	}

	@Override
	public String toString() {
		return "Congelados [temperaturaCongelacion=" + temperaturaCongelacion + "]";
	}
	
}
