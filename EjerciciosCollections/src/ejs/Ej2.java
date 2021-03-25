package ejs;

import java.util.ArrayList;

public class Ej2 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> numeros2 = new ArrayList<Integer>();
		
		numeros.add(4);
		numeros.add(7);
		numeros.add(2);
		
		numeros2.add(1);
		numeros2.add(9);
		numeros2.add(5);
		
		System.out.println(siContiene(numeros));
		System.out.println(siContiene(numeros2));
	}
	
	public static boolean siContiene(ArrayList<Integer> num) {
		if(num.contains(2) || num.contains(3)) {
			return false;
		} else {
			return true;
		}
	}

}
