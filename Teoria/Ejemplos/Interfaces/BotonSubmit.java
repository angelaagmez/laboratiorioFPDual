package herencia;

public class BotonSubmit extends AbstractBoton implements EventoRaton, EventoSubmitFormulario {

	public BotonSubmit(String nombreBoton) {
		super.nombreBoton = nombreBoton;
	}

	@Override
	public void llenaCampo(String campo) {
	}

	@Override
	public boolean registrarLog() {
		System.out.println("No Registro en el log...");
		return true;
	}

	@Override
	public void submitFormulario(String campo1, String campo2) {
		System.out.println("Haciendo submit de campo1: " + campo1 + " y campo 2: " + campo2);

	}

}
