package enumeraciones;

import java.util.Comparator;

public enum Planetas implements Comparator<Planetas>{
	MERCURIO(true,false,200),VENUS(true,false,300),TIERRA(false,true,400),
	MARTE(false,true,500),JUPITER(false,false,600),SATURNO(true,false,700),
	URANO(false,false,800),NEPTUNO(false,true,900),PLUTON(false,false,1000);

	boolean isInsideAsteroidsRing;
	boolean hasAnAtmosphere;
	int distanceFromSun;
	
	private Planetas(boolean isInsideAsteroidsRing, boolean hasAnAtmosphere, int distanceFromSun) {
		this.isInsideAsteroidsRing = isInsideAsteroidsRing;
		this.hasAnAtmosphere = hasAnAtmosphere;
		this.distanceFromSun = distanceFromSun;
	}

	public boolean isInsideAsteroidsRing() {
		return isInsideAsteroidsRing;
	}

	public void setInsideAsteroidsRing(boolean isInsideAsteroidsRing) {
		this.isInsideAsteroidsRing = isInsideAsteroidsRing;
	}

	public boolean isHasAnAtmosphere() {
		return hasAnAtmosphere;
	}

	public void setHasAnAtmosphere(boolean hasAnAtmosphere) {
		this.hasAnAtmosphere = hasAnAtmosphere;
	}

	public int getDistanceFromSun() {
		return distanceFromSun;
	}

	public void setDistanceFromSun(int distanceFromSun) {
		this.distanceFromSun = distanceFromSun;
	}

	@Override
	public int compare(Planetas o1, Planetas o2) {
		return o1.distanceFromSun-o2.distanceFromSun;
	}

	
	
	
	
	
}
