package enumeraciones;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Ejercicio1Enum {
	public static void main(String[] args) {
		System.out.println("Planetas: "+Arrays.toString(Planetas.values()));
		System.out.println("Planetas dentro del anillo de asteroides");
		planetasAsteroides();
		System.out.println("Planetas con atmosfera: ");
		planetasAtmosfera();
		System.out.println("Planetas que cumplen las mismas condiciones que la Tierra: ");
		planetasIgualTierra();
		System.out.println("Planeta mas cercano y lejano al sol: ");
		planetaCercanoSol();
		System.out.println("Planetas ordenador por distancias");
		planetasOrdenados();
		
	}
	
	public static void planetasAsteroides() {
		for (int i = 0; i < Planetas.values().length; i++) {
			if(Planetas.values()[i].isInsideAsteroidsRing) {
				System.out.println(Planetas.values()[i]);
			}
		}
	}
	
	public static void planetasAtmosfera() {
		for (int i = 0; i < Planetas.values().length; i++) {
			if(Planetas.values()[i].hasAnAtmosphere) {
				System.out.println(Planetas.values()[i]);
			}
		}
	}
	
	public static void planetasIgualTierra() {
		for (int i = 0; i < Planetas.values().length; i++) {
			if(Planetas.values()[i].hasAnAtmosphere==Planetas.TIERRA.hasAnAtmosphere &&
					Planetas.values()[i].isInsideAsteroidsRing==Planetas.TIERRA.isInsideAsteroidsRing) {
				System.out.println(Planetas.values()[i]);
			}
		}
	}
	
	public static void planetaCercanoSol() {
		Planetas max = null;
		Planetas min = null;
		Planetas[] planetas = Planetas.values();
		
		for (int i = 0; i < planetas.length; i++) {
			if(i==0) {
				max = planetas[i];
				min = planetas[i];
			} else {
				if(max.getDistanceFromSun()<planetas[i].getDistanceFromSun()) {
					max = planetas[i];
				}
				if(min.getDistanceFromSun()>planetas[i].getDistanceFromSun()) {
					min = planetas[i];
				}
			}
		}
		
		System.out.println("Mayor distancia: "+max);
		System.out.println("Menor distancia: "+min);
	}
	
	public static void planetasOrdenados() {
		Planetas[] p1 = Planetas.values();
		TreeSet<Planetas> planetas = new TreeSet<Planetas>(new Comparator<Planetas>() {
			public int compare(Planetas o1, Planetas o2) {
				return o1.getDistanceFromSun()-o2.getDistanceFromSun();
			}
		});
		planetas.addAll(Arrays.asList(p1));
		Iterator<Planetas> it = planetas.iterator();
		while(it.hasNext()) {
			System.out.println((Planetas)it.next());
		}
	}
	
	
}
