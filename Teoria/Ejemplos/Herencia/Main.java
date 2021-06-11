import herencia.Cajero;
import herencia.Empleado;
import herencia.Persona;

public class Main {
	public static void main(String[] args) {
		Persona persona = new Empleado("Sr.", "Pepe Mariano");
		Empleado persona2 = new Empleado("Sra.", "Vicky");
		Cajero persona3 = new Cajero("Sr.", "Gonzalo");
		Empleado persona4 = new Cajero("Sr.", "Guillermo");

		System.out.print(persona.getNombre());
		System.out.print("\n============\n");
		persona2.imprimirNombre();
		System.out.print("============\n");
		persona2.imprimirEdad();
		System.out.print("============\n");
		persona3.imprimirEdad();
		System.out.print("============\n");
		persona3.imprimirNombre();
		System.out.print("============\n");
		persona4.imprimirNombre();
	}

}
