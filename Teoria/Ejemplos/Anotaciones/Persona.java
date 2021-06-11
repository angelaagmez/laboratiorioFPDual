package prueba;

import java.lang.annotation.Annotation;

import com.sun.istack.internal.NotNull;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase de persona
 * 
 * @author jose.m.prieto.villar
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@ToString
@Creacion(version = "5.0", author = "Mariano")
public class Persona {

	@NotNull
	@Deprecated
	private String nombre;

	private String nombre1;

	@Creacion(version = "3.0", author = "Mariano")
	private String nombre2;

	private String nombre3;

	private String nombre4;

	@Creacion(version = "4.0", author = "Mariano")
	public void imprimir(@Creacion(version = "2.0", author = "Mariano") String texto, Integer entero)
			throws NoSuchMethodException, SecurityException {
		Annotation[][] annotations = getClass().getMethod("imprimir", String.class, Integer.class)
				.getParameterAnnotations();

		for (Annotation[] annotationArray : annotations) {
			for (Annotation annotation : annotationArray) {
				Creacion anotacionCreacion = (Creacion) annotation;
				System.out.println(anotacionCreacion.author() + " -- " + anotacionCreacion.creationDate() + " -- "
						+ anotacionCreacion.version());
			}
		}

	}

}
