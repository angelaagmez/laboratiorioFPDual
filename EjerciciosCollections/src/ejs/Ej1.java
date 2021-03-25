package ejs;

import java.util.ArrayList;

public class Ej1 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(62345);
		numeros.add(1446);
		numeros.add(52738);
		numeros.add(692876);
		
		System.out.println(esSeis(numeros));
	}
	
	public static boolean esSeis(ArrayList<Integer> a) {
		
		if(a.get(0)==6 && a.get(a.size()-1)==6) {
			return true;
		} else {
			return false;
		}
	}
}
