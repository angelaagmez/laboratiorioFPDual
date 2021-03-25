package ejs;

public class ej14 {
	public static void main(String[] args) {
		System.out.println(esPalindromo("hola que tal"));
		System.out.println(esPalindromo("anita lava la tina"));
	}
	
	public static boolean esPalindromo(String frase) {
		frase = frase.replace(" ","");
		String fraseContraria = "";
		
		for (int i = frase.length()-1; i >= 0; i--) {
			fraseContraria += Character.toString(frase.charAt(i));
		}
		
		if(frase.equals(fraseContraria)) {
			return true;
		} else {
			return false;
		}
	}

}
