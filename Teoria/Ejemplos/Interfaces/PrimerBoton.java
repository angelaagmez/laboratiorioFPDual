package herencia;

public class PrimerBoton extends AbstractBoton implements EventoPantalla, EventoRaton {

	public PrimerBoton(String nombreBoton) {
		super.nombreBoton = nombreBoton;
	}

	@Override
	public void llenaCampo(String campo) {
		System.out.println("llenando campo: " + campo);

	}

	@Override
	public void cierraPanatalla() {
		System.out.println("Cerrando Pantalla");

	}

	@Override
	public boolean registrarLog() {
		System.out.println("Registrando en el log... o no :)");
		return true;
	}

}
