package ejs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ej6 {
	public static void main(String[] args) {
		ArrayList<String> frase = new ArrayList<>();
		
		frase.add("Para practicar las colecciones");
		
		Iterator it = frase.iterator();
		
		while(it.hasNext()) {
			ArrayList<String> palabra = new ArrayList<String>();
			String aux = (String) it.next();
			
			palabra.addAll(Arrays.asList(aux.split("")));
			for (String string : palabra) {
				System.out.println(string);
			}
		}
		
	}

}
