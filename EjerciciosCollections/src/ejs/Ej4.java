package ejs;

import java.util.ArrayList;
import java.util.Collections;

public class Ej4 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(2);
		numeros.add(7);
		numeros.add(4);
		numeros.add(9);
		numeros.add(1);
		
		System.out.println(invertido(numeros));
		
		
	}

	public static ArrayList<Integer> invertido(ArrayList<Integer> num){
		ArrayList<Integer> valores = new ArrayList<Integer>();
		
		valores.addAll(num);
		Collections.reverse(valores); 
		
		return valores;
		
	}
}
