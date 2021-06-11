package herencia;

public class SegundoBoton extends AbstractBoton implements EventoRaton {

	public SegundoBoton(String nombreBoton) {
		super.nombreBoton = nombreBoton;
	}

	@Override
	public void llenaCampo(String campo) {
		System.out.println("llenando campo: " + campo);

	}

	@Override
	public boolean registrarLog() {
		System.out.println("Registrando en el log... o no :)");
		return true;
	}

}
