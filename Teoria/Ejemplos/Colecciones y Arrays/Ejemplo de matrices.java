import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import herencia.BotonSubmit;
import herencia.EjemploFinal;
import herencia.EventoRaton;
import herencia.HerenciaAbstract;
import herencia.PrimerBoton;
import herencia.SegundoBoton;

public class Main {

	public static final String CONSTANTE = "A";

	public static void main(String[] args) {
		int[][] numerosRegular = { { 6, 7, 5 }, { 3, 8, 4 }, { 1, 0, 2 }, { 9, 5, 2 } };
		int[][] numerosIRegular = new int[4][];

		for (int i = 0; i < numerosRegular.length; i++) {
			for (int j = 0; j < numerosRegular[i].length; j++) {
				System.out.printf("Valor de la matriz en posicion %d,%d: %d\n", i, j, numerosRegular[i][j]);
			}
		}

		System.out.println("=====\n=====");

		for (int[] datos : numerosRegular) {
			for (int dato : datos) {
				System.out.printf("Valor de la matriz: %d\n", dato);
			}
		}

		System.out.println("=====\n=====");

		Stream.of(numerosRegular).flatMapToInt(IntStream::of)
				.forEach(dato -> System.out.printf("Valor de la matriz: %d\n", dato));

	}

}