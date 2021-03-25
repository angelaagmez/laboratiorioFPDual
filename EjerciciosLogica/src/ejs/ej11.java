package ejs;

public class ej11 {
	public static void main(String[] args) {
		System.out.println(caracterPrincipioFinal("Hola"));
	}
	
	public static String caracterPrincipioFinal(String palabra) {
		String ultima = "";
		
		for (int i = 0; i < palabra.length(); i++) {
			ultima = palabra.substring(palabra.length()-1);
		}
		
		return ultima+palabra+ultima;
	}
}
