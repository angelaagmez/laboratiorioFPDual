package ejercicios;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Concatenar {
	public static void main(String[] args) {
		new Concatenar().concatenarParam("Hola","Mundo","Java","FP");
	}
	
	public void concatenarParam(String...parametros) {
		System.out.println(Arrays.asList(parametros).stream().collect(Collectors.joining(".","","")));
		
		/**
		 * String resultado= "";
		 * for(String dato: Arrays.asList(palabras)){
		 * resultado += dato.toUpperCas() + ".";
		 * }
		 * System.out.println(resultado.substring(0,resultado.length()-1)+"\n");
		 */
	}

}
