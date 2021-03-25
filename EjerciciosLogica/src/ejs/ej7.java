package ejs;

public class ej7 {
	public static void main(String[] args) {
		contarVocales("Hola que tal");
	}
	
	public static void contarVocales(String texto) {
		int contador = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i)=='a' || texto.charAt(i)=='e' || texto.charAt(i)=='i' ||
					texto.charAt(i)=='o' || texto.charAt(i)=='u' ) {
				contador++;
			}
		}
		System.out.println("Tiene "+contador+" vocales");
	}

}
