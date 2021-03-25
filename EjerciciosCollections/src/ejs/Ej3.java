package ejs;

import java.util.ArrayList;

public class Ej3 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(9);
		numeros.add(4);
		numeros.add(8);
		numeros.add(7);
		numeros.add(2);
		numeros.add(1);
		
		System.out.println(valoresCentrales(numeros));
	}
	
	public static ArrayList<Integer> valoresCentrales(ArrayList<Integer> num){
		ArrayList<Integer> valores = new ArrayList<Integer>();
		
		if(num.size()%2==0) {
			valores.add(num.get(num.size()/2-1));
			valores.add(num.get(num.size()/2));
		} else {
			System.out.println("Debe ser de longitud par");
		}
		
		return valores;
		
	}
}
