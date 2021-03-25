package ejs;

import java.util.ArrayList;

public class Ej5 {
	public static void main(String[] args) {
		ArrayList<String> valores = new ArrayList<>();
		
		valores.add("ABG23");
		valores.add("HOLA");
		valores.add("G4M6");
		valores.add("ADIOS");
		
		System.out.println(contieneNumeros(valores));
		
	}
	
	public static ArrayList<String> contieneNumeros(ArrayList<String> cadena){
		ArrayList<String> numeros = new ArrayList<>();
		
		for (int i = 0; i < cadena.size(); i++) {
			for (int j = 0; j < cadena.get(i).length(); j++) {
				if(cadena.get(i).charAt(j)=='1' || cadena.get(i).charAt(j)=='2' || cadena.get(i).charAt(j)=='3' || cadena.get(i).charAt(j)=='4'
						|| cadena.get(i).charAt(j)=='5' || cadena.get(i).charAt(j)=='6' || cadena.get(i).charAt(j)=='7' || cadena.get(i).charAt(j)=='8'
						|| cadena.get(i).charAt(j)=='9' || cadena.get(i).charAt(j)=='0') {
					numeros.add(cadena.get(i));
					break;
				}
			}
		}
		
		return numeros;
	}

}
