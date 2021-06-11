import java.util.Arrays;
import java.util.Scanner;

import herencia.BotonSubmit;
import herencia.EjemploFinal;
import herencia.EventoRaton;
import herencia.HerenciaAbstract;
import herencia.PrimerBoton;
import herencia.SegundoBoton;

public class Main {

	public static final String CONSTANTE = "A";

	public static void main(String[] args) {
		String[] datos = { "1", "2", "3" };

		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos[i]);
		}

		System.out.println("=====\n=====");

		for (String dato : datos) {
			System.out.println(dato);
		}

		System.out.println("=====\n=====");

		Arrays.asList(datos).stream().forEach(dato -> System.out.println(dato));
		
		System.out.println("=====\n=====");

		Arrays.asList(datos).stream().forEach(System.out::println);
		
	}

}