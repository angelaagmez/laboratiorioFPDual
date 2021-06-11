package herencia;

public abstract class AbstractBoton {

	protected String nombreBoton;
	
	public void setNombreBoton(String nombreBoton) {
		this.nombreBoton = nombreBoton;
	}
	
	public abstract boolean registrarLog();
	
}
