package herencia;

import java.util.Date;

public class Persona {

	protected String nombre;
	protected String tratamiento;
	protected Date edad;

	public Persona(String tratamiento, String nombre, Date edad) {
		this.tratamiento = tratamiento;
		this.nombre = nombre;
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(Date edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return tratamiento + " " + nombre;
	}

	public Date getEdad() {
		return edad;
	}

}
