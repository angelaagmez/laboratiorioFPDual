package ejs;

import java.util.Scanner;

public class ej2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		System.out.println("Introduce el nombre del estudiante");
		nombre = sc.nextLine();
		
		System.out.println("Hola "+nombre);
	}

}
