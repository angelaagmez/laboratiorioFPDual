package ejemplojdbc.edu.fpdual.main;

import ejemplojdbc.edu.fpdual.conector.Conector;

public class MainPrueba {
	public static void main(String[] args) {
		Conector co = new Conector();
		System.out.println(co.getMySQLConnection());
	}

}
