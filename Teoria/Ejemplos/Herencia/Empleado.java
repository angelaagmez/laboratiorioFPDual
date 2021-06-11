package herencia;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Empleado extends Persona {

	protected BigDecimal sueldo;
	protected Date fechaIngreso;
	protected String nombre;

	public Empleado(String tratamiento, String nombre) {
		super(tratamiento, nombre, new Date());
		this.nombre = tratamiento + " " + nombre;
		sueldo = new BigDecimal("100.000");
		fechaIngreso = new Date();
	}

	public void imprimirNombre() {
		System.out.println(nombre);
		System.out.println(super.nombre);
		System.out.println(getNombre());
	}

	public void imprimirEdad() {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(edad));
	}
}
