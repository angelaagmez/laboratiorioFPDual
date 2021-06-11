package prueba;

import java.lang.annotation.Annotation;
import java.util.List;

import lombok.AllArgsConstructor;

public class PruebaAnotaciones {

	public static void main(String args[]) throws NoSuchFieldException, SecurityException, NoSuchMethodException {
		Jugador jugador = new Jugador();
		Persona persona = new Persona();
		persona.setNombre2("");
		persona.imprimir("", 1);
		Creacion creacion = jugador.getClass().getAnnotation(Creacion.class);
		Creacion creacionPersona = persona.getClass().getMethod("imprimir", String.class, Integer.class)
				.getAnnotation(Creacion.class);

		System.out.println(creacion.author() + " -- " + creacion.creationDate() + " -- " + creacion.version());
		System.out.println(creacionPersona.author() + " -- " + creacionPersona.creationDate() + " -- "
				+ creacionPersona.version());
	}

}
