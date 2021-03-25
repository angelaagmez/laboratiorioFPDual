package ejs;

public class ej5 {
	public static void main(String[] args) {
		parImpar("Hola que tal");
		parImpar("Me llamo Angela");
	}
	
	public static void parImpar(String...frase) {
		for (int i = 0; i < frase.length; i++) {
			if(frase[i].length()%2==0) {
				System.out.println(frase[i]+" ES PAR");
			}else {
				System.out.println(frase[i]+" ES IMPAR");
			}
		}
	}

}
