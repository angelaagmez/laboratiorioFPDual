package ejs;

public class ej12 {
	public static void main(String[] args) {
		System.out.println(comprobarPalabra("programa de Windows"));
		System.out.println(comprobarPalabra("prog de Windows"));
		System.out.println(comprobarPalabra("programa3"));
		System.out.println(comprobarPalabra("Windows10"));
		
	}
	
	public static boolean comprobarPalabra(String frase) {
		for (int i = 0; i < frase.length(); i++) {
			if(frase.length()>=0) {
				if(frase.substring(0,8).contains("programa")) {
					return true;
				} 
			}
			
		}
		return false;
	}

}
