package herencia;

import java.text.SimpleDateFormat;

public class Cajero extends Empleado {

	public Cajero(String tratamiento, String nombre) {
		super(tratamiento, nombre);
	}

	@Override
	public void imprimirNombre() {
		String[] partes = super.nombre.split(" ");
		System.out.println(partes[0] + " Cajero " + partes[1]);
	}

	@Override
	public void imprimirEdad() {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(super.edad));
	}

	public void imprimirTodo() {
		imprimirNombre();
		imprimirEdad();
	}
}
