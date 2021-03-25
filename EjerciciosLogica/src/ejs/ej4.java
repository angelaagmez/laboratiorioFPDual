package ejs;


public class ej4 {
	public static void main(String[] args) {
		String frase = "A1B2C3";
		
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i)=='1' || frase.charAt(i)=='2' || frase.charAt(i)=='3') {
				System.out.print(frase.charAt(i));
			}
		}
	}
}
