package ejercicios;

public class Empleado {
	private String nombre;
	private String dni;
	private double sueldo;
		
	public Empleado(String nombre, String dni, double sueldo) {
		this.nombre = nombre;
		this.dni = dni;
		this.sueldo = sueldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void saludar() {
		System.out.println("Hola mi nombre es "+nombre);
	}
		
	public double ganarDinero(double ganado) {
		return sueldo += ganado;
	}
	
	public void despedida() {
		System.out.println("Hasta luego, espero que vuelvan pronto");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
