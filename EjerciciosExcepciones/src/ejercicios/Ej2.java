package ejercicios;

import java.util.Scanner;

public class Ej2 extends Exception{
	private String frase;
	
	public Ej2(String frase) {
		super();
		this.frase = frase;
	}
	
	
	@Override
	public String getMessage() {
		if(frase.length()>=15) {
			return "Es demasiado largo";
		} 
		return frase;
	}
	
	public static void mostrarMensaje(String mensaje) throws Ej2{
		if(mensaje.length()>=15) {
			System.out.println("Es demasiado largo");
		} else {
			System.out.println(mensaje);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String cadena = sc.nextLine();
		try {
			mostrarMensaje(cadena);
		} catch (Ej2 e){
			System.out.println(e.getMessage());
		}
	}
	
	
}
