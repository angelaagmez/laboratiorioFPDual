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

		String numerador = new Scanner(System.in).next();

		String denominador = new Scanner(System.in).next();

		try {
			Double resultado = dividir(numerador, denominador);

			System.out.println("Division da como cociente: " + resultado);
		} catch (ArithmeticException | NullPointerException | ExcepcionPersonal e) {
			System.out.println("Error al dividir en el main");
			e.printStackTrace();
			Double resultado = dividirConCero(numerador, denominador);
			System.out.println("Division con cero da como cociente: " + resultado);
		}
	}

	private static Double dividir(String numerador, String denominador) throws ExcepcionPersonal {

		Double resultado = null;

		try {
			if(denominador.equals("0")) {
				throw new ExcepcionPersonal("Dividiendo por 0");
			}
			resultado = Double.valueOf(Integer.valueOf(numerador) / Integer.valueOf(denominador));
			
		} catch (NumberFormatException e) {
			System.out.println("Error formato numerico");
			throw e;
		} catch (ArithmeticException arithmeticException) {
			System.out.println("Error aritmetico");
			arithmeticException.printStackTrace();
			throw arithmeticException;
		} catch (NullPointerException en) {
			System.out.println("Error nulo");
			throw en;
		} catch (IndexOutOfBoundsException ix) {
			System.out.println("Error accediendo a posicion");
			throw ix;
		} catch (Exception ex) {
			System.out.println("Error generals \n");
			ex.printStackTrace();
			throw ex;
		}

		return resultado != null ? resultado : 0;
	}

	private static Double dividirConCero(String numerador, String denominador) {

		Double resultado = null;

		try {
			resultado = Double
					.valueOf(Integer.valueOf(numerador) / Integer.valueOf(denominador.equals("0") ? "1" : denominador));
		} catch (NumberFormatException e) {
			System.out.println("Error formato numerico");
			throw e;
		} catch (ArithmeticException arithmeticException) {
			System.out.println("Error aritmetico");
			arithmeticException.printStackTrace();
			throw arithmeticException;
		} catch (NullPointerException en) {
			System.out.println("Error nulo");
			throw en;
		} catch (IndexOutOfBoundsException ix) {
			System.out.println("Error accediendo a posicion");
			throw ix;
		} catch (Exception ex) {
			System.out.println("Error generals \n");
			ex.printStackTrace();
			throw ex;
		}

		return resultado != null ? resultado : 0;
	}
}