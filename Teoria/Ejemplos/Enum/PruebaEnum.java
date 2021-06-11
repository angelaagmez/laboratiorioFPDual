package prueba;

import java.util.List;

public class PruebaEnum {

	public static void main(String[] args) {

		for (Grado elementoGrado : Grado.values())
			switch (elementoGrado) {
			case MASTER:
			case UNIVERSITARIO:
			case DOCTOR:
				System.out.println(elementoGrado.getTiempoEstudio() + " -- Titulo Obtenido: " + elementoGrado.getTitulo());
				break;
			default:
				System.out.println(elementoGrado.getTiempoEstudio() + " -- " + elementoGrado.getTitulo());
			}

		Persona p = new Persona();

		System.out.println(p.toString());


	}

}





