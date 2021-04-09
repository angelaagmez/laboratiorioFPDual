package anotaciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Zoo {
	private Map<String,Set<Animales>> animales;
	private int cantMax;

	public Zoo(int cantMax) {
		super();
		this.animales = new HashMap<String,Set<Animales>>();
		this.cantMax = cantMax;
	}

	public Map<String, Set<Animales>> getAnimales() {
		return animales;
	}

	public void setAnimales(Map<String, Set<Animales>> animales) {
		this.animales = animales;
	}
	
	public int getCantMax() {
		return cantMax;
	}

	public void setCantMax(int cantMax) {
		this.cantMax = cantMax;
	}

	public void addAnimales(Animales animal) {
		if(animales.containsKey(animal.getClass().getSimpleName())) {
			if(animales.get(animal.getClass().getSimpleName()).size()<cantMax) {
				Set<Animales> a = animales.get(animal.getClass().getSimpleName());
				a.add(animal);
			} 
		} else {
			animales.put(animal.getClass().getSimpleName(),new TreeSet<Animales>());
			animales.get(animal.getClass().getSimpleName()).add(animal);
		}		
	}
	
	public void mostrarAnimales() {
		Collection<Set<Animales>> aux = animales.values();
		
		Iterator<Set<Animales>> it = aux.iterator();
		while(it.hasNext()) {
			Set<Animales> anim = (Set<Animales>) it.next();
			for (Animales animales : anim) {
				System.out.println(animales);
			}
		}
	}
	
	

	@Override
	public String toString() {
		return "Zoo [animales=" + animales + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
