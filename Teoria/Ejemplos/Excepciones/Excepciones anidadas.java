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

		Double resultado = null;

		try {
			resultado = Double.valueOf(Integer.valueOf(numerador) / Integer.parseInt(denominador));
		} catch (NumberFormatException e) {
			System.out.println("Error formato numerico");
		} catch (ArithmeticException arithmeticException) {
			System.out.println("Error aritmetico");
			arithmeticException.printStackTrace();
		} catch (NullPointerException en) {
			System.out.println("Error nulo");
		} catch (IndexOutOfBoundsException ix) {
			System.out.println("Error accediendo a posicion");
		} catch (Exception ex) {
			System.out.println("Error generals \n");
			ex.printStackTrace();
		} finally {
			resultado = resultado != null ? resultado : 0;
		}

		System.out.println("Division da como cociente: " + resultado);
	}
}